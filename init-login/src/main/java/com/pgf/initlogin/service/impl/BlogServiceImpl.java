package com.pgf.initlogin.service.impl;

import com.pgf.initlogin.entity.Blog;
import com.pgf.initlogin.mapper.BlogMapper;
import com.pgf.initlogin.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
