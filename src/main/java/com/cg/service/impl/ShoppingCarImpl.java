package com.cg.service.impl;

import com.cg.entity.generate.Goods;
import com.cg.entity.ShoppingCar;
import com.cg.service.IShoppingCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;


public class ShoppingCarImpl implements IShoppingCar {


    public void saveShopping(Goods goods, ShoppingCar shoppingCar) {
        for (int i = 0; i <= shoppingCar.getGoodList().size(); i++) {
            Goods good = shoppingCar.getGoodList().get(i);
            if (goods.getId() == good.getId()) {
                good.setNumber(good.getNumber() + 1);
            }else {
                shoppingCar.getGoodList().add(goods);
            }
        }
    }

    @Override
    public void deleteShopping(int id) {

    }


}
