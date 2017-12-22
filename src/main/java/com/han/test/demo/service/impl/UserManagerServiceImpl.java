package com.han.test.demo.service.impl;

import com.han.test.demo.domain.entity.UserEntity;
import com.han.test.demo.domain.repository.UserRepository;
import com.han.test.demo.service.intf.UserManagerService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/20 14:18
 */
@Service
public class UserManagerServiceImpl implements UserManagerService {

  private static final Logger logger = LoggerFactory.getLogger(UserManagerServiceImpl.class);

  @Resource
  public UserRepository userRepository;

  @Override
  public void addUser(UserEntity user) {

  }

  @Override
  public void deletetUser(int userId) {

  }

  @Override
  public void updateUser(UserEntity user) {

  }

  @Override
  public UserEntity queryUser(int userId, String userName) {

    return null;
  }

}
