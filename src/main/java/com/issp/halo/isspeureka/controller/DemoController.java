package com.issp.halo.isspeureka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class DemoController {

    @GetMapping("/index")
    public String demo() {
        return "demo";
    }

}
