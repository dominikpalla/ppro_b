package com.example.ppro_b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/403")
    @ResponseBody
    public String forbidden(){
        return "<h1>Access Denied</h1>";
    }

    @GetMapping("/admin/")
    @ResponseBody
    public String admin(){
        return "<h1>Admin section</h1>";
    }

    @GetMapping("/blog/")
    @ResponseBody
    public String blog(){
        return "<h1>Blog section</h1>";
    }

}
