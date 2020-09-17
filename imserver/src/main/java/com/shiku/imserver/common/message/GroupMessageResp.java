package com.shiku.imserver.common.message;

import com.alibaba.fastjson.annotation.JSONField;
import com.shiku.imserver.common.annotation.MessageCommandAnnotation;

@MessageCommandAnnotation(
   command = 22
)
public class GroupMessageResp extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private String jid;
   private byte status;
   @JSONField(
      name = "isExit"
   )
   private boolean isExit;

   public void setJid(String jid) {
      this.jid = jid;
   }

   public void setStatus(byte status) {
      this.status = status;
   }

   public void setExit(boolean isExit) {
      this.isExit = isExit;
   }

   public String getJid() {
      return this.jid;
   }

   public byte getStatus() {
      return this.status;
   }

   public boolean isExit() {
      return this.isExit;
   }
}
