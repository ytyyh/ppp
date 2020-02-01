package com.study.zuul.aggregation;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

@Service
public class AggregationService {
  @Autowired
  private RestTemplate restTemplate;

  public User getUserById() {
    // 请求用户微服务的/{id}端点
    User user = restTemplate.getForObject("http://provider-user/userInfo/findUser", User.class);
    return  user;
  }

  public User getMovieUserByUserId() {
      User movieUser = restTemplate.getForObject("http://microservice-consumer-movie/movieInfo/user", User.class);
      return movieUser;
  }

  public User fallback(Long id) {
    User user = new User();
    user.setId(-1L);
    return user;
  }
}
