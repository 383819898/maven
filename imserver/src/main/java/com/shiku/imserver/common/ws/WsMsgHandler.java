package com.shiku.imserver.common.ws;

import com.shiku.imserver.common.http.HttpRequest;
import com.shiku.imserver.common.http.HttpResponse;
import org.tio.core.ChannelContext;

public class WsMsgHandler implements IWsMsgHandler {
   public HttpResponse handshake(HttpRequest httpRequest, HttpResponse httpResponse, ChannelContext channelContext) throws Exception {
      return httpResponse;
   }

   public void onAfterHandshaked(HttpRequest httpRequest, HttpResponse httpResponse, ChannelContext channelContext) throws Exception {
   }

   public Object onBytes(WsRequest wsRequest, byte[] bytes, ChannelContext channelContext) throws Exception {
      return null;
   }

   public Object onClose(WsRequest wsRequest, byte[] bytes, ChannelContext channelContext) throws Exception {
      return null;
   }

   public Object onText(WsRequest wsRequest, String text, ChannelContext channelContext) throws Exception {
      return null;
   }
}
