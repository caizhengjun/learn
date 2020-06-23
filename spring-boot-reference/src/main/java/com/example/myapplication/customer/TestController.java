package com.example.myapplication.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/17 10:25 下午
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test() {
        return "Hello, SpringBoot00000!";
    }
}
