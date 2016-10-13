package com.sinnbo.jfinal.util;

import com.sinnbo.jfinal.config.token.Token;
import com.sinnbo.jfinal.domain.BasicUser;
import com.sinnbo.jfinal.service.UserService;

public class AuthUtil {
  
  public static boolean isAuth(Token token) {
    if (token == null) {
      return false;
    }
    return true;
  }

  public static BasicUser login(String username, String password) {
    BasicUser user = UserService.service.getByUserName(username);
    if (null != user) {
      String passWd = MD5.getSoltMD5(MD5.getMD5(password), user.getSolt());
      
      if (passWd.equals(user.getUserPasswd())) {
        return user;
      }
    }
    return null;
  }
}