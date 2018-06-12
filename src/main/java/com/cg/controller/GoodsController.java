package com.cg.controller;


import com.cg.entity.ShoppingCar;
import com.cg.entity.generate.Goods;
import com.cg.service.ICoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GoodsController {

    @Autowired

    private ICoodsService coodsService;

    @RequestMapping("/shopping")
    public String main() {

        return "index/main-index";
    }

    @RequestMapping("/addCar/{id}")
    @ResponseBody
    public Map<String, String> addShoppingCar(HttpServletRequest request, int id) {

        ShoppingCar shoppingCar = (ShoppingCar) request.getSession().getAttribute("SHOPPING_CAR");

        if (shoppingCar == null) {
            request.getSession().setAttribute("SHOPPING_CAR", new ShoppingCar());
        }

        Map<String, String> map = new HashMap<>();
        HttpSession session = (HttpSession) coodsService.getGoods(id);
          String str = session.getId();
        //TODO  将商品加入session
        map.put("str", str);
        return map;

    }
}




