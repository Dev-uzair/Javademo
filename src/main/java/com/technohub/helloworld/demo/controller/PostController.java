package com.technohub.helloworld.demo.controller;

import com.technohub.helloworld.demo.model.Post;
import com.technohub.helloworld.demo.request.PostRequest;
import com.technohub.helloworld.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService service;
   /*
    * create
    * update by id
    * read all
    * delete by id
    * find by id
    *
    */

    @PostMapping("/")
    public Post createPost(@RequestBody PostRequest request){
        return service.createPost(request);
    }


}
