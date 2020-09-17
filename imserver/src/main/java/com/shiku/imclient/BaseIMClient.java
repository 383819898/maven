package com.shiku.imclient;

import com.shiku.imserver.common.message.AbstractMessage;
import com.shiku.imserver.common.message.AuthMessage;
import com.shiku.imserver.common.message.ChatMessage;
import com.shiku.imserver.common.message.JoinGroupMessage;
import com.shiku.imserver.common.message.MessageHead;
import com.shiku.imserver.common.packets.ImPacket;
import com.shiku.imserver.common.proto.MessageProBuf;
import com.shiku.imserver.common.tcp.TcpPacket;
import com.shiku.imserver.common.utils.ProBufUtils;
import com.shiku.imserver.common.utils.StringUtils;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.client.ClientChannelContext;
import org.tio.client.ClientGroupContext;
import org.tio.client.ReconnConf;
import org.tio.client.TioClient;
import org.tio.core.ChannelContext;
import org.tio.core.Node;
import org.tio.core.Tio;

public class BaseIMClient {
   protected static final Logger log = LoggerFactory.getLogger(BaseIMClient.class);
   protected Node serverNode;
   protected long pingTime = 60000L;
   protected String userId = "10005";
   protected String resource = "Server";
   protected String connStr = "10005/Server";
   protected boolean isAuth = false;
   protected ClientChannelContext context;
   protected BaseClientHandler clientHandler;
   protected BaseClientListener clientListener;
   protected TioClient tioClient;
   protected ScheduledThreadPoolExecutor executor;
   protected SendMessageReceiptRunnable messageReceiptRunnable;

   public void setISAuth(boolean auth) {
      this.isAuth = auth;
   }

   public boolean getISAuth() {
      return this.isAuth;
   }

   public BaseClientHandler getClientHandler() {
      return this.clientHandler;
   }

   public void setExecutor(ScheduledThreadPoolExecutor executor) {
      this.executor = executor;
   }

   public ScheduledThreadPoolExecutor getExecutor() {
      return this.executor;
   }

   public TioClient getTioClient() {
      return this.tioClient;
   }

   public void initIMClient(String ip, int port, BaseClientHandler clientHandler, BaseClientListener clientListener) throws Exception {
      this.serverNode = new Node(ip, port);
      this.clientHandler = clientHandler;
      this.clientListener = clientListener;
      this.initHandlerListener();
      this.connStr = this.userId + "/" + this.resource;
      this.context = this.getClientChannelContext();
      this.messageReceiptRunnable = new SendMessageReceiptRunnable(this);
      if (null != this.context) {
         this.context.userid = this.userId;
         Tio.bindUser(this.context, this.userId);
         Tio.bindToken(this.context, this.connStr);
      }

   }

   public void connect() throws Exception {
      this.tioClient.connect(this.serverNode);
   }

   public void login() {
      AuthMessage message = this.clientListener.authUserMessage(this.context, this);
      this.sendMessage(message);
   }

   public void joinGroup(String jid) {
      MessageHead messageHead = this.createMessageHead((byte)2, jid);
      JoinGroupMessage message = new JoinGroupMessage();
      message.setJid(jid);
      message.setSeconds(0L);
      message.setMessageHead(messageHead);
      TcpPacket packet = ProBufUtils.encodeTcpPacket(message, MessageProBuf.JoinGroupMessageProBuf.getDescriptor());
      packet.setCommand((short)20);
      this.sendImPacket(packet);
      message = null;
      messageHead = null;
   }

   public MessageHead createMessageHead(byte chatType, String to) {
      MessageHead messageHead = new MessageHead();
      messageHead.setFrom(this.connStr);
      messageHead.setMessageId(StringUtils.newStanzaId());
      messageHead.setTo(to);
      messageHead.setChatType(chatType);
      return messageHead;
   }

   void initHandlerListener() {
      if (null == this.clientHandler) {
         this.clientHandler = new BaseClientHandler() {
            public void handlerReceipt(String messageId) {
            }
         };
      }

      if (null == this.clientListener) {
         this.clientListener = new BaseClientListener() {
            public AuthMessage authUserMessage(ChannelContext channelContext, BaseIMClient imClient) {
               return null;
            }
         };
      }

   }

   public void initIMClient(String ip, int port) {
      try {
         this.initIMClient(ip, port, this.clientHandler, this.clientListener);
      } catch (Exception var4) {
         log.error(var4.toString(), var4);
      }

   }

   public ClientGroupContext getClientGroupContext() {
      ReconnConf reconnConf = new ReconnConf(5000L);
      ClientGroupContext clientGroupContext = new ClientGroupContext(this.clientHandler, this.clientListener, reconnConf);
      return clientGroupContext;
   }

   public ClientChannelContext getClientChannelContext() throws Exception {
      ClientChannelContext clientChannel = null;

      try {
         ClientGroupContext context = this.getClientGroupContext();
         context.setHeartbeatTimeout(this.pingTime);
         this.tioClient = new TioClient(context);
         clientChannel = this.tioClient.connect(this.serverNode);
      } catch (Exception var3) {
         throw var3;
      }

      if (null == clientChannel) {
         log.error("getClientChannelContext  connect Server fail ====>");
      }

      return clientChannel;
   }

   public boolean isSendOk() {
      return this.clientHandler.isSendOk();
   }

   public void setSendOk(boolean sendOk) {
      this.clientHandler.setSendOk(sendOk);
   }

   public ImPacket createPingPacket() {
      return this.clientHandler.createPingPacket(this.context);
   }

   public void sendMessage(ChatMessage message, byte chatType) {
      if (null == message.getMessageHead()) {
         message.setMessageHead(this.createMessageHead(chatType, message.getToUserId()));
      }

      this.sendMessage(message);
   }

   public void sendMessage(AbstractMessage message) {
      this.setSendOk(false);
      TcpPacket packet = ProBufUtils.encodeTcpPacket(message, MessageProBuf.ChatMessage.getDescriptor());
      packet.setCommand((short)10);
      Tio.send(this.getContext(), packet);
   }

   public void sendBlockMessage(AbstractMessage message) {
      this.setSendOk(false);
      TcpPacket packet = ProBufUtils.encodeTcpPacket(message, MessageProBuf.ChatMessage.getDescriptor());
      packet.setCommand((short)10);
      Tio.bSend(this.getContext(), packet);
   }

   public void sendImPacket(ImPacket imPacket) {
      this.setSendOk(false);
      TcpPacket packet = new TcpPacket(imPacket.getCommand(), imPacket.getBytes());
      Tio.send(this.getContext(), packet);
   }

   public AbstractMessage createMessage(String to, short type, String content) {
      ChatMessage message = new ChatMessage();
      MessageHead head = new MessageHead();
      head.setChatType((byte)1);
      head.setMessageId(StringUtils.newStanzaId());
      head.setFrom(this.userId + "/Server");
      head.setTo(to);
      message.setMessageHead(head);
      message.setType(type);
      message.setFromUserId(this.userId);
      message.setToUserId(to);
      message.setContent(content);
      return message;
   }

   public void sendMessageReceipt(AbstractMessage message) {
      this.messageReceiptRunnable.putMessageReceipt(message.getMessageHead().getMessageId());
   }

   public void stop() {
      this.tioClient.stop();
   }

   public void setPingTime(long pingTime) {
      this.pingTime = pingTime;
   }

   public void setResource(String resource) {
      this.resource = resource;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserId() {
      return this.userId;
   }

   public String getResource() {
      return this.resource;
   }

   public String getConnStr() {
      return this.connStr;
   }

   public ClientChannelContext getContext() {
      return this.context;
   }
}
