package com.example.demofun;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    private Logger logger = Logger.getLogger(getClass().getName());

    @GetMapping("/hello")
    public String sayHello() {
        logger.info(">>>>> inside Hello Yo!!!");
        return "Hello world! " + new java.util.Date();
    }
}
