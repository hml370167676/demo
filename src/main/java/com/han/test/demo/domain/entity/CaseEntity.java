package com.han.test.demo.domain.entity;

import com.fasterxml.jackson.databind.ser.Serializers.Base;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 17:26
 */
@Entity
@Table(name = "atp_case")
public class CaseEntity extends BaseEntity {

  @Id
  @GeneratedValue
  private Integer caseId;
  private Integer InterfaceId;
  private Integer userId;
  private String caseRequest;
  private String caseResponse;
  private String caseExpect;

  public Integer getCaseId() {
    return caseId;
  }

  public void setCaseId(Integer caseId) {
    this.caseId = caseId;
  }

  public Integer getInterfaceId() {
    return InterfaceId;
  }

  public void setInterfaceId(Integer interfaceId) {
    InterfaceId = interfaceId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getCaseRequest() {
    return caseRequest;
  }

  public void setCaseRequest(String caseRequest) {
    this.caseRequest = caseRequest;
  }

  public String getCaseResponse() {
    return caseResponse;
  }

  public void setCaseResponse(String caseResponse) {
    this.caseResponse = caseResponse;
  }

  public String getCaseExpect() {
    return caseExpect;
  }

  public void setCaseExpect(String caseExpect) {
    this.caseExpect = caseExpect;
  }
}
