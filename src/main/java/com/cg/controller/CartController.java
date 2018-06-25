package com.cg.controller;

import com.cg.entity.ShoppingCar;
import com.cg.entity.generate.Goods;
import com.cg.service.ICoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 15659 on 2018/6/23.
 */
@RequestMapping("/cart")
@Controller
public class CartController {

    @Autowired
    private ICoodsService coodsServiceImpl;
    @RequestMapping("/list")
        public String main (Model model){

            List<Goods> goods = coodsServiceImpl.findGoods();

            model.addAttribute("goods", goods);
            return "cart/cart-list";
        }
    @RequestMapping("/carList")
    public String shoppingList(HttpServletRequest req, Model model) {

        ShoppingCar car = (ShoppingCar) req.getSession().getAttribute("SHOPPING_CAR");
        model.addAttribute("sessionList", car);

        return "cart/add-car";
    }
    
        @RequestMapping(value = "/addCar/{id}")
    @ResponseBody
    public Map<String, String> addShoppingCar(HttpServletRequest request, @PathVariable int id) {
        System.out.println(id);

        ShoppingCar shoppingCar = (ShoppingCar) request.getSession().getAttribute("SHOPPING_CAR");

        if (shoppingCar == null) {
            request.getSession().setAttribute("SHOPPING_CAR", new ShoppingCar());
        } else {
            Goods goods = coodsServiceImpl.getGoods(id);
            boolean flag = true;
            for (Goods good : shoppingCar.getGoodList()) {
                if (goods.getId() == good.getId()) {
                    flag = false;
                    good.setNumber(good.getNumber() + 1);
                }
            }
            //表示购物车中不存在该商品
            if(flag){
                shoppingCar.getGoodList().add(goods);
            }
        }
        Map<String, String> map = new HashMap<>();
        map.put("success", "true");
        return map;
    }
}