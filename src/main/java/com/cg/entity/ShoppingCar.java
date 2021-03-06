package com.cg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.cg.entity.generate.Goods;
import org.springframework.stereotype.Service;

@Service
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

    public BigDecimal getTotalAmount() {
        Goods goods = new Goods();
        BigDecimal bigDecimal = new BigDecimal(goods.getNumber() * goods.getPrice());
        return bigDecimal;
    }


    public BigDecimal calswewewe(){
        for(Goods g :goodList){
            if(g.getPrice()!=0) {
                totalPrice = totalPrice.add(new BigDecimal(g.getPrice() * g.getNumber()));
             }else {
                System.out.println("数据异常");
            }
        }
   return totalPrice; }

public void deleteShopping(int id){

    Iterator<Goods> gl = goodList.iterator();
    while(gl.hasNext()){
        Goods good =gl.next();
        if(good.equals(id)){
            gl.remove();
        }
    }



}
}

