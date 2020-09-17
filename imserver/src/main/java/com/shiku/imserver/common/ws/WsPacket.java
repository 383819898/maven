package com.shiku.imserver.common.ws;

import com.shiku.imserver.common.packets.ImPacket;
import java.util.Arrays;
import org.tio.websocket.common.Opcode;

public class WsPacket extends ImPacket {
   private static final long serialVersionUID = 4506947563506841436L;
   public static final int MAX_LENGTH_OF_BODY = 2202009;
   public static final int MINIMUM_HEADER_LENGTH = 2;
   public static final int MAX_BODY_LENGTH = 524288;
   public static final String CHARSET_NAME = "utf-8";
   private boolean isHandShake;
   private byte[] body;
   private byte[][] bodys;
   private boolean wsEof;
   private Opcode wsOpcode;
   private boolean wsHasMask;
   private long wsBodyLength;
   private byte[] wsMask;
   private String wsBodyText;

   public WsPacket() {
      this.isHandShake = false;
      this.wsOpcode = Opcode.BINARY;
      this.isHandShake = false;
      this.wsOpcode = Opcode.BINARY;
   }

   public WsPacket(short command, byte[] body) {
      this.isHandShake = false;
      this.wsOpcode = Opcode.BINARY;
      this.isHandShake = false;
      this.wsOpcode = Opcode.BINARY;
      if (null == body) {
         this.setCommand(command);
         this.setBytes(body);
      } else {
         byte[] imBody = new byte[body.length + 1];
         imBody[0] = (byte)command;
         System.arraycopy(body, 0, imBody, 1, body.length);
         this.setCommand(command);
         this.setBytes(imBody);
      }
   }

   public void setWSBytes(byte[] bytes) {
      byte cmdBytes = Arrays.copyOf(bytes, 1)[0];
      byte[] contentBytes = Arrays.copyOfRange(bytes, 1, bytes.length);
      this.setCommand((short)cmdBytes);
      this.bytes = contentBytes;
   }

   public WsPacket(byte[] body) {
      this();
      this.body = body;
   }

   public byte[] getBody() {
      return this.body;
   }

   public long getWsBodyLength() {
      return this.wsBodyLength;
   }

   public String getWsBodyText() {
      return this.wsBodyText;
   }

   public byte[] getWsMask() {
      return this.wsMask;
   }

   public Opcode getWsOpcode() {
      return this.wsOpcode;
   }

   public boolean isHandShake() {
      return this.isHandShake;
   }

   public boolean isWsEof() {
      return this.wsEof;
   }

   public boolean isWsHasMask() {
      return this.wsHasMask;
   }

   public String logstr() {
      return "websocket";
   }

   public void setBody(byte[] body) {
      this.body = body;
   }

   public void setHandShake(boolean isHandShake) {
      this.isHandShake = isHandShake;
   }

   public void setWsBodyLength(long wsBodyLength) {
      this.wsBodyLength = wsBodyLength;
   }

   public void setWsBodyText(String wsBodyText) {
      this.wsBodyText = wsBodyText;
   }

   public void setWsEof(boolean wsEof) {
      this.wsEof = wsEof;
   }

   public void setWsHasMask(boolean wsHasMask) {
      this.wsHasMask = wsHasMask;
   }

   public void setWsMask(byte[] wsMask) {
      this.wsMask = wsMask;
   }

   public void setWsOpcode(Opcode wsOpcode) {
      this.wsOpcode = wsOpcode;
   }

   public byte[][] getBodys() {
      return this.bodys;
   }

   public void setBodys(byte[][] bodys) {
      this.bodys = bodys;
   }
}
