package com.han.test.demo.web.filter;


import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 14:50
 */
@WebFilter(filterName = "DemoFilter",urlPatterns = "/*")
public class DemoFilter implements Filter {

  private final static Logger logger = LoggerFactory.getLogger(DemoFilter.class);

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    logger.info("==>DemoFilter启动");

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    logger.info("==>DemoFilter拦截请求");
    filterChain.doFilter(servletRequest,servletResponse);

  }

  @Override
  public void destroy() {

  }
}
