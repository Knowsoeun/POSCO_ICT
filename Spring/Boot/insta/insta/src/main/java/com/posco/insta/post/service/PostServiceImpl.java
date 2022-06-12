package com.posco.insta.post.service;

import com.posco.insta.post.model.PostDto;
import com.posco.insta.post.model.SelectPostJoinUserDto;
import com.posco.insta.post.repository.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    PostMapper postMapper;
    @Override
    public List<PostDto> getPost(){
        return postMapper.getPosts();
    }



    @Override
    public List<SelectPostJoinUserDto> getPostsByUserId(PostDto postDto){
        return postMapper.findPostsByUserId(postDto);
    }

    @Override
    public Integer deletePost(PostDto postDto) {
        return postMapper.deletePostByUserIdAndId(postDto);
    }

    @Override
    public List<SelectPostJoinUserDto> getPostsByNotUserId(PostDto postDto){
        return postMapper.findPostsByNotUserId(postDto);
    }

    @Override
    public Integer insertPost(PostDto postDto) {
        return postMapper.insertPost(postDto);
    }

    @Override
    public Integer updatePost(PostDto postDto) {

        return postMapper.updatePostByUserIdAndId(postDto);
    }

    @Override
    public SelectPostJoinUserDto getPostsById(PostDto postDto) {
        return postMapper.getPostsById(postDto);
    }

    @Override
    public List<SelectPostJoinUserDto> findPostsLikeKey(String key) {
        return postMapper.getPostLikeKey(key);
    }

    @Override
    public List<SelectPostJoinUserDto> getPostsByMyFollowing(PostDto postDto) {
        return postMapper.getPostsByMyFollowing(postDto);
    }


}
