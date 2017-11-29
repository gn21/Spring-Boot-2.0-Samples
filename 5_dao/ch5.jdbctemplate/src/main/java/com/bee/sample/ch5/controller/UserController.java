package com.bee.sample.ch5.controller;

import com.bee.sample.ch5.entity.User;
import com.bee.sample.ch5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
    public User say(@PathVariable Long id) {
        return userService.geUserById(id);
    }
}
