package com.cg.controller;


import com.cg.entity.ShoppingCar;
import com.cg.entity.generate.Goods;
import com.cg.service.ICoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@Controller
public class GoodsController {

    @Autowired

    private ICoodsService coodsServiceImpl;

    @RequestMapping("/shopping")
    public String main() {

        return "index/main-index";
    }

    @RequestMapping(value = "/addCar/{id}")
    @ResponseBody
    public Map<String, String> addShoppingCar(HttpServletRequest request, @PathVariable int id) {
        System.out.println(id);

        ShoppingCar shoppingCar = (ShoppingCar) request.getSession().getAttribute("SHOPPING_CAR");

        if (shoppingCar == null) {
            request.getSession().setAttribute("SHOPPING_CAR", new ShoppingCar());
        }else {


        Goods goods = coodsServiceImpl.getGoods(id);

        shoppingCar.getGoodList().add(goods);}
        Map<String, String> map = new HashMap<>();
        map.put("success", "true");

        return map;

    }
}




