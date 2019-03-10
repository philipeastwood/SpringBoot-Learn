package com.os.china.dao;

import com.os.china.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 用户相关操作
 * @Author: tianjun
 * @CreateTime: 2018-04-02 13:25
 * @Editor: tianjun
 * @UpdateTime: 2018-04-02 13:25
 * @Company: netposa
 */
@Mapper
public interface UserDao {
    Integer userInsert(@Param("user") User user);

    User queryById(@Param("id") Integer id);
}