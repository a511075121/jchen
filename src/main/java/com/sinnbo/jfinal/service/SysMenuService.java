package com.sinnbo.jfinal.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;
import com.sinnbo.jfinal.common.enumwork.XbusOperater;
import com.sinnbo.jfinal.config.xbus.cache.XbusMessage;
import com.sinnbo.jfinal.domain.SysMenu;
import com.sinnbo.jfinal.service.base.BaseService;
import com.sinnbo.jfinal.util.ObjectIsNullUtil;

public class SysMenuService extends BaseService<SysMenu> {
  public final static SysMenuService service = Enhancer.enhance(SysMenuService.class);
  private final static Logger logger = Logger.getLogger("SysMenu");
  private final static String className = SysMenu.class.getName();
  
  public SysMenu save(SysMenu model) {
    ObjectIsNullUtil.isNull(model);
    model.save();
    return model;
  }
  
  public void update(SysMenu model) {
    ObjectIsNullUtil.isNullElements(model, model.getId());
    model.update();
    XbusMessage.sendMessage(String.valueOf(model.getId()), XbusOperater.UPDATE.name(), className);
  }
  
  public void deleteById(String id) {
    SysMenu menu = getById(id);
    ObjectIsNullUtil.isNull(menu);
    menu.delete();
    XbusMessage.sendMessage(id, XbusOperater.DELETE.name(), className);
  }
  
  @Override
  public void evitByIdFromCache(String id) {
    guavaCache.invalidate(id);
    logger.info("已从缓存移除id="+id+"的"+className+"对象");
  }

  @Override
  public SysMenu getById(String id) {
    return SysMenu.dao.findById(id);
  }

  @Override
  public SysMenu getByIdFromCache(String id) {
    SysMenu menu = null;
    
    try {
      menu = guavaCache.get(id);
    } catch (Exception e) {
      logger.info("找不到id="+id+"的"+className+"对象");
    }
    
    return menu == null ? new SysMenu() : menu;
  }
  
  public List<SysMenu> getAll() {
    return SysMenu.dao.getAll();
  }
  
  public List<SysMenu> getByPid(Integer pId) {
    return SysMenu.dao.getByPId(pId);
  }
  
  public List<SysMenu> getRootMenu() {
    return SysMenu.dao.getRootMenu();
  }
}
