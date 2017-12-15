package com.han.test.demo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 17:32
 */
@Entity
@Table(name = "atp_interface")
public class AtpTestInterface extends BaseEntity {

  @Id
  @GeneratedValue

  private Integer interfaceId;
  private Integer typeId;
  private Integer systemId;
  private String  interfaceName;


  public Integer getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(Integer interfaceId) {
    this.interfaceId = interfaceId;
  }

  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  public String getInterfaceName() {
    return interfaceName;
  }

  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }


}
