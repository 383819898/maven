package com.shiku.imserver.common.message;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;

@MessageCommandAnnotation(
   command = 6
)
public class AuthRespMessage extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private byte status;
   private String arg;
   private String token;
   private String resources;

   public void setStatus(byte status) {
      this.status = status;
   }

   public void setArg(String arg) {
      this.arg = arg;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public void setResources(String resources) {
      this.resources = resources;
   }

   public byte getStatus() {
      return this.status;
   }

   public String getArg() {
      return this.arg;
   }

   public String getToken() {
      return this.token;
   }

   public String getResources() {
      return this.resources;
   }
}
