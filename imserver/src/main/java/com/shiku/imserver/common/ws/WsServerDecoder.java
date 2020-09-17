package com.shiku.imserver.common.ws;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.core.exception.AioDecodeException;
import org.tio.core.utils.ByteBufferUtils;
import org.tio.websocket.common.Opcode;

public class WsServerDecoder {
   private static Logger log = LoggerFactory.getLogger(WsServerDecoder.class);

   public static WsRequest decode(ByteBuffer buf, ChannelContext channelContext) throws AioDecodeException {
      WsSessionContext imSessionContext = (WsSessionContext)channelContext.getAttribute();
      List<byte[]> lastParts = imSessionContext.getLastParts();
      int initPosition = buf.position();
      int readableLength = buf.limit() - initPosition;
      int headLength = 2;
      if (readableLength < headLength) {
         return null;
      } else {
         byte first = buf.get();
         boolean fin = (first & 128) > 0;
         int rsv = (first & 112) >>> 4;
         byte opCodeByte = (byte)(first & 15);
         Opcode opcode = Opcode.valueOf(opCodeByte);
         if (opcode == Opcode.CLOSE) {
         }

         if (!fin) {
            log.error("{} 暂时不支持fin为false的请求", channelContext);
            Tio.remove(channelContext, "暂时不支持fin为false的请求");
            return null;
         } else {
            imSessionContext.setLastParts((List)null);
            byte second = buf.get();
            boolean hasMask = (second & 255) >> 7 == 1;
            if (hasMask) {
               headLength += 4;
            }

            int payloadLength = second & 127;
            byte[] mask = null;
            if (payloadLength == 126) {
               headLength += 2;
               if (readableLength < headLength) {
                  return null;
               }

               payloadLength = ByteBufferUtils.readUB2WithBigEdian(buf);
            } else if (payloadLength == 127) {
               headLength += 8;
               if (readableLength < headLength) {
                  return null;
               }

               payloadLength = (int)buf.getLong();
               log.info("{} payloadLengthFlag: 127，payloadLength {}", channelContext, payloadLength);
            }

            if (payloadLength >= 0 && payloadLength <= 524288) {
               if (readableLength < headLength + payloadLength) {
                  return null;
               } else {
                  if (hasMask) {
                     mask = ByteBufferUtils.readBytes(buf, 4);
                  }

                  WsRequest websocketPacket = new WsRequest();
                  websocketPacket.setWsEof(fin);
                  websocketPacket.setWsHasMask(hasMask);
                  websocketPacket.setWsMask(mask);
                  websocketPacket.setWsOpcode(opcode);
                  websocketPacket.setWsBodyLength((long)payloadLength);
                  if (payloadLength == 0) {
                     return websocketPacket;
                  } else {
                     byte[] array = ByteBufferUtils.readBytes(buf, payloadLength);
                     int allLength;
                     if (hasMask) {
                        for(allLength = 0; allLength < array.length; ++allLength) {
                           array[allLength] ^= mask[allLength % 4];
                        }
                     }

                     if (!fin) {
                        log.error("payloadLength {}, lastParts size {}, array length {}", new Object[]{payloadLength, lastParts.size(), array.length});
                        return websocketPacket;
                     } else {
                        allLength = array.length;
                        Iterator text;
                        if (lastParts != null) {
                           byte[] part;
                           for(text = lastParts.iterator(); text.hasNext(); allLength += part.length) {
                              part = (byte[])text.next();
                           }

                           byte[] allByte = new byte[allLength];
                           int offset = 0;

//                           byte[] part;
                           for(Iterator var21 = lastParts.iterator(); var21.hasNext(); offset += part.length) {
                              part = (byte[])var21.next();
                              System.arraycopy(part, 0, allByte, offset, part.length);
                           }

                           System.arraycopy(array, 0, allByte, offset, array.length);
                           array = allByte;
                        }

                        websocketPacket.setBytes(array);
                        if (opcode != Opcode.BINARY) {
                           try {
                              text = null;
                              String text1 = new String(array, "utf-8");
                              websocketPacket.setWsBodyText(text1);
                           } catch (UnsupportedEncodingException var23) {
                              log.error(var23.toString(), var23);
                           }
                        }

                        return websocketPacket;
                     }
                  }
               }
            } else {
               throw new AioDecodeException("body length(" + payloadLength + ") is not right");
            }
         }
      }
   }

   public static enum Step {
      header,
      remain_header,
      data;
   }
}
