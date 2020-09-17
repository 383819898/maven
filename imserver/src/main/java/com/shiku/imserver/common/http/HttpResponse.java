package com.shiku.imserver.common.http;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.http.common.Cookie;
import org.tio.http.common.HeaderName;
import org.tio.http.common.HeaderValue;
import org.tio.http.common.HttpResponseStatus;
import org.tio.http.common.HeaderValue.Connection;
import org.tio.http.common.HeaderValue.Keep_Alive;
import org.tio.utils.hutool.StrUtil;

public class HttpResponse extends HttpPacket {
   private static Logger log = LoggerFactory.getLogger(HttpResponse.class);
   private static final long serialVersionUID = -3512681144230291786L;
   public static final HttpResponse NULL_RESPONSE = new HttpResponse();
   private HttpResponseStatus status;
   private boolean isStaticRes;
   private HttpRequest request;
   private List<Cookie> cookies;
   private Map<HeaderName, HeaderValue> headers;
   private int headerByteCount;
   private boolean hasGzipped;
   private String charset;
   private boolean skipIpStat;
   private boolean skipTokenStat;

   public HttpResponse() {
      this.status = HttpResponseStatus.C200;
      this.isStaticRes = false;
      this.request = null;
      this.cookies = null;
      this.headers = new HashMap();
      this.headerByteCount = 2;
      this.hasGzipped = false;
      this.charset = "utf-8";
      this.skipIpStat = false;
      this.skipTokenStat = false;
   }

   public HttpResponse(HttpRequest request) {
      this();
      this.request = request;
      if (request != null) {
         if (request.httpConfig != null && request.httpConfig.compatible1_0) {
            String connection = request.getConnection();
            String var3 = request.requestLine.version;
            byte var4 = -1;
            switch(var3.hashCode()) {
            case 48563:
               if (var3.equals("1.0")) {
                  var4 = 0;
               }
            default:
               switch(var4) {
               case 0:
                  if (StrUtil.equals(connection, "keep-alive")) {
                     this.addHeader(HeaderName.Connection, Connection.keep_alive);
                     this.addHeader(HeaderName.Keep_Alive, Keep_Alive.TIMEOUT_10_MAX_20);
                  }
                  break;
               default:
                  if (StrUtil.equals(connection, "close")) {
                  }
               }
            }
         }

      }
   }

   public HttpResponse(Map<HeaderName, HeaderValue> responseHeaders, byte[] body) {
      this.status = HttpResponseStatus.C200;
      this.isStaticRes = false;
      this.request = null;
      this.cookies = null;
      this.headers = new HashMap();
      this.headerByteCount = 2;
      this.hasGzipped = false;
      this.charset = "utf-8";
      this.skipIpStat = false;
      this.skipTokenStat = false;
      if (responseHeaders != null) {
         this.headers.putAll(responseHeaders);
      }

      this.setBody(body);
   }

   public void crossDomain() {
      this.addHeader(HeaderName.Access_Control_Allow_Origin, HeaderValue.from("*"));
      this.addHeader(HeaderName.Access_Control_Allow_Headers, HeaderValue.from("x-requested-with,content-type"));
   }

   public static HttpResponse cloneResponse(HttpRequest request, HttpResponse response) {
      HttpResponse cloneResponse = new HttpResponse(request);
      cloneResponse.setStatus(response.getStatus());
      cloneResponse.setBody(response.getBody());
      cloneResponse.setHasGzipped(response.isHasGzipped());
      cloneResponse.addHeaders(response.getHeaders());
      if (cloneResponse.getCookies() != null) {
         cloneResponse.getCookies().clear();
      }

      return cloneResponse;
   }

   public Map<HeaderName, HeaderValue> getHeaders() {
      return this.headers;
   }

   public void addHeader(HeaderName key, HeaderValue value) {
      this.headers.put(key, value);
      this.headerByteCount += key.bytes.length + value.bytes.length + 3;
   }

   public void addHeaders(Map<HeaderName, HeaderValue> headers) {
      if (headers != null) {
         Set<Entry<HeaderName, HeaderValue>> set = headers.entrySet();
         Iterator var3 = set.iterator();

         while(var3.hasNext()) {
            Entry<HeaderName, HeaderValue> entry = (Entry)var3.next();
            this.addHeader((HeaderName)entry.getKey(), (HeaderValue)entry.getValue());
         }
      }

   }

   public HeaderValue getContentType() {
      return (HeaderValue)this.headers.get(HeaderName.Content_Type);
   }

   public boolean addCookie(Cookie cookie) {
      if (this.cookies == null) {
         this.cookies = new ArrayList();
      }

      return this.cookies.add(cookie);
   }

   public String getCharset() {
      return this.charset;
   }

   public List<Cookie> getCookies() {
      return this.cookies;
   }

   public HttpRequest getHttpRequest() {
      return this.request;
   }

   public HttpResponseStatus getStatus() {
      return this.status;
   }

   public boolean isStaticRes() {
      return this.isStaticRes;
   }

   public String logstr() {
      String str = null;
      if (this.request != null) {
         str = "\r\n响应: 请求ID_" + this.request.getId() + "  " + this.request.getRequestLine().getPathAndQuery();
         str = str + "\r\n" + this.getHeaderString();
      } else {
         str = "\r\n响应\r\n" + this.status.getHeaderText();
      }

      return str;
   }

   public void setCharset(String charset) {
      this.charset = charset;
   }

   public void setCookies(List<Cookie> cookies) {
      this.cookies = cookies;
   }

   public void setHttpRequestPacket(HttpRequest request) {
      this.request = request;
   }

   public void setStaticRes(boolean isStaticRes) {
      this.isStaticRes = isStaticRes;
   }

   public void setStatus(HttpResponseStatus status) {
      this.status = status;
   }

   public boolean isHasGzipped() {
      return this.hasGzipped;
   }

   public void setHasGzipped(boolean hasGzipped) {
      this.hasGzipped = hasGzipped;
   }

   public boolean isSkipIpStat() {
      return this.skipIpStat;
   }

   public void setSkipIpStat(boolean skipIpStat) {
      this.skipIpStat = skipIpStat;
   }

   public boolean isSkipTokenStat() {
      return this.skipTokenStat;
   }

   public void setSkipTokenStat(boolean skipTokenStat) {
      this.skipTokenStat = skipTokenStat;
   }

   public HeaderValue getLastModified() {
      return this.getHeader(HeaderName.Last_Modified);
   }

   public HeaderValue getHeader(HeaderName name) {
      return (HeaderValue)this.headers.get(name);
   }

   public void setLastModified(HeaderValue lastModified) {
      if (lastModified != null) {
         this.addHeader(HeaderName.Last_Modified, lastModified);
      }

   }

   public String toString() {
      return this.status.toString();
   }

   public int getHeaderByteCount() {
      return this.headerByteCount;
   }
}
