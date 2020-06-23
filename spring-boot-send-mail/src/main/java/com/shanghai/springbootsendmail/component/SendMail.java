package com.shanghai.springbootsendmail.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/18 9:35 下午
 */
@Component
public class SendMail {

    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleMail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("1131898792@qq.com");
        simpleMailMessage.setTo("caizhengjun01@gmail.com","804213673@qq.com");
        simpleMailMessage.setSubject("Happy New Year");
        simpleMailMessage.setText("新年快乐!");
        mailSender.send(simpleMailMessage);
    }
}
