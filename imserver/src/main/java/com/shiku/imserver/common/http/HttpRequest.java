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
import org.tio.core.ChannelContext;
import org.tio.core.Node;
import org.tio.core.Tio;
import org.tio.http.common.Cookie;
import org.tio.http.common.HttpConfig;
import org.tio.http.common.RequestLine;
import org.tio.http.common.UploadFile;
import org.tio.http.common.HttpConst.RequestBodyFormat;
import org.tio.http.common.session.HttpSession;
import org.tio.utils.SystemTimer;
import org.tio.utils.hutool.StrUtil;

public class HttpRequest extends HttpPacket {
   private static Logger log = LoggerFactory.getLogger(HttpRequest.class);
   private static final long serialVersionUID = -3849253977016967211L;
   private boolean needForward = false;
   private boolean isForward = false;
   public RequestLine requestLine = null;
   private Map<String, Object[]> params = new HashMap();
   private List<Cookie> cookies = null;
   private Map<String, Cookie> cookieMap = null;
   private int contentLength;
   private String connection;
   private String bodyString;
   private RequestBodyFormat bodyFormat;
   private String charset = "utf-8";
   private Boolean isAjax = null;
   private Boolean isSupportGzip = null;
   private HttpSession httpSession;
   private Node remote = null;
   public ChannelContext channelContext;
   public HttpConfig httpConfig;
   private String domain = null;
   private String host = null;
   private String clientIp = null;
   private long createTime;
   private boolean closed;
   protected Map<String, String> headers;
   private Integer forwardCount;

   public HttpRequest(Node remote) {
      this.createTime = SystemTimer.currTime;
      this.closed = false;
      this.headers = new HashMap();
      this.forwardCount = null;
      this.remote = remote;
   }

   public HttpRequest() {
      this.createTime = SystemTimer.currTime;
      this.closed = false;
      this.headers = new HashMap();
      this.forwardCount = null;
   }

   public void close() {
      this.close((String)null);
   }

   public void close(String remark) {
      this.closed = true;
      Tio.remove(this.channelContext, remark);
   }

   public void addParam(String key, Object value) {
      if (value != null) {
         Object[] existValue = (Object[])this.params.get(key);
         Object newExistValue;
         if (existValue != null) {
            newExistValue = new Object[existValue.length + 1];
            if (value instanceof String) {
               newExistValue = new String[existValue.length + 1];
            } else if (value instanceof UploadFile) {
               newExistValue = new UploadFile[existValue.length + 1];
            }

            System.arraycopy(existValue, 0, newExistValue, 0, existValue.length);
            ((Object[])newExistValue)[((Object[])newExistValue).length - 1] = value;
            this.params.put(key, (Object[]) newExistValue);
         } else {
            newExistValue = null;
            if (value instanceof String) {
               newExistValue = new String[]{(String)value};
            } else if (value instanceof UploadFile) {
               newExistValue = new UploadFile[]{(UploadFile)value};
            }

            this.params.put(key, (Object[]) newExistValue);
         }

      }
   }

   public HttpResponse forward(String newPath) throws Exception {
      if (StrUtil.contains(newPath, '?')) {
         this.requestLine.path = StrUtil.subBefore(newPath, "?", false);
         this.requestLine.queryString = StrUtil.subAfter(newPath, "?", false);
      } else {
         this.requestLine.path = newPath;
         this.requestLine.queryString = null;
      }

      if (this.forwardCount == null) {
         this.forwardCount = 1;
      } else {
         Integer var2 = this.forwardCount;
         Integer var3 = this.forwardCount = this.forwardCount + 1;
      }

      if (this.forwardCount > this.httpConfig.maxForwardCount) {
         log.error("forwardCount[{}] is too large, newPath:{}", this.forwardCount, newPath);
         this.close();
         return null;
      } else {
         this.needForward = true;
         return HttpResponse.NULL_RESPONSE;
      }
   }

   public RequestBodyFormat getBodyFormat() {
      return this.bodyFormat;
   }

   public String getUserAgent() {
      return (String)this.headers.get("user-agent");
   }

