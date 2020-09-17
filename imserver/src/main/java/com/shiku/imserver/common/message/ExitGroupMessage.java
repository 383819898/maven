package com.shiku.imserver.common.message;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;

@MessageCommandAnnotation(
   command = 21
)
public class ExitGroupMessage extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private String jid;

   public void setJid(String jid) {
      this.jid = jid;
   }

   public String getJid() {
      return this.jid;
   }
}
