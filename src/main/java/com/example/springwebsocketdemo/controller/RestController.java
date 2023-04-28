package com.example.springwebsocketdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
