package com.lewis.mvnjenkinssample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: lewis
 * Created On: 11/21/2020 - 1:35 PM
 */

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("hi")
    public String sayHello(){
        return "Hi there!!";
    }
}
