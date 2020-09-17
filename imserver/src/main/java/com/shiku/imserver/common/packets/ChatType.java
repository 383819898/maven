package com.shiku.imserver.common.packets;

public interface ChatType {
   byte UNKNOW = 0;
   byte CHAT = 1;
   byte GROUPCHAT = 2;
   byte ALL = 3;
   byte AUTH = 5;
   byte PING = 9;
   byte RESULT = 10;
   byte RECEIPT = 11;
}
