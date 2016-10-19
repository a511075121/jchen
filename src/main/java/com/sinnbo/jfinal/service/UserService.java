package com.sinnbo.jfinal.service;

import org.apache.log4j.Logger;

import com.jfinal.aop.Enhancer;
import com.sinnbo.jfinal.common.enumwork.XbusOperater;
import com.sinnbo.jfinal.config.xbus.cache.XbusMessage;
import com.sinnbo.jfinal.domain.BasicUser;
import com.sinnbo.jfinal.service.base.BaseService;
import com.sinnbo.jfinal.util.ObjectIsNullUtil;

public class UserService extends BaseService<BasicUser> {
  public final static UserService service = Enhancer.enhance(UserService.class);
  private final static Logger logger = Logger.getLogger("BasicUser");
  private final static String className = BasicUser.class.getName();
  
  public BasicUser getByUserName(String userName) {
    return BasicUser.dao.getByUserName(userName);
  }

  public BasicUser save(BasicUser model) {
    ObjectIsNullUtil.isNull(model);
    model.save();
    return model;
  }
  
  public void update(BasicUser model) {
    ObjectIsNullUtil.isNullElements(model, model.getId());
    model.update();
    XbusMessage.sendMessage(String.valueOf(model.getId()), XbusOperater.UPDATE.name(), className);
  }
  
  public void deleteById(String id) {
    BasicUser user = getById(id);
    ObjectIsNullUtil.isNull(user);
    user.delete();
    XbusMessage.sendMessage(id, XbusOperater.DELETE.name(), className);
  }
  
  public void deleteByIds(String ...id) {
    for (String userId: id) {
      deleteById(userId);
    }
  }
  
  @Override
  public void evitByIdFromCache(String id) {
    guavaCache.invalidate(id);
    logger.info("已从缓存移除id="+id+"的"+className+"对象");
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
      logger.info("找不到id="+id+"的"+className+"对象");
    }
    
    return user == null ? new BasicUser() : user;
  }
}
