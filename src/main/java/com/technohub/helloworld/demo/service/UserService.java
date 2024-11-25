package com.technohub.helloworld.demo.service;

import com.technohub.helloworld.demo.model.User;
import com.technohub.helloworld.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void createUser(User request) {
    User entity =new User ();
    entity.setUserName ( request.getUserName ( )  );
    entity.setEmail ( request.getEmail () );
    entity.setPhoneNumber ( request.getPhoneNumber ( ) );
    repository.save ( entity );
    }

    public List<User> findAll() {
        //we have to retrieve data from db -->repository
       return repository.findAll ( );

    }
}
