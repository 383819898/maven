package com.shiku.imserver.common.packets;

import com.shiku.imserver.common.message.ChatMessage;

public interface IPacket {
   void setCommand(short var1);

   short getCommand();

   byte[] getBytes();

   void setBytes(byte[] var1);

   ChatMessage getMessage();

   void setMessage(ChatMessage var1);
}
