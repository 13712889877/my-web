package com.cg.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class BaseController {

    public HttpSession getSession(HttpServletRequest request){
        return request.getSession();
    }

}
