package com.miles.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class demoComtroller {
    @RequestMapping("/mvc")
    public String HelloMvc()
    {
        return "hello";
    }
}
