package com.shiku.imserver.common.http;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.Tio.IpBlacklist;
import org.tio.core.exception.AioDecodeException;
import org.tio.http.common.HttpConfig;
import org.tio.http.common.Method;
import org.tio.http.common.RequestLine;
import org.tio.http.common.HttpConst.RequestBodyFormat;
import org.tio.http.common.utils.HttpParseUtils;
import org.tio.utils.hutool.StrUtil;

public class HttpRequestDecoder {
   private static Logger log = LoggerFactory.getLogger(HttpRequestDecoder.class);
   public static final int MAX_LENGTH_OF_HEADER = 20480;
   public static final int MAX_LENGTH_OF_HEADERLINE = 20480;
   public static final int MAX_LENGTH_OF_REQUESTLINE = 20480;

   public static HttpRequest decode(ByteBuffer buffer, int limit, int position, int readableLength, ChannelContext channelContext, HttpConfig httpConfig) throws AioDecodeException {
      Map<String, String> headers = new HashMap();
      int contentLength ;
//      byte[] bodyBytes = null;
      StringBuilder headerSb = null;
      RequestLine firstLine = null;
      boolean appendRequestHeaderString = httpConfig.isAppendRequestHeaderString();
      if (appendRequestHeaderString) {
         headerSb = new StringBuilder(512);
      }

      firstLine = parseRequestLine(buffer, channelContext);
      if (firstLine == null) {
         return null;
      } else {
         HttpRequest httpRequest = new HttpRequest(channelContext.getClientNode());
         httpRequest.setRequestLine(firstLine);
         httpRequest.setChannelContext(channelContext);
         httpRequest.setHttpConfig(httpConfig);
         boolean headerCompleted = parseHeaderLine(buffer, headers, 0, httpConfig);
         if (!headerCompleted) {
            return null;
         } else {
            String contentLengthStr = (String)headers.get("content-length");
//            int contentLength;
            if (StrUtil.isBlank(contentLengthStr)) {
               contentLength = 0;
            } else {
               contentLength = Integer.parseInt(contentLengthStr);
               if (contentLength > httpConfig.getMaxLengthOfPostBody()) {
                  throw new AioDecodeException("post body length is too big[" + contentLength + "], max length is " + httpConfig.getMaxLengthOfPostBody() + " byte");
               }
            }

            int headerLength = buffer.position() - position;
            int allNeedLength = headerLength + contentLength;
            if (readableLength < allNeedLength) {
               channelContext.setPacketNeededLength(allNeedLength);
               return null;
            } else if (httpConfig.checkHost && !headers.containsKey("host")) {
               throw new AioDecodeException("there is no host header");
            } else {
               if (appendRequestHeaderString) {
                  httpRequest.setHeaderString(headerSb.toString());
               } else {
                  httpRequest.setHeaderString("");
               }

               httpRequest.setHeaders(headers);
               if (IpBlacklist.isInBlacklist(channelContext.groupContext, httpRequest.getClientIp())) {
                  throw new AioDecodeException("[" + httpRequest.getClientIp() + "] in black list");
               } else {
                  httpRequest.setContentLength(contentLength);
                  String connection = (String)headers.get("connection");
                  if (connection != null) {
                     httpRequest.setConnection(connection.toLowerCase());
                  }

                  if (StrUtil.isNotBlank(firstLine.queryString)) {
                     decodeParams(httpRequest.getParams(), firstLine.queryString, httpRequest.getCharset(), channelContext);
                  }

                  if (contentLength != 0) {
                     byte[] bodyBytes = new byte[contentLength];
                     buffer.get(bodyBytes);
                     httpRequest.setBody(bodyBytes);
                     parseBody(httpRequest, firstLine, bodyBytes, channelContext, httpConfig);
                  }

                  return httpRequest;
               }
            }
         }
      }
   }

