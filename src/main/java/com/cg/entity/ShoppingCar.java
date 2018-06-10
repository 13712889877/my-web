package com.cg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ShoppingCar {

    //所有加入购物车的商品信息
    private List<Goods> goodList = new ArrayList<Goods>();

    private BigDecimal totalPrice = new BigDecimal(0.00);

    public List<Goods> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Goods> goodList) {
        this.goodList = goodList;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calswewewe(){
        for(Goods g :goodList){
            if(g.getPrice()!=0) {
                totalPrice = totalPrice.add(new BigDecimal(g.getPrice() * g.getNumber()));
             }else {
                System.out.println("数据异常");
            }
        }
    }

}
