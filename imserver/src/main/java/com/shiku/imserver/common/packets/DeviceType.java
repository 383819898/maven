package com.shiku.imserver.common.packets;

public enum DeviceType {
   DEVICE_TYPE_UNKNOW(0),
   DEVICE_TYPE_PC(1),
   DEVICE_TYPE_ANDROID(2),
   DEVICE_TYPE_IOS(3);

   private final int value;

   public final int getNumber() {
      return this.value;
   }

   public static DeviceType valueOf(int value) {
      return forNumber(value);
   }

   public static DeviceType forNumber(int value) {
      switch(value) {
      case 0:
         return DEVICE_TYPE_UNKNOW;
      case 1:
         return DEVICE_TYPE_PC;
      case 2:
         return DEVICE_TYPE_ANDROID;
      case 3:
         return DEVICE_TYPE_IOS;
      default:
         return null;
      }
   }

   private DeviceType(int value) {
      this.value = value;
   }
}
