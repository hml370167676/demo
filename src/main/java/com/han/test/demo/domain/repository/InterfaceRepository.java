package com.han.test.demo.domain.repository;

import com.han.test.demo.domain.entity.AtpTestInterface;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 17:54
 */
public interface InterfaceRepository extends JpaRepository<AtpTestInterface,Integer> {

}