   public String getHost() {
      if (this.host != null) {
         return this.host;
      } else {
         this.host = (String)this.headers.get("host");
         return this.host;
      }
   }

   public String getClientIp() {
      return this.clientIp;
   }

   public void addHeader(String key, String value) {
      this.headers.put(key, value);
   }

   public void addHeaders(Map<String, String> headers) {
      if (headers != null) {
         Set<Entry<String, String>> set = headers.entrySet();
         Iterator var3 = set.iterator();

         while(var3.hasNext()) {
            Entry<String, String> entry = (Entry)var3.next();
            this.addHeader((String)entry.getKey(), (String)entry.getValue());
         }
      }

   }

   public String getDomain() {
      if (this.domain != null) {
         return this.domain;
      } else if (StrUtil.isBlank(this.getHost())) {
         return null;
      } else {
         this.domain = StrUtil.subBefore(this.getHost(), ":", false);
         return this.domain;
      }
   }

   public String getBodyString() {
      return this.bodyString;
   }

   public ChannelContext getChannelContext() {
      return this.channelContext;
   }

   public String getCharset() {
      return this.charset;
   }

   public int getContentLength() {
      return this.contentLength;
   }

   public Cookie getCookie(String cooiename) {
      return this.cookieMap == null ? null : (Cookie)this.cookieMap.get(cooiename);
   }

   public Map<String, Cookie> getCookieMap() {
      return this.cookieMap;
   }

   public List<Cookie> getCookies() {
      return this.cookies;
   }

   public HttpConfig getHttpConfig() {
      return this.httpConfig;
   }

   public HttpSession getHttpSession() {
      return this.httpSession;
   }

   public String getHeader(String key) {
      return (String)this.headers.get(key);
   }

   public Map<String, String> getHeaders() {
      return this.headers;
   }

   public void removeHeader(String key, String value) {
      this.headers.remove(key);
   }

   public Boolean getIsAjax() {
      if (this.isAjax == null) {
         String X_Requested_With = this.getHeader("x-requested-with");
         if (X_Requested_With != null && "XMLHttpRequest".equalsIgnoreCase(X_Requested_With)) {
            this.isAjax = true;
         } else {
            this.isAjax = false;
         }
      }

      return this.isAjax;
   }

   public Boolean getIsSupportGzip() {
      return true;
   }

   public Map<String, Object[]> getParams() {
      return this.params;
   }

   public Object getObject(String name) {
      Object[] values = (Object[])this.params.get(name);
      if (values != null && values.length > 0) {
         Object obj = values[0];
         return obj;
      } else {
         return null;
      }
   }

   public String getParam(String name) {
      Object[] values = (Object[])this.params.get(name);
      if (values != null && values.length > 0) {
         Object obj = values[0];
         return (String)obj;
      } else {
         return null;
      }
   }

   public String getString(String name) {
      return this.getParam(name);
   }

   public UploadFile getUploadFile(String name) {
      Object[] values = (Object[])this.params.get(name);
      if (values != null && values.length > 0) {
         Object obj = values[0];
         return (UploadFile)obj;
      } else {
         return null;
      }
   }

   public Integer getInt(String name) {
      String value = this.getParam(name);
      return StrUtil.isBlank(value) ? null : Integer.parseInt(value);
   }

   public Short getShort(String name) {
      String value = this.getParam(name);
      return StrUtil.isBlank(value) ? null : Short.parseShort(value);
   }

   public Byte getByte(String name) {
      String value = this.getParam(name);
      return StrUtil.isBlank(value) ? null : Byte.parseByte(value);
   }

   public Long getLong(String name) {
      String value = this.getParam(name);
      return StrUtil.isBlank(value) ? null : Long.parseLong(value);
   }

   public Double getDouble(String name) {
      String value = this.getParam(name);
      return StrUtil.isBlank(value) ? null : Double.parseDouble(value);
   }

   public Float getFloat(String name) {
      String value = this.getParam(name);
      return StrUtil.isBlank(value) ? null : Float.parseFloat(value);
   }

