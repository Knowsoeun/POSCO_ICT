package com.posco.insta.post.controller;


import com.posco.insta.aspect.TokenRequired;
import com.posco.insta.config.SecurityService;
import com.posco.insta.post.model.PostDto;
import com.posco.insta.post.model.SelectPostJoinUserDto;
import com.posco.insta.post.service.PostServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
@TokenRequired
public class PostController {
    @Autowired
    PostServiceImpl postService;
    @Autowired
    SecurityService securityService;
    @Autowired
    PostDto postDto;
    @GetMapping("/")
    public List<PostDto> getPosts(){
        return postService.getPost();
    }
    @GetMapping("/my")

    public List<SelectPostJoinUserDto> getMyPosts(){

        postDto.setUserId(securityService.getIdAtToken());
        return postService.getPostsByUserId(postDto);
    }
    @DeleteMapping("/{id}")
    public Integer deleteMyPost(@PathVariable String id){
        postDto.setId(Integer.valueOf(id));
        postDto.setUserId(securityService.getIdAtToken());
        return postService.deletePost(postDto);

    }

    @GetMapping("/other")
    public List<SelectPostJoinUserDto> getOtherPosts(){
        postDto.setUserId(securityService.getIdAtToken());
        return postService.getPostsByNotUserId(postDto);
    }

    @GetMapping("/{id}")
    public List<SelectPostJoinUserDto> getPostsById(@PathVariable String id){

        postDto.setUserId(Integer.valueOf(id));
        return postService.getPostsByUserId(postDto);
    }

    @PutMapping("/{id}")
    public Integer updateMyPost(
            @RequestBody PostDto postDto,
            @PathVariable String id
    ){
        postDto.setUserId(securityService.getIdAtToken());
        postDto.setId(Integer.valueOf(id));
        return postService.updatePost(postDto);
    }
    @PostMapping("/")
    public Integer postPost(@RequestBody PostDto postDto){

        return postService.insertPost(postDto);
    }
    @GetMapping("/key/{key}")
    public List<SelectPostJoinUserDto> getPostsLikeKey(@PathVariable String key){
        return postService.findPostsLikeKey(key);
    }

    @GetMapping("/following")
    @Operation(description = "내가 팔로윙으로 있고, follower인 애들의 getPost")
    public List<SelectPostJoinUserDto> getPostsByMyFollowing(){
        postDto.setUserId(securityService.getIdAtToken());
        return postService.getPostsByMyFollowing(postDto);
    }


}
