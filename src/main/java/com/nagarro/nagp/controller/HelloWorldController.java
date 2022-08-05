package com.nagarro.nagp.controller;


import com.nagarro.nagp.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    HelloWorldService service;

    @GetMapping(produces = "application/json")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello Nagp!!");
    }


}
