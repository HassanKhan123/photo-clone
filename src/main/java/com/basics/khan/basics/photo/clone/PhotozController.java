package com.basics.khan.basics.photo.clone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotozController {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

}
