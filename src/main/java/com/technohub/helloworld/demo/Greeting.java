package com.technohub.helloworld.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @GetMapping("/")
    public String sayHello() {
        return "hello from server";
    }


}
