package com.shiku.imserver.common.utils;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BufferUtil {
   private static Logger log = LoggerFactory.getLogger(BufferUtil.class);
   private static final ThreadLocal<Calendar> localCalendar = new ThreadLocal();

   public static byte read(ByteBuffer buffer) {
      return buffer.get();
   }

   public static int readUB2(ByteBuffer buffer) {
      int ret = buffer.get() & 255;
      ret |= (buffer.get() & 255) << 8;
      return ret;
   }

   public static int readUB3(ByteBuffer buffer) {
      int ret = buffer.get() & 255;
      ret |= (buffer.get() & 255) << 8;
      ret |= (buffer.get() & 255) << 16;
      return ret;
   }

   public static long readUB4(ByteBuffer buffer) {
      long ret = (long)(buffer.get() & 255);
      ret |= (long)(buffer.get() & 255) << 8;
      ret |= (long)(buffer.get() & 255) << 16;
      ret |= (long)(buffer.get() & 255) << 24;
      return ret;
   }

   public static int readInt(ByteBuffer buffer) {
      int i = buffer.get() & 255;
      i |= (buffer.get() & 255) << 8;
      i |= (buffer.get() & 255) << 16;
      i |= (buffer.get() & 255) << 24;
      return i;
   }

   public static float readFloat(ByteBuffer buffer) {
      return Float.intBitsToFloat(readInt(buffer));
   }

   public static long readLong(ByteBuffer buffer) {
      return buffer.getLong();
   }

   public static double readDouble(ByteBuffer buffer) {
      return buffer.getDouble();
   }

   public static String readString(ByteBuffer buffer) {
      return readString(buffer, (String)null);
   }

   public static String readString(ByteBuffer buffer, String charset) {
      if (!buffer.hasRemaining()) {
         return null;
      } else {
         int length = buffer.limit() - buffer.position();
         String s = readString(buffer, length, charset);
         return s;
      }
   }

   public static String readStringWithNull(ByteBuffer buffer, String charset) {
      if (!buffer.hasRemaining()) {
         return null;
      } else {
         int offset = -1;
         int position = buffer.position();
         int length = buffer.limit();
         boolean needPlus1 = true;

         int bytelength;
         for(bytelength = position; bytelength < length; ++bytelength) {
            if (buffer.get(bytelength) == 0) {
               offset = bytelength;
               break;
            }
         }

         if (offset == -1) {
            needPlus1 = false;
            offset = buffer.limit();
         }

         if (offset > position) {
            bytelength = offset - buffer.position();
            String s = readString(buffer, bytelength, charset);
            if (needPlus1) {
               buffer.position(buffer.position() + 1);
            }

            return s;
         } else {
            buffer.position(buffer.position() + 1);
            return null;
         }
      }
   }

   public static String readString(ByteBuffer buffer, int length, String charset) {
      byte[] dst = new byte[length];
      buffer.get(dst, 0, length);
      String s = null;
      if (charset != null) {
         try {
            s = new String(dst, charset);
         } catch (UnsupportedEncodingException var7) {
            log.error(var7.toString(), var7);
            s = new String(dst);
         }
      } else {
         s = new String(dst);
      }

      return s;
   }

   public static String readStringWithNull(ByteBuffer buffer) {
      return readStringWithNull(buffer, (String)null);
   }

   public static Time readTime(ByteBuffer buffer) {
      move(6, buffer);
      int hour = read(buffer);
      int minute = read(buffer);
      int second = read(buffer);
      Calendar cal = getLocalCalendar();
      cal.set(0, 0, 0, hour, minute, second);
      return new Time(cal.getTimeInMillis());
   }

   public static Date readDate(ByteBuffer buffer) {
      byte length = read(buffer);
      int year = readUB2(buffer);
      byte month = read(buffer);
      byte date = read(buffer);
      int hour = read(buffer);
      int minute = read(buffer);
      int second = read(buffer);
      if (length == 11) {
         long nanos = readUB4(buffer);
         Calendar cal = getLocalCalendar();
         --month;
         cal.set(year, month, date, hour, minute, second);
         Timestamp time = new Timestamp(cal.getTimeInMillis());
         time.setNanos((int)nanos);
         return time;
      } else {
         Calendar cal = getLocalCalendar();
         --month;
         cal.set(year, month, date, hour, minute, second);
         return new java.sql.Date(cal.getTimeInMillis());
      }
   }

   public static void move(int i, ByteBuffer buffer) {
      buffer.position(buffer.position() + i);
   }

   public static void position(int i, ByteBuffer buffer) {
      buffer.position(i);
   }

   public static final void writeUB2(ByteBuffer buffer, int i) {
      buffer.put((byte)(i & 255));
      buffer.put((byte)(i >>> 8));
   }

   public static final void writeUB3(ByteBuffer buffer, int i) {
      buffer.put((byte)(i & 255));
      buffer.put((byte)(i >>> 8));
      buffer.put((byte)(i >>> 16));
   }

   public static final void writeInt(ByteBuffer buffer, int i) {
      buffer.put((byte)(i & 255));
      buffer.put((byte)(i >>> 8));
      buffer.put((byte)(i >>> 16));
      buffer.put((byte)(i >>> 24));
   }

   public static final void writeFloat(ByteBuffer buffer, float f) {
      writeInt(buffer, Float.floatToIntBits(f));
   }

   public static final void writeUB4(ByteBuffer buffer, long l) {
      buffer.put((byte)((int)(l & 255L)));
      buffer.put((byte)((int)(l >>> 8)));
      buffer.put((byte)((int)(l >>> 16)));
      buffer.put((byte)((int)(l >>> 24)));
   }

   public static final void writeLong(ByteBuffer buffer, long l) {
      buffer.put((byte)((int)(l & 255L)));
      buffer.put((byte)((int)(l >>> 8)));
      buffer.put((byte)((int)(l >>> 16)));
      buffer.put((byte)((int)(l >>> 24)));
      buffer.put((byte)((int)(l >>> 32)));
      buffer.put((byte)((int)(l >>> 40)));
      buffer.put((byte)((int)(l >>> 48)));
      buffer.put((byte)((int)(l >>> 56)));
   }

   public static final void writeDouble(ByteBuffer buffer, double d) {
      writeLong(buffer, Double.doubleToLongBits(d));
   }

   public static final void writeLength(ByteBuffer buffer, long l) {
      if (l < 251L) {
         buffer.put((byte)((int)l));
      } else if (l < 65536L) {
         buffer.put((byte)-4);
         writeUB2(buffer, (int)l);
      } else if (l < 16777216L) {
         buffer.put((byte)-3);
         writeUB3(buffer, (int)l);
      } else {
         buffer.put((byte)-2);
         writeLong(buffer, l);
      }

   }

   public static final void writeWithNull(ByteBuffer buffer, byte[] src) {
      buffer.put(src);
      buffer.put((byte)0);
   }

   public static final void writeWithLength(ByteBuffer buffer, byte[] src) {
      int length = src.length;
      if (length < 251) {
         buffer.put((byte)length);
      } else if ((long)length < 65536L) {
         buffer.put((byte)-4);
         writeUB2(buffer, length);
      } else if ((long)length < 16777216L) {
         buffer.put((byte)-3);
         writeUB3(buffer, length);
      } else {
         buffer.put((byte)-2);
         writeLong(buffer, (long)length);
      }

      buffer.put(src);
   }

   public static final void writeWithLength(ByteBuffer buffer, byte[] src, byte nullValue) {
      if (src == null) {
         buffer.put(nullValue);
      } else {
         writeWithLength(buffer, src);
      }

   }

   public static final int getLength(long length) {
      if (length < 251L) {
         return 1;
      } else if (length < 65536L) {
         return 3;
      } else {
         return length < 16777216L ? 4 : 9;
      }
   }

   public static final int getLength(byte[] src) {
      int length = src.length;
      if (length < 251) {
         return 1 + length;
      } else if ((long)length < 65536L) {
         return 3 + length;
      } else {
         return (long)length < 16777216L ? 4 + length : 9 + length;
      }
   }

   private static final Calendar getLocalCalendar() {
      Calendar cal = (Calendar)localCalendar.get();
      if (cal == null) {
         cal = Calendar.getInstance();
         localCalendar.set(cal);
      }

      return cal;
   }
}
