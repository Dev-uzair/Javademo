package com.technohub.helloworld.demo.controller;

import com.technohub.helloworld.demo.model.User;
import com.technohub.helloworld.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String doSomething(){
    return "hello";
    }
    @PostMapping("/")
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
//find all list user
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

}
