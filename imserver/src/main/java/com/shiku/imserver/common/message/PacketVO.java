package com.shiku.imserver.common.message;

public class PacketVO implements IMessage {
   private static final long serialVersionUID = 1L;
   private short cmd;
   private byte[] bytes;

   public PacketVO(byte[] bytes) {
      this.bytes = bytes;
   }

   public PacketVO(short cmd, byte[] bytes) {
      this.cmd = cmd;
      this.bytes = bytes;
   }

   public short getCmd() {
      return this.cmd;
   }

   public void setCmd(short cmd) {
      this.cmd = cmd;
   }

   public byte[] getBytes() {
      return this.bytes;
   }

   public void setBytes(byte[] bytes) {
      this.bytes = bytes;
   }
}
