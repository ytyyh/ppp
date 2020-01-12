package com.study.provider.user.controller;

import com.study.provider.user.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: study
 * @description:
 * @author: yyh
 * @create: 2020-01-08 09:03
 **/
@RestController
@RequestMapping("/userInfo")
public class UserController {
    @GetMapping("/findUser")
    public User findUser(){
        User user = new User();
        user.setId(new Long(111));
        user.setAge(new Integer(18));
        user.setName("翠花");
        return user;
    }
}
