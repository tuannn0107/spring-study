package com.study.springframework.services;

import com.study.springframework.sdo.Post;

public interface IPostService {
    /**
     *
     * @param post
     * @return
     */
    int writePost(Post post);
}
