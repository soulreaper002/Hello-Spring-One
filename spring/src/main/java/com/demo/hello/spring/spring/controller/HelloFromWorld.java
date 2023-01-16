package com.demo.hello.spring.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFromWorld {
   @GetMapping("/hello")
        public String getHelloWorld() 
        {
            return "Hello Spring from Codespaces";
        }
}
