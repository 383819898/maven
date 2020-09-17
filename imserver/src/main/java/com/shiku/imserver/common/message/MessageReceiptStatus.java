package com.shiku.imserver.common.message;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;

@MessageCommandAnnotation(
   command = 11
)
public class MessageReceiptStatus extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private byte status;
   private String messageId;

   public void setStatus(byte status) {
      this.status = status;
   }

   public void setMessageId(String messageId) {
      this.messageId = messageId;
   }

   public byte getStatus() {
      return this.status;
   }

   public String getMessageId() {
      return this.messageId;
   }
}
