package com.han.test.demo.web.controller;

import com.han.test.demo.service.UserService;
import com.han.test.demo.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 11:37
 */
@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  @Autowired
  UserService userService;



}
