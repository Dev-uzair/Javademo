package com.technohub.helloworld.demo.service;

import com.technohub.helloworld.demo.model.Post;
import com.technohub.helloworld.demo.repository.PostRepository;
import com.technohub.helloworld.demo.repository.UserRepository;
import com.technohub.helloworld.demo.request.PostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class PostService {
    private PostRepository repository;
    private UserRepository userRepository;

    @Autowired
    public PostService(PostRepository repository, UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }


    @Transactional
    public Post createPost(PostRequest request) {
        Post post = new Post ();
        post.setDate ( LocalDateTime.now ().toString ());
        post.setTitle ( request.getTitle ( ) );
        post.setUser ( userRepository.findById ( request.getUserId ()).orElseThrow (()->new RuntimeException ( "User Id Not found" )) );
        return repository.save(post);

    }
}
