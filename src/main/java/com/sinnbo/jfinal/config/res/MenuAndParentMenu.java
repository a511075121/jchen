package com.sinnbo.jfinal.config.res;

import java.util.List;

import com.google.common.collect.Lists;

public class MenuAndParentMenu {
  private Integer menuId;
  private String controller;
  private String name;
  private String icon;
  private List<MenuAndParentMenu> list = Lists.newArrayList();
  public Integer getMenuId() {
    return menuId;
  }
  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }
  public String getController() {
    return controller;
  }
  public void setController(String controller) {
    this.controller = controller;
  }
  public String getIcon() {
    return icon;
  }
  public void setIcon(String icon) {
    this.icon = icon;
  }
  public List<MenuAndParentMenu> getList() {
    return list;
  }
  public void setList(List<MenuAndParentMenu> list) {
    this.list = list;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
