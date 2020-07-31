package com.SpringStart.Controller.controllers;


import com.SpringStart.Controller.services.BuisnessServices;

import com.SpringStart.Controller.services.ITestRequestBean;
import com.SpringStart.Controller.services.ITestSessionBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller2 {

    @Autowired
    BuisnessServices buisnessServices;

    @Autowired
    ApplicationContext ctx;


    @Autowired
    ITestSessionBean testSessionBean;

    @Autowired
    ITestRequestBean testRequestBean;

    @RequestMapping("ftl")
    public String display(@RequestParam(name = "a", required = false, defaultValue = "0.0") Double a,
                          @RequestParam(name = "b", required = false, defaultValue = "0.0") Double b,
                          @RequestParam(name = "c", required = false, defaultValue = "0.0") Double c,
                          Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("c", c);
//        if (buisnessServices.getD(a, b, c) )
        model.addAttribute("result", buisnessServices.getX1(a, b, c));
        return "test";
    }
//
//    @RequestMapping("person")
//    public String person(@RequestParam(name = "name") String name,
//                         Model model) {
//        model.addAttribute("person", personService.findPerson(name));
//        return "person";
//    }



    @RequestMapping("/pavel")
    public String ftl(Model model) {
        testSessionBean.setCounter(testSessionBean.getCounter()+1);
        model.addAttribute("sessioncounter", testSessionBean.getCounter());
        testRequestBean.setCounter(testRequestBean.getCounter()+1);
        model.addAttribute("requestcounter", testRequestBean.getCounter());
        return "index";
    }
}

