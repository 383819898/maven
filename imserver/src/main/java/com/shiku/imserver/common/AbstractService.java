package com.shiku.imserver.common;

public abstract class AbstractService implements IService {
   public boolean startupAfter() {
      return true;
   }
}
