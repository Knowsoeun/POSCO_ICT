package com.posco.insta.post.service;

import com.posco.insta.post.model.PostDto;
import com.posco.insta.post.model.SelectPostJoinUserDto;

import java.util.List;

public interface PostService {
    List<PostDto> getPost();


    List<SelectPostJoinUserDto> getPostsByUserId(PostDto postDto);

    Integer deletePost(PostDto postDto);
    List<SelectPostJoinUserDto> getPostsByNotUserId(PostDto postDto);
    Integer insertPost(PostDto postDto);
    Integer updatePost(PostDto postDto);
    SelectPostJoinUserDto getPostsById(PostDto postDto);
    List<SelectPostJoinUserDto> findPostsLikeKey(String key);
    List<SelectPostJoinUserDto> getPostsByMyFollowing(PostDto postDto);
}
