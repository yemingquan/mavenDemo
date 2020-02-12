package com.web.demo.web.controller;

/**
 * @所属模块
 * @描述
 * @创建人 yemq
 * @创建时间 2020/2/2
 * @备注
 */
import com.web.demo.model.user.User;
import com.web.demo.service.IUserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("Hello");
        log.debug("debug{}","");
        return "base/Default";
    }

    @RequestMapping("find")
    public String find(Integer id){
        User user = userService.findById(id);
        log.debug("find{}",user.toString());
        return "base/Default";
    }
}
