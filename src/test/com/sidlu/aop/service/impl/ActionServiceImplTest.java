package com.sidlu.aop.service.impl;

import com.sidlu.aop.service.ActionServiceI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by ice on 2016/8/13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ActionServiceImplTest {
    @Autowired
    private ActionServiceI actionServiceI;

    @Test
    public void print() throws Exception {
        actionServiceI.print();
    }
}