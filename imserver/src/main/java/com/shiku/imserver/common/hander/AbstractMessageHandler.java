package com.shiku.imserver.common.hander;

import com.shiku.imserver.common.annotation.MessageCommandAnnotation;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractMessageHandler implements IMessageHandler {
   private Map<Short, Method> handlerMethods;

   public AbstractMessageHandler() {
      this.init();
   }

   public Map<Short, Method> getHandlerMethods() {
      return this.handlerMethods;
   }

   public void setHandlerMethods(Map<Short, Method> handlerMethods) {
      this.handlerMethods = handlerMethods;
   }

   public void init() {
      this.handlerMethods = new ConcurrentHashMap();
      Method[] methods = this.getClass().getMethods();
      Method[] var2 = methods;
      int var3 = methods.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Method method = var2[var4];
         if (method.isAnnotationPresent(MessageCommandAnnotation.class)) {
            MessageCommandAnnotation messageCommandAnnotation = (MessageCommandAnnotation)method.getAnnotation(MessageCommandAnnotation.class);
            if (messageCommandAnnotation != null) {
               this.handlerMethods.put(messageCommandAnnotation.command(), method);
            }
         }
      }

   }

   public Method getMessageHandler(short command) {
      return (Method)this.handlerMethods.get(command);
   }
}
