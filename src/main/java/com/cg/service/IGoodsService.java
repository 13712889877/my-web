package com.cg.service;

import com.cg.entity.Goods;

import java.util.List;

public interface IGoodsService {


    List<Goods> findGoods();

    Goods getGoods(int id);


    void saveGoods(Goods goods);


    void updateGoods(Goods goods);


    void deleteGoods(int id);

}
