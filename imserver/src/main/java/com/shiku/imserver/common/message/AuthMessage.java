package com.shiku.imserver.common.message;

public class AuthMessage extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private String token;
   private String password;

   public void setToken(String token) {
      this.token = token;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getToken() {
      return this.token;
   }

   public String getPassword() {
      return this.password;
   }
}
