package com.sinnbo.jfinal.util;

public class StringUtils {

  public static boolean isEmpety(String str) {
    if (null == str || str.trim().equals("")) {
      return true;
    }
    
    return false;
  }
}
