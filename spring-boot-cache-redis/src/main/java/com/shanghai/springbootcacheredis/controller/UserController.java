package com.shanghai.springbootcacheredis.controller;

import com.shanghai.springbootcacheredis.bean.User;
import com.shanghai.springbootcacheredis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/22 5:28 下午
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return this.userService.getUser(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody User user) {
        this.userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        this.userService.deleteUser(id);
    }
}
