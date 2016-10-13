package com.sinnbo.jfinal.service.base;

import com.jfinal.plugin.activerecord.Model;

/**
 * 数据是否可访问
 * 在数据查询和修改时需要检测
 * @author saker
 */
public interface DataAccessable<T extends Model<T>> {
  public void isAccessable(T t);
}
