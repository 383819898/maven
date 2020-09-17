package com.shiku.imserver.common.packets;

import com.shiku.imserver.common.tcp.TcpPacket;

public class MessagePacket extends TcpPacket {
   private static final long serialVersionUID = 1L;

   public MessagePacket() {
   }

   public MessagePacket(byte[] bytes) {
      this.bytes = bytes;
   }
}
