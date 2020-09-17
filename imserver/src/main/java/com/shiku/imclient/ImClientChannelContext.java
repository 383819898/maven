package com.shiku.imclient;

import org.tio.client.ClientChannelContext;
import org.tio.core.GroupContext;

public class ImClientChannelContext extends ClientChannelContext {
   private boolean sendOk = false;

   public ImClientChannelContext(GroupContext groupContext) {
      super(groupContext);
   }

   public boolean isSendOk() {
      return this.sendOk;
   }

   public void setSendOk(boolean sendOk) {
      this.sendOk = sendOk;
   }
}
