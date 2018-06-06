package com.cg.service;

import com.cg.entity.Goods;

import java.util.List;

/**
 * 定义一个商品服务的接口
 */
public interface IGoodsService {

    //接口创建一个查找所有商品信息的方法
    List<Goods> findGoods();

    //接口通过id查找单个商品信息的方法
    Goods getGoods(int id);

    //接口创建一个保存商品信息的方法
    void saveGoods(Goods goods);

    //接口创建一个更新商品信息的方法
    void updateGoods(Goods goods);

    //接口通过id删除商品信息的方法
    void deleteGoods(int id);


}
