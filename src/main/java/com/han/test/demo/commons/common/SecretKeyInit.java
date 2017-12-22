package com.han.test.demo.commons.common;

import com.han.test.demo.commons.encrypt.SecretKeyManager;
import com.han.test.demo.domain.entity.SecretKeyEntity;
import com.han.test.demo.domain.repository.SecretKeyRepository;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/22 18:44
 */
@Component
@Order(value = 1000000)
public class SecretKeyInit implements CommandLineRunner {

  private static final Logger logger = LoggerFactory.getLogger(SecretKeyInit.class);

  @Resource
  private SecretKeyRepository secretKeyRepository;

  private void initSecretKey() {
    List<SecretKeyEntity> skeList = secretKeyRepository.findAll();
    for (SecretKeyEntity ske : skeList) {
      SecretKeyManager.putSecreKey(ske.getKeyName(), ske.getKeyValue());
      logger.info("商户密钥名称:{}，密钥内容：{}", ske.getKeyName(), ske.getKeyValue());
    }

  }


  @Override
  public void run(String... args) throws Exception {
    try {
      initSecretKey();
    } catch (Exception e) {
      logger.error("初始化商户密钥异常",e);
    }
  }
}
