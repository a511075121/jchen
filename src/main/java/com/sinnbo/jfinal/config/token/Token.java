package com.sinnbo.jfinal.config.token;

import com.baomidou.kisso.SSOToken;

/**
 * 
 * 
 * 这个是测试自定义 Token
 * <p>
 * 线上可以直接使用 SSOToken 去掉 sso.properties 中配置
 * sso.token.class=com.baomidou.kisso.MyToken
 * </p>
 * 
 * @author hubin
 *
 */
public class Token extends SSOToken {
  private static final long serialVersionUID = 1L;

  private Integer userType;

  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }
	

}
