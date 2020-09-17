package com.shiku.imserver.common.message;

public enum JoinGroupResult {
   JOIN_GROUP_RESULT_UNKNOW(0),
   JOIN_GROUP_RESULT_OK(1),
   JOIN_GROUP_RESULT_NOT_EXIST(2),
   JOIN_GROUP_RESULT_GROUP_FULL(3),
   JOIN_GROUP_RESULT_IN_BACKLIST(4),
   JOIN_GROUP_RESULT_TAKEOUTED(5);

   private final int value;

   public final int getNumber() {
      return this.value;
   }

   public static JoinGroupResult valueOf(int value) {
      return forNumber(value);
   }

   public static JoinGroupResult forNumber(int value) {
      switch(value) {
      case 0:
         return JOIN_GROUP_RESULT_UNKNOW;
      case 1:
         return JOIN_GROUP_RESULT_OK;
      case 2:
         return JOIN_GROUP_RESULT_NOT_EXIST;
      case 3:
         return JOIN_GROUP_RESULT_GROUP_FULL;
      case 4:
         return JOIN_GROUP_RESULT_IN_BACKLIST;
      case 5:
         return JOIN_GROUP_RESULT_TAKEOUTED;
      default:
         return null;
      }
   }

   private JoinGroupResult(int value) {
      this.value = value;
   }
}
