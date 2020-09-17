package com.shiku.imserver.common.tcp;

import com.shiku.imserver.common.packets.ImPacket;

public class TcpPacket extends ImPacket {
   private static final long serialVersionUID = -4283971967100935982L;
   private byte version = 0;
   private byte mask = 0;

   public TcpPacket() {
   }

   public TcpPacket(short command, byte[] body) {
      super(command, body);
   }

   public TcpPacket(byte[] body) {
      super(body);
   }

   public byte getVersion() {
      return this.version;
   }

   public void setVersion(byte version) {
      this.version = version;
   }

   public byte getMask() {
      return this.mask;
   }

   public void setMask(byte mask) {
      this.mask = mask;
   }
}
