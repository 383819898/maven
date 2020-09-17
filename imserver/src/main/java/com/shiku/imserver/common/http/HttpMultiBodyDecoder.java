package com.shiku.imserver.common.http;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.exception.AioDecodeException;
import org.tio.core.exception.LengthOverflowException;
import org.tio.core.utils.ByteBufferUtils;
import org.tio.http.common.HttpConfig;
import org.tio.http.common.RequestLine;
import org.tio.http.common.UploadFile;
import org.tio.http.common.utils.HttpParseUtils;
import org.tio.utils.SystemTimer;
import org.tio.utils.hutool.StrUtil;

public class HttpMultiBodyDecoder {
   private static Logger log = LoggerFactory.getLogger(HttpMultiBodyDecoder.class);

   public static void decode(HttpRequest request, RequestLine firstLine, byte[] bodyBytes, String initboundary, ChannelContext channelContext, HttpConfig httpConfig) throws AioDecodeException {
      if (StrUtil.isBlank(initboundary)) {
         throw new AioDecodeException("boundary is null");
      } else {
         long start = SystemTimer.currTime;
         ByteBuffer buffer = ByteBuffer.wrap(bodyBytes);
         buffer.position(0);
         String boundary = "--" + initboundary;
         String endBoundary = boundary + "--";
         HttpMultiBodyDecoder.Step step = HttpMultiBodyDecoder.Step.BOUNDARY;

         while(true) {
            boolean var24 = false;

            long end;
            long iv;
            label120: {
               try {
                  var24 = true;
                  if (step == HttpMultiBodyDecoder.Step.BOUNDARY) {
                     String line = ByteBufferUtils.readLine(buffer, request.getCharset(), 512);
                     if (!boundary.equals(line)) {
                        if (!endBoundary.equals(line)) {
                           throw new AioDecodeException("line need:" + boundary + ", but is: " + line + "");
                        }

                        var24 = false;
                        break label120;
                     }

                     step = HttpMultiBodyDecoder.Step.HEADER;
                  }

                  HttpMultiBodyDecoder.Header multiBodyHeader = new HttpMultiBodyDecoder.Header();
                  if (step == HttpMultiBodyDecoder.Step.HEADER) {
                     ArrayList lines = new ArrayList(2);

                     while(true) {
                        String line = ByteBufferUtils.readLine(buffer, request.getCharset(), 512);
                        if ("".equals(line)) {
                           parseHeader(lines, multiBodyHeader, channelContext);
                           step = HttpMultiBodyDecoder.Step.BODY;
                           break;
                        }

                        lines.add(line);
                     }
                  }

                  if (step != HttpMultiBodyDecoder.Step.BODY) {
                     continue;
                  }

                  HttpMultiBodyDecoder.Step newParseStep = parseBody(multiBodyHeader, request, buffer, boundary, endBoundary, channelContext, httpConfig);
                  step = newParseStep;
                  if (newParseStep != HttpMultiBodyDecoder.Step.END) {
                     continue;
                  }

                  var24 = false;
                  break label120;
               } catch (LengthOverflowException var25) {
                  throw new AioDecodeException(var25);
               } catch (UnsupportedEncodingException var26) {
                  log.error(channelContext.toString(), var26);
                  var24 = false;
               } finally {
                  if (var24) {
                     long var17 = SystemTimer.currTime;
                      iv = var17 - start;
                     log.info("解析耗时:{}ms", iv);
                  }
               }

               end = SystemTimer.currTime;
               iv = end - start;
               log.info("解析耗时:{}ms", iv);
               break;
            }

            end = SystemTimer.currTime;
            iv = end - start;
            log.info("解析耗时:{}ms", iv);
            break;
         }

      }
   }

