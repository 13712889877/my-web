package com.cg.servlet;

import com.cg.demo.jdbc.JdbcGoods;
import com.cg.entity.Goods;
import com.cg.entity.ShoppingCar;
import com.cg.entity.User;
import com.cg.filter.StaticsCountByHashMapFilter;
import com.cg.service.IGoodsService;
import com.cg.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class GoodsServlet extends HttpServlet {

    static Map<String,Map<String,Object>>  map = null;

    private IGoodsService goodsService = new GoodsServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        resp.setContentType("text/html");
//        HttpSession session = req.getSession();
//        String heading;
//        Integer accessCount = (Integer) session.getAttribute("accessCount");
//        if (accessCount == null) {
//            accessCount = new Integer(0);
//            heading = "Welcom,You are first time to visit!";
//        } else {
//            heading = "Welcome Backer";
//            accessCount = new Integer(accessCount.intValue() + 1);
//        }
//        session.setAttribute("accessCount", accessCount);
//        PrintWriter out = resp.getWriter();
//        out.println("The title:" + heading);
//        out.println("Access count: " + accessCount);
        this.doPost(request,response);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String method = req.getParameter("method");
        if (method.equals("addShoppingCar")) {
            addShoppingCar(req, resp);
        }else if (method.equals("shopList")){
            shopList(req,resp);
        }else if(method.equals("delete")){
            delete(req,resp);
        }

    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JdbcGoods jdbcGoods = new JdbcGoods();
        Goods goods = new Goods();
        String id = req.getParameter("id");




        //SSSSSSS
        //SSSSSSS
        jdbcGoods.deleteGoods(Integer.parseInt(id));
        req.getRequestDispatcher("/add.jsp").forward(req,resp);
    }

    private void shopList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<Goods> goodsList = goodsService.findGoods();
        req.setAttribute("goodList",goodsList);
        req.getRequestDispatcher("/goods-list.jsp").forward(req,resp);


    }

    protected void addShoppingCar(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
JdbcGoods jdbcGoods = new JdbcGoods();
        String goodsId = req.getParameter("id");

       //operation db
       String goodsName = req.getParameter("name");

        String price = req.getParameter("price");

        Goods goods = new Goods();

        goods.setId(Integer.valueOf(goodsId));
        goods.setName(goodsName);
        goods.setPrice(Double.valueOf(price));
            jdbcGoods.saveGoods(goods);
        ShoppingCar car =  (ShoppingCar)req.getSession().getAttribute("SHOPPING_CAR");

        if(car == null ){
            ShoppingCar carList = new ShoppingCar();

            car.getGoodList().add(goods);

            req.getSession().setAttribute("SHOPPING_CAR",carList);
        }else{

            car.getGoodList().add(goods);
        }
req.getRequestDispatcher("/add.jsp").forward(req,resp);

    }
}