   public static void decodeParams(Map<String, Object[]> params, String queryString, String charset, ChannelContext channelContext) {
      if (!StrUtil.isBlank(queryString)) {
         String[] keyvalues = queryString.split("&");
         String[] var5 = keyvalues;
         int var6 = keyvalues.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            String keyvalue = var5[var7];
            String[] keyvalueArr = keyvalue.split("=");
            if (keyvalueArr.length == 2) {
               String key = keyvalueArr[0];
               String value = null;

               try {
                  value = URLDecoder.decode(keyvalueArr[1], charset);
               } catch (UnsupportedEncodingException var14) {
                  log.error(channelContext.toString(), var14);
               }

               Object[] existValue = (Object[])params.get(key);
               String[] newExistValue;
               if (existValue != null) {
                  newExistValue = new String[existValue.length + 1];
                  System.arraycopy(existValue, 0, newExistValue, 0, existValue.length);
                  newExistValue[newExistValue.length - 1] = value;
                  params.put(key, newExistValue);
               } else {
                  newExistValue = new String[]{value};
                  params.put(key, newExistValue);
               }
            }
         }

      }
   }

   private static void parseBody(HttpRequest httpRequest, RequestLine firstLine, byte[] bodyBytes, ChannelContext channelContext, HttpConfig httpConfig) throws AioDecodeException {
      parseBodyFormat(httpRequest, httpRequest.getHeaders());
      RequestBodyFormat bodyFormat = httpRequest.getBodyFormat();
      httpRequest.setBody(bodyBytes);
      switch(bodyFormat) {
      case MULTIPART:
         String bodyString;
         if (log.isInfoEnabled()) {
            bodyString = null;
            if (bodyBytes != null && bodyBytes.length > 0 && log.isDebugEnabled()) {
               try {
                  bodyString = new String(bodyBytes, httpRequest.getCharset());
                  log.debug("{} multipart body value\r\n{}", channelContext, bodyString);
               } catch (UnsupportedEncodingException var11) {
                  log.error(channelContext.toString(), var11);
               }
            }
         }

         bodyString = httpRequest.getHeader("content-type");
         String initboundary = HttpParseUtils.getSubAttribute(bodyString, "boundary");
         log.debug("{}, initboundary:{}", channelContext, initboundary);
         HttpMultiBodyDecoder.decode(httpRequest, firstLine, bodyBytes, initboundary, channelContext, httpConfig);
         break;
      default:
          bodyString = null;
         if (bodyBytes != null && bodyBytes.length > 0) {
            try {
               bodyString = new String(bodyBytes, httpRequest.getCharset());
               httpRequest.setBodyString(bodyString);
               if (log.isInfoEnabled()) {
                  log.info("{} body value\r\n{}", channelContext, bodyString);
               }
            } catch (UnsupportedEncodingException var10) {
               log.error(channelContext.toString(), var10);
            }
         }

         if (bodyFormat == RequestBodyFormat.URLENCODED) {
            parseUrlencoded(httpRequest, firstLine, bodyBytes, bodyString, channelContext);
         }
      }

   }

   public static void parseBodyFormat(HttpRequest httpRequest, Map<String, String> headers) {
      String contentType = (String)headers.get("content-type");
      String Content_Type = null;
      if (contentType != null) {
         Content_Type = contentType.toLowerCase();
      }

      if (Content_Type.startsWith("text/plain")) {
         httpRequest.setBodyFormat(RequestBodyFormat.TEXT);
      } else if (Content_Type.startsWith("multipart/form-data")) {
         httpRequest.setBodyFormat(RequestBodyFormat.MULTIPART);
      } else {
         httpRequest.setBodyFormat(RequestBodyFormat.URLENCODED);
      }

      if (StrUtil.isNotBlank(Content_Type)) {
         String charset = HttpParseUtils.getSubAttribute(Content_Type, "charset");
         if (StrUtil.isNotBlank(charset)) {
            httpRequest.setCharset(charset);
         } else {
            httpRequest.setCharset("utf-8");
         }
      }

   }

   public static boolean parseHeaderLine(ByteBuffer buffer, Map<String, String> headers, int hasReceivedHeaderLength, HttpConfig httpConfig) throws AioDecodeException {
      if (!buffer.hasArray()) {
         return parseHeaderLine2(buffer, headers, hasReceivedHeaderLength, httpConfig);
      } else {
         byte[] allbs = buffer.array();
         int initPosition = buffer.position();
         int lastPosition = initPosition;
         int remaining = buffer.remaining();
         if (remaining == 0) {
            return false;
         } else {
            if (remaining > 1) {
               byte b1 = buffer.get();
               byte b2 = buffer.get();
               if (13 == b1 && 10 == b2) {
                  return true;
               }

               if (10 == b1) {
                  return true;
               }
            } else if (10 == buffer.get()) {
               return true;
            }

            String name = null;
            String value = null;
            boolean hasValue = false;
            boolean needIteration = false;

            int headerLength;
            while(buffer.hasRemaining()) {
               byte b = buffer.get();
               byte lastByte;
               int len;
               if (name == null) {
                  if (b == 58) {
                     headerLength = buffer.position() - lastPosition - 1;
                     name = new String(allbs, lastPosition, headerLength);
                     lastPosition = buffer.position();
                  } else if (b == 10) {
                     lastByte = buffer.get(buffer.position() - 2);
                     len = buffer.position() - lastPosition - 1;
                     if (lastByte == 13) {
                        len = buffer.position() - lastPosition - 2;
                     }

                     name = new String(allbs, lastPosition, len);
                     lastPosition = buffer.position();
                     headers.put(name.toLowerCase(), "");
                     needIteration = true;
                     break;
                  }
               } else if (value == null) {
                  if (b == 10) {
                     lastByte = buffer.get(buffer.position() - 2);
                     len = buffer.position() - lastPosition - 1;
                     if (lastByte == 13) {
                        len = buffer.position() - lastPosition - 2;
                     }

                     value = new String(allbs, lastPosition, len);
                     lastPosition = buffer.position();
                     headers.put(name.toLowerCase(), StrUtil.trimEnd(value));
                     needIteration = true;
                     break;
                  }

                  if (!hasValue && b == 32) {
                     lastPosition = buffer.position();
                  } else {
                     hasValue = true;
                  }
               }
            }

            int lineLength = buffer.position() - initPosition;
            if (lineLength > 20480) {
               throw new AioDecodeException("header line is too long, max length of header line is 20480");
            } else if (needIteration) {
               headerLength = lineLength + hasReceivedHeaderLength;
               if (headerLength > 20480) {
                  throw new AioDecodeException("header is too long, max length of header is 20480");
               } else {
                  return parseHeaderLine(buffer, headers, headerLength, httpConfig);
               }
            } else {
               return false;
            }
         }
      }
   }

   private static boolean parseHeaderLine2(ByteBuffer buffer, Map<String, String> headers, int headerLength, HttpConfig httpConfig) throws AioDecodeException {
      int initPosition = buffer.position();
      int lastPosition = initPosition;
      int remaining = buffer.remaining();
      if (remaining == 0) {
         return false;
      } else {
         if (remaining > 1) {
            byte b1 = buffer.get();
            byte b2 = buffer.get();
            if (13 == b1 && 10 == b2) {
               return true;
            }

            if (10 == b1) {
               return true;
            }
         } else if (10 == buffer.get()) {
            return true;
         }

         String name = null;
         String value = null;
         boolean hasValue = false;
         boolean needIteration = false;

         while(buffer.hasRemaining()) {
            byte b = buffer.get();
            int nowPosition;
//            Object bs;
            byte lastByte;
            byte[] bs;
            if (name == null) {
               if (b == 58) {
                  nowPosition = buffer.position();
                  bs = new byte[nowPosition - lastPosition - 1];
                  buffer.position(lastPosition);
                  buffer.get(bs);
                  name = new String(bs);
                  lastPosition = nowPosition;
                  buffer.position(nowPosition);
               } else if (b == 10) {
                  nowPosition = buffer.position();
                  bs = null;
                  lastByte = buffer.get(nowPosition - 2);
                  if (lastByte == 13) {
                     bs = new byte[nowPosition - lastPosition - 2];
                  } else {
                     bs = new byte[nowPosition - lastPosition - 1];
                  }

                  buffer.position(lastPosition);
                  buffer.get(bs);
                  name = new String(bs);
                  buffer.position(nowPosition);
                  headers.put(name.toLowerCase(),null);
                  needIteration = true;
                  break;
               }
            } else if (value == null) {
               if (b == 10) {
                  nowPosition = buffer.position();
                  bs = null;
                  lastByte = buffer.get(nowPosition - 2);
                  if (lastByte == 13) {
                     bs = new byte[nowPosition - lastPosition - 2];
                  } else {
                     bs = new byte[nowPosition - lastPosition - 1];
                  }

                  buffer.position(lastPosition);
                  buffer.get(bs);
                  value = new String(bs);
                  buffer.position(nowPosition);
                  headers.put(name.toLowerCase(), StrUtil.trimEnd(value));
                  needIteration = true;
                  break;
               }

               if (!hasValue && b == 32) {
                  lastPosition = buffer.position();
               } else {
                  hasValue = true;
               }
            }
         }

         if (needIteration) {
            int myHeaderLength = buffer.position() - initPosition;
            if (myHeaderLength > 20480) {
               throw new AioDecodeException("header is too long");
            } else {
               return parseHeaderLine(buffer, headers, myHeaderLength + headerLength, httpConfig);
            }
         } else if (remaining > 20480) {
            throw new AioDecodeException("header line is too long");
         } else {
            return false;
         }
      }
   }

   public static RequestLine parseRequestLine(ByteBuffer buffer, ChannelContext channelContext) throws AioDecodeException {
      if (!buffer.hasArray()) {
         return parseRequestLine2(buffer, channelContext);
      } else {
         byte[] allbs = buffer.array();
         int initPosition = buffer.position();
         String methodStr = null;
         String pathStr = null;
         String queryStr = null;
         String protocol = null;
         String version = null;
         int lastPosition = initPosition;

         while(true) {
            while(buffer.hasRemaining()) {
               byte b = buffer.get();
               int len;
               if (methodStr == null) {
                  if (b == 32) {
                     len = buffer.position() - lastPosition - 1;
                     methodStr = new String(allbs, lastPosition, len);
                     lastPosition = buffer.position();
                  }
               } else if (pathStr == null) {
                  if (b == 32 || b == 63) {
                     len = buffer.position() - lastPosition - 1;
                     pathStr = new String(allbs, lastPosition, len);
                     lastPosition = buffer.position();
                     if (b == 32) {
                        queryStr = "";
                     }
                  }
               } else if (queryStr == null) {
                  if (b == 32) {
                     len = buffer.position() - lastPosition - 1;
                     queryStr = new String(allbs, lastPosition, len);
                     lastPosition = buffer.position();
                  }
               } else if (protocol == null) {
                  if (b == 47) {
                     len = buffer.position() - lastPosition - 1;
                     protocol = new String(allbs, lastPosition, len);
                     lastPosition = buffer.position();
                  }
               } else if (version == null && b == 10) {
                  byte lastByte = buffer.get(buffer.position() - 2);
                   len = buffer.position() - lastPosition - 1;
                  if (lastByte == 13) {
                     len = buffer.position() - lastPosition - 2;
                  }

                  version = new String(allbs, lastPosition, len);
                  lastPosition = buffer.position();
                  RequestLine requestLine = new RequestLine();
                  Method method = Method.from(methodStr);
                  requestLine.setMethod(method);
                  requestLine.setPath(pathStr);
                  requestLine.setInitPath(pathStr);
                  requestLine.setQueryString(queryStr);
                  requestLine.setProtocol(protocol);
                  requestLine.setVersion(version);
                  return requestLine;
               }
            }

            if (buffer.position() - initPosition > 20480) {
               throw new AioDecodeException("request line is too long");
            }

            return null;
         }
      }
   }

   private static RequestLine parseRequestLine2(ByteBuffer buffer, ChannelContext channelContext) throws AioDecodeException {
      int initPosition = buffer.position();
      String methodStr = null;
      String pathStr = null;
      String queryStr = null;
      String protocol = null;
      String version = null;
      int lastPosition = initPosition;

      while(true) {
         while(buffer.hasRemaining()) {
            byte b = buffer.get();
            int nowPosition;
            byte[] bs;
            if (methodStr == null) {
               if (b == 32) {
                  nowPosition = buffer.position();
                  bs = new byte[nowPosition - lastPosition - 1];
                  buffer.position(lastPosition);
                  buffer.get(bs);
                  methodStr = new String(bs);
                  lastPosition = nowPosition;
                  buffer.position(nowPosition);
               }
            } else if (pathStr == null) {
               if (b == 32 || b == 63) {
                  nowPosition = buffer.position();
                  bs = new byte[nowPosition - lastPosition - 1];
                  buffer.position(lastPosition);
                  buffer.get(bs);
                  pathStr = new String(bs);
                  lastPosition = nowPosition;
                  buffer.position(nowPosition);
                  if (b == 32) {
                     queryStr = "";
                  }
               }
            } else if (queryStr == null) {
               if (b == 32) {
                  nowPosition = buffer.position();
                  bs = new byte[nowPosition - lastPosition - 1];
                  buffer.position(lastPosition);
                  buffer.get(bs);
                  queryStr = new String(bs);
                  lastPosition = nowPosition;
                  buffer.position(nowPosition);
               }
            } else if (protocol == null) {
               if (b == 47) {
                  nowPosition = buffer.position();
                  bs = new byte[nowPosition - lastPosition - 1];
                  buffer.position(lastPosition);
                  buffer.get(bs);
                  protocol = new String(bs);
                  lastPosition = nowPosition;
                  buffer.position(nowPosition);
               }
            } else if (version == null && b == 10) {
               nowPosition = buffer.position();
                bs = null;
               byte lastByte = buffer.get(nowPosition - 2);
               if (lastByte == 13) {
                  bs = new byte[nowPosition - lastPosition - 2];
               } else {
                  bs = new byte[nowPosition - lastPosition - 1];
               }

               buffer.position(lastPosition);
               buffer.get(bs);
               version = new String(bs);
               buffer.position(nowPosition);
               RequestLine requestLine = new RequestLine();
               Method method = Method.from(methodStr);
               requestLine.setMethod(method);
               requestLine.setPath(pathStr);
               requestLine.setInitPath(pathStr);
               requestLine.setQueryString(queryStr);
               requestLine.setProtocol(protocol);
               requestLine.setVersion(version);
               return requestLine;
            }
         }

         if (buffer.position() - initPosition > 20480) {
            throw new AioDecodeException("request line is too long");
         }

         return null;
      }
   }

   private static void parseUrlencoded(HttpRequest httpRequest, RequestLine firstLine, byte[] bodyBytes, String bodyString, ChannelContext channelContext) {
      decodeParams(httpRequest.getParams(), bodyString, httpRequest.getCharset(), channelContext);
   }

   public static enum Step {
      firstline,
      header,
      body;
   }
}
