package com.han.test.demo.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 15:00
 */
@WebListener
public class DemoListener implements ServletContextListener {

  private final static Logger logger = LoggerFactory.getLogger(DemoListener.class);

  @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {

    logger.info("==>DemoListener启动");

  }

  @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {

  }
}
