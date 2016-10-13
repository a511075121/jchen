package com.sinnbo.jfinal.config.res;
/**
 * 用于缓存一级与二级菜单
 * @author Administrator
 *
 */
public class MenuAndParent {
  private Integer menuId;
  private Integer parentMenuId;
  public Integer getMenuId() {
    return menuId;
  }
  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }
  public Integer getParentMenuId() {
    return parentMenuId;
  }
  public void setParentMenuId(Integer parentMenuId) {
    this.parentMenuId = parentMenuId;
  }
  
  
}
