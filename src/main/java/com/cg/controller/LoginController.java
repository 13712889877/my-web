package com.cg.controller;

import com.cg.entity.generate.Goods;
import com.cg.entity.generate.User;
import com.cg.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by 15659 on 2018/6/23.
 */
@RequestMapping("/login")
@Controller
public class LoginController {
    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping("/index")
    public String index() {

        return "login/login";

    }

    /**
     * 登陆
     *
     * @return
     */
    @RequestMapping("/signin")
    public String signin(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword) {
      User user =userServiceImpl.getUserName(userName);
            if (user != null && user.getUserPassword().equals(userPassword)) {
                return "redirect:/cart/list ";

            }
        return "redirect:/index";
    }


    @RequestMapping("/beforeRegister")
    public String registers() {

        return "login/register";
    }

    @RequestMapping("/signup")
    public String signup(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword,@RequestParam("userEmail") String userEmail) {
        System.out.println(userName);
        if (userName != null && userPassword != null&&userEmail!=null) {
            User user = new User();
          user.setUserName(userName);
            user.setUserPassword(userPassword);
            user.setUserEmail(userEmail);

            userServiceImpl.saveUser(user);
            return "redirect:/login/index";
        } else {

            return "/login/false";
        }
    }


    @RequestMapping("/signup1")
    public String signup1(User user) {

        userServiceImpl.saveUser(user);
        return "redirect:/login/index";
    }
}






