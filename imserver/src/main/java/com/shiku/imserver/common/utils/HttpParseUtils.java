package com.shiku.imserver.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpParseUtils {
   private static ConcurrentHashMap<Integer, Pattern> regexPattern = new ConcurrentHashMap();

   private static Pattern getCachedPattern(String regex) {
      Pattern pattern = null;
      if (regexPattern.containsKey(regex.hashCode())) {
         pattern = (Pattern)regexPattern.get(regex.hashCode());
      } else {
         pattern = Pattern.compile(regex);
         regexPattern.put(regex.hashCode(), pattern);
      }

      return pattern;
   }

   public static Map<String, String> getEqualMap(String str) {
      Map<String, String> equalMap = new HashMap();
      String[] searchedStrings = searchByRegex(str, "([^ ;,]+=[^ ;,]+)");
      String[] var3 = searchedStrings;
      int var4 = searchedStrings.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String groupString = var3[var5];
         String[] equalStrings = new String[2];
         int equalCharIndex = groupString.indexOf("=");
         equalStrings[0] = groupString.substring(0, equalCharIndex);
         equalStrings[1] = groupString.substring(equalCharIndex + 1, groupString.length());
         if (equalStrings.length == 2) {
            String key = equalStrings[0];
            String value = equalStrings[1];
            if (value.startsWith("\"") && value.endsWith("\"")) {
               value = value.substring(1, value.length() - 1);
            }

            equalMap.put(key, value);
         }
      }

      return equalMap;
   }

   public static String getPerprotyEqualValue(Map<String, String> packetMap, String propertyName, String valueName) {
      String propertyValueObj = (String)packetMap.get(propertyName);
      if (propertyValueObj == null) {
         return null;
      } else {
         String propertyValue = propertyValueObj.toString();
         Map<String, String> equalMap = getEqualMap(propertyValue);
         return (String)equalMap.get(valueName);
      }
   }

   public static void main(String[] args) {
   }

   public static String[] searchByRegex(String source, String regex) {
      if (source == null) {
         return null;
      } else {
         Pattern pattern = getCachedPattern(regex);
         Matcher matcher = pattern.matcher(source);
         ArrayList result = new ArrayList();

         while(matcher.find()) {
            result.add(matcher.group());
         }

         return (String[])result.toArray(new String[0]);
      }
   }
}
