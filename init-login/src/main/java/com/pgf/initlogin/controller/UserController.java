package com.pgf.initlogin.controller;


import com.pgf.initlogin.common.result.CommonResult;
import com.pgf.initlogin.entity.User;
import com.pgf.initlogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public Object index(){
        System.out.println("=====================");
        User user = userService.getById(1);
        return CommonResult.success(200,"成功",user);
    }

}
