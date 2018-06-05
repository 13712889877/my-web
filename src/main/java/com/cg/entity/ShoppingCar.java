package com.cg.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCar {

    //所有加入购物车的商品信息
    private List<Goods> goodList = new ArrayList<Goods>();

    private double totalPrice;

    public List<Goods> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Goods> goodList) {
        this.goodList = goodList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
