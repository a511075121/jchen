package com.sinnbo.jfinal.config.xbus.cache;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.zbus.broker.Broker;
import org.zbus.mq.Consumer;
import org.zbus.mq.Consumer.ConsumerHandler;
import org.zbus.mq.Protocol.MqMode;
import org.zbus.net.http.Message;

import com.sinnbo.jfinal.common.enumwork.XbusOperater;
import com.sinnbo.jfinal.config.xbus.cache.mq.ZbusMq;
import com.sinnbo.jfinal.service.SysControllerService;
import com.sinnbo.jfinal.service.SysMenuService;
import com.sinnbo.jfinal.service.UserService;

public class XbusConsumer {
  private static final Logger logger = Logger.getLogger(XbusConsumer.class);
  private static Consumer consumer;
  
  public static void init(Broker broker) {
    logger.info("zbus||消息处理服务初始化中...");
    consumer = new Consumer(broker, ZbusMq.CACHE.getNote(), MqMode.PubSub);
    consumer.setTopic("zbus-cache");
    try {
      consumer.onMessage(new ConsumerHandler() {
        @Override
        public void handle(Message msg, Consumer consumer) throws IOException {
          String id = msg.getHead(Constant.MSG_ID, "");
          String action = msg.getHead(Constant.MSG_ACTION, "");
          String className = msg.getHead(Constant.MSG_CLASSNAME, "");
          logger.debug(msg.toString());
          
          if (XbusOperater.UPDATE.name().equals(action) || XbusOperater.DELETE.name().equals(action)) {
            switch (className) {
              case Constant.CLASS_BASIC_USER:
                UserService.service.evitByIdFromCache(id);
                logger.info("已从缓存移除"+Constant.CLASS_BASIC_USER+"类中id="+id+"的元素");
                break;
              case Constant.CLASS_SYS_MENU:
                SysMenuService.service.evitByIdFromCache(id);
                logger.info("已从缓存移除"+Constant.CLASS_SYS_MENU+"类中id="+id+"的元素");
                break;
              case Constant.CLASS_SYS_CONTROLLER:
                SysControllerService.service.evitByIdFromCache(id);
                logger.info("已从缓存移除"+Constant.CLASS_SYS_CONTROLLER+"类中id="+id+"的元素");
                break;
              default:
                logger.error("移除"+className+"类中id="+id+"的元素失败：不存在的类名");
                break;
            }
          }
        }
      });
      consumer.start();
      logger.info("zbus||消息处理服务初始化成功");
    } catch (IOException e) {
      logger.error("zbus||消息处理失败："+e.getMessage());
    }
  }
  
}
