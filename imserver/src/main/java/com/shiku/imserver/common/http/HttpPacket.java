package com.shiku.imserver.common.http;

import com.shiku.imserver.common.packets.ImPacket;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HttpPacket extends ImPacket {
   private static final long serialVersionUID = 3903186670675671956L;
   private Map<String, Serializable> props = new HashMap();
   protected byte[] body;
   private String headerString;

   public Object getAttribute(String key) {
      return this.props.get(key);
   }

   public Object getAttribute(String key, Serializable defaultValue) {
      Serializable ret = (Serializable)this.props.get(key);
      return ret == null ? defaultValue : ret;
   }

   public void removeAttribute(String key) {
      this.props.remove(key);
   }

   public void setAttribute(String key, Serializable value) {
      this.props.put(key, value);
   }

   public byte[] getBody() {
      return this.body;
   }

   public void setBody(byte[] body) {
      this.body = body;
   }

   public String getHeaderString() {
      return this.headerString;
   }

   public void setHeaderString(String headerString) {
      this.headerString = headerString;
   }
}
