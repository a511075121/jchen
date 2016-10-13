package com.sinnbo.jfinal.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 密码加密工具
 * @author Administrator
 *
 */
public class MD5 {
  
  private final static String[] strDigits = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
  
  /**
   * 将字节转化为字符串
   * @param bByte
   * @return
   */
  private static String byteToArrayString(byte bByte){
    int temp = bByte;
    if(temp < 0){
      temp += 256;
    }
    int index1 = temp / 16;
    int index2 = temp % 16;
    return strDigits[index1]+strDigits[index2];
  }
  
  /**
   * 将字节数组转化为字符串
   * @param Bytes
   * @return
   */
  private static String byteToString(byte[] Bytes){
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < Bytes.length; i++) {
      sb.append(byteToArrayString(Bytes[i]));
    }
    return sb.toString();
  }
  
  /**
   * 获取MD5摘要数据
   * @return
   */
  public static String getMD5(String pwd){
    String nPwd = "";
    
    try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      nPwd = byteToString(md.digest(pwd.getBytes()));
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    
    return nPwd;
  }
  
  /**
   * 获取加盐后的MD5摘要数据
   * @param pwd 已摘要的密码
   * @param solt
   * @return
   */
  public static String getSoltMD5(String pwd, String solt){
    String soltPwd = "";
    soltPwd = pwd + solt;
    return getMD5(soltPwd);
  }
  
  /**
   * 得到一个4位数的随机solt
   */
  public static String getSolt(){
    String soltDict = "qwertyuiopasdfghjklzxcvbnm0123456789";
    String solt="";
    for(int i = 0; i < 4; i++){
      solt += soltDict.charAt((int)(Math.random()*(soltDict.length()-1)));
    }
    
    return solt;
  }
  
  public static void main(String[] args) {
//    System.out.println(MD5.getSolt());
    System.out.println(MD5.getSoltMD5(MD5.getMD5("admin123"),"dvpd"));
  }
}
