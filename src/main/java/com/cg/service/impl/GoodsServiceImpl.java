package com.cg.service.impl;

import com.cg.dao.IGoodsDao;
import com.cg.dao.impl.GoodsDaoImpl;
import com.cg.entity.generate.Goods;
import com.cg.entity.ShoppingCar;
import com.cg.service.IGoodsService;

import java.util.List;


/**
 * 实现商品服务的接口
 */
public class GoodsServiceImpl implements IGoodsService {
    //new一个全局的goodsDao
    private IGoodsDao goodsDao = new GoodsDaoImpl();
    private Goods goods;
    /**
     * 服务层，从goodsDao中调取findGoods方法
     */
    @Override
    public List<Goods> findGoods() {
        return goodsDao.findGoods();
    }
    /**
     * 服务层，从goodsDao中调取getGoods方法
     *
     * @param id
     */
    @Override
    public Goods getGoods(int id) {
        return goodsDao.getGoods(id);
    }

    /**
     * 服务层，从goodsDao中调取saveGoods方法
     *
     * @param goods
     */
    @Override
    public void saveGoods(Goods goods) {
        goodsDao.saveGoods(goods);
    }

    /**
     * 服务层，从goodsDao中调取updateGoods方法
     *
     * @param goods
     */
    @Override
    public void updateGoods(Goods goods) {
        goodsDao.updateGoods(goods);
    }

    /**
     * 服务层，从goodsDao中调取deleteGoods方法
     *
     * @param id
     */
    @Override
    public void deleteGoods(int id) {
        goodsDao.deleteGoods(id);
    }
    @Override
    public void judgeCar(Goods goods, ShoppingCar car) {
        if (car == null) {
            ShoppingCar carList = new ShoppingCar();
            carList.getGoodList().add(goods);
            carList.calswewewe();
        } else {
            car.getGoodList().add(goods);
            car.calswewewe();
        }
    }
}


