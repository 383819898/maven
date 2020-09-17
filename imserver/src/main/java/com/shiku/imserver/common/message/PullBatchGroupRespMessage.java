package com.shiku.imserver.common.message;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;
import java.util.List;

@MessageCommandAnnotation(
   command = 15
)
public class PullBatchGroupRespMessage extends AbstractBaseMessage {
   private static final long serialVersionUID = 1L;
   private String messageId;
   private String jid;
   private long count;
   private List<ChatMessage> messageList;

   public void setMessageId(String messageId) {
      this.messageId = messageId;
   }

   public void setJid(String jid) {
      this.jid = jid;
   }

   public void setCount(long count) {
      this.count = count;
   }

   public void setMessageList(List<ChatMessage> messageList) {
      this.messageList = messageList;
   }

   public String getMessageId() {
      return this.messageId;
   }

   public String getJid() {
      return this.jid;
   }

   public long getCount() {
      return this.count;
   }

   public List<ChatMessage> getMessageList() {
      return this.messageList;
   }
}
