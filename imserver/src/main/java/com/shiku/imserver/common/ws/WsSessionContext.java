package com.shiku.imserver.common.ws;

import com.shiku.imserver.common.ISessionContext;
import com.shiku.imserver.common.ImSessionContext;
import com.shiku.imserver.common.http.HttpRequest;
import com.shiku.imserver.common.http.HttpResponse;
import java.util.List;

public class WsSessionContext extends ImSessionContext implements ISessionContext {
   private boolean isHandshaked = false;
   private HttpRequest handshakeRequest = null;
   private HttpResponse handshakeResponse = null;
   private String token = null;
   private List<byte[]> lastParts = null;

   public HttpRequest getHandshakeRequest() {
      return this.handshakeRequest;
   }

   public HttpResponse getHandshakeResponse() {
      return this.handshakeResponse;
   }

   public List<byte[]> getLastParts() {
      return this.lastParts;
   }

   public String getToken() {
      return this.token;
   }

   public boolean isHandshaked() {
      return this.isHandshaked;
   }

   public void setHandshaked(boolean isHandshaked) {
      this.isHandshaked = isHandshaked;
   }

   public void setHandshakeRequest(HttpRequest handshakeRequest) {
      this.handshakeRequest = handshakeRequest;
   }

   public void setHandshakeResponse(HttpResponse handshakeResponse) {
      this.handshakeResponse = handshakeResponse;
   }

   public void setLastParts(List<byte[]> lastParts) {
      this.lastParts = lastParts;
   }

   public void setToken(String token) {
      this.token = token;
   }
}
