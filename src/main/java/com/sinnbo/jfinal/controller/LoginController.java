package com.sinnbo.jfinal.controller;

import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.common.IpHelper;
import com.baomidou.kisso.common.util.HttpUtil;
import com.baomidou.kisso.web.waf.request.WafRequestWrapper;
import com.jfinal.core.Controller;
import com.jfinal.render.CaptchaRender;
import com.sinnbo.jfinal.config.res.Res;
import com.sinnbo.jfinal.config.token.Token;
import com.sinnbo.jfinal.domain.BasicUser;
import com.sinnbo.jfinal.util.AuthUtil;

public class LoginController extends Controller {
  public void index() {
    Token token = (Token)SSOHelper.getToken(getRequest());
    if (AuthUtil.isAuth(token)) {
      redirect("/welcome/welcome");
      return;
    }
    
    if (HttpUtil.isPost(getRequest())) {
      WafRequestWrapper req = new WafRequestWrapper(getRequest());
      String username = req.getParameter("username");
      String password = req.getParameter("password");
      String image = req.getParameter("image");
      
      BasicUser user = AuthUtil.login(username, password);
      if (!CaptchaRender.validate(this, image)) {
        setAttr("fail", "验证码错误");
      } else {
        if (null != user) {
            token = new Token();
            token.setUid(String.valueOf(user.getId()));
            token.setIp(IpHelper.getIpAddr(getRequest()));
            token.setUserType(user.getUserType());
            SSOHelper.setSSOCookie(getRequest(), getResponse(), token, true);
            redirect("/welcome/welcome");
            return;
        } else {
          setAttr("fail", "登录认证失败");
        }
      }
    }
    
    render("login.jsp");
  }
  
//  /**
//   * 支持APP端登录
//   */
//  @ExceptionHandler
//  public void auth() {
//    Res res = new Res();
//    Token token = (Token) SSOHelper.getToken(getRequest());
//    UserData data = new UserData();
//    if (!HttpUtil.isPost(getRequest())) {
//      throw new TxDataException(StatusCode.STATUS_401, "没有权限");
//    } else {
//      if (!AuthUtil.isAuth(token)) {
//        WafRequestWrapper req = new WafRequestWrapper(getRequest());
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        BasicUser user = AuthUtil.loginAuth(username, password);
//        BasicFreshman bf = BasicFreshman.dao.getByCache(user.getRefId());
//        token = new Token();
//        token.setUid(String.valueOf(user.getRefId()));
//        token.setIp(IpHelper.getIpAddr(getRequest()));
//        token.setUserType(UserType.FRESHMAN.name());
//        token.setBatchId(SysSetting.dao.getBatchId());
//        token.setCampusId(SysSetting.dao.getCampusId());
//        
//        // 设置Cookie不过期
//        getRequest().setAttribute(SSOConfig.SSO_COOKIE_MAXAGE, 999999999);
//        SSOHelper.setSSOCookie(getRequest(), getResponse(), token, true);
//        
//        data.setId(bf.getId());
//        data.setIsConfirmed(bf.getInt("is_confirmed"));
//        res.setData(data);
//        
//        if(!DataStatus.ENABLED.getValue().equals(bf.getActive())){
//          bf.setActive(DataStatus.ENABLED.getValue());
//          bf.update();
//        }
//      } else {
//        throw new TxDataException("当前账号已登录");
//      }
//    }
//    renderJson(res);
//  }
  
  /**
   * APP接口
   * 退出登录
   */
  public void unauth() {
    SSOHelper.clearLogin(getRequest(), getResponse());
    renderJson(new Res());
  }
  
  public void logout() {
    SSOHelper.clearLogin(getRequest(), getResponse());
    render("login.jsp");
  }
  
  public void image() {
    render(new CaptchaRender());
  }
}
