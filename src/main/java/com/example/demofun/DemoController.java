package com.example.demofun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world! " + new java.util.Date();
    }
}
