package com.pgf.initlogin.service.impl;

import com.pgf.initlogin.entity.User;
import com.pgf.initlogin.mapper.UserMapper;
import com.pgf.initlogin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
