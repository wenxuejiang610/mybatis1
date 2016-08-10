package com.sidlu.controller;

import com.sidlu.dao.model.User;
import com.sidlu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ice on 2016/8/8.
 */

@Controller
@RequestMapping("my")
public class MybatisController {
    @Autowired
    private UserServiceI userServiceI;
    private  static int a = 100;

    @RequestMapping("")
    public String root(HttpServletRequest request) {
        System.out.println("controller开始：");
        System.out.println("***********************");
        User user = new User();
        user.setId(a++);
        user.setName("test1");
        userServiceI.add(user);
        request.setAttribute("user",user);
        System.out.println("**********结束*************");
        return "/pages/reglog/test1.jsp";
    }
}
