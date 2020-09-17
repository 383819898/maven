package com.shiku.imserver.common.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
   public static Properties loadPropertyFile(String propertyFile) {
      if (StringUtils.isEmpty(propertyFile)) {
         return null;
      } else {
         Properties prop = new Properties();
         Object inputStream = null;

         Object var4;
         try {
            if (propertyFile.startsWith("classpath:")) {
               System.out.println("loadPropertyFile ===> " + propertyFile);
               propertyFile = propertyFile.replace("classpath:", "");
               inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertyFile);
            } else {
               inputStream = new FileInputStream(propertyFile);
            }

            prop.load((InputStream)inputStream);
            return prop;
         } catch (Exception var14) {
            var14.printStackTrace();
            var4 = null;
         } finally {
            try {
               if (null != inputStream) {
                  ((InputStream)inputStream).close();
               }
            } catch (IOException var13) {
               var13.printStackTrace();
            }

         }

         return (Properties)var4;
      }
   }
}
