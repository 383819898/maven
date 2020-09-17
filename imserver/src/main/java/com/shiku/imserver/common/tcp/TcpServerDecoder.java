package com.shiku.imserver.common.tcp;

import com.shiku.imserver.common.packets.ImPacket;
import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.exception.AioDecodeException;

public class TcpServerDecoder {
   private static Logger logger = LoggerFactory.getLogger(TcpServerDecoder.class);

   public static TcpPacket decode(ByteBuffer buffer, ChannelContext channelContext) throws AioDecodeException {
      if (!isHeaderLength(buffer)) {
         return null;
      } else {
         byte version = buffer.get();
         byte maskByte = buffer.get();
         Integer synSeq = 0;
         if (ImPacket.decodeHasSynSeq(maskByte)) {
            synSeq = buffer.getInt();
         }

         short cmdByte = buffer.getShort();
         int bodyLen = buffer.getInt();
         if (bodyLen < 0) {
            throw new AioDecodeException("bodyLength [" + bodyLen + "] is not right, remote:" + channelContext.getClientNode());
         } else {
            int readableLength = buffer.limit() - buffer.position();
            int validateBodyLen = readableLength - bodyLen;
            if (validateBodyLen < 0) {
               return null;
            } else {
               byte[] body = new byte[bodyLen];

               try {
                  buffer.get(body, 0, bodyLen);
               } catch (Exception var13) {
                  logger.error(var13.toString());
               }

               TcpPacket tcpPacket = new TcpPacket(cmdByte, body);
               tcpPacket.setVersion(version);
               tcpPacket.setMask(maskByte);
               if (synSeq > 0) {
                  tcpPacket.setSynSeq(synSeq);

                  try {
                     channelContext.getGroupContext().getAioHandler().handler(tcpPacket, channelContext);
                  } catch (Exception var12) {
                     logger.error("同步发送解码调用handler异常!" + var12);
                  }
               }

               return tcpPacket;
            }
         }
      }
   }

   private static boolean isHeaderLength(ByteBuffer buffer) throws AioDecodeException {
      int readableLength = buffer.limit() - buffer.position();
      if (readableLength == 0) {
         return false;
      } else {
         int index = buffer.position();

         try {
            buffer.get(index);
            ++index;
            byte maskByte = buffer.get(index);
            ++index;
            if (ImPacket.decodeHasSynSeq(maskByte)) {
               buffer.getInt(index);
               index += 4;
            }

            buffer.getShort(index);
            index += 2;
            buffer.getInt(index);
            index += 4;
            return true;
         } catch (Exception var4) {
            return false;
         }
      }
   }
}
