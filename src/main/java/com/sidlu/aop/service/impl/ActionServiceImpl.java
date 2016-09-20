package com.sidlu.aop.service.impl;

import com.sidlu.aop.service.ActionServiceI;
import org.springframework.stereotype.Service;

/**
 * Created by ice on 2016/8/13.
 */
@Service
public class ActionServiceImpl implements ActionServiceI {
    @Override
    public void print() {
        System.out.println("【ActionServiceImpl.print()】");

    }

    @Override
    public String get() {
        return null;
    }

    @Override
    public void set(String string) {

    }
}
