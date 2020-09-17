package com.shiku.imserver.common.utils;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sun.reflect.ConstructorAccessor;
import sun.reflect.FieldAccessor;
import sun.reflect.ReflectionFactory;

public class DynamicEnumUtil {
   private static ReflectionFactory reflectionFactory = ReflectionFactory.getReflectionFactory();

   private static void setFailsafeFieldValue(Field field, Object target, Object value) throws NoSuchFieldException, IllegalAccessException {
      field.setAccessible(true);
      Field modifiersField = Field.class.getDeclaredField("modifiers");
      modifiersField.setAccessible(true);
      int modifiers = modifiersField.getInt(field);
      modifiers &= -17;
      modifiersField.setInt(field, modifiers);
      FieldAccessor fa = reflectionFactory.newFieldAccessor(field, false);
      fa.set(target, value);
   }

   private static void blankField(Class<?> enumClass, String fieldName) throws NoSuchFieldException, IllegalAccessException {
      Field[] var2 = Class.class.getDeclaredFields();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Field field = var2[var4];
         if (field.getName().contains(fieldName)) {
            AccessibleObject.setAccessible(new Field[]{field}, true);
            setFailsafeFieldValue(field, enumClass, (Object)null);
            break;
         }
      }

   }

   private static void cleanEnumCache(Class<?> enumClass) throws NoSuchFieldException, IllegalAccessException {
      blankField(enumClass, "enumConstantDirectory");
      blankField(enumClass, "enumConstants");
   }

   private static ConstructorAccessor getConstructorAccessor(Class<?> enumClass, Class<?>[] additionalParameterTypes) throws NoSuchMethodException {
      Class<?>[] parameterTypes = new Class[additionalParameterTypes.length + 2];
      parameterTypes[0] = String.class;
      parameterTypes[1] = Integer.TYPE;
      System.arraycopy(additionalParameterTypes, 0, parameterTypes, 2, additionalParameterTypes.length);
      return reflectionFactory.newConstructorAccessor(enumClass.getDeclaredConstructor(parameterTypes));
   }

   private static Object makeEnum(Class<?> enumClass, String value, int ordinal, Class<?>[] additionalTypes, Object[] additionalValues) throws Exception {
      Object[] parms = new Object[additionalValues.length + 2];
      parms[0] = value;
      parms[1] = ordinal;
      System.arraycopy(additionalValues, 0, parms, 2, additionalValues.length);
      parms[1] = parms[parms.length - 1];
      return enumClass.cast(getConstructorAccessor(enumClass, additionalTypes).newInstance(parms));
   }

   public static <T extends Enum<?>> T addEnum(Class<T> enumType, String enumName, Class<?>[] additionalTypes, Object[] additionalValues) {
      if (!Enum.class.isAssignableFrom(enumType)) {
         throw new RuntimeException("class " + enumType + " is not an instance of Enum");
      } else {
         Field valuesField = null;
         Field[] fields = enumType.getDeclaredFields();
         Field[] var6 = fields;
         int var7 = fields.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            Field field = var6[var8];
            if (field.getName().contains("$VALUES")) {
               valuesField = field;
               break;
            }
         }

         AccessibleObject.setAccessible(new Field[]{valuesField}, true);

         try {
            T[] previousValues = (T[]) valuesField.get(enumType);
            List<T> values = new ArrayList(Arrays.asList(previousValues));
            T newValue = (T) makeEnum(enumType, enumName, values.size(), additionalTypes, additionalValues);
            values.add(newValue);
            setFailsafeFieldValue(valuesField, (Object)null, values.toArray((Enum[])((Enum[])Array.newInstance(enumType, 0))));
            cleanEnumCache(enumType);
            return newValue;
         } catch (Exception var10) {
            var10.printStackTrace();
            throw new RuntimeException(var10.getMessage(), var10);
         }
      }
   }
}
