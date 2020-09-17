package com.shiku.imclient;

import com.shiku.imserver.common.SessionContext;
import com.shiku.imserver.common.message.AuthMessage;
import com.shiku.imserver.common.message.MessageHead;
import com.shiku.imserver.common.proto.MessageProBuf;
import com.shiku.imserver.common.tcp.TcpPacket;
import com.shiku.imserver.common.utils.ImUtils;
import com.shiku.imserver.common.utils.ProBufUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.client.intf.ClientAioListener;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.core.intf.Packet;

public abstract class BaseClientListener implements ClientAioListener {
   private static Logger log = LoggerFactory.getLogger(BaseClientListener.class);
   private BaseIMClient imClient;

   public void setImClient(BaseIMClient imClient) {
      this.imClient = imClient;
   }

   public void onAfterConnected(ChannelContext channelContext, boolean isConnected, boolean isReconnect) throws Exception {
      log.info("onAfterConnected channelContext:{}, isConnected:{}, isReconnect:{}", new Object[]{channelContext, isConnected, isReconnect});
      channelContext.setAttribute(new SessionContext());
      channelContext.userid = this.imClient.userId;
      Thread.sleep(10L);
      AuthMessage authMessage = this.authUserMessage(channelContext, this.imClient);
      if (null == authMessage) {
         authMessage = this.authServerUser(channelContext);
      }

      String from = authMessage.getMessageHead().getFrom();
      String userId = ImUtils.parseBareUserId(from);
      Tio.bindUser(channelContext, userId);
      byte[] bytes = ProBufUtils.encodeMessageBody(authMessage, MessageProBuf.AuthMessage.getDescriptor());
      TcpPacket packet = new TcpPacket((short)5, bytes);
      Tio.send(channelContext, packet);
   }

   private AuthMessage authServerUser(ChannelContext channelContext) {
      MessageHead messageHead = new MessageHead();
      messageHead.setChatType((byte)1);
      if (null == channelContext.userid) {
         channelContext.userid = this.imClient.userId;
      }

      messageHead.setFrom(this.imClient.connStr);
      AuthMessage authMessage = new AuthMessage();
      authMessage.setPassword("123456");
      authMessage.setToken("token");
      authMessage.setMessageHead(messageHead);
      return authMessage;
   }

   public abstract AuthMessage authUserMessage(ChannelContext var1, BaseIMClient var2);

   public void onAfterSent(ChannelContext channelContext, Packet packet, boolean isSentSuccess) throws Exception {
   }

   public void onBeforeClose(ChannelContext channelContext, Throwable throwable, String remark, boolean isRemove) {
   }

   public void onAfterDecoded(ChannelContext channelContext, Packet packet, int packetSize) throws Exception {
   }

   public void onAfterReceivedBytes(ChannelContext channelContext, int receivedBytes) throws Exception {
   }

   public void onAfterHandled(ChannelContext channelContext, Packet packet, long cost) throws Exception {
   }
}
