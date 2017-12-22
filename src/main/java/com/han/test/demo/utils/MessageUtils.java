package com.han.test.demo.utils;

import com.han.test.demo.common.Constants;
import com.han.test.demo.common.encrypt.RSAHelper;
import com.han.test.demo.domain.model.MessageReq;
import com.han.test.demo.domain.model.MessageResp;
import com.thoughtworks.xstream.XStream;
import java.lang.reflect.InvocationTargetException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 17:34
 */
public class MessageUtils {

  private static final Logger logger = LoggerFactory.getLogger(MessageUtils.class);
  private MessageReq messageReq;
  private MessageResp messageResp;

  /**
   * * 方法描述： 获取消息体对象
   */
  public <T> T getBody(Object object) {
    if (object.getClass().equals(MessageReq.class)) {
      BeanUtils.copyProperties(messageReq, object);
      //验证签名
      if (!RSAHelper
          .topVerify(messageReq.getRequestBody(), messageReq.getSignature(), Constants.PUB_KEY,
              messageReq.getInstId())) {
        logger.error("校验签名失败：功能号【{}】,机构标识【{}】", messageReq.getBusinType(), messageReq.getInstId());
        return null;
      }
      //解密数据
      String plainBody = RSAHelper
          .topDecrypt(messageReq.getRequestBody(), Constants.PRI_KEY, Constants.CHARSET,
              messageReq.getInstId());
      logger.info("请求报文体明文：{}", plainBody);
      //将数据反序列化为对象
       messageReq.setBody(getXStream(MessageReq.class, "Request").fromXML(plainBody));
      return (T) messageReq.getBody();
    } else {
      if (object.getClass().equals(MessageResp.class)) {
        BeanUtils.copyProperties(messageResp, object);
        //验证签名
        if (!RSAHelper
            .topVerify(messageResp.getResponseBody(), messageResp.getSignature(), Constants.PUB_KEY,
                messageResp.getInstId())) {
          logger.error("校验签名失败：功能号【{}】,机构标识【{}】", messageResp.getBusinType(),
              messageResp.getInstId());
          return null;
        }
        //解密数据
        String plainBody = RSAHelper
            .topDecrypt(messageResp.getResponseBody(), Constants.PRI_KEY, Constants.CHARSET,
                messageResp.getInstId());
        logger.info("响应报文体明文：{}", plainBody);
        //将数据反序列化为对象
        messageResp.setBody(getXStream(MessageReq.class, "Request").fromXML(plainBody));
        return (T) messageResp.getBody();
      }
    }
    return null;
  }

  public static XStream getXStream(Class<?> clazz, String rootName) {

    XStream xStream = new XStream();
    xStream.autodetectAnnotations(true);
    xStream.alias(rootName, clazz);
    return xStream;
  }

}
