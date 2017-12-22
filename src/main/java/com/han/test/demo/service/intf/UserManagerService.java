package com.han.test.demo.service.intf;

import com.han.test.demo.domain.entity.UserEntity;

/**
 * <p>Description:</p>
 *
 * @author minglu @toutoujinrong.com
 * @date 2017 /12/20 14:10
 */
public interface UserManagerService {

  /**
   * 新增用户信息
   *
   * @param user the user
   */
  void addUser(UserEntity user);

  /**
   * 删除用户信息
   *
   * @param userId the user id
   */
  void deletetUser(int userId);

  /**
   * 修改用户信息
   *
   * @param user the user
   */
  void updateUser(UserEntity user);

  /**
   * 查询用户信息
   *
   * @param userId the user id
   * @param userName the user name
   */
  UserEntity queryUser(int userId,String userName);


}
