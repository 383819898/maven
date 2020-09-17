package com.shiku.imserver.common;

public class SessionContext implements ISessionContext {
   private String id;

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.id = id;
   }
}