   public Object[] getParamArray(String name) {
      Object[] values = (Object[])this.params.get(name);
      return values;
   }

   public Node getRemote() {
      return this.remote;
   }

   public RequestLine getRequestLine() {
      return this.requestLine;
   }

   public String logstr() {
      String str = "\r\n请求ID_" + this.getId() + "\r\n" + this.getHeaderString();
      if (null != this.getBodyString()) {
         str = str + this.getBodyString();
      }

      return str;
   }

   public void parseCookie(HttpConfig httpConfig) {
      String cookieline = (String)this.headers.get("cookie");
      if (StrUtil.isNotBlank(cookieline)) {
         this.cookies = new ArrayList();
         this.cookieMap = new HashMap();
         Map<String, String> _cookiemap = Cookie.getEqualMap(cookieline);
         Set<Entry<String, String>> set = _cookiemap.entrySet();
         List<Map<String, String>> cookieListMap = new ArrayList();
         Iterator var6 = set.iterator();

         while(var6.hasNext()) {
            Entry<String, String> cookieMapEntry = (Entry)var6.next();
            HashMap<String, String> cookieOneMap = new HashMap();
            cookieOneMap.put(cookieMapEntry.getKey(), cookieMapEntry.getValue());
            cookieListMap.add(cookieOneMap);
            Cookie cookie = Cookie.buildCookie(cookieOneMap, httpConfig);
            this.cookies.add(cookie);
            this.cookieMap.put(cookie.getName(), cookie);
         }
      }

   }

   public void setBodyFormat(RequestBodyFormat bodyFormat) {
      this.bodyFormat = bodyFormat;
   }

   public void setBodyString(String bodyString) {
      this.bodyString = bodyString;
   }

   public void setChannelContext(ChannelContext channelContext) {
      this.channelContext = channelContext;
   }

   public void setCharset(String charset) {
      this.charset = charset;
   }

   public void setContentLength(int contentLength) {
      this.contentLength = contentLength;
   }

   public void setCookieMap(Map<String, Cookie> cookieMap) {
      this.cookieMap = cookieMap;
   }

   public void setCookies(List<Cookie> cookies) {
      this.cookies = cookies;
   }

   public void setHeaders(Map<String, String> headers) {
      this.headers = headers;
      if (headers != null) {
         this.parseCookie(this.httpConfig);
      }

   }

   public void setHttpConfig(HttpConfig httpConfig) {
      this.httpConfig = httpConfig;
   }

   public void setHttpSession(HttpSession httpSession) {
      this.httpSession = httpSession;
   }

   public void setIsAjax(Boolean isAjax) {
      this.isAjax = isAjax;
   }

   public void setIsSupportGzip(Boolean isSupportGzip) {
      this.isSupportGzip = isSupportGzip;
   }

   public void setParams(Map<String, Object[]> params) {
      this.params = params;
   }

   public void setRemote(Node remote) {
      this.remote = remote;
   }

   public void setRequestLine(RequestLine requestLine) {
      this.requestLine = requestLine;
   }

   public long getCreateTime() {
      return this.createTime;
   }

   public void setCreateTime(long createTime) {
      this.createTime = createTime;
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.requestLine.toString()).append("\r\n");
      if (this.getHeaderString() != null) {
         sb.append(this.getHeaderString()).append("\r\n");
      }

      if (this.getBodyString() != null) {
         sb.append(this.getBodyString());
      }

      return sb.toString();
   }

   public boolean isClosed() {
      return this.closed;
   }

   public void setClosed(boolean closed) {
      this.closed = closed;
   }

   public String getConnection() {
      return this.connection;
   }

   public void setConnection(String connection) {
      this.connection = connection;
   }

   public String getReferer() {
      return this.getHeader("referer");
   }

   public boolean isNeedForward() {
      return this.needForward;
   }

   public void setNeedForward(boolean needForward) {
      this.needForward = needForward;
   }

   public boolean isForward() {
      return this.isForward;
   }

   public void setForward(boolean isForward) {
      this.isForward = isForward;
   }
}
