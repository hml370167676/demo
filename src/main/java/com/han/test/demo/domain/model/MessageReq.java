package com.han.test.demo.domain.model;

import com.han.test.demo.common.Constants;
import com.han.test.demo.common.encrypt.RSAHelper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 15:01
 */
@XmlRootElement(name = "Message")
@XStreamAlias("Message")
public class MessageReq extends MessageHead implements Serializable {

  private static Logger logger = LoggerFactory.getLogger(MessageReq.class);
  @XmlElement
  private String requestBody;

  public MessageReq() {
  }

  public MessageReq(String id, int version, String instId, String transTime,
      String extension, String sstoken, String businType,
      String requestBody, String signature) {

    this.id = id;
    this.version = version;
    this.instId = instId;
    this.transTime = transTime;
    this.extension = extension;
    this.sstoken = sstoken;
    this.businType = businType;
    this.requestBody = requestBody;
    this.signature = signature;
  }

  public String getRequestBody() {
    return requestBody;
  }

  public void setRequestBody(String requestBody) {
    this.requestBody = requestBody;
  }


}
