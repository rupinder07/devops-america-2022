package com.nagarro.nagp.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping(produces = "application/json")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello Nagp!!");
    }


}
