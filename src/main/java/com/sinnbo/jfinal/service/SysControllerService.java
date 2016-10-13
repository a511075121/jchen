package com.sinnbo.jfinal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.aop.Enhancer;
import com.sinnbo.jfinal.domain.SysController;
import com.sinnbo.jfinal.service.base.BaseService;

public class SysControllerService extends BaseService<SysController> {
  public final static SysControllerService service = Enhancer.enhance(SysControllerService.class);
  private final static Logger logger = LoggerFactory.getLogger("SysController");
  
  @Override
  public void evitByIdFromCache(String id) {
    guavaCache.invalidate(id);
    logger.info("已从缓存移除id={0}的{1}对象", id, SysController.class.getName());
    //CacheMessageSender.send(String.valueOf(id), XBusOperator.CACHE_EVIT.name(), className);
  }

  @Override
  public SysController getById(String id) {
    return SysController.dao.findById(id);
  }

  @Override
  public SysController getByIdFromCache(String id) {
    SysController menu = null;
    
    try {
      menu = guavaCache.get(id);
    } catch (Exception e) {
      logger.info("找不到id={0}的{1}对象",id,SysController.class.getName());
    }
    
    return menu == null ? new SysController() : menu;
  }
}
