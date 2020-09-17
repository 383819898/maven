package com.shiku.imserver.common.tcp;

import com.shiku.imserver.common.packets.ImPacket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.tio.core.ChannelContext;
import org.tio.core.GroupContext;

public class TcpServerEncoder {
   public static ByteBuffer encode(TcpPacket tcpPacket, GroupContext groupContext, ChannelContext channelContext) {
      int bodyLen = 0;
      byte[] body = tcpPacket.getBytes();
      if (body != null) {
         bodyLen = body.length;
      }

      boolean isCompress = true;
      boolean is4ByteLength = true;
      boolean isEncrypt = true;
      boolean isHasSynSeq = tcpPacket.getSynSeq() > 0;
      byte version = 1;
      byte maskByte = ImPacket.encodeEncrypt(version, isEncrypt);
      maskByte = ImPacket.encodeCompress(maskByte, isCompress);
      maskByte = ImPacket.encodeHasSynSeq(maskByte, isHasSynSeq);
      maskByte = ImPacket.encode4ByteLength(maskByte, is4ByteLength);
      short cmdByte = tcpPacket.getCommand();
      tcpPacket.setVersion(version);
      tcpPacket.setMask(maskByte);
      int allLen = 2;
      if (isHasSynSeq) {
         allLen += 4;
      }

      allLen += 6 + bodyLen;
      ByteBuffer buffer = ByteBuffer.allocate(allLen);
      ByteOrder byteOrder = groupContext == null ? ByteOrder.BIG_ENDIAN : groupContext.getByteOrder();
      buffer.order(byteOrder);
      buffer.put(tcpPacket.getVersion());
      buffer.put(tcpPacket.getMask());
      if (isHasSynSeq) {
         buffer.putInt(tcpPacket.getSynSeq());
      }

      buffer.putShort(cmdByte);
      buffer.putInt(bodyLen);
      buffer.put(body);
      return buffer;
   }
}
