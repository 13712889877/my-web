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


@Controller
public class GoodsController {

    @Autowired

    private ICoodsService coodsServiceImpl;

    @RequestMapping("/shopping")
    public String main(Model model) {

        List<Goods> goods = coodsServiceImpl.findGoods();

        model.addAttribute("goods", goods);
        return "index/main-index";
    }


    @RequestMapping("/shoppingList")
    public String shoppingList(HttpServletRequest req, Model model) {

        ShoppingCar car = (ShoppingCar) req.getSession().getAttribute("SHOPPING_CAR");
        model.addAttribute("sessionList", car);

        return "index/add-car";
    }

    @RequestMapping(value = "/addCar/{id}")
    @ResponseBody
    public Map<String, String> addShoppingCar(HttpServletRequest request, @PathVariable int id) {
        System.out.println(id);

        ShoppingCar shoppingCar = (ShoppingCar) request.getSession().getAttribute("SHOPPING_CAR");

        if (shoppingCar == null) {
            request.getSession().setAttribute("SHOPPING_CAR", new ShoppingCar());
        } else if(shoppingCar!=null){
            Goods goods = coodsServiceImpl.getGoods(id);
            for (Goods goods1 : shoppingCar.getGoodList()) {
                if (goods1.getId().equals(id)) {
                    goods1.setNumber(goods1.getNumber() + 1);
                } else {
                    shoppingCar.getGoodList().add(goods);
                }
            }
        }


        Map<String, String> map = new HashMap<>();

        //格式
        map.put("success", "true");

        return map;

    }
}




