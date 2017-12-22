package com.han.test.demo.domain.model;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 14:55
 */
public class MessageHead {

  @XStreamAsAttribute
  protected String id;
  protected int version;
  protected String instId;
  protected String transTime;
  protected String extension;
  protected String sstoken;
  protected String businType;
  protected String signature;
  @XStreamOmitField
  protected Object body = null;

  public MessageHead() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  public String getInstId() {
    return instId;
  }

  public void setInstId(String instId) {
    this.instId = instId;
  }

  public String getTransTime() {
    return transTime;
  }

  public void setTransTime(String transTime) {
    this.transTime = transTime;
  }

  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public String getSstoken() {
    return sstoken;
  }

  public void setSstoken(String sstoken) {
    this.sstoken = sstoken;
  }

  public String getBusinType() {
    return businType;
  }

  public void setBusinType(String businType) {
    this.businType = businType;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public Object getBody() {
    return body;
  }

  public void setBody(Object body) {
    this.body = body;
  }
}
