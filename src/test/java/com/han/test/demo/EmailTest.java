package com.han.test.demo;

import java.text.SimpleDateFormat;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 2017/12/15 16:00
 */
@SpringBootTest
@TestExecutionListeners(listeners = MockitoTestExecutionListener.class)
public class EmailTest extends AbstractTestNGSpringContextTests {

  @Autowired
  private JavaMailSender javaMailSender;

  @Test
  public void testSend() {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom("minglu@toutoujinrong.com");//发送者
    message.setTo("guishuai@toutoujinrong.com");//接受者
    message.setSubject("测试邮件（邮件主题）");//邮件主题
    message.setText("这是邮件内容");//邮件内容
    javaMailSender.send(message);//发送邮件
  }

  @Test
  public void testSendHtml() {

    MimeMessage message = null;
    try {
      message = javaMailSender.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(message, true);
      helper.setFrom("minglu@toutoujinrong.com");
      helper.setTo("guishuai@toutoujinrong.com");
      helper.setSubject("标题：发送Html内容");

      StringBuffer sb = new StringBuffer();

    } catch (MessagingException e) {
      e.printStackTrace();
    }

  }
}
