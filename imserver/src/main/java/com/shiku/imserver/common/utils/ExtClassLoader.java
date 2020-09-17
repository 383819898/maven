package com.shiku.imserver.common.utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.StringTokenizer;

public class ExtClassLoader extends URLClassLoader {
   public ExtClassLoader(URL[] urls) {
      super(urls);
   }

   public static ExtClassLoader getExtClassLoader() throws IOException {
      final URL[] dirs = getExtDirs();

      try {
         return (ExtClassLoader)AccessController.doPrivileged(new PrivilegedExceptionAction<ExtClassLoader>() {
            public ExtClassLoader run() throws IOException {
               int len = dirs.length;
               return new ExtClassLoader(dirs);
            }
         });
      } catch (PrivilegedActionException var2) {
         throw (IOException)var2.getException();
      }
   }

   private static URL[] getExtDirs() {
      String s = System.getProperty("java.ext.dirs");
      URL[] dirs;
      if (s != null) {
         StringTokenizer st = new StringTokenizer(s, File.pathSeparator);
         int count = st.countTokens();
         dirs = new URL[count];

         for(int i = 0; i < count; ++i) {
            try {
               dirs[i] = new URL(st.nextToken());
            } catch (MalformedURLException var6) {
               var6.printStackTrace();
            }
         }
      } else {
         dirs = new URL[0];
      }

      return dirs;
   }

   static {
      ClassLoader.registerAsParallelCapable();
   }
}
