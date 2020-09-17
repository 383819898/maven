package com.shiku.imserver.common.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.intf.AioListener;
import org.tio.core.intf.Packet;

public class BaseListener implements AioListener {
   protected static final Logger logger = LoggerFactory.getLogger(BaseListener.class);

   public void onAfterConnected(ChannelContext channelContext, boolean isConnected, boolean isReconnect) throws Exception {
      logger.info("onAfterConnected  ");
   }

   public void onAfterDecoded(ChannelContext channelContext, Packet packet, int packetSize) throws Exception {
   }

   public void onAfterReceivedBytes(ChannelContext channelContext, int receivedBytes) throws Exception {
   }

   public void onAfterSent(ChannelContext channelContext, Packet packet, boolean isSentSuccess) throws Exception {
   }

   public void onAfterHandled(ChannelContext channelContext, Packet packet, long cost) throws Exception {
   }

   public void onBeforeClose(ChannelContext channelContext, Throwable throwable, String remark, boolean isRemove) throws Exception {
   }
}
