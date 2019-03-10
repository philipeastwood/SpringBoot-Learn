package com.example.mpdemo.controller;

import com.os.china.entity.User;
import com.os.china.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 用户接口类
 * @Author: tianjun
 * @CreateTime: 2018-04-02 13:42
 * @Editor: tianjun
 * @UpdateTime: 2018-04-02 13:42
 * @Company: netposa
 */
@RestController
@RequestMapping("/tt")
public class MybatisController {
    @Autowired
    private IUserService userService;

    @PostMapping("/userInsert")
    public Integer userInsert(User user){
        return userService.userInsert(user);
    }

    @PostMapping("/queryById")
    public User queryById(Integer id){
        return userService.queryById(id);
    }
}