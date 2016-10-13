package com.sinnbo.jfinal.config;

import java.util.List;
import java.util.logging.Logger;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.util.JdbcConstants;
import com.alibaba.druid.wall.WallFilter;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.sinnbo.jfinal.common.enumwork.DataStatus;
import com.sinnbo.jfinal.config.interceptor.MenuInterceptor;
import com.sinnbo.jfinal.config.kissoplugin.KissoJfinalPlugin;
import com.sinnbo.jfinal.controller.LoginController;
import com.sinnbo.jfinal.controller.WelcomeController;
import com.sinnbo.jfinal.domain.BasicUser;
import com.sinnbo.jfinal.domain.SysController;
import com.sinnbo.jfinal.domain.SysMenu;
import com.sinnbo.jfinal.domain._MappingKit;
import com.sinnbo.jfinal.service.SysControllerService;
import com.sinnbo.jfinal.service.SysMenuService;
import com.sinnbo.jfinal.service.UserService;

public class DemoConfig extends JFinalConfig {
  private final static Logger logger = Logger.getLogger("DB");
  @Override
  public void configConstant(Constants me) {
    PropKit.use("config.txt");
    me.setBaseViewPath("/WEB-INF/jsp");
    me.setError401View("/WEB-INF/jsp/error/401.jsp");
    me.setError404View("/WEB-INF/jsp/error/404.jsp");
    me.setError500View("/WEB-INF/jsp/error/500.jsp");
    me.setViewType(ViewType.JSP);
  }

  @Override
  public void configRoute(Routes me) {
    me.add("/login", LoginController.class, "/login");
    me.add("/welcome", WelcomeController.class, "/base");
  }

  @Override
  public void configPlugin(Plugins me) {
    DruidPlugin druid = new DruidPlugin(PropKit.get("jdbc.url"), PropKit.get("jdbc.user"), PropKit.get("jdbc.pwd").trim());
    // StatFilter提供JDBC层的统计信息
    druid.addFilter(new StatFilter());
    // WallFilter的功能是防御SQL注入攻击
    WallFilter wallDefault = new WallFilter();
    wallDefault.setDbType(JdbcConstants.MYSQL);
    druid.addFilter(wallDefault);
    me.add(druid);
    
    ActiveRecordPlugin arp = new ActiveRecordPlugin("main", druid);
    arp.setShowSql(true);
    
    me.add(arp);
    _MappingKit.mapping(arp);
    
    me.add(new KissoJfinalPlugin());
  }

  @Override
  public void configInterceptor(Interceptors me) {
    me.add(new MenuInterceptor());
  }

  @Override
  public void configHandler(Handlers me) {
    
  }
  
  public void afterJFinalStart() {
    logger.info("GuavaCache||BasicUser||Initializing...");
    List<BasicUser> users = BasicUser.dao.find("select id from i_basic_user where data_status=?", DataStatus.ENABLED.getValue());
    for (BasicUser user: users) {
      UserService.service.getByIdFromCache(String.valueOf(user.getId()));
    }
    logger.info("GuavaCache||BasicUser||Initialization succeed.");
    logger.info("GuavaCache||SysMenu||Initializing...");
    List<SysMenu> menus = SysMenu.dao.find("select id from i_sys_menu where data_status=?", DataStatus.ENABLED.getValue());
    for (SysMenu menu: menus) {
      SysMenuService.service.getByIdFromCache(String.valueOf(menu.getId()));
    }
    logger.info("GuavaCache||SysMenu||Initialization succeed.");
    logger.info("GuavaCache||SysController||Initializing...");
    List<SysController> contrs = SysController.dao.find("select id from i_sys_controller where data_status=?", DataStatus.ENABLED.getValue());
    for (SysController contr: contrs) {
      SysControllerService.service.getByIdFromCache(String.valueOf(contr.getId()));
    }
    logger.info("GuavaCache||SysController||Initialization succeed.");
    
  }

}
