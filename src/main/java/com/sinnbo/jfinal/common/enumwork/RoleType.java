package com.sinnbo.jfinal.common.enumwork;

public enum RoleType {
  UNKOWN("未知"),
  COMMON("普通用户"),
  ADMIN("管理员");
  
  private String note;
  private RoleType(String note) {
    this.note = note;
  }
  
  public String getNote() {
    return this.note;
  }
  
  public Integer getValue() {
    return this.ordinal();
  }
  
  public String getOrdinalStr() {
    return String.valueOf(this.ordinal());
  }

  public static RoleType returnType(Integer ordinal) {
    return RoleType.values()[ordinal];
  }
}
