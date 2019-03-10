package com.example.mpdemo.service.impl;

import com.os.china.dao.UserDao;
import com.os.china.entity.User;
import com.os.china.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 用户业务类
 * @Author: tianjun
 * @CreateTime: 2018-04-02 13:37
 * @Editor: tianjun
 * @UpdateTime: 2018-04-02 13:37
 * @Company: netposa
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Integer userInsert(User user) {
        return userDao.userInsert(user);
    }

    @Override
    public User queryById(Integer id) {
        return userDao.queryById(id);
    }
}