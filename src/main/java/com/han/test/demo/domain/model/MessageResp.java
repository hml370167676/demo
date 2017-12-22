package com.han.test.demo.domain.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 15:09
 */
@XmlRootElement(name = "Message")
@XStreamAlias("Message")
public class MessageResp extends MessageHead implements Serializable {

  @XmlElement
  private String responseBody;

  public MessageResp() {
  }

  public MessageResp(String id, int version, String instId, String transTime,
      String extension, String sstoken, String businType,
      String responseBody, String signature)
  {

    this.id = id;
    this.version = version;
    this.instId = instId;
    this.transTime = transTime;
    this.extension = extension;
    this.sstoken = sstoken;
    this.businType = businType;
    this.responseBody = responseBody;
    this.signature = signature;

  }

  public String getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }
}
