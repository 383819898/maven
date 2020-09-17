package com.shiku.imserver.common.utils;

import java.util.ArrayList;
import java.util.List;
import org.tio.core.ChannelContext;

public class ImUtils {
   public static String parseResource(String jid) {
      if (jid == null) {
         return null;
      } else {
         int slashIndex = jid.indexOf(47);
         return slashIndex + 1 <= jid.length() && slashIndex >= 0 ? jid.substring(slashIndex + 1) : "";
      }
   }

   public static String parseBareUserId(String jid) {
      int slashIndex = jid.indexOf(47);
      if (slashIndex < 0) {
         return jid;
      } else {
         return slashIndex == 0 ? "" : jid.substring(0, slashIndex);
      }
   }

   public static String formatRegion(String region) {
      if (org.apache.commons.lang3.StringUtils.isBlank(region)) {
         return "";
      } else {
         String[] arr = org.apache.commons.lang3.StringUtils.split(region, "|");
         List<String> validArr = new ArrayList();

         for(int i = 0; i < arr.length; ++i) {
            String e = arr[i];
            if (org.apache.commons.lang3.StringUtils.isNotBlank(e) && !"0".equals(e)) {
               validArr.add(e);
            }
         }

         if (validArr.size() == 0) {
            return "";
         } else if (validArr.size() == 1) {
            return (String)validArr.get(0);
         } else {
            return (String)validArr.get(validArr.size() - 2) + (String)validArr.get(validArr.size() - 1);
         }
      }
   }

   public static String formatUserAgent(ChannelContext channelContext) {
      return null;
   }

   public static void main(String[] args) {
      String region = "中国|杭州|铁通";
      String xx = formatRegion(region);
      System.out.println(xx);
   }
}
