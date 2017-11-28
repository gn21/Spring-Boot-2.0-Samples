package com.bee.sample.ch1.controller;

import com.bee.sample.ch1.annotation.Function;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @RequestMapping("/1")
    @Function()
    public String say(String name) {
        return "hello " + name;
    }
}
