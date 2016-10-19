package com.sinnbo.jfinal.common.enumwork;

public enum XbusOperater {
  CREATE("新增"),
  UPDATE("修改"),
  DELETE("删除");
  
  private String note;
  private XbusOperater(String note) {
    this.note = note;
  }
  
  public String getNote() {
    return this.note;
  }
  
  public Integer getValue() {
    return this.ordinal();
  }
}
