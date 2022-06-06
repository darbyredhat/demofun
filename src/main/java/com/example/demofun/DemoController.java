package com.example.demofun;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    private Logger logger = Logger.getLogger(getClass().getName());

    @Value("${fav.city}")
    private String favCity;

    @Value("${fav.sport}")
    private String favSport;
    
    @GetMapping("/hello")
    public String sayHello() {
        logger.info(">>>>> inside Hello Yo!!!");
        return "Hello world! Fav Sport: " + favSport + ", Fav City: " + favCity;
    }
}
