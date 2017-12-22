package com.han.test.demo.domain.model;

import java.util.Properties;

/**
 *
 * <p>Description: 发送邮件的基本信息</p>
 * <p>Company:上海投投金融有限责任公司</p>
 * @author 陈姣姣
 * @version V1.0
 */
public class MailSenderInfo {
  /**
   *  发送邮件的服务器的IP(或主机地址)
   */
  private String mailServerHost;
  /**
   * 发送邮件的服务器的端口
   */
  private String mailServerPort = "25";
  /**
   *  发件人邮箱地址
   */
  private String fromAddress;
  /**
   * 收件人邮箱地址(收件人用,分隔)
   */
  private String toAddress;
  /**
   * 登陆邮件发送服务器的用户名
   */
  private String userName;
  /**
   * 登陆邮件发送服务器的密码
   */
  private String password;
  /**
   * 邮件主题
   */
  private String subject;
  /**
   * 邮件的文本内容
   */
  private String content;
  /**
   * 邮件附件的文件名
   */
  private String[] attachFileNames;

  public Properties getProperties() {
    Properties p = new Properties();
    p.put("mail.smtp.host", this.mailServerHost);
    p.put("mail.smtp.port", this.mailServerPort);
    p.put("mail.smtp.auth",  "true" );
    return p;
  }

  public String getMailServerHost() {
    return mailServerHost;
  }

  public void setMailServerHost(String mailServerHost) {
    this.mailServerHost = mailServerHost;
  }

  public String getMailServerPort() {
    return mailServerPort;
  }

  public void setMailServerPort(String mailServerPort) {
    this.mailServerPort = mailServerPort;
  }
  public String[] getAttachFileNames() {
    return attachFileNames;
  }

  public void setAttachFileNames(String[] fileNames) {
    this.attachFileNames = fileNames;
  }

  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getToAddress() {
    return toAddress;
  }

  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String textContent) {
    this.content = textContent;
  }

  public MailSenderInfo() {
    super();
  }

  public MailSenderInfo(String mailServerHost, String mailServerPort, String fromAddress, String toAddress,
      String userName, String password, String subject, String content, String[] attachFileNames) {
    super();
    this.mailServerHost = mailServerHost;
    this.mailServerPort = mailServerPort;
    this.fromAddress = fromAddress;
    this.toAddress = toAddress;
    this.userName = userName;
    this.password = password;
    this.subject = subject;
    this.content = content;
    this.attachFileNames = attachFileNames;
  }

}