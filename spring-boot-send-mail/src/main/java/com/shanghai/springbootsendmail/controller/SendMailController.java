package com.shanghai.springbootsendmail.controller;

import com.shanghai.springbootsendmail.component.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/18 9:43 下午
 */
@RestController
@RequestMapping("mail")
public class SendMailController {

    @Autowired
    SendMail sendMail;

    @GetMapping
    public String send() {
        sendMail.sendSimpleMail();
        return "邮件发送成功!";
    }
}
