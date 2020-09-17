package com.shiku.imserver.common.message;

public abstract class AbstractMessage extends AbstractBaseMessage {
   private static final long serialVersionUID = 1L;
   protected MessageHead messageHead;

   public MessageHead createMessageHead() {
      this.messageHead = new MessageHead();
      return this.messageHead;
   }

   public void setMessageHead(MessageHead messageHead) {
      this.messageHead = messageHead;
   }

   public MessageHead getMessageHead() {
      return this.messageHead;
   }
}
