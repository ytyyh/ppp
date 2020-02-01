package com.study.zuul.aggregation;

import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import rx.Observable;
import rx.Observer;

import java.util.HashMap;

@RestController
public class AggregationController {
  public static final Logger LOGGER = LoggerFactory.getLogger(ZuulAggregationApplication.class);

  @Autowired
  private AggregationService aggregationService;

  @GetMapping("/aggregate")
  public HashMap<String, User> aggregate() {
    HashMap<String, User> result = this.aggregateObservable();
    return result;
  }

  public HashMap<String, User> aggregateObservable() {
    User user = this.aggregationService.getUserById();
    User movieUser = this.aggregationService.getMovieUserByUserId();
    HashMap<String, User> map = Maps.newHashMap();
    map.put("user", user);
    map.put("movieUser", movieUser);
    return map;
  }

}