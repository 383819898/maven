package com.shiku.imserver.common.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadUtil {
   public static final ScheduledExecutorService mThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);

   public static void executeInThread(final Callback callback) {
      mThreadPool.execute(new Runnable() {
         public void run() {
            callback.execute(Thread.currentThread().getName());
         }
      });
   }

   public static void executeInThread(final Callback callback, final Object obj) {
      mThreadPool.execute(new Runnable() {
         public void run() {
            callback.execute(obj);
         }
      });
   }

   public static void executeInThread(final Callback callback, long delay) {
      mThreadPool.schedule(new Runnable() {
         public void run() {
            callback.execute(Thread.currentThread().getName());
         }
      }, delay, TimeUnit.SECONDS);
   }
}
