package com.SpringStart.Controller.controllers;


import com.SpringStart.Controller.services.BuisnessServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Controller1 {
    @RequestMapping("/index")
    @ResponseBody
    public String display() {
        return "Hello world";
    }
}
