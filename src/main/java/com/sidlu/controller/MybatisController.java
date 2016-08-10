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

    @RequestMapping("")
    public String root(HttpServletRequest request) {
        System.out.println("**********开始*************");
        User user = new User();
        user.setName("test1");
        userServiceI.add(user);
        request.setAttribute("user",user);
        return "/pages/reglog/test1.jsp";
    }
}
