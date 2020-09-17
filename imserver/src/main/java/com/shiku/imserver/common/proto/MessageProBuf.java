package com.shiku.imserver.common.proto;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MessageProBuf {
   private static final Descriptor internal_static_Message_MessageHead_descriptor;
   private static final FieldAccessorTable internal_static_Message_MessageHead_fieldAccessorTable;
   private static final Descriptor internal_static_Message_ChatMessage_descriptor;
   private static final FieldAccessorTable internal_static_Message_ChatMessage_fieldAccessorTable;
   private static final Descriptor internal_static_Message_AuthMessage_descriptor;
   private static final FieldAccessorTable internal_static_Message_AuthMessage_fieldAccessorTable;
   private static final Descriptor internal_static_Message_AuthRespMessageProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_AuthRespMessageProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_MessageReceiptStatusProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_MessageReceiptStatusProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_JoinGroupMessageProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_JoinGroupMessageProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_ExitGroupMessageProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_ExitGroupMessageProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_GroupMessageRespProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_GroupMessageRespProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_PullMessageHistoryRecordReqProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_PullMessageHistoryRecordReqProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_PullMessageHistoryRecordRespProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_PullMessageHistoryRecordRespProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_PullBatchGroupMessageReqProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_PullBatchGroupMessageReqProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_PullGroupMessageRespProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_PullGroupMessageRespProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_PingMessageProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_PingMessageProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_CommonSuccessProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_CommonSuccessProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_CommonErrorProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_CommonErrorProBuf_fieldAccessorTable;
   private static final Descriptor internal_static_Message_ServerReqMessageProBuf_descriptor;
   private static final FieldAccessorTable internal_static_Message_ServerReqMessageProBuf_fieldAccessorTable;
   private static FileDescriptor descriptor;

   private MessageProBuf() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite registry) {
   }

   public static void registerAllExtensions(ExtensionRegistry registry) {
      registerAllExtensions((ExtensionRegistryLite)registry);
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] descriptorData = new String[]{"\n\rmessage.proto\u0012\u0007Message\"]\n\u000bMessageHead\u0012\f\n\u0004from\u0018\u0001 \u0001(\t\u0012\n\n\u0002to\u0018\u0002 \u0001(\t\u0012\u0011\n\tmessageId\u0018\u0003 \u0001(\t\u0012\u0010\n\bchatType\u0018\u0004 \u0001(\u0005\u0012\u000f\n\u0007offline\u0018\u0005 \u0001(\b\"ø\u0002\n\u000bChatMessage\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\u0012\n\nfromUserId\u0018\u0002 \u0001(\t\u0012\u0014\n\ffromUserName\u0018\u0003 \u0001(\t\u0012\u0010\n\btoUserId\u0018\u0004 \u0001(\t\u0012\u0012\n\ntoUserName\u0018\u0005 \u0001(\t\u0012\u0010\n\btimeSend\u0018\u0006 \u0001(\u0003\u0012\f\n\u0004type\u0018\u0007 \u0001(\u0005\u0012\u000f\n\u0007content\u0018\b \u0001(\t\u0012\u0010\n\bobjectId\u0018\t \u0001(\t\u0012\u0010\n\bfileName\u0018\n \u0001(\t\u0012\u0011\n\tisEncrypt\u0018\u000b \u0001(\b\u0012\u0012\n\ndeleteTime\u0018\f \u0001(\u0003\u0012\u0011\n\tisReadDel\u0018\r \u0001(\b\u0012\u0010\n\bfileSize\u0018\u000e \u0001(\u0003\u0012\u0010\n\bfileTime\u0018\u000f \u0001(\u0003\u0012\u0012\n\nlocation_x\u0018\u0010 \u0001(\u0001\u0012\u0012\n\nlocation_y\u0018\u0011 \u0001(\u0001\u0012\u0013\n\u000bencryptType\u0018\u0012 \u0001(\u0005\"Y\n\u000bAuthMessage\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\r\n\u0005token\u0018\u0002 \u0001(\t\u0012\u0010\n\bpassword\u0018\u0003 \u0001(\t\"\u0081\u0001\n\u0015AuthRespMessageProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\u000e\n\u0006status\u0018\u0002 \u0001(\u0005\u0012\u000b\n\u0003arg\u0018\u0003 \u0001(\t\u0012\r\n\u0005token\u0018\u0004 \u0001(\t\u0012\u0011\n\tresources\u0018\u0005 \u0001(\t\"j\n\u001aMessageReceiptStatusProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\u000e\n\u0006status\u0018\u0002 \u0001(\u0005\u0012\u0011\n\tmessageId\u0018\u0003 \u0001(\t\"a\n\u0016JoinGroupMessageProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\u000b\n\u0003jid\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007seconds\u0018\u0003 \u0001(\u0003\"P\n\u0016ExitGroupMessageProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\u000b\n\u0003jid\u0018\u0002 \u0001(\t\"p\n\u0016GroupMessageRespProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\u000b\n\u0003jid\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006status\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006isExit\u0018\u0004 \u0001(\b\"\u008d\u0001\n!PullMessageHistoryRecordReqProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\u000b\n\u0003jid\u0018\u0002 \u0001(\t\u0012\f\n\u0004size\u0018\u0003 \u0001(\u0005\u0012\u0011\n\tstartTime\u0018\u0004 \u0001(\u0003\u0012\u000f\n\u0007endTime\u0018\u0005 \u0001(\u0003\"\u0090\u0001\n\"PullMessageHistoryRecordRespProBuf\u0012\u0011\n\tmessageId\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003jid\u0018\u0002 \u0001(\t\u0012\u0010\n\bchatType\u0018\u0003 \u0001(\u0005\u0012)\n\u000bmessageList\u0018\u0004 \u0003(\u000b2\u0014.Message.ChatMessage\u0012\r\n\u0005count\u0018\u0005 \u0001(\u0005\"m\n\u001ePullBatchGroupMessageReqProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\u000f\n\u0007jidList\u0018\u0002 \u0003(\t\u0012\u000f\n\u0007endTime\u0018\u0003 \u0001(\u0003\"v\n\u001aPullGroupMessageRespProBuf\u0012\u0011\n\tmessageId\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003jid\u0018\u0002 \u0001(\t\u0012\r\n\u0005count\u0018\u0003 \u0001(\u0003\u0012)\n\u000bmessageList\u0018\u0004 \u0003(\u000b2\u0014.Message.ChatMessage\">\n\u0011PingMessageProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\"@\n\u0013CommonSuccessProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\"Y\n\u0011CommonErrorProBuf\u0012)\n\u000bmessageHead\u0018\u0001 \u0001(\u000b2\u0014.Message.MessageHead\u0012\f\n\u0004code\u0018\u0002 \u0001(\u0005\u0012\u000b\n\u0003arg\u0018\u0003 \u0001(\t\"7\n\u0016ServerReqMessageProBuf\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007content\u0018\u0002 \u0001(\tB0\n\u001fcom.shiku.imserver.common.protoB\rMessageProBufb\u0006proto3"};
      InternalDescriptorAssigner assigner = new InternalDescriptorAssigner() {
         public ExtensionRegistry assignDescriptors(FileDescriptor root) {
            MessageProBuf.descriptor = root;
            return null;
         }
      };
      FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new FileDescriptor[0], assigner);
      internal_static_Message_MessageHead_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_Message_MessageHead_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_MessageHead_descriptor, new String[]{"From", "To", "MessageId", "ChatType", "Offline"});
      internal_static_Message_ChatMessage_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_Message_ChatMessage_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_ChatMessage_descriptor, new String[]{"MessageHead", "FromUserId", "FromUserName", "ToUserId", "ToUserName", "TimeSend", "Type", "Content", "ObjectId", "FileName", "IsEncrypt", "DeleteTime", "IsReadDel", "FileSize", "FileTime", "LocationX", "LocationY", "EncryptType"});
      internal_static_Message_AuthMessage_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_Message_AuthMessage_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_AuthMessage_descriptor, new String[]{"MessageHead", "Token", "Password"});
      internal_static_Message_AuthRespMessageProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_Message_AuthRespMessageProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_AuthRespMessageProBuf_descriptor, new String[]{"MessageHead", "Status", "Arg", "Token", "Resources"});
      internal_static_Message_MessageReceiptStatusProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_Message_MessageReceiptStatusProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_MessageReceiptStatusProBuf_descriptor, new String[]{"MessageHead", "Status", "MessageId"});
      internal_static_Message_JoinGroupMessageProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_Message_JoinGroupMessageProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_JoinGroupMessageProBuf_descriptor, new String[]{"MessageHead", "Jid", "Seconds"});
      internal_static_Message_ExitGroupMessageProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_Message_ExitGroupMessageProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_ExitGroupMessageProBuf_descriptor, new String[]{"MessageHead", "Jid"});
      internal_static_Message_GroupMessageRespProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_Message_GroupMessageRespProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_GroupMessageRespProBuf_descriptor, new String[]{"MessageHead", "Jid", "Status", "IsExit"});
      internal_static_Message_PullMessageHistoryRecordReqProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_Message_PullMessageHistoryRecordReqProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_PullMessageHistoryRecordReqProBuf_descriptor, new String[]{"MessageHead", "Jid", "Size", "StartTime", "EndTime"});
      internal_static_Message_PullMessageHistoryRecordRespProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_Message_PullMessageHistoryRecordRespProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_PullMessageHistoryRecordRespProBuf_descriptor, new String[]{"MessageId", "Jid", "ChatType", "MessageList", "Count"});
      internal_static_Message_PullBatchGroupMessageReqProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_Message_PullBatchGroupMessageReqProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_PullBatchGroupMessageReqProBuf_descriptor, new String[]{"MessageHead", "JidList", "EndTime"});
      internal_static_Message_PullGroupMessageRespProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_Message_PullGroupMessageRespProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_PullGroupMessageRespProBuf_descriptor, new String[]{"MessageId", "Jid", "Count", "MessageList"});
      internal_static_Message_PingMessageProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_Message_PingMessageProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_PingMessageProBuf_descriptor, new String[]{"MessageHead"});
      internal_static_Message_CommonSuccessProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_Message_CommonSuccessProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_CommonSuccessProBuf_descriptor, new String[]{"MessageHead"});
      internal_static_Message_CommonErrorProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_Message_CommonErrorProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_CommonErrorProBuf_descriptor, new String[]{"MessageHead", "Code", "Arg"});
      internal_static_Message_ServerReqMessageProBuf_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_Message_ServerReqMessageProBuf_fieldAccessorTable = new FieldAccessorTable(internal_static_Message_ServerReqMessageProBuf_descriptor, new String[]{"Type", "Content"});
   }

   public static final class ServerReqMessageProBuf extends GeneratedMessageV3 implements MessageProBuf.ServerReqMessageProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int CONTENT_FIELD_NUMBER = 2;
      private volatile Object content_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.ServerReqMessageProBuf DEFAULT_INSTANCE = new MessageProBuf.ServerReqMessageProBuf();
      private static final Parser<MessageProBuf.ServerReqMessageProBuf> PARSER = new AbstractParser<MessageProBuf.ServerReqMessageProBuf>() {
         public MessageProBuf.ServerReqMessageProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.ServerReqMessageProBuf(input, extensionRegistry);
         }
      };

      private ServerReqMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ServerReqMessageProBuf() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
         this.content_ = "";
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ServerReqMessageProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
//            int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 8:
                     this.type_ = input.readInt32();
                     break;
                  case 18:
                     String s = input.readStringRequireUtf8();
                     this.content_ = s;
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_ServerReqMessageProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_ServerReqMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.ServerReqMessageProBuf.class, MessageProBuf.ServerReqMessageProBuf.Builder.class);
      }

      public int getType() {
         return this.type_;
      }

      public String getContent() {
         Object ref = this.content_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.content_ = s;
            return s;
         }
      }

      public ByteString getContentBytes() {
         Object ref = this.content_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.content_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.type_ != 0) {
            output.writeInt32(1, this.type_);
         }

         if (!this.getContentBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.content_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.type_ != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if (!this.getContentBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.content_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.ServerReqMessageProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.ServerReqMessageProBuf other = (MessageProBuf.ServerReqMessageProBuf)obj;
            boolean result = true;
            result = result && this.getType() == other.getType();
            result = result && this.getContent().equals(other.getContent());
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
             hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getType();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getContent().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.ServerReqMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.ServerReqMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.ServerReqMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.ServerReqMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.ServerReqMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.ServerReqMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.ServerReqMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.ServerReqMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.ServerReqMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.ServerReqMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.ServerReqMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.ServerReqMessageProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.ServerReqMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.ServerReqMessageProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.ServerReqMessageProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.ServerReqMessageProBuf.Builder newBuilder(MessageProBuf.ServerReqMessageProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.ServerReqMessageProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.ServerReqMessageProBuf.Builder() : (new MessageProBuf.ServerReqMessageProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.ServerReqMessageProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.ServerReqMessageProBuf.Builder builder = new MessageProBuf.ServerReqMessageProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.ServerReqMessageProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.ServerReqMessageProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.ServerReqMessageProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.ServerReqMessageProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      ServerReqMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      ServerReqMessageProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.ServerReqMessageProBuf.Builder> implements MessageProBuf.ServerReqMessageProBufOrBuilder {
         private int type_;
         private Object content_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_ServerReqMessageProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_ServerReqMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.ServerReqMessageProBuf.class, MessageProBuf.ServerReqMessageProBuf.Builder.class);
         }

         private Builder() {
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.content_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.ServerReqMessageProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.ServerReqMessageProBuf.Builder clear() {
            super.clear();
            this.type_ = 0;
            this.content_ = "";
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_ServerReqMessageProBuf_descriptor;
         }

         public MessageProBuf.ServerReqMessageProBuf getDefaultInstanceForType() {
            return MessageProBuf.ServerReqMessageProBuf.getDefaultInstance();
         }

         public MessageProBuf.ServerReqMessageProBuf build() {
            MessageProBuf.ServerReqMessageProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.ServerReqMessageProBuf buildPartial() {
            MessageProBuf.ServerReqMessageProBuf result = new MessageProBuf.ServerReqMessageProBuf(this);
            result.type_ = this.type_;
            result.content_ = this.content_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder clone() {
            return (MessageProBuf.ServerReqMessageProBuf.Builder)super.clone();
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.ServerReqMessageProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.ServerReqMessageProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.ServerReqMessageProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.ServerReqMessageProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.ServerReqMessageProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.ServerReqMessageProBuf) {
               return this.mergeFrom((MessageProBuf.ServerReqMessageProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder mergeFrom(MessageProBuf.ServerReqMessageProBuf other) {
            if (other == MessageProBuf.ServerReqMessageProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.getType() != 0) {
                  this.setType(other.getType());
               }

               if (!other.getContent().isEmpty()) {
                  this.content_ = other.content_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.ServerReqMessageProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.ServerReqMessageProBuf)MessageProBuf.ServerReqMessageProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.ServerReqMessageProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public int getType() {
            return this.type_;
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder setType(int value) {
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder clearType() {
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public String getContent() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.content_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContentBytes() {
            Object ref = this.content_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.content_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder setContent(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder clearContent() {
            this.content_ = MessageProBuf.ServerReqMessageProBuf.getDefaultInstance().getContent();
            this.onChanged();
            return this;
         }

         public MessageProBuf.ServerReqMessageProBuf.Builder setContentBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.ServerReqMessageProBuf.checkByteStringIsUtf8(value);
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public final MessageProBuf.ServerReqMessageProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.ServerReqMessageProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.ServerReqMessageProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.ServerReqMessageProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface ServerReqMessageProBufOrBuilder extends MessageOrBuilder {
      int getType();

      String getContent();

      ByteString getContentBytes();
   }

   public static final class CommonErrorProBuf extends GeneratedMessageV3 implements MessageProBuf.CommonErrorProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int ARG_FIELD_NUMBER = 3;
      private volatile Object arg_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.CommonErrorProBuf DEFAULT_INSTANCE = new MessageProBuf.CommonErrorProBuf();
      private static final Parser<MessageProBuf.CommonErrorProBuf> PARSER = new AbstractParser<MessageProBuf.CommonErrorProBuf>() {
         public MessageProBuf.CommonErrorProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.CommonErrorProBuf(input, extensionRegistry);
         }
      };

      private CommonErrorProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CommonErrorProBuf() {
         this.memoizedIsInitialized = -1;
         this.code_ = 0;
         this.arg_ = "";
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CommonErrorProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
//            int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 16:
                     this.code_ = input.readInt32();
                     break;
                  case 26:
                     String s = input.readStringRequireUtf8();
                     this.arg_ = s;
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_CommonErrorProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_CommonErrorProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.CommonErrorProBuf.class, MessageProBuf.CommonErrorProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public int getCode() {
         return this.code_;
      }

      public String getArg() {
         Object ref = this.arg_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.arg_ = s;
            return s;
         }
      }

      public ByteString getArgBytes() {
         Object ref = this.arg_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.arg_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         if (this.code_ != 0) {
            output.writeInt32(2, this.code_);
         }

         if (!this.getArgBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 3, this.arg_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            if (this.code_ != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if (!this.getArgBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(3, this.arg_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.CommonErrorProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.CommonErrorProBuf other = (MessageProBuf.CommonErrorProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getCode() == other.getCode();
            result = result && this.getArg().equals(other.getArg());
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
             hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getArg().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonErrorProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonErrorProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonErrorProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonErrorProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonErrorProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonErrorProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.CommonErrorProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.CommonErrorProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.CommonErrorProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.CommonErrorProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.CommonErrorProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.CommonErrorProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.CommonErrorProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.CommonErrorProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.CommonErrorProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.CommonErrorProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.CommonErrorProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.CommonErrorProBuf.Builder newBuilder(MessageProBuf.CommonErrorProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.CommonErrorProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.CommonErrorProBuf.Builder() : (new MessageProBuf.CommonErrorProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.CommonErrorProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.CommonErrorProBuf.Builder builder = new MessageProBuf.CommonErrorProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.CommonErrorProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.CommonErrorProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.CommonErrorProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.CommonErrorProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      CommonErrorProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      CommonErrorProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.CommonErrorProBuf.Builder> implements MessageProBuf.CommonErrorProBufOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private int code_;
         private Object arg_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_CommonErrorProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_CommonErrorProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.CommonErrorProBuf.class, MessageProBuf.CommonErrorProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.arg_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.arg_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.CommonErrorProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.CommonErrorProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.code_ = 0;
            this.arg_ = "";
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_CommonErrorProBuf_descriptor;
         }

         public MessageProBuf.CommonErrorProBuf getDefaultInstanceForType() {
            return MessageProBuf.CommonErrorProBuf.getDefaultInstance();
         }

         public MessageProBuf.CommonErrorProBuf build() {
            MessageProBuf.CommonErrorProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.CommonErrorProBuf buildPartial() {
            MessageProBuf.CommonErrorProBuf result = new MessageProBuf.CommonErrorProBuf(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            result.code_ = this.code_;
            result.arg_ = this.arg_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.CommonErrorProBuf.Builder clone() {
            return (MessageProBuf.CommonErrorProBuf.Builder)super.clone();
         }

         public MessageProBuf.CommonErrorProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.CommonErrorProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.CommonErrorProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.CommonErrorProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.CommonErrorProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.CommonErrorProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.CommonErrorProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.CommonErrorProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.CommonErrorProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.CommonErrorProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.CommonErrorProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.CommonErrorProBuf) {
               return this.mergeFrom((MessageProBuf.CommonErrorProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.CommonErrorProBuf.Builder mergeFrom(MessageProBuf.CommonErrorProBuf other) {
            if (other == MessageProBuf.CommonErrorProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (other.getCode() != 0) {
                  this.setCode(other.getCode());
               }

               if (!other.getArg().isEmpty()) {
                  this.arg_ = other.arg_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.CommonErrorProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.CommonErrorProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.CommonErrorProBuf)MessageProBuf.CommonErrorProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.CommonErrorProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.CommonErrorProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.CommonErrorProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.CommonErrorProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.CommonErrorProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public int getCode() {
            return this.code_;
         }

         public MessageProBuf.CommonErrorProBuf.Builder setCode(int value) {
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.CommonErrorProBuf.Builder clearCode() {
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public String getArg() {
            Object ref = this.arg_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.arg_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getArgBytes() {
            Object ref = this.arg_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.arg_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.CommonErrorProBuf.Builder setArg(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.arg_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.CommonErrorProBuf.Builder clearArg() {
            this.arg_ = MessageProBuf.CommonErrorProBuf.getDefaultInstance().getArg();
            this.onChanged();
            return this;
         }

         public MessageProBuf.CommonErrorProBuf.Builder setArgBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.CommonErrorProBuf.checkByteStringIsUtf8(value);
               this.arg_ = value;
               this.onChanged();
               return this;
            }
         }

         public final MessageProBuf.CommonErrorProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.CommonErrorProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.CommonErrorProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.CommonErrorProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface CommonErrorProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      int getCode();

      String getArg();

      ByteString getArgBytes();
   }

   public static final class CommonSuccessProBuf extends GeneratedMessageV3 implements MessageProBuf.CommonSuccessProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.CommonSuccessProBuf DEFAULT_INSTANCE = new MessageProBuf.CommonSuccessProBuf();
      private static final Parser<MessageProBuf.CommonSuccessProBuf> PARSER = new AbstractParser<MessageProBuf.CommonSuccessProBuf>() {
         public MessageProBuf.CommonSuccessProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.CommonSuccessProBuf(input, extensionRegistry);
         }
      };

      private CommonSuccessProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CommonSuccessProBuf() {
         this.memoizedIsInitialized = -1;
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CommonSuccessProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
//            int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_CommonSuccessProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_CommonSuccessProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.CommonSuccessProBuf.class, MessageProBuf.CommonSuccessProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.CommonSuccessProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.CommonSuccessProBuf other = (MessageProBuf.CommonSuccessProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
             hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonSuccessProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonSuccessProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonSuccessProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonSuccessProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonSuccessProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.CommonSuccessProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.CommonSuccessProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.CommonSuccessProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.CommonSuccessProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.CommonSuccessProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.CommonSuccessProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.CommonSuccessProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.CommonSuccessProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.CommonSuccessProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.CommonSuccessProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.CommonSuccessProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.CommonSuccessProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.CommonSuccessProBuf.Builder newBuilder(MessageProBuf.CommonSuccessProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.CommonSuccessProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.CommonSuccessProBuf.Builder() : (new MessageProBuf.CommonSuccessProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.CommonSuccessProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.CommonSuccessProBuf.Builder builder = new MessageProBuf.CommonSuccessProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.CommonSuccessProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.CommonSuccessProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.CommonSuccessProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.CommonSuccessProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      CommonSuccessProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      CommonSuccessProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.CommonSuccessProBuf.Builder> implements MessageProBuf.CommonSuccessProBufOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_CommonSuccessProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_CommonSuccessProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.CommonSuccessProBuf.class, MessageProBuf.CommonSuccessProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.CommonSuccessProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.CommonSuccessProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_CommonSuccessProBuf_descriptor;
         }

         public MessageProBuf.CommonSuccessProBuf getDefaultInstanceForType() {
            return MessageProBuf.CommonSuccessProBuf.getDefaultInstance();
         }

         public MessageProBuf.CommonSuccessProBuf build() {
            MessageProBuf.CommonSuccessProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.CommonSuccessProBuf buildPartial() {
            MessageProBuf.CommonSuccessProBuf result = new MessageProBuf.CommonSuccessProBuf(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public MessageProBuf.CommonSuccessProBuf.Builder clone() {
            return (MessageProBuf.CommonSuccessProBuf.Builder)super.clone();
         }

         public MessageProBuf.CommonSuccessProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.CommonSuccessProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.CommonSuccessProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.CommonSuccessProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.CommonSuccessProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.CommonSuccessProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.CommonSuccessProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.CommonSuccessProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.CommonSuccessProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.CommonSuccessProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.CommonSuccessProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.CommonSuccessProBuf) {
               return this.mergeFrom((MessageProBuf.CommonSuccessProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.CommonSuccessProBuf.Builder mergeFrom(MessageProBuf.CommonSuccessProBuf other) {
            if (other == MessageProBuf.CommonSuccessProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.CommonSuccessProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.CommonSuccessProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.CommonSuccessProBuf)MessageProBuf.CommonSuccessProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.CommonSuccessProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.CommonSuccessProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.CommonSuccessProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.CommonSuccessProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.CommonSuccessProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public final MessageProBuf.CommonSuccessProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.CommonSuccessProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.CommonSuccessProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.CommonSuccessProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface CommonSuccessProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();
   }

   public static final class PingMessageProBuf extends GeneratedMessageV3 implements MessageProBuf.PingMessageProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.PingMessageProBuf DEFAULT_INSTANCE = new MessageProBuf.PingMessageProBuf();
      private static final Parser<MessageProBuf.PingMessageProBuf> PARSER = new AbstractParser<MessageProBuf.PingMessageProBuf>() {
         public MessageProBuf.PingMessageProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.PingMessageProBuf(input, extensionRegistry);
         }
      };

      private PingMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PingMessageProBuf() {
         this.memoizedIsInitialized = -1;
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PingMessageProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
//            int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_PingMessageProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_PingMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PingMessageProBuf.class, MessageProBuf.PingMessageProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.PingMessageProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.PingMessageProBuf other = (MessageProBuf.PingMessageProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PingMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PingMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PingMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PingMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PingMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PingMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.PingMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PingMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PingMessageProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.PingMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.PingMessageProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PingMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.PingMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PingMessageProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PingMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.PingMessageProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.PingMessageProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.PingMessageProBuf.Builder newBuilder(MessageProBuf.PingMessageProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.PingMessageProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.PingMessageProBuf.Builder() : (new MessageProBuf.PingMessageProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.PingMessageProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.PingMessageProBuf.Builder builder = new MessageProBuf.PingMessageProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.PingMessageProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.PingMessageProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.PingMessageProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.PingMessageProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      PingMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      PingMessageProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.PingMessageProBuf.Builder> implements MessageProBuf.PingMessageProBufOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_PingMessageProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_PingMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PingMessageProBuf.class, MessageProBuf.PingMessageProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.PingMessageProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.PingMessageProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_PingMessageProBuf_descriptor;
         }

         public MessageProBuf.PingMessageProBuf getDefaultInstanceForType() {
            return MessageProBuf.PingMessageProBuf.getDefaultInstance();
         }

         public MessageProBuf.PingMessageProBuf build() {
            MessageProBuf.PingMessageProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.PingMessageProBuf buildPartial() {
            MessageProBuf.PingMessageProBuf result = new MessageProBuf.PingMessageProBuf(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public MessageProBuf.PingMessageProBuf.Builder clone() {
            return (MessageProBuf.PingMessageProBuf.Builder)super.clone();
         }

         public MessageProBuf.PingMessageProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PingMessageProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.PingMessageProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.PingMessageProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.PingMessageProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.PingMessageProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.PingMessageProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.PingMessageProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.PingMessageProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PingMessageProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.PingMessageProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.PingMessageProBuf) {
               return this.mergeFrom((MessageProBuf.PingMessageProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.PingMessageProBuf.Builder mergeFrom(MessageProBuf.PingMessageProBuf other) {
            if (other == MessageProBuf.PingMessageProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.PingMessageProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.PingMessageProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.PingMessageProBuf)MessageProBuf.PingMessageProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.PingMessageProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.PingMessageProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.PingMessageProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.PingMessageProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.PingMessageProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public final MessageProBuf.PingMessageProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PingMessageProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.PingMessageProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PingMessageProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface PingMessageProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();
   }

   public static final class PullGroupMessageRespProBuf extends GeneratedMessageV3 implements MessageProBuf.PullGroupMessageRespProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MESSAGEID_FIELD_NUMBER = 1;
      private volatile Object messageId_;
      public static final int JID_FIELD_NUMBER = 2;
      private volatile Object jid_;
      public static final int COUNT_FIELD_NUMBER = 3;
      private long count_;
      public static final int MESSAGELIST_FIELD_NUMBER = 4;
      private List<MessageProBuf.ChatMessage> messageList_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.PullGroupMessageRespProBuf DEFAULT_INSTANCE = new MessageProBuf.PullGroupMessageRespProBuf();
      private static final Parser<MessageProBuf.PullGroupMessageRespProBuf> PARSER = new AbstractParser<MessageProBuf.PullGroupMessageRespProBuf>() {
         public MessageProBuf.PullGroupMessageRespProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.PullGroupMessageRespProBuf(input, extensionRegistry);
         }
      };

      private PullGroupMessageRespProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PullGroupMessageRespProBuf() {
         this.memoizedIsInitialized = -1;
         this.messageId_ = "";
         this.jid_ = "";
         this.count_ = 0L;
         this.messageList_ = Collections.emptyList();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PullGroupMessageRespProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  String s;
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     s = input.readStringRequireUtf8();
                     this.messageId_ = s;
                     break;
                  case 18:
                     s = input.readStringRequireUtf8();
                     this.jid_ = s;
                     break;
                  case 24:
                     this.count_ = input.readInt64();
                     break;
                  case 34:
                     if ((mutable_bitField0_ & 8) != 8) {
                        this.messageList_ = new ArrayList();
                        mutable_bitField0_ |= 8;
                     }

                     this.messageList_.add(input.readMessage(MessageProBuf.ChatMessage.parser(), extensionRegistry));
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) == 8) {
                  this.messageList_ = Collections.unmodifiableList(this.messageList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_PullGroupMessageRespProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_PullGroupMessageRespProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PullGroupMessageRespProBuf.class, MessageProBuf.PullGroupMessageRespProBuf.Builder.class);
      }

      public String getMessageId() {
         Object ref = this.messageId_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.messageId_ = s;
            return s;
         }
      }

      public ByteString getMessageIdBytes() {
         Object ref = this.messageId_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.messageId_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getJid() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.jid_ = s;
            return s;
         }
      }

      public ByteString getJidBytes() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.jid_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public long getCount() {
         return this.count_;
      }

      public List<MessageProBuf.ChatMessage> getMessageListList() {
         return this.messageList_;
      }

      public List<? extends MessageProBuf.ChatMessageOrBuilder> getMessageListOrBuilderList() {
         return this.messageList_;
      }

      public int getMessageListCount() {
         return this.messageList_.size();
      }

      public MessageProBuf.ChatMessage getMessageList(int index) {
         return (MessageProBuf.ChatMessage)this.messageList_.get(index);
      }

      public MessageProBuf.ChatMessageOrBuilder getMessageListOrBuilder(int index) {
         return (MessageProBuf.ChatMessageOrBuilder)this.messageList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (!this.getMessageIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 1, this.messageId_);
         }

         if (!this.getJidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.jid_);
         }

         if (this.count_ != 0L) {
            output.writeInt64(3, this.count_);
         }

         for(int i = 0; i < this.messageList_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.messageList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (!this.getMessageIdBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(1, this.messageId_);
            }

            if (!this.getJidBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.jid_);
            }

            if (this.count_ != 0L) {
               size += CodedOutputStream.computeInt64Size(3, this.count_);
            }

            for(int i = 0; i < this.messageList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.messageList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.PullGroupMessageRespProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.PullGroupMessageRespProBuf other = (MessageProBuf.PullGroupMessageRespProBuf)obj;
            boolean result = true;
            result = result && this.getMessageId().equals(other.getMessageId());
            result = result && this.getJid().equals(other.getJid());
            result = result && this.getCount() == other.getCount();
            result = result && this.getMessageListList().equals(other.getMessageListList());
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
             hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMessageId().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getJid().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getCount());
            if (this.getMessageListCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMessageListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullGroupMessageRespProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullGroupMessageRespProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullGroupMessageRespProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullGroupMessageRespProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullGroupMessageRespProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullGroupMessageRespProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.PullGroupMessageRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullGroupMessageRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.PullGroupMessageRespProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullGroupMessageRespProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.PullGroupMessageRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullGroupMessageRespProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullGroupMessageRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.PullGroupMessageRespProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.PullGroupMessageRespProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.PullGroupMessageRespProBuf.Builder newBuilder(MessageProBuf.PullGroupMessageRespProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.PullGroupMessageRespProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.PullGroupMessageRespProBuf.Builder() : (new MessageProBuf.PullGroupMessageRespProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.PullGroupMessageRespProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.PullGroupMessageRespProBuf.Builder builder = new MessageProBuf.PullGroupMessageRespProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.PullGroupMessageRespProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.PullGroupMessageRespProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.PullGroupMessageRespProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.PullGroupMessageRespProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      PullGroupMessageRespProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      PullGroupMessageRespProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.PullGroupMessageRespProBuf.Builder> implements MessageProBuf.PullGroupMessageRespProBufOrBuilder {
         private int bitField0_;
         private Object messageId_;
         private Object jid_;
         private long count_;
         private List<MessageProBuf.ChatMessage> messageList_;
         private RepeatedFieldBuilderV3<MessageProBuf.ChatMessage, MessageProBuf.ChatMessage.Builder, MessageProBuf.ChatMessageOrBuilder> messageListBuilder_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_PullGroupMessageRespProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_PullGroupMessageRespProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PullGroupMessageRespProBuf.class, MessageProBuf.PullGroupMessageRespProBuf.Builder.class);
         }

         private Builder() {
            this.messageId_ = "";
            this.jid_ = "";
            this.messageList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageId_ = "";
            this.jid_ = "";
            this.messageList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.PullGroupMessageRespProBuf.alwaysUseFieldBuilders) {
               this.getMessageListFieldBuilder();
            }

         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder clear() {
            super.clear();
            this.messageId_ = "";
            this.jid_ = "";
            this.count_ = 0L;
            if (this.messageListBuilder_ == null) {
               this.messageList_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.messageListBuilder_.clear();
            }

            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_PullGroupMessageRespProBuf_descriptor;
         }

         public MessageProBuf.PullGroupMessageRespProBuf getDefaultInstanceForType() {
            return MessageProBuf.PullGroupMessageRespProBuf.getDefaultInstance();
         }

         public MessageProBuf.PullGroupMessageRespProBuf build() {
            MessageProBuf.PullGroupMessageRespProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.PullGroupMessageRespProBuf buildPartial() {
            MessageProBuf.PullGroupMessageRespProBuf result = new MessageProBuf.PullGroupMessageRespProBuf(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            result.messageId_ = this.messageId_;
            result.jid_ = this.jid_;
            result.count_ = this.count_;
            if (this.messageListBuilder_ == null) {
               if ((this.bitField0_ & 8) == 8) {
                  this.messageList_ = Collections.unmodifiableList(this.messageList_);
                  this.bitField0_ &= -9;
               }

               result.messageList_ = this.messageList_;
            } else {
               result.messageList_ = this.messageListBuilder_.build();
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder clone() {
            return (MessageProBuf.PullGroupMessageRespProBuf.Builder)super.clone();
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PullGroupMessageRespProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.PullGroupMessageRespProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.PullGroupMessageRespProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.PullGroupMessageRespProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PullGroupMessageRespProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.PullGroupMessageRespProBuf) {
               return this.mergeFrom((MessageProBuf.PullGroupMessageRespProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder mergeFrom(MessageProBuf.PullGroupMessageRespProBuf other) {
            if (other == MessageProBuf.PullGroupMessageRespProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (!other.getMessageId().isEmpty()) {
                  this.messageId_ = other.messageId_;
                  this.onChanged();
               }

               if (!other.getJid().isEmpty()) {
                  this.jid_ = other.jid_;
                  this.onChanged();
               }

               if (other.getCount() != 0L) {
                  this.setCount(other.getCount());
               }

               if (this.messageListBuilder_ == null) {
                  if (!other.messageList_.isEmpty()) {
                     if (this.messageList_.isEmpty()) {
                        this.messageList_ = other.messageList_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureMessageListIsMutable();
                        this.messageList_.addAll(other.messageList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.messageList_.isEmpty()) {
                  if (this.messageListBuilder_.isEmpty()) {
                     this.messageListBuilder_.dispose();
                     this.messageListBuilder_ = null;
                     this.messageList_ = other.messageList_;
                     this.bitField0_ &= -9;
                     this.messageListBuilder_ = MessageProBuf.PullGroupMessageRespProBuf.alwaysUseFieldBuilders ? this.getMessageListFieldBuilder() : null;
                  } else {
                     this.messageListBuilder_.addAllMessages(other.messageList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.PullGroupMessageRespProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.PullGroupMessageRespProBuf)MessageProBuf.PullGroupMessageRespProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.PullGroupMessageRespProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public String getMessageId() {
            Object ref = this.messageId_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.messageId_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getMessageIdBytes() {
            Object ref = this.messageId_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.messageId_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder setMessageId(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.messageId_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder clearMessageId() {
            this.messageId_ = MessageProBuf.PullGroupMessageRespProBuf.getDefaultInstance().getMessageId();
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder setMessageIdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.PullGroupMessageRespProBuf.checkByteStringIsUtf8(value);
               this.messageId_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getJid() {
            Object ref = this.jid_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.jid_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getJidBytes() {
            Object ref = this.jid_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.jid_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder setJid(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder clearJid() {
            this.jid_ = MessageProBuf.PullGroupMessageRespProBuf.getDefaultInstance().getJid();
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder setJidBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.PullGroupMessageRespProBuf.checkByteStringIsUtf8(value);
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public long getCount() {
            return this.count_;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder setCount(long value) {
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder clearCount() {
            this.count_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureMessageListIsMutable() {
            if ((this.bitField0_ & 8) != 8) {
               this.messageList_ = new ArrayList(this.messageList_);
               this.bitField0_ |= 8;
            }

         }

         public List<MessageProBuf.ChatMessage> getMessageListList() {
            return this.messageListBuilder_ == null ? Collections.unmodifiableList(this.messageList_) : this.messageListBuilder_.getMessageList();
         }

         public int getMessageListCount() {
            return this.messageListBuilder_ == null ? this.messageList_.size() : this.messageListBuilder_.getCount();
         }

         public MessageProBuf.ChatMessage getMessageList(int index) {
            return this.messageListBuilder_ == null ? (MessageProBuf.ChatMessage)this.messageList_.get(index) : (MessageProBuf.ChatMessage)this.messageListBuilder_.getMessage(index);
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder setMessageList(int index, MessageProBuf.ChatMessage value) {
            if (this.messageListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMessageListIsMutable();
               this.messageList_.set(index, value);
               this.onChanged();
            } else {
               this.messageListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder setMessageList(int index, MessageProBuf.ChatMessage.Builder builderForValue) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               this.messageList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.messageListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder addMessageList(MessageProBuf.ChatMessage value) {
            if (this.messageListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMessageListIsMutable();
               this.messageList_.add(value);
               this.onChanged();
            } else {
               this.messageListBuilder_.addMessage(value);
            }

            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder addMessageList(int index, MessageProBuf.ChatMessage value) {
            if (this.messageListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMessageListIsMutable();
               this.messageList_.add(index, value);
               this.onChanged();
            } else {
               this.messageListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder addMessageList(MessageProBuf.ChatMessage.Builder builderForValue) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               this.messageList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.messageListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder addMessageList(int index, MessageProBuf.ChatMessage.Builder builderForValue) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               this.messageList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.messageListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder addAllMessageList(Iterable<? extends MessageProBuf.ChatMessage> values) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.messageList_);
               this.onChanged();
            } else {
               this.messageListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder clearMessageList() {
            if (this.messageListBuilder_ == null) {
               this.messageList_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.messageListBuilder_.clear();
            }

            return this;
         }

         public MessageProBuf.PullGroupMessageRespProBuf.Builder removeMessageList(int index) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               this.messageList_.remove(index);
               this.onChanged();
            } else {
               this.messageListBuilder_.remove(index);
            }

            return this;
         }

         public MessageProBuf.ChatMessage.Builder getMessageListBuilder(int index) {
            return (MessageProBuf.ChatMessage.Builder)this.getMessageListFieldBuilder().getBuilder(index);
         }

         public MessageProBuf.ChatMessageOrBuilder getMessageListOrBuilder(int index) {
            return this.messageListBuilder_ == null ? (MessageProBuf.ChatMessageOrBuilder)this.messageList_.get(index) : (MessageProBuf.ChatMessageOrBuilder)this.messageListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MessageProBuf.ChatMessageOrBuilder> getMessageListOrBuilderList() {
            return this.messageListBuilder_ != null ? this.messageListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.messageList_);
         }

         public MessageProBuf.ChatMessage.Builder addMessageListBuilder() {
            return (MessageProBuf.ChatMessage.Builder)this.getMessageListFieldBuilder().addBuilder(MessageProBuf.ChatMessage.getDefaultInstance());
         }

         public MessageProBuf.ChatMessage.Builder addMessageListBuilder(int index) {
            return (MessageProBuf.ChatMessage.Builder)this.getMessageListFieldBuilder().addBuilder(index, MessageProBuf.ChatMessage.getDefaultInstance());
         }

         public List<MessageProBuf.ChatMessage.Builder> getMessageListBuilderList() {
            return this.getMessageListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MessageProBuf.ChatMessage, MessageProBuf.ChatMessage.Builder, MessageProBuf.ChatMessageOrBuilder> getMessageListFieldBuilder() {
            if (this.messageListBuilder_ == null) {
               this.messageListBuilder_ = new RepeatedFieldBuilderV3(this.messageList_, (this.bitField0_ & 8) == 8, this.getParentForChildren(), this.isClean());
               this.messageList_ = null;
            }

            return this.messageListBuilder_;
         }

         public final MessageProBuf.PullGroupMessageRespProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PullGroupMessageRespProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.PullGroupMessageRespProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PullGroupMessageRespProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface PullGroupMessageRespProBufOrBuilder extends MessageOrBuilder {
      String getMessageId();

      ByteString getMessageIdBytes();

      String getJid();

      ByteString getJidBytes();

      long getCount();

      List<MessageProBuf.ChatMessage> getMessageListList();

      MessageProBuf.ChatMessage getMessageList(int var1);

      int getMessageListCount();

      List<? extends MessageProBuf.ChatMessageOrBuilder> getMessageListOrBuilderList();

      MessageProBuf.ChatMessageOrBuilder getMessageListOrBuilder(int var1);
   }

   public static final class PullBatchGroupMessageReqProBuf extends GeneratedMessageV3 implements MessageProBuf.PullBatchGroupMessageReqProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int JIDLIST_FIELD_NUMBER = 2;
      private LazyStringList jidList_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private long endTime_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.PullBatchGroupMessageReqProBuf DEFAULT_INSTANCE = new MessageProBuf.PullBatchGroupMessageReqProBuf();
      private static final Parser<MessageProBuf.PullBatchGroupMessageReqProBuf> PARSER = new AbstractParser<MessageProBuf.PullBatchGroupMessageReqProBuf>() {
         public MessageProBuf.PullBatchGroupMessageReqProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.PullBatchGroupMessageReqProBuf(input, extensionRegistry);
         }
      };

      private PullBatchGroupMessageReqProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PullBatchGroupMessageReqProBuf() {
         this.memoizedIsInitialized = -1;
         this.jidList_ = LazyStringArrayList.EMPTY;
         this.endTime_ = 0L;
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PullBatchGroupMessageReqProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 18:
                     String s = input.readStringRequireUtf8();
                     if ((mutable_bitField0_ & 2) != 2) {
                        this.jidList_ = new LazyStringArrayList();
                        mutable_bitField0_ |= 2;
                     }

                     this.jidList_.add(s);
                     break;
                  case 24:
                     this.endTime_ = input.readInt64();
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) == 2) {
                  this.jidList_ = this.jidList_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_PullBatchGroupMessageReqProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_PullBatchGroupMessageReqProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PullBatchGroupMessageReqProBuf.class, MessageProBuf.PullBatchGroupMessageReqProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public ProtocolStringList getJidListList() {
         return this.jidList_;
      }

      public int getJidListCount() {
         return this.jidList_.size();
      }

      public String getJidList(int index) {
         return (String)this.jidList_.get(index);
      }

      public ByteString getJidListBytes(int index) {
         return this.jidList_.getByteString(index);
      }

      public long getEndTime() {
         return this.endTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         for(int i = 0; i < this.jidList_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 2, this.jidList_.getRaw(i));
         }

         if (this.endTime_ != 0L) {
            output.writeInt64(3, this.endTime_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            int dataSize = 0;

            for(int i = 0; i < this.jidList_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.jidList_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getJidListList().size();
            if (this.endTime_ != 0L) {
               size += CodedOutputStream.computeInt64Size(3, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.PullBatchGroupMessageReqProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.PullBatchGroupMessageReqProBuf other = (MessageProBuf.PullBatchGroupMessageReqProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getJidListList().equals(other.getJidListList());
            result = result && this.getEndTime() == other.getEndTime();
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
             hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            if (this.getJidListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getJidListList().hashCode();
            }

            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getEndTime());
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullBatchGroupMessageReqProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf.Builder newBuilder(MessageProBuf.PullBatchGroupMessageReqProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.PullBatchGroupMessageReqProBuf.Builder() : (new MessageProBuf.PullBatchGroupMessageReqProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.PullBatchGroupMessageReqProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.PullBatchGroupMessageReqProBuf.Builder builder = new MessageProBuf.PullBatchGroupMessageReqProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.PullBatchGroupMessageReqProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.PullBatchGroupMessageReqProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.PullBatchGroupMessageReqProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.PullBatchGroupMessageReqProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      PullBatchGroupMessageReqProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      PullBatchGroupMessageReqProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.PullBatchGroupMessageReqProBuf.Builder> implements MessageProBuf.PullBatchGroupMessageReqProBufOrBuilder {
         private int bitField0_;
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private LazyStringList jidList_;
         private long endTime_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_PullBatchGroupMessageReqProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_PullBatchGroupMessageReqProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PullBatchGroupMessageReqProBuf.class, MessageProBuf.PullBatchGroupMessageReqProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.jidList_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.jidList_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.PullBatchGroupMessageReqProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.jidList_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.endTime_ = 0L;
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_PullBatchGroupMessageReqProBuf_descriptor;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf getDefaultInstanceForType() {
            return MessageProBuf.PullBatchGroupMessageReqProBuf.getDefaultInstance();
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf build() {
            MessageProBuf.PullBatchGroupMessageReqProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf buildPartial() {
            MessageProBuf.PullBatchGroupMessageReqProBuf result = new MessageProBuf.PullBatchGroupMessageReqProBuf(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            if ((this.bitField0_ & 2) == 2) {
               this.jidList_ = this.jidList_.getUnmodifiableView();
               this.bitField0_ &= -3;
            }

            result.jidList_ = this.jidList_;
            result.endTime_ = this.endTime_;
            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder clone() {
            return (MessageProBuf.PullBatchGroupMessageReqProBuf.Builder)super.clone();
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PullBatchGroupMessageReqProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.PullBatchGroupMessageReqProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.PullBatchGroupMessageReqProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.PullBatchGroupMessageReqProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PullBatchGroupMessageReqProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.PullBatchGroupMessageReqProBuf) {
               return this.mergeFrom((MessageProBuf.PullBatchGroupMessageReqProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder mergeFrom(MessageProBuf.PullBatchGroupMessageReqProBuf other) {
            if (other == MessageProBuf.PullBatchGroupMessageReqProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (!other.jidList_.isEmpty()) {
                  if (this.jidList_.isEmpty()) {
                     this.jidList_ = other.jidList_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureJidListIsMutable();
                     this.jidList_.addAll(other.jidList_);
                  }

                  this.onChanged();
               }

               if (other.getEndTime() != 0L) {
                  this.setEndTime(other.getEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.PullBatchGroupMessageReqProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.PullBatchGroupMessageReqProBuf)MessageProBuf.PullBatchGroupMessageReqProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.PullBatchGroupMessageReqProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         private void ensureJidListIsMutable() {
            if ((this.bitField0_ & 2) != 2) {
               this.jidList_ = new LazyStringArrayList(this.jidList_);
               this.bitField0_ |= 2;
            }

         }

         public ProtocolStringList getJidListList() {
            return this.jidList_.getUnmodifiableView();
         }

         public int getJidListCount() {
            return this.jidList_.size();
         }

         public String getJidList(int index) {
            return (String)this.jidList_.get(index);
         }

         public ByteString getJidListBytes(int index) {
            return this.jidList_.getByteString(index);
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder setJidList(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureJidListIsMutable();
               this.jidList_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder addJidList(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureJidListIsMutable();
               this.jidList_.add(value);
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder addAllJidList(Iterable<String> values) {
            this.ensureJidListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.jidList_);
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder clearJidList() {
            this.jidList_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder addJidListBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.PullBatchGroupMessageReqProBuf.checkByteStringIsUtf8(value);
               this.ensureJidListIsMutable();
               this.jidList_.add(value);
               this.onChanged();
               return this;
            }
         }

         public long getEndTime() {
            return this.endTime_;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder setEndTime(long value) {
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullBatchGroupMessageReqProBuf.Builder clearEndTime() {
            this.endTime_ = 0L;
            this.onChanged();
            return this;
         }

         public final MessageProBuf.PullBatchGroupMessageReqProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PullBatchGroupMessageReqProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.PullBatchGroupMessageReqProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PullBatchGroupMessageReqProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface PullBatchGroupMessageReqProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      List<String> getJidListList();

      int getJidListCount();

      String getJidList(int var1);

      ByteString getJidListBytes(int var1);

      long getEndTime();
   }

   public static final class PullMessageHistoryRecordRespProBuf extends GeneratedMessageV3 implements MessageProBuf.PullMessageHistoryRecordRespProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MESSAGEID_FIELD_NUMBER = 1;
      private volatile Object messageId_;
      public static final int JID_FIELD_NUMBER = 2;
      private volatile Object jid_;
      public static final int CHATTYPE_FIELD_NUMBER = 3;
      private int chatType_;
      public static final int MESSAGELIST_FIELD_NUMBER = 4;
      private List<MessageProBuf.ChatMessage> messageList_;
      public static final int COUNT_FIELD_NUMBER = 5;
      private int count_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.PullMessageHistoryRecordRespProBuf DEFAULT_INSTANCE = new MessageProBuf.PullMessageHistoryRecordRespProBuf();
      private static final Parser<MessageProBuf.PullMessageHistoryRecordRespProBuf> PARSER = new AbstractParser<MessageProBuf.PullMessageHistoryRecordRespProBuf>() {
         public MessageProBuf.PullMessageHistoryRecordRespProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.PullMessageHistoryRecordRespProBuf(input, extensionRegistry);
         }
      };

      private PullMessageHistoryRecordRespProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PullMessageHistoryRecordRespProBuf() {
         this.memoizedIsInitialized = -1;
         this.messageId_ = "";
         this.jid_ = "";
         this.chatType_ = 0;
         this.messageList_ = Collections.emptyList();
         this.count_ = 0;
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PullMessageHistoryRecordRespProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  String s;
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     s = input.readStringRequireUtf8();
                     this.messageId_ = s;
                     break;
                  case 18:
                     s = input.readStringRequireUtf8();
                     this.jid_ = s;
                     break;
                  case 24:
                     this.chatType_ = input.readInt32();
                     break;
                  case 34:
                     if ((mutable_bitField0_ & 8) != 8) {
                        this.messageList_ = new ArrayList();
                        mutable_bitField0_ |= 8;
                     }

                     this.messageList_.add(input.readMessage(MessageProBuf.ChatMessage.parser(), extensionRegistry));
                     break;
                  case 40:
                     this.count_ = input.readInt32();
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) == 8) {
                  this.messageList_ = Collections.unmodifiableList(this.messageList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_PullMessageHistoryRecordRespProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_PullMessageHistoryRecordRespProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PullMessageHistoryRecordRespProBuf.class, MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder.class);
      }

      public String getMessageId() {
         Object ref = this.messageId_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.messageId_ = s;
            return s;
         }
      }

      public ByteString getMessageIdBytes() {
         Object ref = this.messageId_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.messageId_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getJid() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.jid_ = s;
            return s;
         }
      }

      public ByteString getJidBytes() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.jid_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public int getChatType() {
         return this.chatType_;
      }

      public List<MessageProBuf.ChatMessage> getMessageListList() {
         return this.messageList_;
      }

      public List<? extends MessageProBuf.ChatMessageOrBuilder> getMessageListOrBuilderList() {
         return this.messageList_;
      }

      public int getMessageListCount() {
         return this.messageList_.size();
      }

      public MessageProBuf.ChatMessage getMessageList(int index) {
         return (MessageProBuf.ChatMessage)this.messageList_.get(index);
      }

      public MessageProBuf.ChatMessageOrBuilder getMessageListOrBuilder(int index) {
         return (MessageProBuf.ChatMessageOrBuilder)this.messageList_.get(index);
      }

      public int getCount() {
         return this.count_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (!this.getMessageIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 1, this.messageId_);
         }

         if (!this.getJidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.jid_);
         }

         if (this.chatType_ != 0) {
            output.writeInt32(3, this.chatType_);
         }

         for(int i = 0; i < this.messageList_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.messageList_.get(i));
         }

         if (this.count_ != 0) {
            output.writeInt32(5, this.count_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (!this.getMessageIdBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(1, this.messageId_);
            }

            if (!this.getJidBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.jid_);
            }

            if (this.chatType_ != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.chatType_);
            }

            for(int i = 0; i < this.messageList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.messageList_.get(i));
            }

            if (this.count_ != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.PullMessageHistoryRecordRespProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.PullMessageHistoryRecordRespProBuf other = (MessageProBuf.PullMessageHistoryRecordRespProBuf)obj;
            boolean result = true;
            result = result && this.getMessageId().equals(other.getMessageId());
            result = result && this.getJid().equals(other.getJid());
            result = result && this.getChatType() == other.getChatType();
            result = result && this.getMessageListList().equals(other.getMessageListList());
            result = result && this.getCount() == other.getCount();
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
             hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMessageId().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getJid().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getChatType();
            if (this.getMessageListCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMessageListList().hashCode();
            }

            hash = 37 * hash + 5;
            hash = 53 * hash + this.getCount();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder newBuilder(MessageProBuf.PullMessageHistoryRecordRespProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder() : (new MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder builder = new MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.PullMessageHistoryRecordRespProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.PullMessageHistoryRecordRespProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.PullMessageHistoryRecordRespProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.PullMessageHistoryRecordRespProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      PullMessageHistoryRecordRespProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      PullMessageHistoryRecordRespProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder> implements MessageProBuf.PullMessageHistoryRecordRespProBufOrBuilder {
         private int bitField0_;
         private Object messageId_;
         private Object jid_;
         private int chatType_;
         private List<MessageProBuf.ChatMessage> messageList_;
         private RepeatedFieldBuilderV3<MessageProBuf.ChatMessage, MessageProBuf.ChatMessage.Builder, MessageProBuf.ChatMessageOrBuilder> messageListBuilder_;
         private int count_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_PullMessageHistoryRecordRespProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_PullMessageHistoryRecordRespProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PullMessageHistoryRecordRespProBuf.class, MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder.class);
         }

         private Builder() {
            this.messageId_ = "";
            this.jid_ = "";
            this.messageList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageId_ = "";
            this.jid_ = "";
            this.messageList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.PullMessageHistoryRecordRespProBuf.alwaysUseFieldBuilders) {
               this.getMessageListFieldBuilder();
            }

         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder clear() {
            super.clear();
            this.messageId_ = "";
            this.jid_ = "";
            this.chatType_ = 0;
            if (this.messageListBuilder_ == null) {
               this.messageList_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.messageListBuilder_.clear();
            }

            this.count_ = 0;
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_PullMessageHistoryRecordRespProBuf_descriptor;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf getDefaultInstanceForType() {
            return MessageProBuf.PullMessageHistoryRecordRespProBuf.getDefaultInstance();
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf build() {
            MessageProBuf.PullMessageHistoryRecordRespProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf buildPartial() {
            MessageProBuf.PullMessageHistoryRecordRespProBuf result = new MessageProBuf.PullMessageHistoryRecordRespProBuf(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            result.messageId_ = this.messageId_;
            result.jid_ = this.jid_;
            result.chatType_ = this.chatType_;
            if (this.messageListBuilder_ == null) {
               if ((this.bitField0_ & 8) == 8) {
                  this.messageList_ = Collections.unmodifiableList(this.messageList_);
                  this.bitField0_ &= -9;
               }

               result.messageList_ = this.messageList_;
            } else {
               result.messageList_ = this.messageListBuilder_.build();
            }

            result.count_ = this.count_;
            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder clone() {
            return (MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder)super.clone();
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.PullMessageHistoryRecordRespProBuf) {
               return this.mergeFrom((MessageProBuf.PullMessageHistoryRecordRespProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder mergeFrom(MessageProBuf.PullMessageHistoryRecordRespProBuf other) {
            if (other == MessageProBuf.PullMessageHistoryRecordRespProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (!other.getMessageId().isEmpty()) {
                  this.messageId_ = other.messageId_;
                  this.onChanged();
               }

               if (!other.getJid().isEmpty()) {
                  this.jid_ = other.jid_;
                  this.onChanged();
               }

               if (other.getChatType() != 0) {
                  this.setChatType(other.getChatType());
               }

               if (this.messageListBuilder_ == null) {
                  if (!other.messageList_.isEmpty()) {
                     if (this.messageList_.isEmpty()) {
                        this.messageList_ = other.messageList_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureMessageListIsMutable();
                        this.messageList_.addAll(other.messageList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.messageList_.isEmpty()) {
                  if (this.messageListBuilder_.isEmpty()) {
                     this.messageListBuilder_.dispose();
                     this.messageListBuilder_ = null;
                     this.messageList_ = other.messageList_;
                     this.bitField0_ &= -9;
                     this.messageListBuilder_ = MessageProBuf.PullMessageHistoryRecordRespProBuf.alwaysUseFieldBuilders ? this.getMessageListFieldBuilder() : null;
                  } else {
                     this.messageListBuilder_.addAllMessages(other.messageList_);
                  }
               }

               if (other.getCount() != 0) {
                  this.setCount(other.getCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.PullMessageHistoryRecordRespProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.PullMessageHistoryRecordRespProBuf)MessageProBuf.PullMessageHistoryRecordRespProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.PullMessageHistoryRecordRespProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public String getMessageId() {
            Object ref = this.messageId_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.messageId_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getMessageIdBytes() {
            Object ref = this.messageId_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.messageId_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setMessageId(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.messageId_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder clearMessageId() {
            this.messageId_ = MessageProBuf.PullMessageHistoryRecordRespProBuf.getDefaultInstance().getMessageId();
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setMessageIdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.PullMessageHistoryRecordRespProBuf.checkByteStringIsUtf8(value);
               this.messageId_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getJid() {
            Object ref = this.jid_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.jid_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getJidBytes() {
            Object ref = this.jid_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.jid_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setJid(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder clearJid() {
            this.jid_ = MessageProBuf.PullMessageHistoryRecordRespProBuf.getDefaultInstance().getJid();
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setJidBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.PullMessageHistoryRecordRespProBuf.checkByteStringIsUtf8(value);
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public int getChatType() {
            return this.chatType_;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setChatType(int value) {
            this.chatType_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder clearChatType() {
            this.chatType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureMessageListIsMutable() {
            if ((this.bitField0_ & 8) != 8) {
               this.messageList_ = new ArrayList(this.messageList_);
               this.bitField0_ |= 8;
            }

         }

         public List<MessageProBuf.ChatMessage> getMessageListList() {
            return this.messageListBuilder_ == null ? Collections.unmodifiableList(this.messageList_) : this.messageListBuilder_.getMessageList();
         }

         public int getMessageListCount() {
            return this.messageListBuilder_ == null ? this.messageList_.size() : this.messageListBuilder_.getCount();
         }

         public MessageProBuf.ChatMessage getMessageList(int index) {
            return this.messageListBuilder_ == null ? (MessageProBuf.ChatMessage)this.messageList_.get(index) : (MessageProBuf.ChatMessage)this.messageListBuilder_.getMessage(index);
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setMessageList(int index, MessageProBuf.ChatMessage value) {
            if (this.messageListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMessageListIsMutable();
               this.messageList_.set(index, value);
               this.onChanged();
            } else {
               this.messageListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setMessageList(int index, MessageProBuf.ChatMessage.Builder builderForValue) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               this.messageList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.messageListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder addMessageList(MessageProBuf.ChatMessage value) {
            if (this.messageListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMessageListIsMutable();
               this.messageList_.add(value);
               this.onChanged();
            } else {
               this.messageListBuilder_.addMessage(value);
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder addMessageList(int index, MessageProBuf.ChatMessage value) {
            if (this.messageListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMessageListIsMutable();
               this.messageList_.add(index, value);
               this.onChanged();
            } else {
               this.messageListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder addMessageList(MessageProBuf.ChatMessage.Builder builderForValue) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               this.messageList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.messageListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder addMessageList(int index, MessageProBuf.ChatMessage.Builder builderForValue) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               this.messageList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.messageListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder addAllMessageList(Iterable<? extends MessageProBuf.ChatMessage> values) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.messageList_);
               this.onChanged();
            } else {
               this.messageListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder clearMessageList() {
            if (this.messageListBuilder_ == null) {
               this.messageList_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.messageListBuilder_.clear();
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder removeMessageList(int index) {
            if (this.messageListBuilder_ == null) {
               this.ensureMessageListIsMutable();
               this.messageList_.remove(index);
               this.onChanged();
            } else {
               this.messageListBuilder_.remove(index);
            }

            return this;
         }

         public MessageProBuf.ChatMessage.Builder getMessageListBuilder(int index) {
            return (MessageProBuf.ChatMessage.Builder)this.getMessageListFieldBuilder().getBuilder(index);
         }

         public MessageProBuf.ChatMessageOrBuilder getMessageListOrBuilder(int index) {
            return this.messageListBuilder_ == null ? (MessageProBuf.ChatMessageOrBuilder)this.messageList_.get(index) : (MessageProBuf.ChatMessageOrBuilder)this.messageListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MessageProBuf.ChatMessageOrBuilder> getMessageListOrBuilderList() {
            return this.messageListBuilder_ != null ? this.messageListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.messageList_);
         }

         public MessageProBuf.ChatMessage.Builder addMessageListBuilder() {
            return (MessageProBuf.ChatMessage.Builder)this.getMessageListFieldBuilder().addBuilder(MessageProBuf.ChatMessage.getDefaultInstance());
         }

         public MessageProBuf.ChatMessage.Builder addMessageListBuilder(int index) {
            return (MessageProBuf.ChatMessage.Builder)this.getMessageListFieldBuilder().addBuilder(index, MessageProBuf.ChatMessage.getDefaultInstance());
         }

         public List<MessageProBuf.ChatMessage.Builder> getMessageListBuilderList() {
            return this.getMessageListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MessageProBuf.ChatMessage, MessageProBuf.ChatMessage.Builder, MessageProBuf.ChatMessageOrBuilder> getMessageListFieldBuilder() {
            if (this.messageListBuilder_ == null) {
               this.messageListBuilder_ = new RepeatedFieldBuilderV3(this.messageList_, (this.bitField0_ & 8) == 8, this.getParentForChildren(), this.isClean());
               this.messageList_ = null;
            }

            return this.messageListBuilder_;
         }

         public int getCount() {
            return this.count_;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setCount(int value) {
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder clearCount() {
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public final MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PullMessageHistoryRecordRespProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface PullMessageHistoryRecordRespProBufOrBuilder extends MessageOrBuilder {
      String getMessageId();

      ByteString getMessageIdBytes();

      String getJid();

      ByteString getJidBytes();

      int getChatType();

      List<MessageProBuf.ChatMessage> getMessageListList();

      MessageProBuf.ChatMessage getMessageList(int var1);

      int getMessageListCount();

      List<? extends MessageProBuf.ChatMessageOrBuilder> getMessageListOrBuilderList();

      MessageProBuf.ChatMessageOrBuilder getMessageListOrBuilder(int var1);

      int getCount();
   }

   public static final class PullMessageHistoryRecordReqProBuf extends GeneratedMessageV3 implements MessageProBuf.PullMessageHistoryRecordReqProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int JID_FIELD_NUMBER = 2;
      private volatile Object jid_;
      public static final int SIZE_FIELD_NUMBER = 3;
      private int size_;
      public static final int STARTTIME_FIELD_NUMBER = 4;
      private long startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 5;
      private long endTime_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.PullMessageHistoryRecordReqProBuf DEFAULT_INSTANCE = new MessageProBuf.PullMessageHistoryRecordReqProBuf();
      private static final Parser<MessageProBuf.PullMessageHistoryRecordReqProBuf> PARSER = new AbstractParser<MessageProBuf.PullMessageHistoryRecordReqProBuf>() {
         public MessageProBuf.PullMessageHistoryRecordReqProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.PullMessageHistoryRecordReqProBuf(input, extensionRegistry);
         }
      };

      private PullMessageHistoryRecordReqProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PullMessageHistoryRecordReqProBuf() {
         this.memoizedIsInitialized = -1;
         this.jid_ = "";
         this.size_ = 0;
         this.startTime_ = 0L;
         this.endTime_ = 0L;
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PullMessageHistoryRecordReqProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
//            int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 18:
                     String s = input.readStringRequireUtf8();
                     this.jid_ = s;
                     break;
                  case 24:
                     this.size_ = input.readInt32();
                     break;
                  case 32:
                     this.startTime_ = input.readInt64();
                     break;
                  case 40:
                     this.endTime_ = input.readInt64();
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_PullMessageHistoryRecordReqProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_PullMessageHistoryRecordReqProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PullMessageHistoryRecordReqProBuf.class, MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public String getJid() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.jid_ = s;
            return s;
         }
      }

      public ByteString getJidBytes() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.jid_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public int getSize() {
         return this.size_;
      }

      public long getStartTime() {
         return this.startTime_;
      }

      public long getEndTime() {
         return this.endTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         if (!this.getJidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.jid_);
         }

         if (this.size_ != 0) {
            output.writeInt32(3, this.size_);
         }

         if (this.startTime_ != 0L) {
            output.writeInt64(4, this.startTime_);
         }

         if (this.endTime_ != 0L) {
            output.writeInt64(5, this.endTime_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            if (!this.getJidBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.jid_);
            }

            if (this.size_ != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.size_);
            }

            if (this.startTime_ != 0L) {
               size += CodedOutputStream.computeInt64Size(4, this.startTime_);
            }

            if (this.endTime_ != 0L) {
               size += CodedOutputStream.computeInt64Size(5, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.PullMessageHistoryRecordReqProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.PullMessageHistoryRecordReqProBuf other = (MessageProBuf.PullMessageHistoryRecordReqProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getJid().equals(other.getJid());
            result = result && this.getSize() == other.getSize();
            result = result && this.getStartTime() == other.getStartTime();
            result = result && this.getEndTime() == other.getEndTime();
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
             hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getJid().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getSize();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getStartTime());
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong(this.getEndTime());
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.PullMessageHistoryRecordReqProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder newBuilder(MessageProBuf.PullMessageHistoryRecordReqProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder() : (new MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder builder = new MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.PullMessageHistoryRecordReqProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.PullMessageHistoryRecordReqProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.PullMessageHistoryRecordReqProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.PullMessageHistoryRecordReqProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      PullMessageHistoryRecordReqProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      PullMessageHistoryRecordReqProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder> implements MessageProBuf.PullMessageHistoryRecordReqProBufOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private Object jid_;
         private int size_;
         private long startTime_;
         private long endTime_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_PullMessageHistoryRecordReqProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_PullMessageHistoryRecordReqProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.PullMessageHistoryRecordReqProBuf.class, MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.jid_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.jid_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.PullMessageHistoryRecordReqProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.jid_ = "";
            this.size_ = 0;
            this.startTime_ = 0L;
            this.endTime_ = 0L;
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_PullMessageHistoryRecordReqProBuf_descriptor;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf getDefaultInstanceForType() {
            return MessageProBuf.PullMessageHistoryRecordReqProBuf.getDefaultInstance();
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf build() {
            MessageProBuf.PullMessageHistoryRecordReqProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf buildPartial() {
            MessageProBuf.PullMessageHistoryRecordReqProBuf result = new MessageProBuf.PullMessageHistoryRecordReqProBuf(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            result.jid_ = this.jid_;
            result.size_ = this.size_;
            result.startTime_ = this.startTime_;
            result.endTime_ = this.endTime_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder clone() {
            return (MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder)super.clone();
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.PullMessageHistoryRecordReqProBuf) {
               return this.mergeFrom((MessageProBuf.PullMessageHistoryRecordReqProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder mergeFrom(MessageProBuf.PullMessageHistoryRecordReqProBuf other) {
            if (other == MessageProBuf.PullMessageHistoryRecordReqProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (!other.getJid().isEmpty()) {
                  this.jid_ = other.jid_;
                  this.onChanged();
               }

               if (other.getSize() != 0) {
                  this.setSize(other.getSize());
               }

               if (other.getStartTime() != 0L) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.getEndTime() != 0L) {
                  this.setEndTime(other.getEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.PullMessageHistoryRecordReqProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.PullMessageHistoryRecordReqProBuf)MessageProBuf.PullMessageHistoryRecordReqProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.PullMessageHistoryRecordReqProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public String getJid() {
            Object ref = this.jid_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.jid_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getJidBytes() {
            Object ref = this.jid_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.jid_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setJid(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder clearJid() {
            this.jid_ = MessageProBuf.PullMessageHistoryRecordReqProBuf.getDefaultInstance().getJid();
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setJidBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.PullMessageHistoryRecordReqProBuf.checkByteStringIsUtf8(value);
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public int getSize() {
            return this.size_;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setSize(int value) {
            this.size_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder clearSize() {
            this.size_ = 0;
            this.onChanged();
            return this;
         }

         public long getStartTime() {
            return this.startTime_;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setStartTime(long value) {
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder clearStartTime() {
            this.startTime_ = 0L;
            this.onChanged();
            return this;
         }

         public long getEndTime() {
            return this.endTime_;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setEndTime(long value) {
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder clearEndTime() {
            this.endTime_ = 0L;
            this.onChanged();
            return this;
         }

         public final MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.PullMessageHistoryRecordReqProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface PullMessageHistoryRecordReqProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      String getJid();

      ByteString getJidBytes();

      int getSize();

      long getStartTime();

      long getEndTime();
   }

   public static final class GroupMessageRespProBuf extends GeneratedMessageV3 implements MessageProBuf.GroupMessageRespProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int JID_FIELD_NUMBER = 2;
      private volatile Object jid_;
      public static final int STATUS_FIELD_NUMBER = 3;
      private int status_;
      public static final int ISEXIT_FIELD_NUMBER = 4;
      private boolean isExit_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.GroupMessageRespProBuf DEFAULT_INSTANCE = new MessageProBuf.GroupMessageRespProBuf();
      private static final Parser<MessageProBuf.GroupMessageRespProBuf> PARSER = new AbstractParser<MessageProBuf.GroupMessageRespProBuf>() {
         public MessageProBuf.GroupMessageRespProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.GroupMessageRespProBuf(input, extensionRegistry);
         }
      };

      private GroupMessageRespProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GroupMessageRespProBuf() {
         this.memoizedIsInitialized = -1;
         this.jid_ = "";
         this.status_ = 0;
         this.isExit_ = false;
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GroupMessageRespProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
//            int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 18:
                     String s = input.readStringRequireUtf8();
                     this.jid_ = s;
                     break;
                  case 24:
                     this.status_ = input.readInt32();
                     break;
                  case 32:
                     this.isExit_ = input.readBool();
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_GroupMessageRespProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_GroupMessageRespProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.GroupMessageRespProBuf.class, MessageProBuf.GroupMessageRespProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public String getJid() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.jid_ = s;
            return s;
         }
      }

      public ByteString getJidBytes() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.jid_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public int getStatus() {
         return this.status_;
      }

      public boolean getIsExit() {
         return this.isExit_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         if (!this.getJidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.jid_);
         }

         if (this.status_ != 0) {
            output.writeInt32(3, this.status_);
         }

         if (this.isExit_) {
            output.writeBool(4, this.isExit_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            if (!this.getJidBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.jid_);
            }

            if (this.status_ != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.status_);
            }

            if (this.isExit_) {
               size += CodedOutputStream.computeBoolSize(4, this.isExit_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.GroupMessageRespProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.GroupMessageRespProBuf other = (MessageProBuf.GroupMessageRespProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getJid().equals(other.getJid());
            result = result && this.getStatus() == other.getStatus();
            result = result && this.getIsExit() == other.getIsExit();
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
             hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getJid().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getStatus();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashBoolean(this.getIsExit());
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.GroupMessageRespProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.GroupMessageRespProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.GroupMessageRespProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.GroupMessageRespProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.GroupMessageRespProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.GroupMessageRespProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.GroupMessageRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.GroupMessageRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.GroupMessageRespProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.GroupMessageRespProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.GroupMessageRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.GroupMessageRespProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.GroupMessageRespProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.GroupMessageRespProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.GroupMessageRespProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.GroupMessageRespProBuf.Builder newBuilder(MessageProBuf.GroupMessageRespProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.GroupMessageRespProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.GroupMessageRespProBuf.Builder() : (new MessageProBuf.GroupMessageRespProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.GroupMessageRespProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.GroupMessageRespProBuf.Builder builder = new MessageProBuf.GroupMessageRespProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.GroupMessageRespProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.GroupMessageRespProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.GroupMessageRespProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.GroupMessageRespProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      GroupMessageRespProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      GroupMessageRespProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.GroupMessageRespProBuf.Builder> implements MessageProBuf.GroupMessageRespProBufOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private Object jid_;
         private int status_;
         private boolean isExit_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_GroupMessageRespProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_GroupMessageRespProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.GroupMessageRespProBuf.class, MessageProBuf.GroupMessageRespProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.jid_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.jid_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.GroupMessageRespProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.GroupMessageRespProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.jid_ = "";
            this.status_ = 0;
            this.isExit_ = false;
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_GroupMessageRespProBuf_descriptor;
         }

         public MessageProBuf.GroupMessageRespProBuf getDefaultInstanceForType() {
            return MessageProBuf.GroupMessageRespProBuf.getDefaultInstance();
         }

         public MessageProBuf.GroupMessageRespProBuf build() {
            MessageProBuf.GroupMessageRespProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.GroupMessageRespProBuf buildPartial() {
            MessageProBuf.GroupMessageRespProBuf result = new MessageProBuf.GroupMessageRespProBuf(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            result.jid_ = this.jid_;
            result.status_ = this.status_;
            result.isExit_ = this.isExit_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder clone() {
            return (MessageProBuf.GroupMessageRespProBuf.Builder)super.clone();
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.GroupMessageRespProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.GroupMessageRespProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.GroupMessageRespProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.GroupMessageRespProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.GroupMessageRespProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.GroupMessageRespProBuf) {
               return this.mergeFrom((MessageProBuf.GroupMessageRespProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder mergeFrom(MessageProBuf.GroupMessageRespProBuf other) {
            if (other == MessageProBuf.GroupMessageRespProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (!other.getJid().isEmpty()) {
                  this.jid_ = other.jid_;
                  this.onChanged();
               }

               if (other.getStatus() != 0) {
                  this.setStatus(other.getStatus());
               }

               if (other.getIsExit()) {
                  this.setIsExit(other.getIsExit());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.GroupMessageRespProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.GroupMessageRespProBuf)MessageProBuf.GroupMessageRespProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.GroupMessageRespProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public String getJid() {
            Object ref = this.jid_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.jid_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getJidBytes() {
            Object ref = this.jid_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.jid_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder setJid(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder clearJid() {
            this.jid_ = MessageProBuf.GroupMessageRespProBuf.getDefaultInstance().getJid();
            this.onChanged();
            return this;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder setJidBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.GroupMessageRespProBuf.checkByteStringIsUtf8(value);
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public int getStatus() {
            return this.status_;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder setStatus(int value) {
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder clearStatus() {
            this.status_ = 0;
            this.onChanged();
            return this;
         }

         public boolean getIsExit() {
            return this.isExit_;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder setIsExit(boolean value) {
            this.isExit_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.GroupMessageRespProBuf.Builder clearIsExit() {
            this.isExit_ = false;
            this.onChanged();
            return this;
         }

         public final MessageProBuf.GroupMessageRespProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.GroupMessageRespProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.GroupMessageRespProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.GroupMessageRespProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface GroupMessageRespProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      String getJid();

      ByteString getJidBytes();

      int getStatus();

      boolean getIsExit();
   }

   public static final class ExitGroupMessageProBuf extends GeneratedMessageV3 implements MessageProBuf.ExitGroupMessageProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int JID_FIELD_NUMBER = 2;
      private volatile Object jid_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.ExitGroupMessageProBuf DEFAULT_INSTANCE = new MessageProBuf.ExitGroupMessageProBuf();
      private static final Parser<MessageProBuf.ExitGroupMessageProBuf> PARSER = new AbstractParser<MessageProBuf.ExitGroupMessageProBuf>() {
         public MessageProBuf.ExitGroupMessageProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.ExitGroupMessageProBuf(input, extensionRegistry);
         }
      };

      private ExitGroupMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ExitGroupMessageProBuf() {
         this.memoizedIsInitialized = -1;
         this.jid_ = "";
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ExitGroupMessageProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            //int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 18:
                     String s = input.readStringRequireUtf8();
                     this.jid_ = s;
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_ExitGroupMessageProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_ExitGroupMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.ExitGroupMessageProBuf.class, MessageProBuf.ExitGroupMessageProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public String getJid() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.jid_ = s;
            return s;
         }
      }

      public ByteString getJidBytes() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.jid_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         if (!this.getJidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.jid_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            if (!this.getJidBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.jid_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.ExitGroupMessageProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.ExitGroupMessageProBuf other = (MessageProBuf.ExitGroupMessageProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getJid().equals(other.getJid());
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getJid().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.ExitGroupMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.ExitGroupMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.ExitGroupMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.ExitGroupMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.ExitGroupMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.ExitGroupMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.ExitGroupMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.ExitGroupMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.ExitGroupMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.ExitGroupMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.ExitGroupMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.ExitGroupMessageProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.ExitGroupMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.ExitGroupMessageProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.ExitGroupMessageProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.ExitGroupMessageProBuf.Builder newBuilder(MessageProBuf.ExitGroupMessageProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.ExitGroupMessageProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.ExitGroupMessageProBuf.Builder() : (new MessageProBuf.ExitGroupMessageProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.ExitGroupMessageProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.ExitGroupMessageProBuf.Builder builder = new MessageProBuf.ExitGroupMessageProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.ExitGroupMessageProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.ExitGroupMessageProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.ExitGroupMessageProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.ExitGroupMessageProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      ExitGroupMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      ExitGroupMessageProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.ExitGroupMessageProBuf.Builder> implements MessageProBuf.ExitGroupMessageProBufOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private Object jid_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_ExitGroupMessageProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_ExitGroupMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.ExitGroupMessageProBuf.class, MessageProBuf.ExitGroupMessageProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.jid_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.jid_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.ExitGroupMessageProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.jid_ = "";
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_ExitGroupMessageProBuf_descriptor;
         }

         public MessageProBuf.ExitGroupMessageProBuf getDefaultInstanceForType() {
            return MessageProBuf.ExitGroupMessageProBuf.getDefaultInstance();
         }

         public MessageProBuf.ExitGroupMessageProBuf build() {
            MessageProBuf.ExitGroupMessageProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.ExitGroupMessageProBuf buildPartial() {
            MessageProBuf.ExitGroupMessageProBuf result = new MessageProBuf.ExitGroupMessageProBuf(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            result.jid_ = this.jid_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder clone() {
            return (MessageProBuf.ExitGroupMessageProBuf.Builder)super.clone();
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.ExitGroupMessageProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.ExitGroupMessageProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.ExitGroupMessageProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.ExitGroupMessageProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.ExitGroupMessageProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.ExitGroupMessageProBuf) {
               return this.mergeFrom((MessageProBuf.ExitGroupMessageProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder mergeFrom(MessageProBuf.ExitGroupMessageProBuf other) {
            if (other == MessageProBuf.ExitGroupMessageProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (!other.getJid().isEmpty()) {
                  this.jid_ = other.jid_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.ExitGroupMessageProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.ExitGroupMessageProBuf)MessageProBuf.ExitGroupMessageProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.ExitGroupMessageProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public String getJid() {
            Object ref = this.jid_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.jid_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getJidBytes() {
            Object ref = this.jid_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.jid_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder setJid(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder clearJid() {
            this.jid_ = MessageProBuf.ExitGroupMessageProBuf.getDefaultInstance().getJid();
            this.onChanged();
            return this;
         }

         public MessageProBuf.ExitGroupMessageProBuf.Builder setJidBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.ExitGroupMessageProBuf.checkByteStringIsUtf8(value);
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public final MessageProBuf.ExitGroupMessageProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.ExitGroupMessageProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.ExitGroupMessageProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.ExitGroupMessageProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface ExitGroupMessageProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      String getJid();

      ByteString getJidBytes();
   }

   public static final class JoinGroupMessageProBuf extends GeneratedMessageV3 implements MessageProBuf.JoinGroupMessageProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int JID_FIELD_NUMBER = 2;
      private volatile Object jid_;
      public static final int SECONDS_FIELD_NUMBER = 3;
      private long seconds_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.JoinGroupMessageProBuf DEFAULT_INSTANCE = new MessageProBuf.JoinGroupMessageProBuf();
      private static final Parser<MessageProBuf.JoinGroupMessageProBuf> PARSER = new AbstractParser<MessageProBuf.JoinGroupMessageProBuf>() {
         public MessageProBuf.JoinGroupMessageProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.JoinGroupMessageProBuf(input, extensionRegistry);
         }
      };

      private JoinGroupMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private JoinGroupMessageProBuf() {
         this.memoizedIsInitialized = -1;
         this.jid_ = "";
         this.seconds_ = 0L;
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private JoinGroupMessageProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            //int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 18:
                     String s = input.readStringRequireUtf8();
                     this.jid_ = s;
                     break;
                  case 24:
                     this.seconds_ = input.readInt64();
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_JoinGroupMessageProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_JoinGroupMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.JoinGroupMessageProBuf.class, MessageProBuf.JoinGroupMessageProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public String getJid() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.jid_ = s;
            return s;
         }
      }

      public ByteString getJidBytes() {
         Object ref = this.jid_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.jid_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public long getSeconds() {
         return this.seconds_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         if (!this.getJidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.jid_);
         }

         if (this.seconds_ != 0L) {
            output.writeInt64(3, this.seconds_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            if (!this.getJidBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.jid_);
            }

            if (this.seconds_ != 0L) {
               size += CodedOutputStream.computeInt64Size(3, this.seconds_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.JoinGroupMessageProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.JoinGroupMessageProBuf other = (MessageProBuf.JoinGroupMessageProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getJid().equals(other.getJid());
            result = result && this.getSeconds() == other.getSeconds();
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getJid().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getSeconds());
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.JoinGroupMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.JoinGroupMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.JoinGroupMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.JoinGroupMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.JoinGroupMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.JoinGroupMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.JoinGroupMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.JoinGroupMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.JoinGroupMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.JoinGroupMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.JoinGroupMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.JoinGroupMessageProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.JoinGroupMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.JoinGroupMessageProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.JoinGroupMessageProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.JoinGroupMessageProBuf.Builder newBuilder(MessageProBuf.JoinGroupMessageProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.JoinGroupMessageProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.JoinGroupMessageProBuf.Builder() : (new MessageProBuf.JoinGroupMessageProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.JoinGroupMessageProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.JoinGroupMessageProBuf.Builder builder = new MessageProBuf.JoinGroupMessageProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.JoinGroupMessageProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.JoinGroupMessageProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.JoinGroupMessageProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.JoinGroupMessageProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      JoinGroupMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      JoinGroupMessageProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.JoinGroupMessageProBuf.Builder> implements MessageProBuf.JoinGroupMessageProBufOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private Object jid_;
         private long seconds_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_JoinGroupMessageProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_JoinGroupMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.JoinGroupMessageProBuf.class, MessageProBuf.JoinGroupMessageProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.jid_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.jid_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.JoinGroupMessageProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.jid_ = "";
            this.seconds_ = 0L;
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_JoinGroupMessageProBuf_descriptor;
         }

         public MessageProBuf.JoinGroupMessageProBuf getDefaultInstanceForType() {
            return MessageProBuf.JoinGroupMessageProBuf.getDefaultInstance();
         }

         public MessageProBuf.JoinGroupMessageProBuf build() {
            MessageProBuf.JoinGroupMessageProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.JoinGroupMessageProBuf buildPartial() {
            MessageProBuf.JoinGroupMessageProBuf result = new MessageProBuf.JoinGroupMessageProBuf(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            result.jid_ = this.jid_;
            result.seconds_ = this.seconds_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder clone() {
            return (MessageProBuf.JoinGroupMessageProBuf.Builder)super.clone();
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.JoinGroupMessageProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.JoinGroupMessageProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.JoinGroupMessageProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.JoinGroupMessageProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.JoinGroupMessageProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.JoinGroupMessageProBuf) {
               return this.mergeFrom((MessageProBuf.JoinGroupMessageProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder mergeFrom(MessageProBuf.JoinGroupMessageProBuf other) {
            if (other == MessageProBuf.JoinGroupMessageProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (!other.getJid().isEmpty()) {
                  this.jid_ = other.jid_;
                  this.onChanged();
               }

               if (other.getSeconds() != 0L) {
                  this.setSeconds(other.getSeconds());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.JoinGroupMessageProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.JoinGroupMessageProBuf)MessageProBuf.JoinGroupMessageProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.JoinGroupMessageProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public String getJid() {
            Object ref = this.jid_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.jid_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getJidBytes() {
            Object ref = this.jid_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.jid_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder setJid(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder clearJid() {
            this.jid_ = MessageProBuf.JoinGroupMessageProBuf.getDefaultInstance().getJid();
            this.onChanged();
            return this;
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder setJidBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.JoinGroupMessageProBuf.checkByteStringIsUtf8(value);
               this.jid_ = value;
               this.onChanged();
               return this;
            }
         }

         public long getSeconds() {
            return this.seconds_;
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder setSeconds(long value) {
            this.seconds_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.JoinGroupMessageProBuf.Builder clearSeconds() {
            this.seconds_ = 0L;
            this.onChanged();
            return this;
         }

         public final MessageProBuf.JoinGroupMessageProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.JoinGroupMessageProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.JoinGroupMessageProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.JoinGroupMessageProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface JoinGroupMessageProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      String getJid();

      ByteString getJidBytes();

      long getSeconds();
   }

   public static final class MessageReceiptStatusProBuf extends GeneratedMessageV3 implements MessageProBuf.MessageReceiptStatusProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int STATUS_FIELD_NUMBER = 2;
      private int status_;
      public static final int MESSAGEID_FIELD_NUMBER = 3;
      private volatile Object messageId_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.MessageReceiptStatusProBuf DEFAULT_INSTANCE = new MessageProBuf.MessageReceiptStatusProBuf();
      private static final Parser<MessageProBuf.MessageReceiptStatusProBuf> PARSER = new AbstractParser<MessageProBuf.MessageReceiptStatusProBuf>() {
         public MessageProBuf.MessageReceiptStatusProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.MessageReceiptStatusProBuf(input, extensionRegistry);
         }
      };

      private MessageReceiptStatusProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MessageReceiptStatusProBuf() {
         this.memoizedIsInitialized = -1;
         this.status_ = 0;
         this.messageId_ = "";
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MessageReceiptStatusProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            //int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 16:
                     this.status_ = input.readInt32();
                     break;
                  case 26:
                     String s = input.readStringRequireUtf8();
                     this.messageId_ = s;
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_MessageReceiptStatusProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_MessageReceiptStatusProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.MessageReceiptStatusProBuf.class, MessageProBuf.MessageReceiptStatusProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public int getStatus() {
         return this.status_;
      }

      public String getMessageId() {
         Object ref = this.messageId_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.messageId_ = s;
            return s;
         }
      }

      public ByteString getMessageIdBytes() {
         Object ref = this.messageId_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.messageId_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         if (this.status_ != 0) {
            output.writeInt32(2, this.status_);
         }

         if (!this.getMessageIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 3, this.messageId_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            if (this.status_ != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.status_);
            }

            if (!this.getMessageIdBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(3, this.messageId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.MessageReceiptStatusProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.MessageReceiptStatusProBuf other = (MessageProBuf.MessageReceiptStatusProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getStatus() == other.getStatus();
            result = result && this.getMessageId().equals(other.getMessageId());
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getStatus();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getMessageId().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageReceiptStatusProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageReceiptStatusProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageReceiptStatusProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageReceiptStatusProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageReceiptStatusProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageReceiptStatusProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.MessageReceiptStatusProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.MessageReceiptStatusProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.MessageReceiptStatusProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.MessageReceiptStatusProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.MessageReceiptStatusProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.MessageReceiptStatusProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.MessageReceiptStatusProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.MessageReceiptStatusProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.MessageReceiptStatusProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.MessageReceiptStatusProBuf.Builder newBuilder(MessageProBuf.MessageReceiptStatusProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.MessageReceiptStatusProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.MessageReceiptStatusProBuf.Builder() : (new MessageProBuf.MessageReceiptStatusProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.MessageReceiptStatusProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.MessageReceiptStatusProBuf.Builder builder = new MessageProBuf.MessageReceiptStatusProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.MessageReceiptStatusProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.MessageReceiptStatusProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.MessageReceiptStatusProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.MessageReceiptStatusProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      MessageReceiptStatusProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      MessageReceiptStatusProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.MessageReceiptStatusProBuf.Builder> implements MessageProBuf.MessageReceiptStatusProBufOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private int status_;
         private Object messageId_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_MessageReceiptStatusProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_MessageReceiptStatusProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.MessageReceiptStatusProBuf.class, MessageProBuf.MessageReceiptStatusProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.messageId_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.messageId_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.MessageReceiptStatusProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.status_ = 0;
            this.messageId_ = "";
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_MessageReceiptStatusProBuf_descriptor;
         }

         public MessageProBuf.MessageReceiptStatusProBuf getDefaultInstanceForType() {
            return MessageProBuf.MessageReceiptStatusProBuf.getDefaultInstance();
         }

         public MessageProBuf.MessageReceiptStatusProBuf build() {
            MessageProBuf.MessageReceiptStatusProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.MessageReceiptStatusProBuf buildPartial() {
            MessageProBuf.MessageReceiptStatusProBuf result = new MessageProBuf.MessageReceiptStatusProBuf(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            result.status_ = this.status_;
            result.messageId_ = this.messageId_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder clone() {
            return (MessageProBuf.MessageReceiptStatusProBuf.Builder)super.clone();
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.MessageReceiptStatusProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.MessageReceiptStatusProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.MessageReceiptStatusProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.MessageReceiptStatusProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.MessageReceiptStatusProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.MessageReceiptStatusProBuf) {
               return this.mergeFrom((MessageProBuf.MessageReceiptStatusProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder mergeFrom(MessageProBuf.MessageReceiptStatusProBuf other) {
            if (other == MessageProBuf.MessageReceiptStatusProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (other.getStatus() != 0) {
                  this.setStatus(other.getStatus());
               }

               if (!other.getMessageId().isEmpty()) {
                  this.messageId_ = other.messageId_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.MessageReceiptStatusProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.MessageReceiptStatusProBuf)MessageProBuf.MessageReceiptStatusProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.MessageReceiptStatusProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public int getStatus() {
            return this.status_;
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder setStatus(int value) {
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder clearStatus() {
            this.status_ = 0;
            this.onChanged();
            return this;
         }

         public String getMessageId() {
            Object ref = this.messageId_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.messageId_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getMessageIdBytes() {
            Object ref = this.messageId_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.messageId_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder setMessageId(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.messageId_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder clearMessageId() {
            this.messageId_ = MessageProBuf.MessageReceiptStatusProBuf.getDefaultInstance().getMessageId();
            this.onChanged();
            return this;
         }

         public MessageProBuf.MessageReceiptStatusProBuf.Builder setMessageIdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.MessageReceiptStatusProBuf.checkByteStringIsUtf8(value);
               this.messageId_ = value;
               this.onChanged();
               return this;
            }
         }

         public final MessageProBuf.MessageReceiptStatusProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.MessageReceiptStatusProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.MessageReceiptStatusProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.MessageReceiptStatusProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface MessageReceiptStatusProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      int getStatus();

      String getMessageId();

      ByteString getMessageIdBytes();
   }

   public static final class AuthRespMessageProBuf extends GeneratedMessageV3 implements MessageProBuf.AuthRespMessageProBufOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int STATUS_FIELD_NUMBER = 2;
      private int status_;
      public static final int ARG_FIELD_NUMBER = 3;
      private volatile Object arg_;
      public static final int TOKEN_FIELD_NUMBER = 4;
      private volatile Object token_;
      public static final int RESOURCES_FIELD_NUMBER = 5;
      private volatile Object resources_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.AuthRespMessageProBuf DEFAULT_INSTANCE = new MessageProBuf.AuthRespMessageProBuf();
      private static final Parser<MessageProBuf.AuthRespMessageProBuf> PARSER = new AbstractParser<MessageProBuf.AuthRespMessageProBuf>() {
         public MessageProBuf.AuthRespMessageProBuf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.AuthRespMessageProBuf(input, extensionRegistry);
         }
      };

      private AuthRespMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private AuthRespMessageProBuf() {
         this.memoizedIsInitialized = -1;
         this.status_ = 0;
         this.arg_ = "";
         this.token_ = "";
         this.resources_ = "";
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AuthRespMessageProBuf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            //int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  String s;
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 16:
                     this.status_ = input.readInt32();
                     break;
                  case 26:
                     s = input.readStringRequireUtf8();
                     this.arg_ = s;
                     break;
                  case 34:
                     s = input.readStringRequireUtf8();
                     this.token_ = s;
                     break;
                  case 42:
                     s = input.readStringRequireUtf8();
                     this.resources_ = s;
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_AuthRespMessageProBuf_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_AuthRespMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.AuthRespMessageProBuf.class, MessageProBuf.AuthRespMessageProBuf.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public int getStatus() {
         return this.status_;
      }

      public String getArg() {
         Object ref = this.arg_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.arg_ = s;
            return s;
         }
      }

      public ByteString getArgBytes() {
         Object ref = this.arg_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.arg_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getToken() {
         Object ref = this.token_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.token_ = s;
            return s;
         }
      }

      public ByteString getTokenBytes() {
         Object ref = this.token_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.token_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getResources() {
         Object ref = this.resources_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.resources_ = s;
            return s;
         }
      }

      public ByteString getResourcesBytes() {
         Object ref = this.resources_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.resources_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         if (this.status_ != 0) {
            output.writeInt32(2, this.status_);
         }

         if (!this.getArgBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 3, this.arg_);
         }

         if (!this.getTokenBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 4, this.token_);
         }

         if (!this.getResourcesBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 5, this.resources_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            if (this.status_ != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.status_);
            }

            if (!this.getArgBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(3, this.arg_);
            }

            if (!this.getTokenBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(4, this.token_);
            }

            if (!this.getResourcesBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(5, this.resources_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.AuthRespMessageProBuf)) {
            return super.equals(obj);
         } else {
            MessageProBuf.AuthRespMessageProBuf other = (MessageProBuf.AuthRespMessageProBuf)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getStatus() == other.getStatus();
            result = result && this.getArg().equals(other.getArg());
            result = result && this.getToken().equals(other.getToken());
            result = result && this.getResources().equals(other.getResources());
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getStatus();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getArg().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getToken().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getResources().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthRespMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthRespMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthRespMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthRespMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthRespMessageProBuf)PARSER.parseFrom(data);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthRespMessageProBuf)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.AuthRespMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.AuthRespMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.AuthRespMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.AuthRespMessageProBuf)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.AuthRespMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.AuthRespMessageProBuf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.AuthRespMessageProBuf)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.AuthRespMessageProBuf.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.AuthRespMessageProBuf.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.AuthRespMessageProBuf.Builder newBuilder(MessageProBuf.AuthRespMessageProBuf prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.AuthRespMessageProBuf.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.AuthRespMessageProBuf.Builder() : (new MessageProBuf.AuthRespMessageProBuf.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.AuthRespMessageProBuf.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.AuthRespMessageProBuf.Builder builder = new MessageProBuf.AuthRespMessageProBuf.Builder(parent);
         return builder;
      }

      public static MessageProBuf.AuthRespMessageProBuf getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.AuthRespMessageProBuf> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.AuthRespMessageProBuf> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.AuthRespMessageProBuf getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      AuthRespMessageProBuf(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      AuthRespMessageProBuf(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.AuthRespMessageProBuf.Builder> implements MessageProBuf.AuthRespMessageProBufOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private int status_;
         private Object arg_;
         private Object token_;
         private Object resources_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_AuthRespMessageProBuf_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_AuthRespMessageProBuf_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.AuthRespMessageProBuf.class, MessageProBuf.AuthRespMessageProBuf.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.arg_ = "";
            this.token_ = "";
            this.resources_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.arg_ = "";
            this.token_ = "";
            this.resources_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.AuthRespMessageProBuf.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.AuthRespMessageProBuf.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.status_ = 0;
            this.arg_ = "";
            this.token_ = "";
            this.resources_ = "";
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_AuthRespMessageProBuf_descriptor;
         }

         public MessageProBuf.AuthRespMessageProBuf getDefaultInstanceForType() {
            return MessageProBuf.AuthRespMessageProBuf.getDefaultInstance();
         }

         public MessageProBuf.AuthRespMessageProBuf build() {
            MessageProBuf.AuthRespMessageProBuf result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.AuthRespMessageProBuf buildPartial() {
            MessageProBuf.AuthRespMessageProBuf result = new MessageProBuf.AuthRespMessageProBuf(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            result.status_ = this.status_;
            result.arg_ = this.arg_;
            result.token_ = this.token_;
            result.resources_ = this.resources_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder clone() {
            return (MessageProBuf.AuthRespMessageProBuf.Builder)super.clone();
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.AuthRespMessageProBuf.Builder)super.setField(field, value);
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.AuthRespMessageProBuf.Builder)super.clearField(field);
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.AuthRespMessageProBuf.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.AuthRespMessageProBuf.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.AuthRespMessageProBuf.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.AuthRespMessageProBuf) {
               return this.mergeFrom((MessageProBuf.AuthRespMessageProBuf)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder mergeFrom(MessageProBuf.AuthRespMessageProBuf other) {
            if (other == MessageProBuf.AuthRespMessageProBuf.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (other.getStatus() != 0) {
                  this.setStatus(other.getStatus());
               }

               if (!other.getArg().isEmpty()) {
                  this.arg_ = other.arg_;
                  this.onChanged();
               }

               if (!other.getToken().isEmpty()) {
                  this.token_ = other.token_;
                  this.onChanged();
               }

               if (!other.getResources().isEmpty()) {
                  this.resources_ = other.resources_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.AuthRespMessageProBuf parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.AuthRespMessageProBuf)MessageProBuf.AuthRespMessageProBuf.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.AuthRespMessageProBuf)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public int getStatus() {
            return this.status_;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setStatus(int value) {
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder clearStatus() {
            this.status_ = 0;
            this.onChanged();
            return this;
         }

         public String getArg() {
            Object ref = this.arg_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.arg_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getArgBytes() {
            Object ref = this.arg_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.arg_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setArg(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.arg_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder clearArg() {
            this.arg_ = MessageProBuf.AuthRespMessageProBuf.getDefaultInstance().getArg();
            this.onChanged();
            return this;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setArgBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.AuthRespMessageProBuf.checkByteStringIsUtf8(value);
               this.arg_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getToken() {
            Object ref = this.token_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.token_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getTokenBytes() {
            Object ref = this.token_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.token_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setToken(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.token_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder clearToken() {
            this.token_ = MessageProBuf.AuthRespMessageProBuf.getDefaultInstance().getToken();
            this.onChanged();
            return this;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setTokenBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.AuthRespMessageProBuf.checkByteStringIsUtf8(value);
               this.token_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getResources() {
            Object ref = this.resources_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.resources_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getResourcesBytes() {
            Object ref = this.resources_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.resources_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setResources(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.resources_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder clearResources() {
            this.resources_ = MessageProBuf.AuthRespMessageProBuf.getDefaultInstance().getResources();
            this.onChanged();
            return this;
         }

         public MessageProBuf.AuthRespMessageProBuf.Builder setResourcesBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.AuthRespMessageProBuf.checkByteStringIsUtf8(value);
               this.resources_ = value;
               this.onChanged();
               return this;
            }
         }

         public final MessageProBuf.AuthRespMessageProBuf.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.AuthRespMessageProBuf.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.AuthRespMessageProBuf.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.AuthRespMessageProBuf.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface AuthRespMessageProBufOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      int getStatus();

      String getArg();

      ByteString getArgBytes();

      String getToken();

      ByteString getTokenBytes();

      String getResources();

      ByteString getResourcesBytes();
   }

   public static final class AuthMessage extends GeneratedMessageV3 implements MessageProBuf.AuthMessageOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int TOKEN_FIELD_NUMBER = 2;
      private volatile Object token_;
      public static final int PASSWORD_FIELD_NUMBER = 3;
      private volatile Object password_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.AuthMessage DEFAULT_INSTANCE = new MessageProBuf.AuthMessage();
      private static final Parser<MessageProBuf.AuthMessage> PARSER = new AbstractParser<MessageProBuf.AuthMessage>() {
         public MessageProBuf.AuthMessage parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.AuthMessage(input, extensionRegistry);
         }
      };

      private AuthMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private AuthMessage() {
         this.memoizedIsInitialized = -1;
         this.token_ = "";
         this.password_ = "";
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AuthMessage(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            //int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  String s;
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 18:
                     s = input.readStringRequireUtf8();
                     this.token_ = s;
                     break;
                  case 26:
                     s = input.readStringRequireUtf8();
                     this.password_ = s;
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_AuthMessage_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_AuthMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.AuthMessage.class, MessageProBuf.AuthMessage.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public String getToken() {
         Object ref = this.token_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.token_ = s;
            return s;
         }
      }

      public ByteString getTokenBytes() {
         Object ref = this.token_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.token_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getPassword() {
         Object ref = this.password_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.password_ = s;
            return s;
         }
      }

      public ByteString getPasswordBytes() {
         Object ref = this.password_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.password_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         if (!this.getTokenBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.token_);
         }

         if (!this.getPasswordBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 3, this.password_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            if (!this.getTokenBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.token_);
            }

            if (!this.getPasswordBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(3, this.password_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.AuthMessage)) {
            return super.equals(obj);
         } else {
            MessageProBuf.AuthMessage other = (MessageProBuf.AuthMessage)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getToken().equals(other.getToken());
            result = result && this.getPassword().equals(other.getPassword());
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getToken().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getPassword().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.AuthMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthMessage)PARSER.parseFrom(data);
      }

      public static MessageProBuf.AuthMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthMessage)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.AuthMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthMessage)PARSER.parseFrom(data);
      }

      public static MessageProBuf.AuthMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthMessage)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.AuthMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthMessage)PARSER.parseFrom(data);
      }

      public static MessageProBuf.AuthMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.AuthMessage)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.AuthMessage parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.AuthMessage)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.AuthMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.AuthMessage)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.AuthMessage parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.AuthMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.AuthMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.AuthMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.AuthMessage parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.AuthMessage)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.AuthMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.AuthMessage)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.AuthMessage.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.AuthMessage.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.AuthMessage.Builder newBuilder(MessageProBuf.AuthMessage prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.AuthMessage.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.AuthMessage.Builder() : (new MessageProBuf.AuthMessage.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.AuthMessage.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.AuthMessage.Builder builder = new MessageProBuf.AuthMessage.Builder(parent);
         return builder;
      }

      public static MessageProBuf.AuthMessage getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.AuthMessage> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.AuthMessage> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.AuthMessage getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      AuthMessage(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      AuthMessage(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.AuthMessage.Builder> implements MessageProBuf.AuthMessageOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private Object token_;
         private Object password_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_AuthMessage_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_AuthMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.AuthMessage.class, MessageProBuf.AuthMessage.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.token_ = "";
            this.password_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.token_ = "";
            this.password_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.AuthMessage.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.AuthMessage.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.token_ = "";
            this.password_ = "";
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_AuthMessage_descriptor;
         }

         public MessageProBuf.AuthMessage getDefaultInstanceForType() {
            return MessageProBuf.AuthMessage.getDefaultInstance();
         }

         public MessageProBuf.AuthMessage build() {
            MessageProBuf.AuthMessage result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.AuthMessage buildPartial() {
            MessageProBuf.AuthMessage result = new MessageProBuf.AuthMessage(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            result.token_ = this.token_;
            result.password_ = this.password_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.AuthMessage.Builder clone() {
            return (MessageProBuf.AuthMessage.Builder)super.clone();
         }

         public MessageProBuf.AuthMessage.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.AuthMessage.Builder)super.setField(field, value);
         }

         public MessageProBuf.AuthMessage.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.AuthMessage.Builder)super.clearField(field);
         }

         public MessageProBuf.AuthMessage.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.AuthMessage.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.AuthMessage.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.AuthMessage.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.AuthMessage.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.AuthMessage.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.AuthMessage.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.AuthMessage) {
               return this.mergeFrom((MessageProBuf.AuthMessage)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.AuthMessage.Builder mergeFrom(MessageProBuf.AuthMessage other) {
            if (other == MessageProBuf.AuthMessage.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (!other.getToken().isEmpty()) {
                  this.token_ = other.token_;
                  this.onChanged();
               }

               if (!other.getPassword().isEmpty()) {
                  this.password_ = other.password_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.AuthMessage.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.AuthMessage parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.AuthMessage)MessageProBuf.AuthMessage.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.AuthMessage)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.AuthMessage.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.AuthMessage.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.AuthMessage.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.AuthMessage.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public String getToken() {
            Object ref = this.token_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.token_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getTokenBytes() {
            Object ref = this.token_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.token_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.AuthMessage.Builder setToken(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.token_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.AuthMessage.Builder clearToken() {
            this.token_ = MessageProBuf.AuthMessage.getDefaultInstance().getToken();
            this.onChanged();
            return this;
         }

         public MessageProBuf.AuthMessage.Builder setTokenBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.AuthMessage.checkByteStringIsUtf8(value);
               this.token_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getPassword() {
            Object ref = this.password_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.password_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPasswordBytes() {
            Object ref = this.password_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.password_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.AuthMessage.Builder setPassword(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.password_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.AuthMessage.Builder clearPassword() {
            this.password_ = MessageProBuf.AuthMessage.getDefaultInstance().getPassword();
            this.onChanged();
            return this;
         }

         public MessageProBuf.AuthMessage.Builder setPasswordBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.AuthMessage.checkByteStringIsUtf8(value);
               this.password_ = value;
               this.onChanged();
               return this;
            }
         }

         public final MessageProBuf.AuthMessage.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.AuthMessage.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.AuthMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.AuthMessage.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface AuthMessageOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      String getToken();

      ByteString getTokenBytes();

      String getPassword();

      ByteString getPasswordBytes();
   }

   public static final class ChatMessage extends GeneratedMessageV3 implements MessageProBuf.ChatMessageOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MESSAGEHEAD_FIELD_NUMBER = 1;
      private MessageProBuf.MessageHead messageHead_;
      public static final int FROMUSERID_FIELD_NUMBER = 2;
      private volatile Object fromUserId_;
      public static final int FROMUSERNAME_FIELD_NUMBER = 3;
      private volatile Object fromUserName_;
      public static final int TOUSERID_FIELD_NUMBER = 4;
      private volatile Object toUserId_;
      public static final int TOUSERNAME_FIELD_NUMBER = 5;
      private volatile Object toUserName_;
      public static final int TIMESEND_FIELD_NUMBER = 6;
      private long timeSend_;
      public static final int TYPE_FIELD_NUMBER = 7;
      private int type_;
      public static final int CONTENT_FIELD_NUMBER = 8;
      private volatile Object content_;
      public static final int OBJECTID_FIELD_NUMBER = 9;
      private volatile Object objectId_;
      public static final int FILENAME_FIELD_NUMBER = 10;
      private volatile Object fileName_;
      public static final int ISENCRYPT_FIELD_NUMBER = 11;
      private boolean isEncrypt_;
      public static final int DELETETIME_FIELD_NUMBER = 12;
      private long deleteTime_;
      public static final int ISREADDEL_FIELD_NUMBER = 13;
      private boolean isReadDel_;
      public static final int FILESIZE_FIELD_NUMBER = 14;
      private long fileSize_;
      public static final int FILETIME_FIELD_NUMBER = 15;
      private long fileTime_;
      public static final int LOCATION_X_FIELD_NUMBER = 16;
      private double locationX_;
      public static final int LOCATION_Y_FIELD_NUMBER = 17;
      private double locationY_;
      public static final int ENCRYPTTYPE_FIELD_NUMBER = 18;
      private int encryptType_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.ChatMessage DEFAULT_INSTANCE = new MessageProBuf.ChatMessage();
      private static final Parser<MessageProBuf.ChatMessage> PARSER = new AbstractParser<MessageProBuf.ChatMessage>() {
         public MessageProBuf.ChatMessage parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.ChatMessage(input, extensionRegistry);
         }
      };

      private ChatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ChatMessage() {
         this.memoizedIsInitialized = -1;
         this.fromUserId_ = "";
         this.fromUserName_ = "";
         this.toUserId_ = "";
         this.toUserName_ = "";
         this.timeSend_ = 0L;
         this.type_ = 0;
         this.content_ = "";
         this.objectId_ = "";
         this.fileName_ = "";
         this.isEncrypt_ = false;
         this.deleteTime_ = 0L;
         this.isReadDel_ = false;
         this.fileSize_ = 0L;
         this.fileTime_ = 0L;
         this.locationX_ = 0.0D;
         this.locationY_ = 0.0D;
         this.encryptType_ = 0;
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ChatMessage(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            //int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  String s;
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     MessageProBuf.MessageHead.Builder subBuilder = null;
                     if (this.messageHead_ != null) {
                        subBuilder = this.messageHead_.toBuilder();
                     }

                     this.messageHead_ = (MessageProBuf.MessageHead)input.readMessage(MessageProBuf.MessageHead.parser(), extensionRegistry);
                     if (subBuilder != null) {
                        subBuilder.mergeFrom(this.messageHead_);
                        this.messageHead_ = subBuilder.buildPartial();
                     }
                     break;
                  case 18:
                     s = input.readStringRequireUtf8();
                     this.fromUserId_ = s;
                     break;
                  case 26:
                     s = input.readStringRequireUtf8();
                     this.fromUserName_ = s;
                     break;
                  case 34:
                     s = input.readStringRequireUtf8();
                     this.toUserId_ = s;
                     break;
                  case 42:
                     s = input.readStringRequireUtf8();
                     this.toUserName_ = s;
                     break;
                  case 48:
                     this.timeSend_ = input.readInt64();
                     break;
                  case 56:
                     this.type_ = input.readInt32();
                     break;
                  case 66:
                     s = input.readStringRequireUtf8();
                     this.content_ = s;
                     break;
                  case 74:
                     s = input.readStringRequireUtf8();
                     this.objectId_ = s;
                     break;
                  case 82:
                     s = input.readStringRequireUtf8();
                     this.fileName_ = s;
                     break;
                  case 88:
                     this.isEncrypt_ = input.readBool();
                     break;
                  case 96:
                     this.deleteTime_ = input.readInt64();
                     break;
                  case 104:
                     this.isReadDel_ = input.readBool();
                     break;
                  case 112:
                     this.fileSize_ = input.readInt64();
                     break;
                  case 120:
                     this.fileTime_ = input.readInt64();
                     break;
                  case 129:
                     this.locationX_ = input.readDouble();
                     break;
                  case 137:
                     this.locationY_ = input.readDouble();
                     break;
                  case 144:
                     this.encryptType_ = input.readInt32();
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_ChatMessage_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_ChatMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.ChatMessage.class, MessageProBuf.ChatMessage.Builder.class);
      }

      public boolean hasMessageHead() {
         return this.messageHead_ != null;
      }

      public MessageProBuf.MessageHead getMessageHead() {
         return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
      }

      public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
         return this.getMessageHead();
      }

      public String getFromUserId() {
         Object ref = this.fromUserId_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.fromUserId_ = s;
            return s;
         }
      }

      public ByteString getFromUserIdBytes() {
         Object ref = this.fromUserId_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.fromUserId_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getFromUserName() {
         Object ref = this.fromUserName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.fromUserName_ = s;
            return s;
         }
      }

      public ByteString getFromUserNameBytes() {
         Object ref = this.fromUserName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.fromUserName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getToUserId() {
         Object ref = this.toUserId_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.toUserId_ = s;
            return s;
         }
      }

      public ByteString getToUserIdBytes() {
         Object ref = this.toUserId_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.toUserId_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getToUserName() {
         Object ref = this.toUserName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.toUserName_ = s;
            return s;
         }
      }

      public ByteString getToUserNameBytes() {
         Object ref = this.toUserName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.toUserName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public long getTimeSend() {
         return this.timeSend_;
      }

      public int getType() {
         return this.type_;
      }

      public String getContent() {
         Object ref = this.content_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.content_ = s;
            return s;
         }
      }

      public ByteString getContentBytes() {
         Object ref = this.content_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.content_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getObjectId() {
         Object ref = this.objectId_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.objectId_ = s;
            return s;
         }
      }

      public ByteString getObjectIdBytes() {
         Object ref = this.objectId_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.objectId_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getFileName() {
         Object ref = this.fileName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.fileName_ = s;
            return s;
         }
      }

      public ByteString getFileNameBytes() {
         Object ref = this.fileName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.fileName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean getIsEncrypt() {
         return this.isEncrypt_;
      }

      public long getDeleteTime() {
         return this.deleteTime_;
      }

      public boolean getIsReadDel() {
         return this.isReadDel_;
      }

      public long getFileSize() {
         return this.fileSize_;
      }

      public long getFileTime() {
         return this.fileTime_;
      }

      public double getLocationX() {
         return this.locationX_;
      }

      public double getLocationY() {
         return this.locationY_;
      }

      public int getEncryptType() {
         return this.encryptType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (this.messageHead_ != null) {
            output.writeMessage(1, this.getMessageHead());
         }

         if (!this.getFromUserIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.fromUserId_);
         }

         if (!this.getFromUserNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 3, this.fromUserName_);
         }

         if (!this.getToUserIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 4, this.toUserId_);
         }

         if (!this.getToUserNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 5, this.toUserName_);
         }

         if (this.timeSend_ != 0L) {
            output.writeInt64(6, this.timeSend_);
         }

         if (this.type_ != 0) {
            output.writeInt32(7, this.type_);
         }

         if (!this.getContentBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 8, this.content_);
         }

         if (!this.getObjectIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 9, this.objectId_);
         }

         if (!this.getFileNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 10, this.fileName_);
         }

         if (this.isEncrypt_) {
            output.writeBool(11, this.isEncrypt_);
         }

         if (this.deleteTime_ != 0L) {
            output.writeInt64(12, this.deleteTime_);
         }

         if (this.isReadDel_) {
            output.writeBool(13, this.isReadDel_);
         }

         if (this.fileSize_ != 0L) {
            output.writeInt64(14, this.fileSize_);
         }

         if (this.fileTime_ != 0L) {
            output.writeInt64(15, this.fileTime_);
         }

         if (this.locationX_ != 0.0D) {
            output.writeDouble(16, this.locationX_);
         }

         if (this.locationY_ != 0.0D) {
            output.writeDouble(17, this.locationY_);
         }

         if (this.encryptType_ != 0) {
            output.writeInt32(18, this.encryptType_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (this.messageHead_ != null) {
               size += CodedOutputStream.computeMessageSize(1, this.getMessageHead());
            }

            if (!this.getFromUserIdBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.fromUserId_);
            }

            if (!this.getFromUserNameBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(3, this.fromUserName_);
            }

            if (!this.getToUserIdBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(4, this.toUserId_);
            }

            if (!this.getToUserNameBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(5, this.toUserName_);
            }

            if (this.timeSend_ != 0L) {
               size += CodedOutputStream.computeInt64Size(6, this.timeSend_);
            }

            if (this.type_ != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.type_);
            }

            if (!this.getContentBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(8, this.content_);
            }

            if (!this.getObjectIdBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(9, this.objectId_);
            }

            if (!this.getFileNameBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(10, this.fileName_);
            }

            if (this.isEncrypt_) {
               size += CodedOutputStream.computeBoolSize(11, this.isEncrypt_);
            }

            if (this.deleteTime_ != 0L) {
               size += CodedOutputStream.computeInt64Size(12, this.deleteTime_);
            }

            if (this.isReadDel_) {
               size += CodedOutputStream.computeBoolSize(13, this.isReadDel_);
            }

            if (this.fileSize_ != 0L) {
               size += CodedOutputStream.computeInt64Size(14, this.fileSize_);
            }

            if (this.fileTime_ != 0L) {
               size += CodedOutputStream.computeInt64Size(15, this.fileTime_);
            }

            if (this.locationX_ != 0.0D) {
               size += CodedOutputStream.computeDoubleSize(16, this.locationX_);
            }

            if (this.locationY_ != 0.0D) {
               size += CodedOutputStream.computeDoubleSize(17, this.locationY_);
            }

            if (this.encryptType_ != 0) {
               size += CodedOutputStream.computeInt32Size(18, this.encryptType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.ChatMessage)) {
            return super.equals(obj);
         } else {
            MessageProBuf.ChatMessage other = (MessageProBuf.ChatMessage)obj;
            boolean result = true;
            result = result && this.hasMessageHead() == other.hasMessageHead();
            if (this.hasMessageHead()) {
               result = result && this.getMessageHead().equals(other.getMessageHead());
            }

            result = result && this.getFromUserId().equals(other.getFromUserId());
            result = result && this.getFromUserName().equals(other.getFromUserName());
            result = result && this.getToUserId().equals(other.getToUserId());
            result = result && this.getToUserName().equals(other.getToUserName());
            result = result && this.getTimeSend() == other.getTimeSend();
            result = result && this.getType() == other.getType();
            result = result && this.getContent().equals(other.getContent());
            result = result && this.getObjectId().equals(other.getObjectId());
            result = result && this.getFileName().equals(other.getFileName());
            result = result && this.getIsEncrypt() == other.getIsEncrypt();
            result = result && this.getDeleteTime() == other.getDeleteTime();
            result = result && this.getIsReadDel() == other.getIsReadDel();
            result = result && this.getFileSize() == other.getFileSize();
            result = result && this.getFileTime() == other.getFileTime();
            result = result && Double.doubleToLongBits(this.getLocationX()) == Double.doubleToLongBits(other.getLocationX());
            result = result && Double.doubleToLongBits(this.getLocationY()) == Double.doubleToLongBits(other.getLocationY());
            result = result && this.getEncryptType() == other.getEncryptType();
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMessageHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMessageHead().hashCode();
            }

            hash = 37 * hash + 2;
            hash = 53 * hash + this.getFromUserId().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getFromUserName().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getToUserId().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getToUserName().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(this.getTimeSend());
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getType();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getContent().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getObjectId().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getFileName().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getIsEncrypt());
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashLong(this.getDeleteTime());
            hash = 37 * hash + 13;
            hash = 53 * hash + Internal.hashBoolean(this.getIsReadDel());
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashLong(this.getFileSize());
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashLong(this.getFileTime());
            hash = 37 * hash + 16;
            hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getLocationX()));
            hash = 37 * hash + 17;
            hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getLocationY()));
            hash = 37 * hash + 18;
            hash = 53 * hash + this.getEncryptType();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.ChatMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.ChatMessage)PARSER.parseFrom(data);
      }

      public static MessageProBuf.ChatMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.ChatMessage)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.ChatMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.ChatMessage)PARSER.parseFrom(data);
      }

      public static MessageProBuf.ChatMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.ChatMessage)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.ChatMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.ChatMessage)PARSER.parseFrom(data);
      }

      public static MessageProBuf.ChatMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.ChatMessage)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.ChatMessage parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.ChatMessage)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.ChatMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.ChatMessage)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.ChatMessage parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.ChatMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.ChatMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.ChatMessage)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.ChatMessage parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.ChatMessage)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.ChatMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.ChatMessage)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.ChatMessage.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.ChatMessage.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.ChatMessage.Builder newBuilder(MessageProBuf.ChatMessage prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.ChatMessage.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.ChatMessage.Builder() : (new MessageProBuf.ChatMessage.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.ChatMessage.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.ChatMessage.Builder builder = new MessageProBuf.ChatMessage.Builder(parent);
         return builder;
      }

      public static MessageProBuf.ChatMessage getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.ChatMessage> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.ChatMessage> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.ChatMessage getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      ChatMessage(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      ChatMessage(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.ChatMessage.Builder> implements MessageProBuf.ChatMessageOrBuilder {
         private MessageProBuf.MessageHead messageHead_;
         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> messageHeadBuilder_;
         private Object fromUserId_;
         private Object fromUserName_;
         private Object toUserId_;
         private Object toUserName_;
         private long timeSend_;
         private int type_;
         private Object content_;
         private Object objectId_;
         private Object fileName_;
         private boolean isEncrypt_;
         private long deleteTime_;
         private boolean isReadDel_;
         private long fileSize_;
         private long fileTime_;
         private double locationX_;
         private double locationY_;
         private int encryptType_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_ChatMessage_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_ChatMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.ChatMessage.class, MessageProBuf.ChatMessage.Builder.class);
         }

         private Builder() {
            this.messageHead_ = null;
            this.fromUserId_ = "";
            this.fromUserName_ = "";
            this.toUserId_ = "";
            this.toUserName_ = "";
            this.content_ = "";
            this.objectId_ = "";
            this.fileName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.messageHead_ = null;
            this.fromUserId_ = "";
            this.fromUserName_ = "";
            this.toUserId_ = "";
            this.toUserName_ = "";
            this.content_ = "";
            this.objectId_ = "";
            this.fileName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.ChatMessage.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.ChatMessage.Builder clear() {
            super.clear();
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            this.fromUserId_ = "";
            this.fromUserName_ = "";
            this.toUserId_ = "";
            this.toUserName_ = "";
            this.timeSend_ = 0L;
            this.type_ = 0;
            this.content_ = "";
            this.objectId_ = "";
            this.fileName_ = "";
            this.isEncrypt_ = false;
            this.deleteTime_ = 0L;
            this.isReadDel_ = false;
            this.fileSize_ = 0L;
            this.fileTime_ = 0L;
            this.locationX_ = 0.0D;
            this.locationY_ = 0.0D;
            this.encryptType_ = 0;
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_ChatMessage_descriptor;
         }

         public MessageProBuf.ChatMessage getDefaultInstanceForType() {
            return MessageProBuf.ChatMessage.getDefaultInstance();
         }

         public MessageProBuf.ChatMessage build() {
            MessageProBuf.ChatMessage result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.ChatMessage buildPartial() {
            MessageProBuf.ChatMessage result = new MessageProBuf.ChatMessage(this);
            if (this.messageHeadBuilder_ == null) {
               result.messageHead_ = this.messageHead_;
            } else {
               result.messageHead_ = (MessageProBuf.MessageHead)this.messageHeadBuilder_.build();
            }

            result.fromUserId_ = this.fromUserId_;
            result.fromUserName_ = this.fromUserName_;
            result.toUserId_ = this.toUserId_;
            result.toUserName_ = this.toUserName_;
            result.timeSend_ = this.timeSend_;
            result.type_ = this.type_;
            result.content_ = this.content_;
            result.objectId_ = this.objectId_;
            result.fileName_ = this.fileName_;
            result.isEncrypt_ = this.isEncrypt_;
            result.deleteTime_ = this.deleteTime_;
            result.isReadDel_ = this.isReadDel_;
            result.fileSize_ = this.fileSize_;
            result.fileTime_ = this.fileTime_;
            result.locationX_ = this.locationX_;
            result.locationY_ = this.locationY_;
            result.encryptType_ = this.encryptType_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.ChatMessage.Builder clone() {
            return (MessageProBuf.ChatMessage.Builder)super.clone();
         }

         public MessageProBuf.ChatMessage.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.ChatMessage.Builder)super.setField(field, value);
         }

         public MessageProBuf.ChatMessage.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.ChatMessage.Builder)super.clearField(field);
         }

         public MessageProBuf.ChatMessage.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.ChatMessage.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.ChatMessage.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.ChatMessage.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.ChatMessage.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.ChatMessage.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.ChatMessage.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.ChatMessage) {
               return this.mergeFrom((MessageProBuf.ChatMessage)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.ChatMessage.Builder mergeFrom(MessageProBuf.ChatMessage other) {
            if (other == MessageProBuf.ChatMessage.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMessageHead()) {
                  this.mergeMessageHead(other.getMessageHead());
               }

               if (!other.getFromUserId().isEmpty()) {
                  this.fromUserId_ = other.fromUserId_;
                  this.onChanged();
               }

               if (!other.getFromUserName().isEmpty()) {
                  this.fromUserName_ = other.fromUserName_;
                  this.onChanged();
               }

               if (!other.getToUserId().isEmpty()) {
                  this.toUserId_ = other.toUserId_;
                  this.onChanged();
               }

               if (!other.getToUserName().isEmpty()) {
                  this.toUserName_ = other.toUserName_;
                  this.onChanged();
               }

               if (other.getTimeSend() != 0L) {
                  this.setTimeSend(other.getTimeSend());
               }

               if (other.getType() != 0) {
                  this.setType(other.getType());
               }

               if (!other.getContent().isEmpty()) {
                  this.content_ = other.content_;
                  this.onChanged();
               }

               if (!other.getObjectId().isEmpty()) {
                  this.objectId_ = other.objectId_;
                  this.onChanged();
               }

               if (!other.getFileName().isEmpty()) {
                  this.fileName_ = other.fileName_;
                  this.onChanged();
               }

               if (other.getIsEncrypt()) {
                  this.setIsEncrypt(other.getIsEncrypt());
               }

               if (other.getDeleteTime() != 0L) {
                  this.setDeleteTime(other.getDeleteTime());
               }

               if (other.getIsReadDel()) {
                  this.setIsReadDel(other.getIsReadDel());
               }

               if (other.getFileSize() != 0L) {
                  this.setFileSize(other.getFileSize());
               }

               if (other.getFileTime() != 0L) {
                  this.setFileTime(other.getFileTime());
               }

               if (other.getLocationX() != 0.0D) {
                  this.setLocationX(other.getLocationX());
               }

               if (other.getLocationY() != 0.0D) {
                  this.setLocationY(other.getLocationY());
               }

               if (other.getEncryptType() != 0) {
                  this.setEncryptType(other.getEncryptType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.ChatMessage.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.ChatMessage parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.ChatMessage)MessageProBuf.ChatMessage.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.ChatMessage)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMessageHead() {
            return this.messageHeadBuilder_ != null || this.messageHead_ != null;
         }

         public MessageProBuf.MessageHead getMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            } else {
               return (MessageProBuf.MessageHead)this.messageHeadBuilder_.getMessage();
            }
         }

         public MessageProBuf.ChatMessage.Builder setMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.messageHead_ = value;
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(value);
            }

            return this;
         }

         public MessageProBuf.ChatMessage.Builder setMessageHead(MessageProBuf.MessageHead.Builder builderForValue) {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = builderForValue.build();
               this.onChanged();
            } else {
               this.messageHeadBuilder_.setMessage(builderForValue.build());
            }

            return this;
         }

         public MessageProBuf.ChatMessage.Builder mergeMessageHead(MessageProBuf.MessageHead value) {
            if (this.messageHeadBuilder_ == null) {
               if (this.messageHead_ != null) {
                  this.messageHead_ = MessageProBuf.MessageHead.newBuilder(this.messageHead_).mergeFrom(value).buildPartial();
               } else {
                  this.messageHead_ = value;
               }

               this.onChanged();
            } else {
               this.messageHeadBuilder_.mergeFrom(value);
            }

            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearMessageHead() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHead_ = null;
               this.onChanged();
            } else {
               this.messageHead_ = null;
               this.messageHeadBuilder_ = null;
            }

            return this;
         }

         public MessageProBuf.MessageHead.Builder getMessageHeadBuilder() {
            this.onChanged();
            return (MessageProBuf.MessageHead.Builder)this.getMessageHeadFieldBuilder().getBuilder();
         }

         public MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder() {
            if (this.messageHeadBuilder_ != null) {
               return (MessageProBuf.MessageHeadOrBuilder)this.messageHeadBuilder_.getMessageOrBuilder();
            } else {
               return this.messageHead_ == null ? MessageProBuf.MessageHead.getDefaultInstance() : this.messageHead_;
            }
         }

         private SingleFieldBuilderV3<MessageProBuf.MessageHead, MessageProBuf.MessageHead.Builder, MessageProBuf.MessageHeadOrBuilder> getMessageHeadFieldBuilder() {
            if (this.messageHeadBuilder_ == null) {
               this.messageHeadBuilder_ = new SingleFieldBuilderV3(this.getMessageHead(), this.getParentForChildren(), this.isClean());
               this.messageHead_ = null;
            }

            return this.messageHeadBuilder_;
         }

         public String getFromUserId() {
            Object ref = this.fromUserId_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.fromUserId_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getFromUserIdBytes() {
            Object ref = this.fromUserId_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.fromUserId_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.ChatMessage.Builder setFromUserId(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.fromUserId_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.ChatMessage.Builder clearFromUserId() {
            this.fromUserId_ = MessageProBuf.ChatMessage.getDefaultInstance().getFromUserId();
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder setFromUserIdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.ChatMessage.checkByteStringIsUtf8(value);
               this.fromUserId_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getFromUserName() {
            Object ref = this.fromUserName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.fromUserName_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getFromUserNameBytes() {
            Object ref = this.fromUserName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.fromUserName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.ChatMessage.Builder setFromUserName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.fromUserName_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.ChatMessage.Builder clearFromUserName() {
            this.fromUserName_ = MessageProBuf.ChatMessage.getDefaultInstance().getFromUserName();
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder setFromUserNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.ChatMessage.checkByteStringIsUtf8(value);
               this.fromUserName_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getToUserId() {
            Object ref = this.toUserId_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.toUserId_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getToUserIdBytes() {
            Object ref = this.toUserId_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.toUserId_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.ChatMessage.Builder setToUserId(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.toUserId_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.ChatMessage.Builder clearToUserId() {
            this.toUserId_ = MessageProBuf.ChatMessage.getDefaultInstance().getToUserId();
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder setToUserIdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.ChatMessage.checkByteStringIsUtf8(value);
               this.toUserId_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getToUserName() {
            Object ref = this.toUserName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.toUserName_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getToUserNameBytes() {
            Object ref = this.toUserName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.toUserName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.ChatMessage.Builder setToUserName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.toUserName_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.ChatMessage.Builder clearToUserName() {
            this.toUserName_ = MessageProBuf.ChatMessage.getDefaultInstance().getToUserName();
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder setToUserNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.ChatMessage.checkByteStringIsUtf8(value);
               this.toUserName_ = value;
               this.onChanged();
               return this;
            }
         }

         public long getTimeSend() {
            return this.timeSend_;
         }

         public MessageProBuf.ChatMessage.Builder setTimeSend(long value) {
            this.timeSend_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearTimeSend() {
            this.timeSend_ = 0L;
            this.onChanged();
            return this;
         }

         public int getType() {
            return this.type_;
         }

         public MessageProBuf.ChatMessage.Builder setType(int value) {
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearType() {
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public String getContent() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.content_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContentBytes() {
            Object ref = this.content_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.content_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.ChatMessage.Builder setContent(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.ChatMessage.Builder clearContent() {
            this.content_ = MessageProBuf.ChatMessage.getDefaultInstance().getContent();
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder setContentBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.ChatMessage.checkByteStringIsUtf8(value);
               this.content_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getObjectId() {
            Object ref = this.objectId_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.objectId_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getObjectIdBytes() {
            Object ref = this.objectId_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.objectId_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.ChatMessage.Builder setObjectId(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.objectId_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.ChatMessage.Builder clearObjectId() {
            this.objectId_ = MessageProBuf.ChatMessage.getDefaultInstance().getObjectId();
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder setObjectIdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.ChatMessage.checkByteStringIsUtf8(value);
               this.objectId_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getFileName() {
            Object ref = this.fileName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.fileName_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getFileNameBytes() {
            Object ref = this.fileName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.fileName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.ChatMessage.Builder setFileName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.fileName_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.ChatMessage.Builder clearFileName() {
            this.fileName_ = MessageProBuf.ChatMessage.getDefaultInstance().getFileName();
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder setFileNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.ChatMessage.checkByteStringIsUtf8(value);
               this.fileName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean getIsEncrypt() {
            return this.isEncrypt_;
         }

         public MessageProBuf.ChatMessage.Builder setIsEncrypt(boolean value) {
            this.isEncrypt_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearIsEncrypt() {
            this.isEncrypt_ = false;
            this.onChanged();
            return this;
         }

         public long getDeleteTime() {
            return this.deleteTime_;
         }

         public MessageProBuf.ChatMessage.Builder setDeleteTime(long value) {
            this.deleteTime_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearDeleteTime() {
            this.deleteTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean getIsReadDel() {
            return this.isReadDel_;
         }

         public MessageProBuf.ChatMessage.Builder setIsReadDel(boolean value) {
            this.isReadDel_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearIsReadDel() {
            this.isReadDel_ = false;
            this.onChanged();
            return this;
         }

         public long getFileSize() {
            return this.fileSize_;
         }

         public MessageProBuf.ChatMessage.Builder setFileSize(long value) {
            this.fileSize_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearFileSize() {
            this.fileSize_ = 0L;
            this.onChanged();
            return this;
         }

         public long getFileTime() {
            return this.fileTime_;
         }

         public MessageProBuf.ChatMessage.Builder setFileTime(long value) {
            this.fileTime_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearFileTime() {
            this.fileTime_ = 0L;
            this.onChanged();
            return this;
         }

         public double getLocationX() {
            return this.locationX_;
         }

         public MessageProBuf.ChatMessage.Builder setLocationX(double value) {
            this.locationX_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearLocationX() {
            this.locationX_ = 0.0D;
            this.onChanged();
            return this;
         }

         public double getLocationY() {
            return this.locationY_;
         }

         public MessageProBuf.ChatMessage.Builder setLocationY(double value) {
            this.locationY_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearLocationY() {
            this.locationY_ = 0.0D;
            this.onChanged();
            return this;
         }

         public int getEncryptType() {
            return this.encryptType_;
         }

         public MessageProBuf.ChatMessage.Builder setEncryptType(int value) {
            this.encryptType_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.ChatMessage.Builder clearEncryptType() {
            this.encryptType_ = 0;
            this.onChanged();
            return this;
         }

         public final MessageProBuf.ChatMessage.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.ChatMessage.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.ChatMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.ChatMessage.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface ChatMessageOrBuilder extends MessageOrBuilder {
      boolean hasMessageHead();

      MessageProBuf.MessageHead getMessageHead();

      MessageProBuf.MessageHeadOrBuilder getMessageHeadOrBuilder();

      String getFromUserId();

      ByteString getFromUserIdBytes();

      String getFromUserName();

      ByteString getFromUserNameBytes();

      String getToUserId();

      ByteString getToUserIdBytes();

      String getToUserName();

      ByteString getToUserNameBytes();

      long getTimeSend();

      int getType();

      String getContent();

      ByteString getContentBytes();

      String getObjectId();

      ByteString getObjectIdBytes();

      String getFileName();

      ByteString getFileNameBytes();

      boolean getIsEncrypt();

      long getDeleteTime();

      boolean getIsReadDel();

      long getFileSize();

      long getFileTime();

      double getLocationX();

      double getLocationY();

      int getEncryptType();
   }

   public static final class MessageHead extends GeneratedMessageV3 implements MessageProBuf.MessageHeadOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int FROM_FIELD_NUMBER = 1;
      private volatile Object from_;
      public static final int TO_FIELD_NUMBER = 2;
      private volatile Object to_;
      public static final int MESSAGEID_FIELD_NUMBER = 3;
      private volatile Object messageId_;
      public static final int CHATTYPE_FIELD_NUMBER = 4;
      private int chatType_;
      public static final int OFFLINE_FIELD_NUMBER = 5;
      private boolean offline_;
      private byte memoizedIsInitialized;
      private static final MessageProBuf.MessageHead DEFAULT_INSTANCE = new MessageProBuf.MessageHead();
      private static final Parser<MessageProBuf.MessageHead> PARSER = new AbstractParser<MessageProBuf.MessageHead>() {
         public MessageProBuf.MessageHead parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MessageProBuf.MessageHead(input, extensionRegistry);
         }
      };

      private MessageHead(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MessageHead() {
         this.memoizedIsInitialized = -1;
         this.from_ = "";
         this.to_ = "";
         this.messageId_ = "";
         this.chatType_ = 0;
         this.offline_ = false;
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MessageHead(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            //int mutable_bitField0_ = false;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  String s;
                  switch(tag) {
                  case 0:
                     done = true;
                     break;
                  case 10:
                     s = input.readStringRequireUtf8();
                     this.from_ = s;
                     break;
                  case 18:
                     s = input.readStringRequireUtf8();
                     this.to_ = s;
                     break;
                  case 26:
                     s = input.readStringRequireUtf8();
                     this.messageId_ = s;
                     break;
                  case 32:
                     this.chatType_ = input.readInt32();
                     break;
                  case 40:
                     this.offline_ = input.readBool();
                     break;
                  default:
                     if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                        done = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var12) {
               throw var12.setUnfinishedMessage(this);
            } catch (IOException var13) {
               throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return MessageProBuf.internal_static_Message_MessageHead_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProBuf.internal_static_Message_MessageHead_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.MessageHead.class, MessageProBuf.MessageHead.Builder.class);
      }

      public String getFrom() {
         Object ref = this.from_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.from_ = s;
            return s;
         }
      }

      public ByteString getFromBytes() {
         Object ref = this.from_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.from_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getTo() {
         Object ref = this.to_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.to_ = s;
            return s;
         }
      }

      public ByteString getToBytes() {
         Object ref = this.to_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.to_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public String getMessageId() {
         Object ref = this.messageId_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            this.messageId_ = s;
            return s;
         }
      }

      public ByteString getMessageIdBytes() {
         Object ref = this.messageId_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.messageId_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public int getChatType() {
         return this.chatType_;
      }

      public boolean getOffline() {
         return this.offline_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if (!this.getFromBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 1, this.from_);
         }

         if (!this.getToBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.to_);
         }

         if (!this.getMessageIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 3, this.messageId_);
         }

         if (this.chatType_ != 0) {
            output.writeInt32(4, this.chatType_);
         }

         if (this.offline_) {
            output.writeBool(5, this.offline_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if (!this.getFromBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(1, this.from_);
            }

            if (!this.getToBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(2, this.to_);
            }

            if (!this.getMessageIdBytes().isEmpty()) {
               size += GeneratedMessageV3.computeStringSize(3, this.messageId_);
            }

            if (this.chatType_ != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.chatType_);
            }

            if (this.offline_) {
               size += CodedOutputStream.computeBoolSize(5, this.offline_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MessageProBuf.MessageHead)) {
            return super.equals(obj);
         } else {
            MessageProBuf.MessageHead other = (MessageProBuf.MessageHead)obj;
            boolean result = true;
            result = result && this.getFrom().equals(other.getFrom());
            result = result && this.getTo().equals(other.getTo());
            result = result && this.getMessageId().equals(other.getMessageId());
            result = result && this.getChatType() == other.getChatType();
            result = result && this.getOffline() == other.getOffline();
            result = result && this.unknownFields.equals(other.unknownFields);
            return result;
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getFrom().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getTo().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getMessageId().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getChatType();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getOffline());
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MessageProBuf.MessageHead parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageHead)PARSER.parseFrom(data);
      }

      public static MessageProBuf.MessageHead parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageHead)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.MessageHead parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageHead)PARSER.parseFrom(data);
      }

      public static MessageProBuf.MessageHead parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageHead)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.MessageHead parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageHead)PARSER.parseFrom(data);
      }

      public static MessageProBuf.MessageHead parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MessageProBuf.MessageHead)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MessageProBuf.MessageHead parseFrom(InputStream input) throws IOException {
         return (MessageProBuf.MessageHead)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.MessageHead parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.MessageHead)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.MessageHead parseDelimitedFrom(InputStream input) throws IOException {
         return (MessageProBuf.MessageHead)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MessageProBuf.MessageHead parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.MessageHead)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MessageProBuf.MessageHead parseFrom(CodedInputStream input) throws IOException {
         return (MessageProBuf.MessageHead)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MessageProBuf.MessageHead parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MessageProBuf.MessageHead)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public MessageProBuf.MessageHead.Builder newBuilderForType() {
         return newBuilder();
      }

      public static MessageProBuf.MessageHead.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static MessageProBuf.MessageHead.Builder newBuilder(MessageProBuf.MessageHead prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public MessageProBuf.MessageHead.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new MessageProBuf.MessageHead.Builder() : (new MessageProBuf.MessageHead.Builder()).mergeFrom(this);
      }

      protected MessageProBuf.MessageHead.Builder newBuilderForType(BuilderParent parent) {
         MessageProBuf.MessageHead.Builder builder = new MessageProBuf.MessageHead.Builder(parent);
         return builder;
      }

      public static MessageProBuf.MessageHead getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MessageProBuf.MessageHead> parser() {
         return PARSER;
      }

      public Parser<MessageProBuf.MessageHead> getParserForType() {
         return PARSER;
      }

      public MessageProBuf.MessageHead getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      MessageHead(com.google.protobuf.GeneratedMessageV3.Builder x0, Object x1) {
         this(x0);
      }

      // $FF: synthetic method
      MessageHead(CodedInputStream x0, ExtensionRegistryLite x1, Object x2) throws InvalidProtocolBufferException {
         this(x0, x1);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<MessageProBuf.MessageHead.Builder> implements MessageProBuf.MessageHeadOrBuilder {
         private Object from_;
         private Object to_;
         private Object messageId_;
         private int chatType_;
         private boolean offline_;

         public static final Descriptor getDescriptor() {
            return MessageProBuf.internal_static_Message_MessageHead_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MessageProBuf.internal_static_Message_MessageHead_fieldAccessorTable.ensureFieldAccessorsInitialized(MessageProBuf.MessageHead.class, MessageProBuf.MessageHead.Builder.class);
         }

         private Builder() {
            this.from_ = "";
            this.to_ = "";
            this.messageId_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent parent) {
            super(parent);
            this.from_ = "";
            this.to_ = "";
            this.messageId_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MessageProBuf.MessageHead.alwaysUseFieldBuilders) {
            }

         }

         public MessageProBuf.MessageHead.Builder clear() {
            super.clear();
            this.from_ = "";
            this.to_ = "";
            this.messageId_ = "";
            this.chatType_ = 0;
            this.offline_ = false;
            return this;
         }

         public Descriptor getDescriptorForType() {
            return MessageProBuf.internal_static_Message_MessageHead_descriptor;
         }

         public MessageProBuf.MessageHead getDefaultInstanceForType() {
            return MessageProBuf.MessageHead.getDefaultInstance();
         }

         public MessageProBuf.MessageHead build() {
            MessageProBuf.MessageHead result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MessageProBuf.MessageHead buildPartial() {
            MessageProBuf.MessageHead result = new MessageProBuf.MessageHead(this);
            result.from_ = this.from_;
            result.to_ = this.to_;
            result.messageId_ = this.messageId_;
            result.chatType_ = this.chatType_;
            result.offline_ = this.offline_;
            this.onBuilt();
            return result;
         }

         public MessageProBuf.MessageHead.Builder clone() {
            return (MessageProBuf.MessageHead.Builder)super.clone();
         }

         public MessageProBuf.MessageHead.Builder setField(FieldDescriptor field, Object value) {
            return (MessageProBuf.MessageHead.Builder)super.setField(field, value);
         }

         public MessageProBuf.MessageHead.Builder clearField(FieldDescriptor field) {
            return (MessageProBuf.MessageHead.Builder)super.clearField(field);
         }

         public MessageProBuf.MessageHead.Builder clearOneof(OneofDescriptor oneof) {
            return (MessageProBuf.MessageHead.Builder)super.clearOneof(oneof);
         }

         public MessageProBuf.MessageHead.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
            return (MessageProBuf.MessageHead.Builder)super.setRepeatedField(field, index, value);
         }

         public MessageProBuf.MessageHead.Builder addRepeatedField(FieldDescriptor field, Object value) {
            return (MessageProBuf.MessageHead.Builder)super.addRepeatedField(field, value);
         }

         public MessageProBuf.MessageHead.Builder mergeFrom(Message other) {
            if (other instanceof MessageProBuf.MessageHead) {
               return this.mergeFrom((MessageProBuf.MessageHead)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public MessageProBuf.MessageHead.Builder mergeFrom(MessageProBuf.MessageHead other) {
            if (other == MessageProBuf.MessageHead.getDefaultInstance()) {
               return this;
            } else {
               if (!other.getFrom().isEmpty()) {
                  this.from_ = other.from_;
                  this.onChanged();
               }

               if (!other.getTo().isEmpty()) {
                  this.to_ = other.to_;
                  this.onChanged();
               }

               if (!other.getMessageId().isEmpty()) {
                  this.messageId_ = other.messageId_;
                  this.onChanged();
               }

               if (other.getChatType() != 0) {
                  this.setChatType(other.getChatType());
               }

               if (other.getOffline()) {
                  this.setOffline(other.getOffline());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public MessageProBuf.MessageHead.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MessageProBuf.MessageHead parsedMessage = null;

            try {
               parsedMessage = (MessageProBuf.MessageHead)MessageProBuf.MessageHead.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException var8) {
               parsedMessage = (MessageProBuf.MessageHead)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public String getFrom() {
            Object ref = this.from_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.from_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getFromBytes() {
            Object ref = this.from_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.from_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.MessageHead.Builder setFrom(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.from_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.MessageHead.Builder clearFrom() {
            this.from_ = MessageProBuf.MessageHead.getDefaultInstance().getFrom();
            this.onChanged();
            return this;
         }

         public MessageProBuf.MessageHead.Builder setFromBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.MessageHead.checkByteStringIsUtf8(value);
               this.from_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getTo() {
            Object ref = this.to_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.to_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getToBytes() {
            Object ref = this.to_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.to_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.MessageHead.Builder setTo(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.to_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.MessageHead.Builder clearTo() {
            this.to_ = MessageProBuf.MessageHead.getDefaultInstance().getTo();
            this.onChanged();
            return this;
         }

         public MessageProBuf.MessageHead.Builder setToBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.MessageHead.checkByteStringIsUtf8(value);
               this.to_ = value;
               this.onChanged();
               return this;
            }
         }

         public String getMessageId() {
            Object ref = this.messageId_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               this.messageId_ = s;
               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getMessageIdBytes() {
            Object ref = this.messageId_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.messageId_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public MessageProBuf.MessageHead.Builder setMessageId(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.messageId_ = value;
               this.onChanged();
               return this;
            }
         }

         public MessageProBuf.MessageHead.Builder clearMessageId() {
            this.messageId_ = MessageProBuf.MessageHead.getDefaultInstance().getMessageId();
            this.onChanged();
            return this;
         }

         public MessageProBuf.MessageHead.Builder setMessageIdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               MessageProBuf.MessageHead.checkByteStringIsUtf8(value);
               this.messageId_ = value;
               this.onChanged();
               return this;
            }
         }

         public int getChatType() {
            return this.chatType_;
         }

         public MessageProBuf.MessageHead.Builder setChatType(int value) {
            this.chatType_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.MessageHead.Builder clearChatType() {
            this.chatType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean getOffline() {
            return this.offline_;
         }

         public MessageProBuf.MessageHead.Builder setOffline(boolean value) {
            this.offline_ = value;
            this.onChanged();
            return this;
         }

         public MessageProBuf.MessageHead.Builder clearOffline() {
            this.offline_ = false;
            this.onChanged();
            return this;
         }

         public final MessageProBuf.MessageHead.Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.MessageHead.Builder)super.setUnknownFieldsProto3(unknownFields);
         }

         public final MessageProBuf.MessageHead.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (MessageProBuf.MessageHead.Builder)super.mergeUnknownFields(unknownFields);
         }

         // $FF: synthetic method
         Builder(Object x0) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent x0, Object x1) {
            this(x0);
         }
      }
   }

   public interface MessageHeadOrBuilder extends MessageOrBuilder {
      String getFrom();

      ByteString getFromBytes();

      String getTo();

      ByteString getToBytes();

      String getMessageId();

      ByteString getMessageIdBytes();

      int getChatType();

      boolean getOffline();
   }
}
