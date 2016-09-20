package com.sidlu.dao.dao;

import com.sidlu.dao.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by ice on 2016/8/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-mybatis.xml","classpath:mybatis-config.xml"})
public class EmpMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertSelective() throws Exception {
        User user = new User();
        user.setName("leaf");
        userMapper.insertSelective(user);
    }
}