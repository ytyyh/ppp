package com.study.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: study
 * @description:
 * @author: yyh
 * @create: 2020-01-08 16:41
 **/
@SpringBootApplication
@EnableZuulProxy
public class GateZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateZuulApplication.class,args);
    }
}
