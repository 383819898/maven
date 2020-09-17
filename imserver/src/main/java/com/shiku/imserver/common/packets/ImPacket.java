package com.shiku.imserver.common.packets;

import com.shiku.imserver.common.message.ChatMessage;
import org.tio.core.intf.Packet;

public class ImPacket extends Packet implements IPacket {
   private static final long serialVersionUID = 2000118564569232098L;
   protected byte[] bytes;
   private short command;
   private ChatMessage message;

   public ImPacket() {
   }

   public ImPacket(byte[] bytes) {
      this.bytes = bytes;
   }

   public ImPacket(short command, byte[] body) {
      this(body);
      this.setCommand(command);
   }

   public ImPacket(short command) {
      this(command, (byte[])null);
   }

   public void releaseMessageBody() {
      this.setBytes((byte[])null);
   }

   public static byte encodeEncrypt(byte bs, boolean isEncrypt) {
      return isEncrypt ? (byte)(bs | -128) : 0;
   }

   public static boolean decodeCompress(byte version) {
      return (64 & version) != 0;
   }

   public static byte encodeCompress(byte bs, boolean isCompress) {
      return isCompress ? (byte)(bs | 64) : (byte)(bs & 63);
   }

   public static boolean decodeHasSynSeq(byte maskByte) {
      return (32 & maskByte) != 0;
   }

   public static byte encodeHasSynSeq(byte bs, boolean hasSynSeq) {
      return hasSynSeq ? (byte)(bs | 32) : (byte)(bs & 95);
   }

   public static boolean decode4ByteLength(byte version) {
      return (16 & version) != 0;
   }

   public static byte encode4ByteLength(byte bs, boolean is4ByteLength) {
      return is4ByteLength ? (byte)(bs | 16) : (byte)(bs & 111);
   }

   public static byte decodeVersion(byte version) {
      return (byte)(15 & version);
   }

   public int calcHeaderLength(boolean is4byteLength) {
      int ret = 4;
      if (is4byteLength) {
         ret += 2;
      }

      if (this.getSynSeq() > 0) {
         ret += 4;
      }

      return ret;
   }

   public short getCommand() {
      return this.command;
   }

   public void setCommand(short type) {
      this.command = type;
   }

   public byte[] getBytes() {
      return this.bytes;
   }

   public void setBytes(byte[] bytes) {
      this.bytes = bytes;
   }

   public String logstr() {
      return String.valueOf(this.command);
   }

   public ChatMessage getMessage() {
      return this.message;
   }

   public void setMessage(ChatMessage message) {
      this.message = message;
   }
}
