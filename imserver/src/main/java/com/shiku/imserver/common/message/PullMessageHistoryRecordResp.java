package com.shiku.imserver.common.message;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;
import java.util.List;

@MessageCommandAnnotation(
   command = 13
)
public class PullMessageHistoryRecordResp extends AbstractBaseMessage {
   private static final long serialVersionUID = 1L;
   private String messageId;
   private String jid;
   private byte chatType;
   private List<ChatMessage> messageList;
   private int count = 0;

   public void setMessageId(String messageId) {
      this.messageId = messageId;
   }

   public void setJid(String jid) {
      this.jid = jid;
   }

   public void setChatType(byte chatType) {
      this.chatType = chatType;
   }

   public void setMessageList(List<ChatMessage> messageList) {
      this.messageList = messageList;
   }

   public void setCount(int count) {
      this.count = count;
   }

   public String getMessageId() {
      return this.messageId;
   }

   public String getJid() {
      return this.jid;
   }

   public byte getChatType() {
      return this.chatType;
   }

   public List<ChatMessage> getMessageList() {
      return this.messageList;
   }

   public int getCount() {
      return this.count;
   }
}
