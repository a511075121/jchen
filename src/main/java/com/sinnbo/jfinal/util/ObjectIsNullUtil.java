package com.sinnbo.jfinal.util;

import com.sinnbo.jfinal.exception.NullObjectException;

public class ObjectIsNullUtil {
  public static void isNull(Object object) {
    if (object == null) {
      new NullObjectException("空对象异常");
    }
  }
  
  public static void isNullElements(Object ...object) {
    for (Object o: object) {
      if (null == o) {
        new NullObjectException("空对象异常");
      }
    }
  }
  
  public static boolean isNullOfBoolean(Object object) {
    if (object == null) {
      return true;
    }
    return false;
  }
}
