package com.shiku.imserver.common.scanner;

import com.shiku.imserver.common.constant.IMLoggers;
import java.io.File;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.slf4j.Logger;
import sun.net.www.protocol.file.FileURLConnection;

public class PackageScaner {
   public static final Logger logger;

   public static String[] scanNamespaceFiles(String namespace, String fileext, boolean isReturnCanonicalPath) {
      return scanNamespaceFiles(namespace, fileext, isReturnCanonicalPath, false);
   }

   public static String[] scanNamespaceFiles(String namespace, String fileext, boolean isReturnCanonicalPath, boolean checkSub) {
      String respath = namespace.replace('.', '/');
      respath = respath.replace('.', '/');
      ArrayList tmpNameList = new ArrayList();

      try {
         URL url = null;
         logger.info("scan url path " + respath);
         if (!respath.startsWith("/")) {
            url = PackageScaner.class.getResource("/" + respath);
         } else {
            url = PackageScaner.class.getResource(respath);
         }

         logger.info("scan url  " + url);
         URLConnection tmpURLConnection = url.openConnection();
         String tmpItemName;
         if (tmpURLConnection instanceof JarURLConnection) {
            JarURLConnection tmpJarURLConnection = (JarURLConnection)tmpURLConnection;
            JarFile jarFile = tmpJarURLConnection.getJarFile();
            Enumeration entrys = jarFile.entries();

            label110:
            while(true) {
               do {
                  do {
                     JarEntry tmpJarEntry;
                     do {
                        if (!entrys.hasMoreElements()) {
                           jarFile.close();
                           break label110;
                        }

                        tmpJarEntry = (JarEntry)entrys.nextElement();
                     } while(tmpJarEntry.isDirectory());

                     tmpItemName = tmpJarEntry.getName();
                  } while(tmpItemName.indexOf(36) >= 0);
               } while(fileext != null && !tmpItemName.endsWith(fileext));

               int tmpPos = tmpItemName.lastIndexOf(47);
               if (tmpPos > 0) {
                  String tmpPath = tmpItemName.substring(0, tmpPos);
                  if (checkSub) {
                     if (tmpPath.startsWith(respath)) {
                        String r = tmpItemName.substring(respath.length() + 1).replaceAll("/", ".");
                        tmpNameList.add(r);
                     }
                  } else if (respath.equals(tmpPath)) {
                     tmpNameList.add(tmpItemName.substring(tmpPos + 1));
                  }
               }
            }
         } else if (tmpURLConnection instanceof FileURLConnection) {
            File file = new File(url.getFile());
            if (file.exists() && file.isDirectory()) {
               File[] fileArray = file.listFiles();
               File[] var24 = fileArray;
               int var25 = fileArray.length;

               for(int var26 = 0; var26 < var25; ++var26) {
                  File f = var24[var26];
                  if (!f.isDirectory() || f.getName().indexOf(".") == -1) {
                     if (isReturnCanonicalPath) {
                        tmpItemName = f.getCanonicalPath();
                     } else {
                        tmpItemName = f.getName();
                     }

                     if (f.isDirectory()) {
                        String[] inner = scanNamespaceFiles(namespace + "." + tmpItemName, fileext, isReturnCanonicalPath);
                        if (inner != null) {
                           String[] var16 = inner;
                           int var17 = inner.length;

                           for(int var18 = 0; var18 < var17; ++var18) {
                              String i = var16[var18];
                              if (i != null) {
                                 tmpNameList.add(tmpItemName + "." + i);
                              }
                           }
                        }
                     } else if (fileext == null || tmpItemName.endsWith(fileext)) {
                        tmpNameList.add(tmpItemName);
                     }
                  }
               }
            } else {
               logger.error("scaning stop,invalid package path:" + url.getFile());
            }
         }
      } catch (Exception var20) {
         logger.error("scaning stop,invalid package path error" + var20.toString());
      }

      if (tmpNameList.size() > 0) {
         String[] r = new String[tmpNameList.size()];
         tmpNameList.toArray(r);
         tmpNameList.clear();
         return r;
      } else {
         return null;
      }
   }

   static {
      logger = IMLoggers.serverLog;
   }
}
