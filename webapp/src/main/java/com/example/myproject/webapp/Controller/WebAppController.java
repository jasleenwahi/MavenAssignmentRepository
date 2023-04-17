package com.example.myproject.webapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
    @GetMapping("/hello")
    public String returnHelloWorld(){
        return "Hello World!";
    }
}
