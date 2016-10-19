package com.sinnbo.jfinal.config.xbus.cache;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.zbus.broker.Broker;
import org.zbus.broker.BrokerConfig;
import org.zbus.broker.JvmBroker;
import org.zbus.broker.SingleBroker;

import com.jfinal.kit.PropKit;
import com.jfinal.plugin.IPlugin;

public class XbusPlugin implements IPlugin {
  private static final Logger logger = Logger.getLogger(XbusPlugin.class);
  private static Broker broker;
  @Override
  public boolean start() {
    BrokerConfig config = new BrokerConfig();
    config.setBrokerAddress(PropKit.get("zbus.server", "127.0.0.1:15555"));
    try {
      logger.info("zbus||初始化中...");
      if (PropKit.getBoolean("model.dev")) {
        broker = new JvmBroker();
        logger.info("zbus||使用内部jvm初始化...");
      } else {
        broker = new SingleBroker(config);
        logger.info("zbus||使用外部zbus初始化...");
      }
      XbusProducor.init(broker);
      XbusConsumer.init(broker);
      logger.info("zbus||初始化完成");
      return true;
    } catch (IOException e) {
      logger.error(e.getMessage());
      return false;
    }
  }

  @Override
  public boolean stop() {
    return true;
  }

  public static Broker getBroker() {
    return broker;
  }
  
}
