package com.shiku.imserver.common.constant;

public class KConstants {
   public static boolean isDebug = true;
   public static boolean messageDebug = false;
   public static final String PAGE_INDEX = "0";
   public static final String PAGE_SIZE = "15";
   public static final int MIN_USERID = 100000;

   public interface SystemNo {
      int System = 10000;
      int NewKFriend = 10001;
      int Circle = 10002;
      int AddressBook = 10003;
      int Notice = 10006;
   }

   public interface PUSHSERVER {
      String APNS = "apns";
      String APNS_VOIP = "apns_voip";
      String BAIDU = "baidu";
      String XIAOMI = "xiaomi";
      String HUAWEI = "huawei";
      String JPUSH = "Jpush";
      String FCM = "fcm";
   }

   public interface DeviceKey {
      String Android = "android";
      String IOS = "ios";
      String WEB = "web";
      String PC = "pc";
      String MAC = "mac";
   }

   public interface Expire {
      int DAY1 = 86400;
      int DAY7 = 604800;
      int HOUR12 = 43200;
      int HOUR = 3600;
   }

   public interface DB_REMAINDER {
      int ADDRESSBOOK = 10000;
   }
}
