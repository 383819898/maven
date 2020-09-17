package com.shiku.imserver.common.utils;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.digest.DigestUtils;

public class Md5 {
   private static byte[] getContentBytes(String content, String charset) {
      if (charset != null && !"".equals(charset)) {
         try {
            return content.getBytes(charset);
         } catch (UnsupportedEncodingException var3) {
            throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
         }
      } else {
         return content.getBytes();
      }
   }

   public static String sign(String text, String key, String input_charset) {
      text = text + key;
      return DigestUtils.md5Hex(getContentBytes(text, input_charset));
   }

   public static boolean verify(String text, String sign, String key, String input_charset) {
      text = text + key;
      String mysign = DigestUtils.md5Hex(getContentBytes(text, input_charset));
      return mysign.equals(sign);
   }

   public static void main(String[] args) {
      System.out.println(Integer.valueOf("1001001", 2).toString());
   }

   public static String getMD5(String input) {
      return sign(input, "", "utf-8");
   }
}