   public static HttpMultiBodyDecoder.Step parseBody(HttpMultiBodyDecoder.Header header, HttpRequest request, ByteBuffer buffer, String boundary, String endBoundary, ChannelContext channelContext, HttpConfig httpConfig) throws UnsupportedEncodingException, LengthOverflowException, AioDecodeException {
      int initPosition = buffer.position();

      String line;
      boolean isEndBoundary;
      boolean isBoundary;
      do {
         if (!buffer.hasRemaining()) {
            log.error("文件上传，协议不对，step is null");
            throw new AioDecodeException("step is null");
         }

         line = ByteBufferUtils.readLine(buffer, request.getCharset(), httpConfig.getMaxLengthOfMultiBody());
         isEndBoundary = endBoundary.equals(line);
         isBoundary = boundary.equals(line);
      } while(!isBoundary && !isEndBoundary);

      int endIndex = buffer.position() - line.getBytes().length - 2 - 2;
      int length = endIndex - initPosition;
      byte[] dst = new byte[length];
      System.arraycopy(buffer.array(), initPosition, dst, 0, length);
      String filename = header.getFilename();
      if (filename != null) {
         if (StrUtil.isNotBlank(filename)) {
            UploadFile uploadFile = new UploadFile();
            uploadFile.setName(filename.replaceAll("%", ""));
            uploadFile.setData(dst);
            uploadFile.setSize(dst.length);
            request.addParam(header.getName(), uploadFile);
         }
      } else {
         request.addParam(header.getName(), new String(dst, request.getCharset()));
      }

      return isEndBoundary ? HttpMultiBodyDecoder.Step.END : HttpMultiBodyDecoder.Step.HEADER;
   }

   public static void parseHeader(List<String> lines, HttpMultiBodyDecoder.Header header, ChannelContext channelContext) throws AioDecodeException {
      if (lines != null && lines.size() != 0) {
         try {
            Iterator var3 = lines.iterator();

            String name;
            String contentType;
            while(var3.hasNext()) {
               name = (String)var3.next();
               String[] keyvalue = name.split(":");
               contentType = StrUtil.trim(keyvalue[0]).toLowerCase();
               String value = StrUtil.trim(keyvalue[1]);
               header.map.put(contentType, value);
            }

            String contentDisposition = (String)header.map.get(HttpMultiBodyDecoder.MultiBodyHeaderKey.Content_Disposition);
            name = HttpParseUtils.getSubAttribute(contentDisposition, "name");
            String filename = HttpParseUtils.getSubAttribute(contentDisposition, "filename");
            contentType = (String)header.map.get(HttpMultiBodyDecoder.MultiBodyHeaderKey.Content_Type);
            header.setContentDisposition(contentDisposition);
            header.setName(name);
            header.setFilename(filename);
            header.setContentType(contentType);
         } catch (Throwable var8) {
            log.error(channelContext.toString(), var8);
            throw new AioDecodeException(var8.toString());
         }
      } else {
         throw new AioDecodeException("multipart_form_data 格式不对，没有头部信息");
      }
   }

   public static enum Step {
      BOUNDARY,
      HEADER,
      BODY,
      END;
   }

   public interface MultiBodyHeaderKey {
      String Content_Disposition = "Content-Disposition".toLowerCase();
      String Content_Type = "Content-Type".toLowerCase();
   }

   public static class Header {
      private String contentDisposition = "form-data";
      private String name = null;
      private String filename = null;
      private String contentType = null;
      private Map<String, String> map = new HashMap();

      public String getContentDisposition() {
         return this.contentDisposition;
      }

      public String getContentType() {
         return this.contentType;
      }

      public String getFilename() {
         return this.filename;
      }

      public Map<String, String> getMap() {
         return this.map;
      }

      public String getName() {
         return this.name;
      }

      public void setContentDisposition(String contentDisposition) {
         this.contentDisposition = contentDisposition;
      }

      public void setContentType(String contentType) {
         this.contentType = contentType;
      }

      public void setFilename(String filename) {
         this.filename = filename;
      }

      public void setMap(Map<String, String> map) {
         this.map = map;
      }

      public void setName(String name) {
         this.name = name;
      }
   }
}
