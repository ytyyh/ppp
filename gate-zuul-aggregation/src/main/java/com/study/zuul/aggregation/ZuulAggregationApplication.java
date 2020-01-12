package com.study.zuul.aggregation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: study
 * @description:
 * @author: yyh
 * @create: 2020-01-09 10:53
 **/
@SpringBootApplication
@EnableZuulProxy
public class ZuulAggregationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulAggregationApplication.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
