package com.sahanbcs.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @GetMapping("/kub")
    public String hellow() {
        return "Hello Docker Spring Kubernetiess";
    }
}
