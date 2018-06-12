package com.cg.service.impl;

import com.cg.entity.Goods;
import com.cg.entity.ShoppingCar;
import com.cg.service.IShoppingCar;
import java.util.Iterator;


/**
 * Created by IYFT on 2018/6/11.
 */
public class ShoppingCarImpl implements IShoppingCar {
    @Override
    public void saveShopping(Goods goods, ShoppingCar car) {
        for (int i = 0; i <= car.getGoodList().size(); i++) {
            Goods good = car.getGoodList().get(i);
            if (goods.getId() == good.getId()) {
                good.setNumber(good.getNumber() + 1);
            }
        }
    }

    @Override
    public void deleteShopping(int id) {


    }
}
