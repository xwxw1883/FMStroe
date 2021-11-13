package com.cn.fmstroe.controller;

import com.cn.fmstroe.bean.User;
import com.cn.fmstroe.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
//url地址 IP：端口好/user/insert？+参数
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/insert")
//    返回json注解
    @ResponseBody
    public User insertUser(User user) {
        User u = userService.insertUser(user);
        return u;
    }
}
