package com.sinnbo.jfinal.service.base;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.Model;
import com.sinnbo.jfinal.config.xbus.cache.CacheEvit;

/**
 * 所有Service的基类
 * 
 * @author saker
 */
public abstract class BaseService<T extends Model<T>> implements DataAccessable<T>, CacheEvit {
  private final int DOMAIN_CACHE_SIZE_DEFAULT = Boolean.FALSE.equals(isDomain()) ? 1 : PropKit.getInt("domain.cache.size.default", 999);
  public final static String defaultCommonId = "-1";

  // 每个Service实例有自己的Cache实例
  protected final LoadingCache<String, T> guavaCache = CacheBuilder.newBuilder().maximumSize(DOMAIN_CACHE_SIZE_DEFAULT).build(new CacheLoader<String, T>() {
    @Override
    public T load(String cacheKey) throws Exception {
      return getById(cacheKey);
    }
  });

  /**
   * 默认数据可操作，子类可覆盖该方法
   */
  @Override
  public void isAccessable(T t) {}

  /**
   * 子类必须实现该方法
   * 
   * @param id 主键
   */
  public abstract T getById(String id);
  
  public abstract T getByIdFromCache(String id);
  
  /**
   * 默认缓存是针对Domain的缓存，子类可覆盖该方法
   * 如果不是Domain类型的缓存，子类返回False
   */
  public Boolean isDomain() {
    return Boolean.TRUE;
  }
}
