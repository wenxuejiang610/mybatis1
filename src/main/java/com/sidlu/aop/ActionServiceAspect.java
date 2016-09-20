package com.sidlu.aop;

/**
 * Created by ice on 2016/8/5.
 */

import org.springframework.stereotype.Component;

/**
 *
 */

@Component
public class ActionServiceAspect {
    /**
     * 方法调用之前执行
     */
    public void myBefore() {
        System.out.println("*********方法调用之前*************");

    }

    /**
     * 方法调用之后执行
     */
    public void myAfter() {
        System.out.println("***********方法调用之后*********");
    }
}
