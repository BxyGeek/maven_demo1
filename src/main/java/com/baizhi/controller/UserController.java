package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("queryAll")
    public String test(HttpSession session) {
        List<User> users = userService.queryAll();
        session.setAttribute("users", users);

        //this is first uodate on github
        System.out.println("I am bxy");
        return "index";
    }
}
