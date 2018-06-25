package com.cg.controller;

import com.cg.entity.generate.User;
import com.cg.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userServiceImpl;
    @RequestMapping("/list")
    public String list(){

        List<User> Users  =  userServiceImpl.findUser();
        return "user/list";

    }

    @RequestMapping("/add")
    public String add(){

        return "";
    }


    @RequestMapping("/delete")
    public String delete() {

        return "";
    }}

