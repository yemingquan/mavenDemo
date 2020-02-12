package com.web.demo.web.controller;

import com.web.demo.model.user.User;
import com.web.demo.service.IUserService;
import com.web.demo.util.base.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

/**
 * @所属模块
 * @描述
 * @创建人 xiaoYe
 * @创建时间 2020/2/918:55
 * @备注
 */
@Slf4j
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private RedisTemplate redisTemplate;
//    @Autowired
//    private IUserService userService;
    @Autowired
    private RedisUtil redisUtil;


    @RequestMapping("log")
    public String login(){
       log.info("Hello");
        log.debug("debug{}","");
        log.info("info{}","");
        log.error("error{}","");
        return "base/Default";
    }

    @RequestMapping("redis")
    public String redis(){
        redisUtil.set("1","11111111",1000l);
        String a = redisUtil.get("1").toString();
        log.info("redis{} ",a.toString());
        redisTemplate.opsForValue().set("key","hello world");
        return "base/Default";
}
}
