package com.cg.service.impl;

import com.cg.dao.IGoodsDao;
import com.cg.dao.impl.GoodsDaoImpl;

import com.cg.entity.ShoppingCar;
import com.cg.entity.generate.Goods;
import com.cg.entity.generate.GoodsExample;
import com.cg.mapper.generate.GoodsMapper;
import com.cg.service.ICoodsService;
import com.cg.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 实现商品服务的接口
 */
@Service
public class CoodsServiceImpl implements ICoodsService {
    //new一个全局的goodsMapper

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 服务层，从goodsMapper中调取findGoods方法
     */
    @Override
    public List<Goods> findGoods() {
        GoodsExample e = new GoodsExample();
        GoodsExample.Criteria criteria = e.createCriteria();
        return goodsMapper.selectByExample(e);
    }
    /**
     * 服务层，从goodsMapper中调取getGoods方法
     *
     * @param id
     */
    @Override
    public Goods getGoods(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    /**
     * 服务层，从goodsMapper中调取saveGoods方法
     *
     * @param goods
     */
    @Override
    public void saveGoods(Goods goods) {
       // goodsMapper.saveGoods(goods);
    }

    /**
     * 服务层，从goodsMapper中调取updateGoods方法
     *
     * @param goods
     */
    @Override
    public void updateGoods(Goods goods) {
       // goodsMapper.updateGoods(goods);
    }

    /**
     * 服务层，从goodsMapper中调取deleteGoods方法
     *
     * @param id
     */
    @Override
    public void deleteGoods(int id) {
        //goodsMapper.deleteGoods(id);
    }
    @Override
    public void judgeCar(Goods goods, ShoppingCar car) {
//        if (car == null) {
//            ShoppingCar carList = new ShoppingCar();
//            carList.getGoodList().add(goods);
//            carList.calswewewe();
//        } else {
//            car.getGoodList().add(goods);
//            car.calswewewe();
//        }
    }
}


