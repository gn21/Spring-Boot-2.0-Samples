package com.bee.sample.ch2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @RequestMapping("/sayhello.html")
    public String say() {
        return "hello world";
    }

    @RequestMapping("/say.html")
    public String say(String name) {
        return "hello world " + name;
    }
}
