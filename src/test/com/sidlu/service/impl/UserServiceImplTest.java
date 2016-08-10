package com.sidlu.service.impl;

import com.sidlu.dao.model.User;
import com.sidlu.service.UserServiceI;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ice on 2016/8/10.
 */


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserServiceImplTest {

    @Autowired
    private UserServiceI userService;

    @Test
    public void add() throws Exception {
        User user = new User();
        user.setName("t");
        user.setId(110);
        userService.add(user);
    }

}