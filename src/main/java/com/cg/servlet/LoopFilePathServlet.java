package com.cg.servlet;

import com.cg.entity.FilePath;
import com.cg.service.LoopFilePathService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoopFilePathServlet extends HttpServlet {


    public static final String FILE_PATH = "C:\\Users\\15659\\Desktop";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if (method.equals("list")) {
            list(req, resp);
        } else if (method.equals("delete")) {
            delete(req, resp);
        }
    }

    private void list(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        List<FilePath> list = new ArrayList<>();

        LoopFilePathService service = new LoopFilePathService();

        service.getListByPath(FILE_PATH, list);

        req.setAttribute("fileList", list);
        req.getRequestDispatcher("/view/file-list.jsp").forward(req, resp);
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        LoopFilePathService  service = new LoopFilePathService();
        File file = new File(FILE_PATH);
        service.delete(FILE_PATH +file.getName());
        resp.sendRedirect("/file?method=list");
    }
}


