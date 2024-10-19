package com.backend.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Juldas RAMDE
 * Since: 19/10/2024 at 03:06
 */

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world from Docker !";
    }

    @PostMapping("/docker")
    public String docker() {
        return "Build images easy and fast";
    }
}
