package com.han.test.demo.domain.builder;

import com.han.test.demo.common.Constants;
import com.han.test.demo.common.encrypt.RSAHelper;
import com.han.test.demo.domain.model.MessageReq;
import com.han.test.demo.utils.DateUtils;
import java.util.Random;
import java.util.UUID;
import org.springframework.stereotype.Component;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 15:27
 */
@Component
public class MessageReqBuilder {

  public MessageReq build(String param, String instId, String businType) {
    MessageReq messageReq = new MessageReq();
    messageReq.setId(String.valueOf(new Random().nextInt(1000000000)));
    messageReq.setInstId(instId);
    messageReq.setVersion(1);
    messageReq
        .setTransTime(DateUtils.getCurrentDayByPattern(DateUtils.YYYY_MM_DD_HH_MM_SS_PATTERN_1));
    messageReq.setExtension("");
    messageReq.setSstoken(UUID.randomUUID().toString());
    messageReq.setBusinType(businType);
    String reqParmValue = RSAHelper
        .topEncrypt(param, Constants.PUB_KEY, Constants.CHARSET, messageReq.getInstId());
    messageReq.setRequestBody(reqParmValue);
    messageReq.setSignature(RSAHelper.topSign(reqParmValue, Constants.PRI_KEY, messageReq.getInstId())
        .replaceAll(" ", ""));
    return messageReq;
  }

}
