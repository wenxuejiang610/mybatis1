package com.sidlu.service.impl;

import com.sidlu.dao.dao.UserMapper;
import com.sidlu.dao.model.User;
import com.sidlu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ice on 2016/8/10.
 */
@Service("userServiceI")
public class UserServiceImpl implements UserServiceI {
    @Resource
    private UserMapper userMapper;

    public void add(User user) {
        userMapper.insertSelective(user);
    }
}
