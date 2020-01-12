package com.study.movie.feign.controller;

import com.study.movie.feign.entity.User;
import com.study.movie.feign.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: study
 * @description:
 * @author: yyh
 * @create: 2020-01-08 10:32
 **/
@RestController
@RequestMapping("/movieInfo")
public class MovieController
{
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/getUser")
    public User getUser(){
        return userFeignClient.findUser();
    }
}
