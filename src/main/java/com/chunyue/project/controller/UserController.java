package com.chunyue.project.controller;

import com.chunyue.project.service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public int addUser(){
//        System.out.println(user.getPassword());
//        System.out.println(user.getRole());
        return userService.addUser();
    }
}
