package com.shiku.imserver.common.message;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;

@MessageCommandAnnotation(
   command = 20
)
public class JoinGroupMessage extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private String jid;
   private long seconds;

   public void setJid(String jid) {
      this.jid = jid;
   }

   public void setSeconds(long seconds) {
      this.seconds = seconds;
   }

   public String getJid() {
      return this.jid;
   }

   public long getSeconds() {
      return this.seconds;
   }
}
