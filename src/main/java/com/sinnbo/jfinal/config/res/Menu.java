package com.sinnbo.jfinal.config.res;

import java.util.List;

public class Menu {
  private Integer menuId;
  private String controller;
  private String name;
  private String icon;
  private List<Menu> list;
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
  public List<Menu> getList() {
    return list;
  }
  public void setList(List<Menu> list) {
    this.list = list;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
