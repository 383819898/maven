package com.shiku.imserver.common.message;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;

@MessageCommandAnnotation(
   command = 12
)
public class PullMessageHistoryRecord extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private String jid;
   private int size;
   private long startTime;
   private long endTime;

   public void setJid(String jid) {
      this.jid = jid;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public void setStartTime(long startTime) {
      this.startTime = startTime;
   }

   public void setEndTime(long endTime) {
      this.endTime = endTime;
   }

   public String getJid() {
      return this.jid;
   }

   public int getSize() {
      return this.size;
   }

   public long getStartTime() {
      return this.startTime;
   }

   public long getEndTime() {
      return this.endTime;
   }
}
