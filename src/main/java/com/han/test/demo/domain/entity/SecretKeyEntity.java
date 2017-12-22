package com.han.test.demo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 18:47
 */
@Entity
@Table(name = "atp_secretkey")
public class SecretKeyEntity extends BaseEntity {

  @Id
  @GeneratedValue
  private Integer keyId;
  private String keyName;
  private String keyValue;

  public Integer getKeyId() {
    return keyId;
  }

  public void setKeyId(Integer keyId) {
    this.keyId = keyId;
  }

  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public String getKeyValue() {
    return keyValue;
  }

  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }


}
