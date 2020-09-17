package com.shiku.imclient;

import com.shiku.imserver.common.message.AbstractMessage;
import com.shiku.imserver.common.message.AuthRespMessage;
import com.shiku.imserver.common.message.ChatMessage;
import com.shiku.imserver.common.message.ErrorMessage;
import com.shiku.imserver.common.message.GroupMessageResp;
import com.shiku.imserver.common.message.MessageHead;
import com.shiku.imserver.common.message.MessageReceiptStatus;
import com.shiku.imserver.common.message.PingMessage;
import com.shiku.imserver.common.message.SuccessMessage;
import com.shiku.imserver.common.packets.ImPacket;
import com.shiku.imserver.common.proto.MessageProBuf;
import com.shiku.imserver.common.tcp.TcpPacket;
import com.shiku.imserver.common.tcp.TcpServerDecoder;
import com.shiku.imserver.common.tcp.TcpServerEncoder;
import com.shiku.imserver.common.utils.ProBufUtils;
import com.shiku.imserver.common.utils.StringUtils;
import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.client.intf.ClientAioHandler;
import org.tio.core.ChannelContext;
import org.tio.core.GroupContext;
import org.tio.core.exception.AioDecodeException;
import org.tio.core.intf.Packet;

public abstract class BaseClientHandler implements ClientAioHandler {
   private static Logger logger = LoggerFactory.getLogger(BaseClientListener.class);
   private boolean sendOk = false;
   private BaseIMClient imClient;

   public void setImClient(BaseIMClient imClient) {
      this.imClient = imClient;
   }

   public boolean isSendOk() {
      return this.sendOk;
   }

   public void setSendOk(boolean sendOk) {
      this.sendOk = sendOk;
   }

   public Packet heartbeatPacket(ChannelContext channelContext) {
      return this.createPingPacket(channelContext);
   }

   public ImPacket createPingPacket(ChannelContext channelContext) {
      PingMessage message = new PingMessage();
      MessageHead head = new MessageHead();
      head.setChatType((byte)9);
      head.setMessageId(StringUtils.newStanzaId());
      head.setFrom(channelContext.userid + "/Server");
      message.setMessageHead(head);
      ImPacket packet = ProBufUtils.encodeTcpPacket(message, MessageProBuf.PingMessageProBuf.getDescriptor());
      packet.setCommand((short)99);
      return packet;
   }

   public Packet decode(ByteBuffer buffer, int limit, int position, int readableLength, ChannelContext channelContext) throws AioDecodeException {
      return TcpServerDecoder.decode(buffer, channelContext);
   }

   public ByteBuffer encode(Packet packet, GroupContext groupContext, ChannelContext channelContext) {
      return TcpServerEncoder.encode((TcpPacket)packet, groupContext, channelContext);
   }

   public void handler(Packet packet, ChannelContext channelContext) throws Exception {
      ImPacket imPacket = (ImPacket)packet;
      AbstractMessage message = null;
      this.handlerPacket(imPacket);
      switch(imPacket.getCommand()) {
      case -3:
         message = (AbstractMessage)ProBufUtils.decoderMessageBody(imPacket.getBytes(), MessageProBuf.CommonErrorProBuf.getDescriptor(), ErrorMessage.class);
         break;
      case -1:
         message = (AbstractMessage)ProBufUtils.decoderMessageBody(imPacket.getBytes(), MessageProBuf.CommonErrorProBuf.getDescriptor(), ErrorMessage.class);
         break;
      case 6:
         message = (AbstractMessage)ProBufUtils.decoderMessageBody(imPacket.getBytes(), MessageProBuf.AuthRespMessageProBuf.getDescriptor(), AuthRespMessage.class);
         this.handlerLoginResult((AuthRespMessage)message);
         break;
      case 10:
         message = (AbstractMessage)ProBufUtils.decoderMessageBody(imPacket.getBytes(), MessageProBuf.ChatMessage.getDescriptor(), ChatMessage.class);
         this.sendMessageReceipt(message);
         break;
      case 11:
         message = (AbstractMessage)ProBufUtils.decoderMessageBody(imPacket.getBytes(), MessageProBuf.MessageReceiptStatusProBuf.getDescriptor(), MessageReceiptStatus.class);
         this.handlerReceipt(message.getMessageHead().getMessageId());
         break;
      case 22:
         message = (AbstractMessage)ProBufUtils.decoderMessageBody(imPacket.getBytes(), MessageProBuf.GroupMessageRespProBuf.getDescriptor(), GroupMessageResp.class);
         this.handlerJoinGroupResult((GroupMessageResp)message);
         break;
      case 100:
         message = (AbstractMessage)ProBufUtils.decoderMessageBody(imPacket.getBytes(), MessageProBuf.CommonSuccessProBuf.getDescriptor(), SuccessMessage.class);
         this.handlerReceipt(message.getMessageHead().getMessageId());
      }

      if (null != message) {
         this.handlerMessage(message);
      }

   }

   public void handlerReceipt(String messageId) {
      this.setSendOk(true);
   }

   public void sendMessageReceipt(AbstractMessage message) {
      this.imClient.sendMessageReceipt(message);
   }

   public void handlerPacket(ImPacket imPacket) {
   }

   public void handlerLoginResult(AuthRespMessage message) {
      if (0 == message.getStatus()) {
         logger.info("login ---> fail {} ", message.getMessageHead().getFrom());
         this.imClient.getTioClient().stop();
      } else {
         this.imClient.setISAuth(true);
      }

      logger.info("login result ===> {}   status > {}  {} ", new Object[]{message.getMessageHead().getFrom(), message.getStatus(), message.getArg()});
   }

   public void handlerErrorResult(ErrorMessage message) {
      logger.error("handlerError ===> {}   messageId > {} arg {}" + message.getMessageHead().getFrom(), message.getMessageHead().getMessageId(), message.getArg());
   }

   public void handlerJoinGroupResult(GroupMessageResp message) {
      logger.info("joinGroupResult ===> {} isExit  {}  status {}", new Object[]{message.getMessageHead().getFrom(), message.isExit(), message.getStatus()});
   }

   public void handlerMessage(AbstractMessage message) {
   }
}
