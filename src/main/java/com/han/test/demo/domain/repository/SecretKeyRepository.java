package com.han.test.demo.domain.repository;

import com.han.test.demo.domain.entity.SecretKeyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 18:52
 */
public interface SecretKeyRepository extends JpaRepository<SecretKeyEntity,Integer> {

}
