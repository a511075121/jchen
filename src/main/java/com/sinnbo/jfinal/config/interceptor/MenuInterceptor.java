package com.sinnbo.jfinal.config.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

public class MenuInterceptor implements Interceptor {
  protected static final Logger logger = LoggerFactory.getLogger("MenuInteceptor");
  
  @Override
  public void intercept(Invocation inv) {
    HttpServletRequest request = inv.getController().getRequest();
    if ("APP".equals(request.getHeader("PLATFORM"))) {
      inv.invoke();
      return;
    }
    
  }

}
