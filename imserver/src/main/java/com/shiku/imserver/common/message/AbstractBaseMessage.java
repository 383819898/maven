package com.shiku.imserver.common.message;

import com.alibaba.fastjson.JSON;

public abstract class AbstractBaseMessage implements IMessage, Cloneable {
   private static final long serialVersionUID = 1L;

   public String toString() {
      return JSON.toJSONString(this);
   }

   public AbstractBaseMessage clone() throws CloneNotSupportedException {
      return (AbstractBaseMessage)super.clone();
   }
}
