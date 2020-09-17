package com.shiku.imserver.common.http;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.GroupContext;
import org.tio.http.common.Cookie;
import org.tio.http.common.HeaderName;
import org.tio.http.common.HeaderValue;
import org.tio.http.common.HttpResponseStatus;
import org.tio.http.common.HeaderValue.Server;
import org.tio.http.common.utils.HttpDateTimer;
import org.tio.utils.SysConst;

public class HttpResponseEncoder {
   private static Logger log = LoggerFactory.getLogger(HttpResponseEncoder.class);
   public static final int MAX_HEADER_LENGTH = 20480;
   public static final int HEADER_SERVER_LENGTH;
   public static final int HEADER_DATE_LENGTH_1;
   public static final int HEADER_FIXED_LENGTH;

   public static ByteBuffer encode(HttpResponse httpResponse, GroupContext groupContext, ChannelContext channelContext) throws UnsupportedEncodingException {
      int bodyLength = 0;
      byte[] body = httpResponse.getBody();
      if (body != null) {
         bodyLength = body.length;
      }

      HttpResponseStatus httpResponseStatus = httpResponse.getStatus();
      int respLineLength = httpResponseStatus.responseLineBinary.length;
      Map<HeaderName, HeaderValue> headers = httpResponse.getHeaders();
      httpResponse.addHeader(HeaderName.Content_Length, HeaderValue.from(Integer.toString(bodyLength)));
      int headerLength = httpResponse.getHeaderByteCount();
      if (httpResponse.getCookies() != null) {
         byte[] bs;
         for(Iterator var9 = httpResponse.getCookies().iterator(); var9.hasNext(); headerLength += bs.length) {
            Cookie cookie = (Cookie)var9.next();
            headerLength += HeaderName.SET_COOKIE.bytes.length;
            bs = cookie.toString().getBytes(httpResponse.getCharset());
            cookie.setBytes(bs);
         }

         headerLength += httpResponse.getCookies().size() * 3;
      }

      HeaderValue httpDateValue = HttpDateTimer.httpDateValue;
      headerLength += HEADER_FIXED_LENGTH + httpDateValue.bytes.length;
      ByteBuffer buffer = ByteBuffer.allocate(respLineLength + headerLength + bodyLength);
      buffer.put(httpResponseStatus.responseLineBinary);
      buffer.put(HeaderName.Server.bytes);
      buffer.put((byte)58);
      buffer.put(Server.TIO.bytes);
      buffer.put(SysConst.CR_LF);
      buffer.put(HeaderName.Date.bytes);
      buffer.put((byte)58);
      buffer.put(httpDateValue.bytes);
      buffer.put(SysConst.CR_LF);
      Set<Entry<HeaderName, HeaderValue>> headerSet = headers.entrySet();
      Iterator var12 = headerSet.iterator();

      while(var12.hasNext()) {
         Entry<HeaderName, HeaderValue> entry = (Entry)var12.next();
         buffer.put(((HeaderName)entry.getKey()).bytes);
         buffer.put((byte)58);
         buffer.put(((HeaderValue)entry.getValue()).bytes);
         buffer.put(SysConst.CR_LF);
      }

      if (httpResponse.getCookies() != null) {
         var12 = httpResponse.getCookies().iterator();

         while(var12.hasNext()) {
            Cookie cookie = (Cookie)var12.next();
            buffer.put(HeaderName.SET_COOKIE.bytes);
            buffer.put((byte)58);
            buffer.put(cookie.getBytes());
            buffer.put(SysConst.CR_LF);
         }
      }

      buffer.put(SysConst.CR_LF);
      if (bodyLength > 0) {
         buffer.put(body);
      }

      buffer.flip();
      return buffer;
   }

   private HttpResponseEncoder() {
   }

   static {
      HEADER_SERVER_LENGTH = HeaderName.Server.bytes.length + Server.TIO.bytes.length + 3;
      HEADER_DATE_LENGTH_1 = HeaderName.Date.bytes.length + 3;
      HEADER_FIXED_LENGTH = HEADER_SERVER_LENGTH + HEADER_DATE_LENGTH_1;
   }
}
