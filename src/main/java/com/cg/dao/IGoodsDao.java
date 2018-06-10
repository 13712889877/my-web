package com.cg.dao;

import com.cg.entity.Goods;


import java.util.List;

/**
 * 定义一个商品信息的接口
 */
public interface IGoodsDao {
    //创建一个查找所有商品信息的方法
    List<Goods> findGoods();

    //通过id查找单个商品信息的方法
    Goods getGoods(int id);

    //创建一个保存商品信息的方法
    void saveGoods(Goods goods);

    //创建一个更新商品信息的方法
    void updateGoods(Goods goods);

    //通关id删除商品信息的方法
    void deleteGoods(int id);




}



