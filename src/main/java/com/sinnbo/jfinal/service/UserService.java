package com.sinnbo.jfinal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.aop.Enhancer;
import com.sinnbo.jfinal.domain.BasicUser;
import com.sinnbo.jfinal.service.base.BaseService;

public class UserService extends BaseService<BasicUser> {
  public final static UserService service = Enhancer.enhance(UserService.class);
  private final static Logger logger = LoggerFactory.getLogger("BasicUser");
  
  public BasicUser getByUserName(String userName) {
    return BasicUser.dao.getByUserName(userName);
  }

  @Override
  public void evitByIdFromCache(String id) {
    guavaCache.invalidate(id);
    logger.info("已从缓存移除id={0}的{1}对象", id, BasicUser.class.getName());
    //CacheMessageSender.send(String.valueOf(id), XBusOperator.CACHE_EVIT.name(), className);
  }

  @Override
  public BasicUser getById(String id) {
    return BasicUser.dao.findById(id);
  }

  @Override
  public BasicUser getByIdFromCache(String id) {
    BasicUser user = null;
    
    try {
      user = guavaCache.get(id);
    } catch (Exception e) {
      logger.info("找不到id={0}的{1}对象",id,BasicUser.class.getName());
    }
    
    return user == null ? new BasicUser() : user;
  }
}
