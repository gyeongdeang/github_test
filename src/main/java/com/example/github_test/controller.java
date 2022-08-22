package com.example.github_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {
@GetMapping("/")
    public String helloworld(){
    return "To do Application !";
}
}
