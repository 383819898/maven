package com.shiku.imserver.common.message;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;

@MessageCommandAnnotation(
   command = 200
)
public class ServerReqMessage extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private short type;
   private String content;

   public void setType(short type) {
      this.type = type;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public short getType() {
      return this.type;
   }

   public String getContent() {
      return this.content;
   }
}
