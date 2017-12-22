package com.han.test.demo.domain.repository;

import com.han.test.demo.domain.entity.AtpInterfaceParameter;
import org.hibernate.validator.internal.engine.resolver.JPATraversableResolver;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 11:36
 */
public interface InterfaceParameterRepository extends JpaRepository<AtpInterfaceParameter,Integer> {

}
