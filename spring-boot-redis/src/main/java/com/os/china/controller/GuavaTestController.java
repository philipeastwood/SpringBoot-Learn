package com.os.china.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuavaTestController {

    @RequestMapping("/test")
    //key是使用spEl取得参数，根据参数name作为缓存的key，value是使用的缓存list中的那个，具体看配置类
    @Cacheable(value = "GuavaCacheAll", key = "#name")
    public String tt(String name) {
        System.out.println("in tt");
        return "name:" + name;
    }
}
