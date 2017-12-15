package com.han.test.demo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 10:54
 */
@RestController
public class HelloController {

  @RequestMapping(value = "/hello",method = RequestMethod.GET)
  public String say() {
    return "Hello World!";
  }
}
