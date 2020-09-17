package com.shiku.imserver.common.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
   public static final String Default_Split = "#";
   private static final String PREFIX = randomCode() + "-";
   private static final AtomicLong ID = new AtomicLong();

   public static String newStanzaId() {
      return PREFIX + Long.toString(ID.incrementAndGet());
   }

   public static String randomCode() {
      return "" + ((new Random()).nextInt(899999) + 1000000);
   }

   public static String trim(String str) {
      if (str == null) {
         str = "";
      } else {
         str = str.trim();
      }

      if (str.length() == 0) {
         return str;
      } else {
         if (str.charAt(0) == '"') {
            str = str.substring(1);
         }

         if (str.charAt(str.length() - 1) == '"') {
            str = str.substring(0, str.length() - 1);
         }

         return str;
      }
   }

   public static String[] getStringList(String str) {
      str = trim(str);
      if (str.endsWith(",")) {
         str = str.substring(0, str.length() - 1);
      }

      String sep = ",";
      if (str.indexOf(58) >= 0) {
         sep = ":";
      }

      return str.split(sep);
   }

   public static String[] getStringList(String str, String sep) {
      str = trim(str);
      return str.split(sep);
   }

   public static int[] getIntArray(String str, String sep) {
      String[] prop = getStringList(str, sep);
      List<Integer> tmp = new ArrayList();

//      int i;
      for(int i = 0; i < prop.length; ++i) {
         try {
            i = Integer.parseInt(prop[i]);
            tmp.add(i);
         } catch (Exception var6) {
            throw new RuntimeException(var6);
         }
      }

      int[] ints = new int[tmp.size()];

      for(int i = 0; i < tmp.size(); ++i) {
         ints[i] = (Integer)tmp.get(i);
      }

      return ints;
   }

   public static List<Integer> getIntList(String str, String sep) {
      List<Integer> tmp = new ArrayList();
      if (str != null && !str.trim().equals("")) {
         String[] prop = getStringList(str, sep);

         for(int i = 0; i < prop.length; ++i) {
            try {
               int r = Integer.parseInt(prop[i]);
               tmp.add(r);
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

         return tmp;
      } else {
         return tmp;
      }
   }

   public static String join(String[] strs, String sep) {
      StringBuffer buffer = new StringBuffer();
      buffer.append(strs[0]);

      for(int i = 1; i < strs.length; ++i) {
         buffer.append(sep).append(strs[i]);
      }

      return buffer.toString();
   }

   public static String join(List<Integer> ints, String sep) {
      StringBuffer sb = new StringBuffer();
      sb.append(ints.get(0));

      for(int i = 1; i < ints.size(); ++i) {
         sb.append(sep).append(ints.get(i));
      }

      return sb.toString();
   }

   public static double[] getDoubleList(String str) {
      String[] prop = getStringList(str);
      double[] ds = new double[prop.length];

      for(int i = 0; i < ds.length; ++i) {
         ds[i] = Double.parseDouble(prop[i]);
      }

      return ds;
   }

   public static List<String> getListBySplit(String str, String split) {
      List<String> list = new ArrayList();
      if (str != null && !str.trim().equalsIgnoreCase("")) {
         String[] strs = str.split(split);
         String[] var4 = strs;
         int var5 = strs.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String temp = var4[var6];
            if (temp != null && !temp.trim().equalsIgnoreCase("")) {
               list.add(temp.trim());
            }
         }

         return list;
      } else {
         return list;
      }
   }

   public static int[] getIntList(String str) {
      String[] prop = getStringList(str);
      List<Integer> tmp = new ArrayList();

      for(int i = 0; i < prop.length; ++i) {
         try {
            String sInt = prop[i].trim();
            if (sInt.length() < 20) {
               int r = Integer.parseInt(prop[i].trim());
               tmp.add(r);
            }
         } catch (Exception var6) {
         }
      }

      int[] ints = new int[tmp.size()];

      for(int i = 0; i < tmp.size(); ++i) {
         ints[i] = (Integer)tmp.get(i);
      }

      return ints;
   }

   public static String toWrapString(Object obj, String content) {
      return obj == null ? "null" : obj.getClass().getName() + "@" + obj.hashCode() + "[\r\n" + content + "\r\n]";
   }

   public static BitSet bitSetFromString(String str) {
      if (str == null) {
         return new BitSet();
      } else {
         if (str.startsWith("{")) {
            str = str.substring(1);
         }

         if (str.endsWith("}")) {
            str = str.substring(0, str.length() - 1);
         }

         int[] ints = getIntList(str);
         BitSet bs = new BitSet();
         int[] var3 = ints;
         int var4 = ints.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            int i = var3[var5];
            bs.set(i);
         }

         return bs;
      }
   }

   public static boolean hasExcludeChar(String str) {
      if (str != null) {
         char[] chs = str.toCharArray();

         for(int i = 0; i < chs.length; ++i) {
            if (Character.getType(chs[i]) == 18) {
               return true;
            }
         }
      }

      return false;
   }

   public static String replaceSql(String str) {
      return str != null ? str.replaceAll("'", "’").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;") : "";
   }

   public static boolean isEquals(String s1, String s2) {
      if (s1 != null) {
         return s1.equals(s2);
      } else {
         return s2 == null;
      }
   }

   public static boolean isDigit(String text) {
      String reg = "[-]*[\\d]+[\\.\\d+]*";
      Pattern pat = Pattern.compile(reg);
      Matcher mat = pat.matcher(text);
      return mat.matches();
   }

   public static boolean isChiness(String text) {
      String reg = "[\\w]*[\\u4e00-\\u9fa5]+[\\w]*";
      Pattern pat = Pattern.compile(reg);
      Matcher mat = pat.matcher(text);
      boolean result = mat.matches();
      return result;
   }

   public static boolean isChineseChar(char cha) {
      String reg = "[\\u4e00-\\u9fa5]";
      Pattern pat = Pattern.compile(reg);
      String text = Character.toString(cha);
      Matcher mat = pat.matcher(text);
      boolean result = mat.matches();
      return result;
   }

   public static boolean isLetterAndDigit(String cha) {
      String reg = "[\\w]+";
      Pattern pat = Pattern.compile(reg);
      Matcher mat = pat.matcher(cha);
      boolean result = mat.matches();
      return result;
   }

   public static int getChineseCount(String test) {
      int count = 0;
      boolean tempResult = false;

      for(int i = 0; i < test.length(); ++i) {
         char cha = test.charAt(i);
         tempResult = isChineseChar(cha);
         if (tempResult) {
            ++count;
         }
      }

      return count;
   }

   public static int getLetterAndDigitCount(String text) {
      int count = 0;
      boolean tempResult = false;

      for(int i = 0; i < text.length(); ++i) {
         tempResult = isLetterAndDigit(text);
         if (tempResult) {
            ++count;
         }
      }

      return count;
   }

   public static boolean isEmpty(String str) {
      return str == null || str.trim().length() == 0;
   }

   public static String upperCaseFirstCharOnly(String s) {
      return s != null && s.length() >= 1 ? s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() : s;
   }

   public static String arrayToString(String[] s, char sep) {
      if (s != null && s.length != 0) {
         StringBuffer buf = new StringBuffer();
         if (s != null) {
            for(int i = 0; i < s.length; ++i) {
               if (i > 0) {
                  buf.append(sep);
               }

               buf.append(s[i]);
            }
         }

         return buf.toString();
      } else {
         return "";
      }
   }

   public static String getString(String splitString, String... strings) {
      StringBuffer stringBuffer = new StringBuffer();

      for(int i = 0; i < strings.length; ++i) {
         stringBuffer.append(strings[i]);
         if (i == strings.length - 1) {
            break;
         }

         stringBuffer.append(splitString);
      }

      return stringBuffer.toString();
   }

   public static String listToString(Collection<String> list, String splitStr) {
      if (list == null) {
         return null;
      } else {
         StringBuilder result = new StringBuilder();
         Iterator var3 = list.iterator();

         while(var3.hasNext()) {
            String string = (String)var3.next();
            result.append(string);
            result.append(splitStr);
         }

         return result.toString();
      }
   }

   public static String getString(String splitString, int start, Serializable... strings) {
      StringBuffer stringBuffer = new StringBuffer();

      for(int i = start; i < strings.length; ++i) {
         stringBuffer.append(strings[i]);
         if (i == strings.length - 1) {
            break;
         }

         stringBuffer.append(splitString);
      }

      return stringBuffer.toString();
   }

   public static String toLowerCaseFirstOne(String s) {
      return Character.isLowerCase(s.charAt(0)) ? s : Character.toLowerCase(s.charAt(0)) + s.substring(1);
   }
}
