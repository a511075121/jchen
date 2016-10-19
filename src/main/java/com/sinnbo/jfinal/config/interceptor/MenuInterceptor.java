package com.sinnbo.jfinal.config.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.baomidou.kisso.SSOHelper;
import com.google.common.collect.Lists;
import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.sinnbo.jfinal.config.res.Menu;
import com.sinnbo.jfinal.config.token.Token;
import com.sinnbo.jfinal.domain.SysController;
import com.sinnbo.jfinal.domain.SysMenu;
import com.sinnbo.jfinal.service.SysControllerService;
import com.sinnbo.jfinal.service.SysMenuService;
import com.sinnbo.jfinal.util.ObjectIsNullUtil;
import com.sinnbo.jfinal.util.StringUtils;

public class MenuInterceptor implements Interceptor {
  protected static final Logger logger = Logger.getLogger("MenuInteceptor");

  // private LoadingCache<String, MenuAndParent> actionCache =
  // CacheBuilder.newBuilder().newBuilder()
  // .maximumSize(1000).build(new CacheLoader<String, MenuAndParent>(){
  // @Override
  // public MenuAndParent load(String key) throws Exception {
  // List<SysMenu> list = SysMenuService.service.getAll();
  // return null;
  // }
  // });

  @Override
  public void intercept(Invocation inv) {
    HttpServletRequest request = inv.getController().getRequest();
    if ("APP".equals(request.getHeader("PLATFORM"))) {
      inv.invoke();
      return;
    }
    
    Token token = (Token)SSOHelper.getToken(inv.getController().getRequest());
    if (token != null) {
      List<SysMenu> list = SysMenuService.service.getRootMenu();
      List<Menu> rootMenu = Lists.newArrayList();
  
      for (SysMenu menu : list) {
        Menu m = new Menu();
        SysController controller = null;
        if (!ObjectIsNullUtil.isNullOfBoolean(menu.getControllerId())) {
           controller = SysControllerService.service.getByIdFromCache(String.valueOf(menu.getControllerId()));
           m.setController("/" + controller.getControllerKey() + "/" + controller.getControllerValue());
        } else {
          m.setController("#");
        }
        
        m.setMenuId(menu.getId());
        m.setName(menu.getMenuName());
        if (!StringUtils.isEmpety(menu.getIcon())) {
          m.setIcon(menu.getIcon());
        }
        List<SysMenu> subMenus = SysMenuService.service.getByPid(menu.getId());
        if (!subMenus.isEmpty()) {
          List<Menu> subMenu = Lists.newArrayList();
          for (SysMenu subM : subMenus) {
            Menu subm = new Menu();
            SysController contr = null;
            if (!ObjectIsNullUtil.isNullOfBoolean(subM.getControllerId())) {
              contr = SysControllerService.service.getByIdFromCache(String.valueOf(subM.getControllerId()));
              subm.setController("/" + contr.getControllerKey() + "/" + contr.getControllerValue());
            } else {
              subm.setController("#");
            }
            subm.setMenuId(subM.getId());
            subm.setName(subM.getMenuName());
            if (!StringUtils.isEmpety(subM.getIcon())) {
              subm.setIcon(subM.getIcon());
            }
            subMenu.add(subm);
          }
          m.setList(subMenu);
        }
        rootMenu.add(m);
      }
      
      inv.getController().setAttr("_menuList", rootMenu);
    }
    inv.invoke();
  }

}
