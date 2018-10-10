package com.chunyue.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainContoller {


    @RequestMapping("/index")
    public String index(){
        return "index";
    }



}
