//package com.cg.servlet;
//
//import com.cg.entity.Goods;
//import com.cg.entity.ShoppingCar;
//import com.cg.service.IGoodsService;
//import com.cg.service.impl.GoodsServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 商品控制层
// */
//public class GoodsServlet extends HttpServlet {
//    private ShoppingCar shoppingCar;
//    private IGoodsService goodsService = new GoodsServiceImpl();
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        doPost(req, resp);
//    }
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        String method = req.getParameter("method");
//        if (method.equals("addShoppingCar")) {
//            addShoppingCar(req, resp);
//        } else if (method.equals("shopList")) {
//            shopList(req, resp);
//        } else if (method.equals("delete")) {
//            delete(req, resp);
//        }
//    }
//    /**
//     * 前端商品列表页面点击删除跳转时所走的方法
//     *
//     * @param req
//     * @param resp
//     */
//    private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //接口通过id查找单个商品信息的方法
//        String id = req.getParameter("id") == null ? "" : req.getParameter("id");
//        goodsService.deleteGoods(Integer.valueOf(id));
//        req.getRequestDispatcher("WEB-INF/view/file/add.jsp").forward(req, resp);
//    }
//    private void shopList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Goods> goodsList = goodsService.findGoods();
//        req.setAttribute("goodsList", goodsList);
//        req.getRequestDispatcher("WEB-INF/view/file/goods-list.jsp").forward(req, resp);
//    }
//    /**
//     * 前端商品列表页面点击添加跳转时所走的方法
//     *
//     * @param req
//     * @param resp
//     */
//    protected void addShoppingCar(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        String goodsId = req.getParameter("goodsId") == null ? "" : req.getParameter("goodsId");
//        req.getRequestDispatcher("WEB-INF/view/file/shoppingCar.jsp").forward(req, resp);
//    }
//}
