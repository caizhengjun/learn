package com.shanghai.springbootvalidator.controller;

import com.shanghai.springbootvalidator.bean.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/23 11:05 上午
 */
@RestController
@RequestMapping("api")
public class PersonController {

    @PostMapping("/person")
    public ResponseEntity<@Valid Person> getPerson(@RequestBody @Valid Person person) {
        return ResponseEntity.ok().body(person);
    }
}
