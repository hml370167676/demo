/**   
 * <p>Title: SendMailUtil.java</p>
 * @Package com.uusoft.fundbase.sendMail 
 * <p>Description: </p> 
 * <p>Company:上海投投金融信息服务有限公司</p>
 * @author 陈姣姣
 * @since 2016年8月24日 下午3:56:01 
 * @version V1.0   
 */
package com.han.test.demo.utils;

import com.han.test.demo.domain.model.MailSenderInfo;
import java.util.Date;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/** 
 * <p>Description: </p> 
 * @author 陈姣姣
 * @version V1.0 
 */
public class SendMailUtil {
    private static Logger log= LoggerFactory.getLogger(SendMailUtil.class);

  
    public static boolean sendTextMail(MailSenderInfo mailInfo) {
        if(mailInfo == null){
            log.info("邮件发送失败...邮件信息实体为空");
            return false;
        }
        String userName = mailInfo.getUserName();
        String fromAddress = mailInfo.getFromAddress();
        log.info("邮件发送开始...userName:{},fromAddress:{}",userName,fromAddress);
        try {
            MyAuthenticator authenticator = null;
            Properties pro = mailInfo.getProperties();
            authenticator = new MyAuthenticator(userName, mailInfo.getPassword());
           
            // 根据邮件会话属性和密码验证器构造一个发送邮件的session
            Session sendMailSession = Session.getDefaultInstance(pro,authenticator);
            // 根据session创建一个邮件消息
            Message mailMessage = new MimeMessage(sendMailSession);
            // 创建邮件发送者地址
            Address from = new InternetAddress(mailInfo.getFromAddress());
            // 设置邮件消息的发送者
            mailMessage.setFrom(from);
            InternetAddress[] iaToList = InternetAddress.parse(mailInfo.getToAddress());
            mailMessage.setRecipients(Message.RecipientType.TO, iaToList);
            // 设置邮件消息的主题
            mailMessage.setSubject(mailInfo.getSubject());
            // 设置邮件消息发送的时间
            mailMessage.setSentDate(new Date());
            // 设置邮件消息的主要内容
            String mailContent = mailInfo.getContent();
            mailMessage.setText(mailContent);
            // 发送邮件
            Transport.send(mailMessage);
            log.info("邮件发送结束...userName:{},fromAddress:{}",userName,fromAddress);
            return true;
        } catch (MessagingException ex) {
            log.error("邮件发送结束...userName:{},fromAddress:{}",userName,fromAddress,ex);
        }
        return false;
    }
    
     public static class MyAuthenticator extends Authenticator {
        String userName = null;
        String password = null;

        public MyAuthenticator() {
        }

        public MyAuthenticator(String username, String password) {
            this.userName = username;
            this.password = password;
        }

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(userName, password);
        }
    }

}
