package com.han.test.demo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 11:23
 */
@Entity
@Table(name = "atp_parameter")
public class AtpInterfaceParameter extends BaseEntity {

  @Id
  @GeneratedValue
  private Integer parameterId;
  private Integer interfaceId;
  //中文域名
  private String parameterName;
  //英文域名
  private String parameter;
  //说明
  private String parameterDesciption;
  //类型
  private String dataType;

  public Integer getParameterId() {
    return parameterId;
  }

  public void setParameterId(Integer parameterId) {
    this.parameterId = parameterId;
  }

  public Integer getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(Integer interfaceId) {
    this.interfaceId = interfaceId;
  }

  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public String getParameterDesciption() {
    return parameterDesciption;
  }

  public void setParameterDesciption(String parameterDesciption) {
    this.parameterDesciption = parameterDesciption;
  }

  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }
}
