package com.cg.servlet;

import com.cg.demo.jdbc.JdbcUser;
import com.cg.entity.ShoppingCar;
import com.cg.entity.User;
import com.cg.service.IUserService;
import com.cg.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 定义一个类并继承HttpServlet
 */
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    //全局的用户服务层
    public IUserService userService = new UserServiceImpl();

    public LoginServlet() {
        super();
    }
    /**
     * doGet方法
     * @param request
     * @param response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    /**
     * 前端登录页面未点击跳转之前所走的方法
     * @param request
     * @param response
     */
    private void beforeLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/view/file/login.jsp").forward(request, response);
    }
    /**
     * 前端注册页面未点击跳转之前所走的方法
     * @param request
     * @param response
     */
    private void beforeRegister(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("WEB-INF/view/file/register.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     * 前端注册页面点击跳转时所走的方法
     * @param request
     * @param response
     */
    private void register(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String userEamil = request.getParameter("userEmail") == null ? "" : request.getParameter("userEmail");
        String userName = request.getParameter("userName") == null ? "" : request.getParameter("userName");
        String userPassword = request.getParameter("userPassword") == null ? "" : request.getParameter("userPassword");
        User user = new User();
        user.setUserName(userName);
        user.setUserEmail(userEamil);
        user.setUserPassword(userPassword);
        userService.saveUser(user);
        response.sendRedirect("/my-web/login?method=beforeLogin");
    }
    /**
     * 前端登录页面点击跳转时所走的方法
     * @param request
     * @param response
     */
    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName") == null ? "" : request.getParameter("userName");
        String userPassword = request.getParameter("userPassword") == null ? "" : request.getParameter("userPassword");
        User user =userService.getUser(userName);
        if (user != null && userPassword.equals(user.getUserPassword())) {
            request.getSession().setAttribute("SHOPPING_CAR", new ShoppingCar());
            response.sendRedirect("/goods?method=shopList");
        } else {
            request.setAttribute("errorMsg", "账号和密码错误");
            request.getRequestDispatcher("WEB-INF/view/file/login.jsp").forward(request, response);
        }
    }
    /**
     * doPost方法
     * @param request
     * @param response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String method = request.getParameter("method");
        if (method.equals("beforeLogin")) {
            this.beforeLogin(request, response);
        } else if (method.equals("login")) {
            login(request, response);
        } else if (method.equals("register")) {
            register(request, response);
        } else if (method.equals("beforeRegister")) {
            beforeRegister(request, response);
        }
    }
}
