package com.shiku.imserver.common;

import org.tio.monitor.RateLimiterWrap;
import org.tio.server.intf.ServerAioHandler;

public class ImSessionContext extends SessionContext {
   protected RateLimiterWrap requestRateLimiter = null;
   protected String token = null;
   private ServerAioHandler protocolHandler;

   public String getToken() {
      return this.token;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public RateLimiterWrap getRequestRateLimiter() {
      return this.requestRateLimiter;
   }

   public void setRequestRateLimiter(RateLimiterWrap requestRateLimiter) {
      this.requestRateLimiter = requestRateLimiter;
   }

   public ServerAioHandler getProtocolHandler() {
      return this.protocolHandler;
   }

   public ImSessionContext setProtocolHandler(ServerAioHandler protocolHandler) {
      this.protocolHandler = protocolHandler;
      return this;
   }
}
