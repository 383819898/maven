package com.shiku.imserver.common.ws;

import com.shiku.imserver.common.http.HttpRequest;
import com.shiku.imserver.common.http.HttpResponse;
import org.tio.core.ChannelContext;

public interface IWsMsgHandler {
   HttpResponse handshake(HttpRequest var1, HttpResponse var2, ChannelContext var3) throws Exception;

   void onAfterHandshaked(HttpRequest var1, HttpResponse var2, ChannelContext var3) throws Exception;

   Object onBytes(WsRequest var1, byte[] var2, ChannelContext var3) throws Exception;

   Object onClose(WsRequest var1, byte[] var2, ChannelContext var3) throws Exception;

   Object onText(WsRequest var1, String var2, ChannelContext var3) throws Exception;
}
