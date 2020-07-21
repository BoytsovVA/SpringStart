package com.SpringStart.Controller.controllers;

import com.SpringStart.Controller.services.BuisnessServices;
import com.SpringStart.Controller.services.ITestRequestBean;
import com.SpringStart.Controller.services.ITestSessionBean;
import com.SpringStart.Controller.services.TestSessionBean;
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

//    @RequestMapping("/index")
//    @ResponseBody
//    public String display(@RequestParam(name = "a", required = true) Double a,
//                          @RequestParam(name = "b", required = true) Double b,
//                          @RequestParam(name = "c", required = true) Double c) {
//
//        BuisnessServices bs = (BuisnessServices) ctx.getBean("buisnessServices");
//        return buisnessServices.getX1(a, b, c).toString();
//    }

    @RequestMapping("/ftl")
    public String ftl(Model model) {
        testSessionBean.setCounter(testSessionBean.getCounter()+1);
        model.addAttribute("sessioncounter", testSessionBean.getCounter());
        testRequestBean.setCounter(testRequestBean.getCounter()+1);
        model.addAttribute("requestcounter", testRequestBean.getCounter());
        return "index";
    }
}
