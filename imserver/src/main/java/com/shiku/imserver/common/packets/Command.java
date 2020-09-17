package com.shiku.imserver.common.packets;

public interface Command {
   short COMMAND_UNKNOW = 0;
   short COMMAND_HANDSHAKE_REQ = 1;
   short COMMAND_HANDSHAKE_RESP = 2;
   short COMMAND_AUTH_REQ = 5;
   short COMMAND_AUTH_RESP = 6;
   short COMMAND_CLOSE = 7;
   short COMMAND_CHAT = 10;
   short MESSAGE_RECEIPT = 11;
   short PULL_MESSAGE_RECORD_REQ = 12;
   short PULL_MESSAGE_RECORD_RESP = 13;
   short PULL_BATCH_GROUP_MESSAGE_REQ = 14;
   short PULL_BATCH_GROUP_MESSAGE_RESP = 15;
   short ERROR = -1;
   short Login_Conflict = -3;
   short JOINGROUP_REQ = 20;
   short EXITGROUP_REQ = 21;
   short GROUP_REQUEST_RESULT = 22;
   short Ping_REQ = 99;
   short SUCCESS = 100;
   short SERVER_REQ = 200;
}
