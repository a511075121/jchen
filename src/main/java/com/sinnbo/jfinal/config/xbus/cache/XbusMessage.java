package com.sinnbo.jfinal.config.xbus.cache;

import org.zbus.net.http.Message;

public class XbusMessage {
  public static void sendMessage(String id, String action, String className) {
    Message message = new Message();
    message.setTopic("zbus-cache");
    message.setHead(Constant.MSG_ID, id);
    message.setHead(Constant.MSG_ACTION, action);
    message.setHead(Constant.MSG_CLASSNAME, className);
    XbusProducor.sendA(message);
  }
}
