package com.agroho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by USER on 4/22/2016.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/static")
    public String getstatic(){
        return "redirect:/hello.html";
    }
}
