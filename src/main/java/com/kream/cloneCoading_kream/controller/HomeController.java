package com.kream.cloneCoading_kream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("test/test")
    public String test() {
        return "test/test";
    }

    @GetMapping("test2")
    public String test2() {
        return "test2";
    }

}
