package com.sinnbo.jfinal.config.xbus.cache.mq;

public enum ZbusMq {
  CACHE("x-cache");
  
  private String note;
  private ZbusMq(String note) {
    this.note = note;
  }
  
  public String getNote() {
    return this.note;
  }
}
