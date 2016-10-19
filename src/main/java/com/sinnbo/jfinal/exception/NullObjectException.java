package com.sinnbo.jfinal.exception;

public class NullObjectException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  public NullObjectException() {}
  
  public NullObjectException(String msg) {
    super(msg);
  }
}
