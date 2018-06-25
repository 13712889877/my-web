package com.cg.controller;

import com.cg.entity.generate.User;
import com.cg.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        List<User> userlist = userServiceImpl.findUser();
        for (int i = 0; i <= userlist.size(); i++) {
            User user = userlist.get(i);
            if (userName != null && user.getUserPassword().equals(userPassword)) {
                return "redirect:/cart/list ";
            }
        }
        return "/login/login";
    }


    @RequestMapping("/beforeRegister")
    public String registers() {

        return "login/register";
    }

    @RequestMapping("/signup")
    public String signup(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword) {

        if(userName!=null&&userPassword!=null){
            User user =new User();
            user.setUserName(userName);
            user.setUserPassword(userPassword);
            userServiceImpl.saveUser(user);
            return "redirect:/login/index";
        }else {

            return "/login/false";
        }



    }
}





