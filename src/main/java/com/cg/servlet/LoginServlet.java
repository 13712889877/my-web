package com.cg.servlet;

import com.cg.demo.jdbc.JdbcUser;
import com.cg.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    private void beforeLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/view/file/login.jsp").forward(request, response);


    }

    private void beforeRegister(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("WEB-INF/view/file/register.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void register(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String userEamil = request.getParameter("user_email") == null ? "" : request.getParameter("user_email");
        String userName = request.getParameter("user_name") == null ? "" : request.getParameter("user_name");
        String userPassword = request.getParameter("user_password") == null ? "" : request.getParameter("user_password");
        JdbcUser jdbcUser = new JdbcUser();
        User user = new User();
        user.setUserName(userName);
        user.setUserEmail(userEamil);
        user.setUserPassword(userPassword);
        jdbcUser.saveUser(user);

        response.sendRedirect("/my-web/login?method=beforeLogin");

    }

    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName") == null ? "" : request.getParameter("name");
        String userPassword = request.getParameter("userPassword") == null ? "" : request.getParameter("userPassword");
        JdbcUser jdbcUser = new JdbcUser();
        User user = jdbcUser.getUser(userName);
        if (user != null && userPassword.equals(user.getUserPassword())) {
            response.sendRedirect("/my-web/goods?method=list");
        } else {
            request.setAttribute("errorMsg", "账号和密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

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
