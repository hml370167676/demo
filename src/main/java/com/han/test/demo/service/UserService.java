package com.han.test.demo.service;

import com.han.test.demo.domain.entity.UserEntity;
import com.han.test.demo.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 11:18
 */
@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  /**
   * 事务管理测试 两条数据同时成功，或者同时不成功 保证数据库数据的完整性和一致性
   */
  @Transactional
  public void insertTwo() {

    UserEntity userA = new UserEntity();
    userA.setUserName("hanminglu");
    userA.setUserPassword("123413");
    userRepository.save(userA);

    System.out.println(1 / 0);

    UserEntity userB = new UserEntity();
    userB.setUserName("java");
    userB.setUserPassword("666");
    userRepository.save(userB);
  }

}
