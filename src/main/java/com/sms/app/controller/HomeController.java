package com.sms.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/home")
public class HomeController {

    @GetMapping("/hello-world")
    public ResponseEntity<String> home(){
        return new ResponseEntity<String>("<h1>OK</h1>",HttpStatus.OK) ;
    }
}
