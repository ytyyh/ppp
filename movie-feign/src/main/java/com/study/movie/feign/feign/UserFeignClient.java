package com.study.movie.feign.feign;

import com.study.movie.feign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: study
 * @description:
 * @author: yyh
 * @create: 2020-01-08 09:44
 **/
@FeignClient(name = "provider-user")
public interface UserFeignClient {
    @GetMapping("/userInfo/findUser")
    User findUser();
}
