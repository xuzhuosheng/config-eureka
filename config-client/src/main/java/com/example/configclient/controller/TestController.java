package com.example.configclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${name}")
    private String name;


    @RequestMapping("/toTest")
    public String toTest() {
        return name;
    }


}
