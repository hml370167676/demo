package com.han.test.demo.domain.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 17:11
 */
@MappedSuperclass
public class BaseEntity {

  private Date creatTime;
  private Date updateTime;

  public Date getCreatTime() {
    return creatTime;
  }

  public void setCreatTime(Date creatTime) {
    this.creatTime = creatTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}
