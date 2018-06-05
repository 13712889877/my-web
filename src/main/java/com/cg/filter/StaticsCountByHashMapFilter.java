package com.cg.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class StaticsCountByHashMapFilter implements Filter {

    /**
     * 存放当前系统所有登录用户
     */
    public static Map<String,String> map = new HashMap<>();


    @Override
    public void init(FilterConfig filterConfig) {



    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request1 = (HttpServletRequest) request;
        StringBuffer requestURL = request1.getRequestURL();
        String requestURI = request1.getRequestURI();


        System.out.println("拦截器拦截到的URL："+requestURL);
        System.out.println("拦截器拦截到的URI："+requestURI);

        HttpServletRequest httpRequest = (HttpServletRequest)request;
        HttpSession session = httpRequest.getSession();


        String username = (String) session.getAttribute("USER_SESSION");

        if(username != null){
            System.out.println(username+"已经添加到登录用户集合中，sesssionId:"+session.getId());
            map.put(username,session.getId());
        }else{
            System.out.println(requestURL+"未登录");
        }

        filterChain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }
}
