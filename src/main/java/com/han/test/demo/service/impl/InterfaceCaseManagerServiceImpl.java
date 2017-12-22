package com.han.test.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.han.test.demo.domain.entity.CaseEntity;
import com.han.test.demo.domain.repository.AtpCaseRepository;
import com.han.test.demo.service.intf.InterfaceCaseManagerService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/20 15:12
 */
@Service
public class InterfaceCaseManagerServiceImpl implements InterfaceCaseManagerService {

  private static final Logger logger = LoggerFactory
      .getLogger(InterfaceCaseManagerServiceImpl.class);

  @Resource
  public AtpCaseRepository atpCaseRepository;

  @Override
  public void addInterfaceCase(CaseEntity intfCase) {
    Assert.isNull(intfCase, "Case 不能为空");
    String json = JSON.toJSONString(intfCase);


  }

  @Override
  public void deleteInterfaceCase(Integer caseId) {

  }

  @Override
  public void updateInterfaceCase(CaseEntity intfCase) {

  }

  @Override
  public CaseEntity queryInterfaceCase(Integer caseId) {
    return null;
  }

  @Override
  public CaseEntity runCase(Integer caseId) {
    return null;
  }
}
