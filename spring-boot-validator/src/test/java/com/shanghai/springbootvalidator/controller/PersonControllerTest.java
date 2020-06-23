package com.shanghai.springbootvalidator.controller;

import com.shanghai.springbootvalidator.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/23 11:41 上午
 */
@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_get_person_correctly() {

        Person person = new Person();
        person.setName("SnailClimb");
        person.setSex("Man");
        person.setClassId("2131231");
        person.setEmail("Snailclimb@qq.com");
    }
}