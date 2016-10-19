package com.sinnbo.jfinal.config.xbus.cache;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.zbus.broker.Broker;
import org.zbus.mq.Producer;
import org.zbus.mq.Protocol.MqMode;
import org.zbus.net.Sync.ResultCallback;
import org.zbus.net.http.Message;

import com.sinnbo.jfinal.config.xbus.cache.mq.ZbusMq;

public class XbusProducor {
  private static final Logger logger = Logger.getLogger(XbusProducor.class);
  private static Producer producer;
  
  public static void init(Broker broker) {
    logger.info("zbus||消息发送服务初始化中...");
    producer = new Producer(broker, ZbusMq.CACHE.getNote(), MqMode.PubSub);
    try {
      producer.createMQ();
    } catch (IOException e) {
      logger.error(e.getMessage());
    } catch (InterruptedException e) {
      logger.error(e.getMessage());
    }
    logger.info("zbus||消息发送服务初始化成功");
  }
  
  public static void sendAsync(Message msg) {
    try {
      producer.sendAsync(msg, new ResultCallback<Message>() {
        @Override
        public void onReturn(Message result) {
            if (!"200".equals(result.getStatus())) {
              logger.error(result.toString());
            }
        }
      });
    } catch (IOException e) {
      logger.error("zbus||消息发送失败："+e.getMessage());
    }
  }
  
  public static void sendSycn(Message msg) {
    try {
      producer.sendSync(msg);
    } catch (IOException e) {
      logger.error("zbus||消息发送失败："+e.getMessage());
    } catch (InterruptedException e) {
      logger.error("zbus||消息发送失败："+e.getMessage());
    }
  }
  
  /**
   * 发送异步消息
   */
  public static void sendA(Message msg) {
    sendAsync(msg);
  }
  
  /**
   * 发送同步消息
   */
  public static void sendS(Message msg) {
    sendSycn(msg);
  }
}
