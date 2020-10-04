package com.study.springframework.services.impl;

import com.study.springframework.sdo.Post;
import com.study.springframework.services.IPostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements IPostService {
    @Override
    public int writePost(Post post) {
        return 1;
    }
}
