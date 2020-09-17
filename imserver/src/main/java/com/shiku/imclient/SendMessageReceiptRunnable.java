package com.shiku.imclient;

import com.google.common.collect.Sets;
import com.shiku.imserver.common.message.MessageReceiptStatus;
import com.shiku.imserver.common.proto.MessageProBuf;
import com.shiku.imserver.common.tcp.TcpPacket;
import com.shiku.imserver.common.utils.ProBufUtils;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SendMessageReceiptRunnable implements Runnable {
   private Set<String> messageSet = Sets.newConcurrentHashSet();
   private BaseIMClient imClient;

   public SendMessageReceiptRunnable(BaseIMClient imClient) {
      this.imClient = imClient;
      imClient.getExecutor().scheduleAtFixedRate(this, 2L, 2L, TimeUnit.SECONDS);
   }

   public void putMessageReceipt(String messageId) {
      this.messageSet.add(messageId);
   }

   public void run() {
      StringBuffer messageId = null;
      if (!this.messageSet.isEmpty()) {
         messageId = new StringBuffer();
         synchronized(this.messageSet) {
            Iterator var3 = this.messageSet.iterator();

            while(true) {
               if (!var3.hasNext()) {
                  this.messageSet.clear();
                  break;
               }

               String msgId = (String)var3.next();
               messageId.append(msgId).append(",");
            }
         }

         this.sendMessageReceipt(messageId.toString());
      }

   }

   public void sendMessageReceipt(String messageId) {
      MessageReceiptStatus receiptStatus = new MessageReceiptStatus();
      receiptStatus.setMessageHead(this.imClient.createMessageHead((byte)1, (String)null));
      receiptStatus.setMessageId(messageId);
      receiptStatus.setStatus((byte)2);
      TcpPacket packet = ProBufUtils.encodeTcpPacket(receiptStatus, MessageProBuf.MessageReceiptStatusProBuf.getDescriptor());
      packet.setCommand((short)11);
      this.imClient.sendImPacket(packet);
   }
}
