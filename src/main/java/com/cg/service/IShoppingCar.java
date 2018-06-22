package com.cg.service;

import com.cg.entity.generate.Goods;
import com.cg.entity.ShoppingCar;
import org.springframework.stereotype.Service;

@Service
public interface IShoppingCar {
    void saveShopping(Goods goods, ShoppingCar car);
    void deleteShopping(int id);
 }
