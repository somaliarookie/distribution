package com.distribution.lock;


import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisLock {



    @RequestMapping("/redislock")
    @ResponseBody
    String redislock() {
        return "Hello World!";
    }




}



