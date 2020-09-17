package com.shiku.imserver.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.DynamicMessage.Builder;
import com.google.protobuf.util.JsonFormat;
import com.shiku.imserver.common.message.AbstractBaseMessage;
import com.shiku.imserver.common.message.AbstractMessage;
import com.shiku.imserver.common.message.MessageHead;
import com.shiku.imserver.common.message.PacketVO;
import com.shiku.imserver.common.packets.ImPacket;
import com.shiku.imserver.common.proto.MessageProBuf;
import com.shiku.imserver.common.tcp.TcpPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProBufUtils {
   private static final Logger logger = LoggerFactory.getLogger(ProBufUtils.class);

   public static <T> T decoderMessageBody(byte[] bytes, Descriptor descriptor, Class<T> classz) {
      Object message = null;

      try {
         DynamicMessage parseFrom = DynamicMessage.parseFrom(descriptor, bytes);
         String msgStr = JsonFormat.printer().print(parseFrom);
         message = JSONObject.parseObject(msgStr, classz);
         if (null == message) {
            logger.error("message is null");
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return (T) message;
   }

   public static <T extends AbstractMessage> byte[] encodeMessageBody(T message, Descriptor descriptor) {
      byte[] bytes = null;

      try {
         Builder builder = DynamicMessage.newBuilder(descriptor);
         JsonFormat.parser().merge(message.toString(), builder);
         bytes = builder.build().toByteArray();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return bytes;
   }

   public static <T> PacketVO encodePacketVO(T message, Descriptor descriptor) {
      byte[] bytes = null;

      try {
         Builder builder = DynamicMessage.newBuilder(descriptor);
         JsonFormat.parser().merge(message.toString(), builder);
         bytes = builder.build().toByteArray();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return null != bytes ? new PacketVO(bytes) : null;
   }

   public static ImPacket encodeImPacket(AbstractBaseMessage message, Descriptor descriptor) {
      byte[] bytes = null;

      try {
         Builder builder = DynamicMessage.newBuilder(descriptor);
         JsonFormat.parser().merge(message.toString(), builder);
         bytes = builder.build().toByteArray();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return null != bytes ? new ImPacket(bytes) : null;
   }

   public static TcpPacket encodeTcpPacket(AbstractBaseMessage message, Descriptor descriptor) {
      byte[] bytes = null;

      try {
         Builder builder = DynamicMessage.newBuilder(descriptor);
         JsonFormat.parser().merge(message.toString(), builder);
         bytes = builder.build().toByteArray();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return null != bytes ? new TcpPacket(bytes) : null;
   }

   public static <T> MessageProBuf.MessageHead encodeProBufMessageHead(MessageHead messageHead) {
      MessageProBuf.MessageHead result = null;

      try {
         Builder builder = DynamicMessage.newBuilder(MessageProBuf.MessageHead.getDescriptor());
         JsonFormat.parser().merge(messageHead.toString(), builder);
         result = MessageProBuf.MessageHead.parseFrom(builder.build().toByteArray());
         if (null == result) {
            logger.error("MessageHead is null");
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      return result;
   }
}
