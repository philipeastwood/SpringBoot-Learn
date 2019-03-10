package com.os.china.service;

import com.os.china.entity.User;

/**
 * @Description: 用户业务接口
 * @Author: tianjun
 * @CreateTime: 2018-04-02 13:38
 * @Editor: tianjun
 * @UpdateTime: 2018-04-02 13:38
 * @Company: netposa
 */
public interface IUserService {
    Integer userInsert(User user);

    User queryById(Integer id);
}