package com.cg.service;

import com.cg.entity.ShoppingCar;
import com.cg.entity.generate.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 定义一个商品服务的接口
 * @author  cg
 * @since  2018/2/2
 */
@Service
public interface ICoodsService {

    /**
     * 接口创建一个查找所有商品信息的方法
     *
     */
    List<Goods> findGoods();



    /**
     * 获取商品
     * @param id
     * @return
     */
    Goods getGoods(int id);

    //接口创建一个保存商品信息的方法
    void saveGoods(Goods goods);

    //接口创建一个更新商品信息的方法
    void updateGoods(Goods goods);

    //接口通过id删除商品信息的方法
    void deleteGoods(int id);
    void judgeCar(Goods goods, ShoppingCar car);

}
