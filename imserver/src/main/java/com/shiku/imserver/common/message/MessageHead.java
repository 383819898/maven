package com.shiku.imserver.common.message;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class MessageHead implements Serializable, Cloneable {
   private static final long serialVersionUID = 1L;
   protected String from;
   protected String to;
   protected byte chatType;
   protected String messageId;
   @JSONField(
      name = "offline"
   )
   protected boolean offline;

   public String toString() {
      return JSON.toJSONString(this);
   }

   public void setFrom(String from) {
      this.from = from;
   }

   public void setTo(String to) {
      this.to = to;
   }

   public void setChatType(byte chatType) {
      this.chatType = chatType;
   }

   public void setMessageId(String messageId) {
      this.messageId = messageId;
   }

   public void setOffline(boolean offline) {
      this.offline = offline;
   }

   public String getFrom() {
      return this.from;
   }

   public String getTo() {
      return this.to;
   }

   public byte getChatType() {
      return this.chatType;
   }

   public String getMessageId() {
      return this.messageId;
   }

   public boolean isOffline() {
      return this.offline;
   }
}
