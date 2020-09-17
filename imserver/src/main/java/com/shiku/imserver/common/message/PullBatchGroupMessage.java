package com.shiku.imserver.common.message;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;
import java.util.List;

@MessageCommandAnnotation(
   command = 14
)
public class PullBatchGroupMessage extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private List<String> jidList;
   private long endTime;

   public void setJidList(List<String> jidList) {
      this.jidList = jidList;
   }

   public void setEndTime(long endTime) {
      this.endTime = endTime;
   }

   public List<String> getJidList() {
      return this.jidList;
   }

   public long getEndTime() {
      return this.endTime;
   }
}
