package com.cg.controller;

import com.cg.entity.generate.Goods;
import com.cg.entity.generate.User;
import com.cg.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = userServiceImpl.getUserName(userName);
        if (user != null && user.getUserPassword().equals(userPassword)) {
            return "redirect:/cart/list ";

        }
        return "redirect:/index";
    }

    @RequestMapping("/beforeRegister")
    public String registers() {

        return "login/register1";
    }

    @RequestMapping("/signup")
    public String signup(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword, @RequestParam("userEmail") String userEmail) {
        System.out.println(userName);
        System.out.println(userPassword);
        System.out.println(userEmail);
        if (userName != null && userPassword != null && userEmail != null) {
            User user = new User();
            user.setUserName(userName);
            user.setUserPassword(userPassword);
            user.setUserEmail(userEmail);
            userServiceImpl.insert(user);
            return "redirect:/login/index";
        } else {

            return "/login/false";
        }
    }

    @RequestMapping("/signup1")
    @ResponseBody
    public Map<String,Object> signup1(@RequestBody User user) {
        System.out.println(user);
        Map<String, Object> map = new HashMap<>();
        if (StringUtils.isNotBlank(user.getUserPassword()) && StringUtils.isNotBlank(user.getUserName()) && StringUtils.isNotBlank(user.getUserEmail())) {
            userServiceImpl.insert(user);
            map.put("isOk", "true");
        }else{
            map.put("isOk", "false");

            map.put("msg","表单元素不能为空，请重新填写");
        }
        return map;
    }

    @RequestMapping("/signup2")
    @ResponseBody
    public void signup2(HttpServletRequest req) {
        String userName = req.getParameter("userName") == null ? "" : req.getParameter("userName");
        String userPassword = req.getParameter("userPassword") == null ? "" : req.getParameter("userPassword");
        String userEmail = req.getParameter("userEmail") == null ? "" : req.getParameter("userEmail");
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserEmail(userEmail);
        userServiceImpl.insert(user);
    }
}






