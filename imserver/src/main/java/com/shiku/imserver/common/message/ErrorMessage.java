package com.shiku.imserver.common.message;

public class ErrorMessage extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private short code;
   private String arg;

   public void setCode(short code) {
      this.code = code;
   }

   public void setArg(String arg) {
      this.arg = arg;
   }

   public short getCode() {
      return this.code;
   }

   public String getArg() {
      return this.arg;
   }
}
