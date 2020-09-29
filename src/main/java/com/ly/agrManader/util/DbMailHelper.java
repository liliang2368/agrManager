package com.ly.agrManader.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DbMailHelper {

    @Value("${spring.mail.username}")
    private  String from; //邮箱验证

    @Autowired
    private  JavaMailSender mailSender;

     Logger  logger = LoggerFactory.getLogger(this.getClass());

    public  void sendVertifyCode(String to, String title, String content){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from); //发送人
        message.setTo(to);   //收件人
        message.setSubject(title);  //邮件名
        message.setText(content);   //邮件内容（验证码）
        mailSender.send(message);
        logger.info("已经发送");
    }
    //随机生成验证码
    public  String verifyCode(){
        String str = "";
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random random = new Random();
        for (int i = 0; i <6; i++){
            char num = ch[random.nextInt(ch.length)];
            str += num;
        }
        return str;
    }




}
