package com.sidlu.dao.dao;

import com.sidlu.dao.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


/**
 * Created by ice on 2016/8/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:spring-mybatis.xml"})
public class UserMapperTest {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertSelective() throws Exception {
        User user = new User();
        user.setName("aaaa");
        userMapper.insertSelective(user);
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        assertEquals("test1",userMapper.selectByPrimaryKey(10).getName());
    }

    @Test
    public void insertTest1() throws Exception {
        User user = new User();
        user.setName("test1");
       userMapper.insert(user);

    }
}