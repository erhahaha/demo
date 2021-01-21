package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserServiceImpl {

    @Autowired(required = false)
    private UserMapper userMapper;
    /**
     * 登录
     * @param user 用户名和密码
     * @return Result
     */
    public CommonResult login(User user) {
        User user1= userMapper.login(user);
        if (user1 != null)
            return CommonResult.success(user.getName());
        else
            return CommonResult.validateFailed();

    }
}