package com.ncee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController  {
    @GetMapping(value="/demo")
    public String getIndex(){
        return "Index";
    }
}
