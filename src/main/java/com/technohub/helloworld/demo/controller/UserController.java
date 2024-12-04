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
    private UserService userService ;

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
    @GetMapping("/findById/{userId}")
    public User findById(@PathVariable Long userId){
        return userService.findById ( userId );

    }
    @PutMapping("/updateById/{userId}")
    public User updateById(@PathVariable Long userId,@RequestBody User user){
        User rUser=userService.updateById(userId,user);
        return rUser;
    }
    @DeleteMapping("/{userId}")
    public User deleteById(@PathVariable Long userId){
        User user = userService.deleteById ( userId );
        return user;
    }



}
