package com.study.springframework.services.impl;

import com.study.springframework.sdo.Post;
import com.study.springframework.services.IPostService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class PostServiceImpl implements IPostService {
    @Override
    public int writePost(Post post) {
        ApplicationContext
        return 1;
    }
}
