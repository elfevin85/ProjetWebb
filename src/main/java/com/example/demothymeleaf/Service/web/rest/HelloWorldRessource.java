package com.example.demothymeleaf.Service.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldRessource {

    private final String str = "Hello World!";

    @GetMapping("/HelloWorld")
    public ResponseEntity<String> getHelloWorld(){
        return new ResponseEntity<>(str, HttpStatus.OK);
    }


}
