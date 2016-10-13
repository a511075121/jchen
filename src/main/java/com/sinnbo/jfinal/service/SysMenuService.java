package com.sinnbo.jfinal.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.aop.Enhancer;
import com.sinnbo.jfinal.domain.SysMenu;
import com.sinnbo.jfinal.service.base.BaseService;

public class SysMenuService extends BaseService<SysMenu> {
  public final static SysMenuService service = Enhancer.enhance(SysMenuService.class);
  private final static Logger logger = LoggerFactory.getLogger("SysMenu");
  
  @Override
  public void evitByIdFromCache(String id) {
    guavaCache.invalidate(id);
    logger.info("已从缓存移除id={0}的{1}对象", id, SysMenu.class.getName());
    //CacheMessageSender.send(String.valueOf(id), XBusOperator.CACHE_EVIT.name(), className);
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
      logger.info("找不到id={0}的{1}对象",id,SysMenu.class.getName());
    }
    
    return menu == null ? new SysMenu() : menu;
  }
  
  public List<SysMenu> getAll() {
    return SysMenu.dao.getAll();
  }
}
