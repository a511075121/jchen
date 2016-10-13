package com.sinnbo.jfinal.controller;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.sinnbo.jfinal.config.interceptor.SSOJfinalInterceptor;

@Before(SSOJfinalInterceptor.class)
public class WelcomeController extends Controller {
  public void welcome() {
    render("welcome.jsp");
  }
}
