package com.han.test.demo.domain.repository;

import com.han.test.demo.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 11:16
 */
public interface  UserRepository extends JpaRepository<UserEntity,Integer> {

}
