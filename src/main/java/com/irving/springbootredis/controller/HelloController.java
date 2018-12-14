package com.irving.springbootredis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Development IDE: IntelliJ IDEA
 * Author: irving
 * Project Name: springboot-redis
 * Date: 2018-12-14
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
