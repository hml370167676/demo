package com.han.test.demo.domain.repository;

import com.han.test.demo.domain.entity.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 17:56
 */
public interface AtpCaseRepository extends JpaRepository<CaseEntity,Integer> {

}
