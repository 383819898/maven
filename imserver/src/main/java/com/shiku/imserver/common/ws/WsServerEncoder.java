package com.shiku.imserver.common.ws;

import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.GroupContext;
import org.tio.core.utils.ByteBufferUtils;

public class WsServerEncoder {
   private static Logger log = LoggerFactory.getLogger(WsServerEncoder.class);
   public static final int MAX_HEADER_LENGTH = 20480;

   private static void checkLength(byte[] bytes, int length, int offset) {
      if (bytes == null) {
         throw new IllegalArgumentException("null");
      } else if (offset < 0) {
         throw new IllegalArgumentException("invalidate offset " + offset);
      } else if (bytes.length - offset < length) {
         throw new IllegalArgumentException("invalidate length " + bytes.length);
      }
   }

   public static ByteBuffer encode(WsPacket wsResponse, GroupContext groupContext, ChannelContext channelContext) {
      byte[] wsBody = wsResponse.getBytes();
      byte[][] wsBodies = wsResponse.getBodys();
      int wsBodyLength = 0;
      if (wsBody != null) {
         wsBodyLength += wsBody.length;
      } else if (wsBodies != null) {
         for(int i = 0; i < wsBodies.length; ++i) {
            byte[] bs = wsBodies[i];
            wsBodyLength += bs.length;
         }
      }

      byte header0 = (byte)(143 & (wsResponse.getWsOpcode().getCode() | 240));
      ByteBuffer buf = null;
      if (wsBodyLength < 126) {
         buf = ByteBuffer.allocate(2 + wsBodyLength);
         buf.put(header0);
         buf.put((byte)wsBodyLength);
      } else if (wsBodyLength < 65535) {
         buf = ByteBuffer.allocate(4 + wsBodyLength);
         buf.put(header0);
         buf.put((byte)126);
         ByteBufferUtils.writeUB2WithBigEdian(buf, wsBodyLength);
      } else {
         buf = ByteBuffer.allocate(10 + wsBodyLength);
         buf.put(header0);
         buf.put((byte)127);
         buf.position(buf.position() + 4);
         ByteBufferUtils.writeUB4WithBigEdian(buf, (long)wsBodyLength);
      }

      if (wsBody != null && wsBody.length > 0) {
         buf.put(wsBody);
      } else if (wsBodies != null) {
         for(int i = 0; i < wsBodies.length; ++i) {
            byte[] bs = wsBodies[i];
            buf.put(bs);
         }
      }

      return buf;
   }

   public static void int2Byte(byte[] bytes, int value, int offset) {
      checkLength(bytes, 4, offset);
      bytes[offset + 3] = (byte)(value & 255);
      bytes[offset + 2] = (byte)(value >> 8 & 255);
      bytes[offset + 1] = (byte)(value >> 16 & 255);
      bytes[offset + 0] = (byte)(value >> 24);
   }
}
