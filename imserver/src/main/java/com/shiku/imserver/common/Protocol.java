package com.shiku.imserver.common;

public interface Protocol {
   byte HEARTBEAT_BYTE = -128;
   byte HANDSHAKE_BYTE = -127;
   byte VERSION = 1;
   byte TCP = 1;
   byte WEBSOCKET = 2;
   byte HTTP = 3;
   String COOKIE_NAME_FOR_SESSION = "jim-s";
   int MAX_LENGTH_OF_BODY = 2202009;
   int LEAST_HEADER_LENGHT = 4;
   byte FIRST_BYTE_MASK_ENCRYPT = -128;
   byte FIRST_BYTE_MASK_COMPRESS = 64;
   byte FIRST_BYTE_MASK_HAS_SYNSEQ = 32;
   byte FIRST_BYTE_MASK_4_BYTE_LENGTH = 16;
   byte FIRST_BYTE_MASK_VERSION = 15;
}
