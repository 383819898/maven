package com.shiku.imserver.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonKit {
   private static Logger log = LoggerFactory.getLogger(JsonKit.class);
   private static SerializeConfig mapping = new SerializeConfig();

   public static SerializeConfig put(Class<?> clazz, SerializeFilter filter) {
      mapping.addFilter(clazz, filter);
      return mapping;
   }

   public static SerializeConfig put(Class<?> clazz, ObjectSerializer serializer) {
      mapping.put(clazz, serializer);
      return mapping;
   }

   public static <T> T toBean(String jsonString, Class<T> tt) {
      try {
         if (org.apache.commons.lang3.StringUtils.isBlank(jsonString)) {
            return null;
         } else {
            T t = JSON.parseObject(jsonString, tt);
            return t;
         }
      } catch (Throwable var3) {
         log.error("json解析失败:\r\n{}", jsonString);
         throw new RuntimeException(var3);
      }
   }

   public static <T> T toBean(byte[] bytes, Class<T> tt) {
      try {
         if (bytes == null) {
            return null;
         } else {
            T t = JSON.parseObject(bytes, tt, new Feature[0]);
            return t;
         }
      } catch (Throwable var3) {
         log.error("json解析失败:\r\n{}", bytes);
         throw new RuntimeException(var3);
      }
   }

   public static String toFormatedJson(Object bean) {
      try {
         return JSON.toJSONString(bean, mapping, new SerializerFeature[]{SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.PrettyFormat});
      } catch (Throwable var2) {
         throw new RuntimeException(var2);
      }
   }

   public static String toJSONEnumNoUsingName(Object bean) {
      int features = SerializerFeature.config(JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.WriteEnumUsingName, false);
      return JSONObject.toJSONString(bean, features, new SerializerFeature[0]);
   }

   public static String toJSONString(Object bean, SerializerFeature serializerFeature) {
      return JSONObject.toJSONString(bean, mapping, new SerializerFeature[]{serializerFeature});
   }

   public static String toJSONString(Object bean) {
      try {
         return JSON.toJSONString(bean, mapping, new SerializerFeature[]{SerializerFeature.DisableCircularReferenceDetect});
      } catch (Throwable var2) {
         throw new RuntimeException(var2);
      }
   }

   public static String toJSONString(Object bean, SerializeFilter serializeFilter) {
      try {
         return serializeFilter != null ? JSON.toJSONString(bean, mapping, serializeFilter, new SerializerFeature[]{SerializerFeature.DisableCircularReferenceDetect}) : JSON.toJSONString(bean, mapping, new SerializerFeature[]{SerializerFeature.DisableCircularReferenceDetect});
      } catch (Throwable var3) {
         throw new RuntimeException(var3);
      }
   }

   public static byte[] toJsonBytes(Object bean) {
      return JSON.toJSONBytes(bean, mapping, new SerializerFeature[]{SerializerFeature.DisableCircularReferenceDetect});
   }

   public static byte[] toJSONBytesEnumNoUsingName(Object bean) {
      int features = SerializerFeature.config(JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.WriteEnumUsingName, false);
      return JSONObject.toJSONBytes(bean, features, new SerializerFeature[0]);
   }

   public static <T> List<T> toArray(List<String> datas, Class<T> clazz) {
      if (datas == null) {
         return null;
      } else {
         List<T> result = new ArrayList();
         Iterator var3 = datas.iterator();

         while(var3.hasNext()) {
            String obj = (String)var3.next();
            result.add(toBean(obj, clazz));
         }

         return result;
      }
   }

   static {
      mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
      mapping.put(java.sql.Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
      mapping.put(Timestamp.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
      mapping.put(Time.class, new SimpleDateFormatSerializer("HH:mm:ss"));
   }
}
