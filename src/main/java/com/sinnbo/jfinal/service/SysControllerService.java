package com.sinnbo.jfinal.service;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;
import com.sinnbo.jfinal.domain.SysController;
import com.sinnbo.jfinal.service.base.BaseService;

public class SysControllerService extends BaseService<SysController> {
  public final static SysControllerService service = Enhancer.enhance(SysControllerService.class);
  private final static Logger logger = Logger.getLogger("SysController");
  private final static String className = SysController.class.getName();
  
  @Override
  public void evitByIdFromCache(String id) {
    guavaCache.invalidate(id);
    logger.info("已从缓存移除id="+id+"的"+className+"对象");
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
      logger.info("已从缓存移除id="+id+"的"+className+"对象");
    }
    
    return menu == null ? new SysController() : menu;
  }
}
