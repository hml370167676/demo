package com.han.test.demo.service.intf;

import com.han.test.demo.domain.entity.CaseEntity;

/**
 * <p>Description:</p>
 *
 * @author minglu @toutoujinrong.com
 * @date 2017 /12/20 15:05
 */
public interface InterfaceCaseManagerService {

  /**
   * Add interface case.
   *
   * @param intfCase the intf case
   */
  void addInterfaceCase(CaseEntity intfCase);

  /**
   * Delete interface case.
   *
   * @param caseId the case id
   */
  void deleteInterfaceCase(Integer caseId);

  /**
   * Update interface case.
   *
   * @param intfCase the intf case
   */
  void updateInterfaceCase(CaseEntity intfCase);

  /**
   * Query interface case case entity.
   *
   * @param caseId the case id
   * @return the case entity
   */
  CaseEntity queryInterfaceCase(Integer caseId);

  /**
   * Run case case entity.
   *
   * @param caseId the case id
   * @return the case entity
   */
  CaseEntity runCase(Integer caseId);


}
