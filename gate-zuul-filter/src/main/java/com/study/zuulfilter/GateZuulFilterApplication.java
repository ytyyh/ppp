package com.study.zuulfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @program: study
 * @description:Zuul过滤器
 * @author: yyh
 * @create: 2020-01-29 21:37
 **/
@SpringBootApplication
@EnableZuulProxy
public class GateZuulFilterApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateZuulFilterApplication.class,args);
    }

    @Bean
    public PreRequestLogFilter preRequestLogFilter(){
        return new PreRequestLogFilter();
    }
}


