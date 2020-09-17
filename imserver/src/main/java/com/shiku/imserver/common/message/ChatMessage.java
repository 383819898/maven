package com.shiku.imserver.common.message;

import com.alibaba.fastjson.annotation.JSONField;

public class ChatMessage extends AbstractMessage {
   private static final long serialVersionUID = 1L;
   private String fromUserId;
   private String fromUserName;
   private String toUserId;
   private String toUserName;
   private short type;
   protected long timeSend;
   private String content;
   private String objectId;
   private String fileName;
   @JSONField(
      name = "isEncrypt"
   )
   private boolean isEncrypt;
   private long deleteTime;
   @JSONField(
      name = "isReadDel"
   )
   private boolean isReadDel;
   private long fileSize;
   private long fileTime;
   private double location_x;
   private double location_y;
   private byte encryptType;

   public ChatMessage clone() throws CloneNotSupportedException {
      return (ChatMessage)super.clone();
   }

   public void setFromUserId(String fromUserId) {
      this.fromUserId = fromUserId;
   }

   public void setFromUserName(String fromUserName) {
      this.fromUserName = fromUserName;
   }

   public void setToUserId(String toUserId) {
      this.toUserId = toUserId;
   }

   public void setToUserName(String toUserName) {
      this.toUserName = toUserName;
   }

   public void setType(short type) {
      this.type = type;
   }

   public void setTimeSend(long timeSend) {
      this.timeSend = timeSend;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public void setObjectId(String objectId) {
      this.objectId = objectId;
   }

   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public void setEncrypt(boolean isEncrypt) {
      this.isEncrypt = isEncrypt;
   }

   public void setDeleteTime(long deleteTime) {
      this.deleteTime = deleteTime;
   }

   public void setReadDel(boolean isReadDel) {
      this.isReadDel = isReadDel;
   }

   public void setFileSize(long fileSize) {
      this.fileSize = fileSize;
   }

   public void setFileTime(long fileTime) {
      this.fileTime = fileTime;
   }

   public void setLocation_x(double location_x) {
      this.location_x = location_x;
   }

   public void setLocation_y(double location_y) {
      this.location_y = location_y;
   }

   public void setEncryptType(byte encryptType) {
      this.encryptType = encryptType;
   }

   public String getFromUserId() {
      return this.fromUserId;
   }

   public String getFromUserName() {
      return this.fromUserName;
   }

   public String getToUserId() {
      return this.toUserId;
   }

   public String getToUserName() {
      return this.toUserName;
   }

   public short getType() {
      return this.type;
   }

   public long getTimeSend() {
      return this.timeSend;
   }

   public String getContent() {
      return this.content;
   }

   public String getObjectId() {
      return this.objectId;
   }

   public String getFileName() {
      return this.fileName;
   }

   public boolean isEncrypt() {
      return this.isEncrypt;
   }

   public long getDeleteTime() {
      return this.deleteTime;
   }

   public boolean isReadDel() {
      return this.isReadDel;
   }

   public long getFileSize() {
      return this.fileSize;
   }

   public long getFileTime() {
      return this.fileTime;
   }

   public double getLocation_x() {
      return this.location_x;
   }

   public double getLocation_y() {
      return this.location_y;
   }

   public byte getEncryptType() {
      return this.encryptType;
   }
}
