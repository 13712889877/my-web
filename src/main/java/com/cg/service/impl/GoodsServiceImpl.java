package com.cg.service.impl;

import com.cg.dao.IGoodsDao;
import com.cg.dao.impl.GoodsDaoImpl;
import com.cg.entity.Goods;
import com.cg.service.IGoodsService;
import java.util.List;


public class GoodsServiceImpl implements IGoodsService {

    private IGoodsDao goodsDao = new GoodsDaoImpl();

    @Override
    public List<Goods> findGoods() {
        return goodsDao.findGoods();
    }

    @Override
    public Goods getGoods(int id) {
        return goodsDao.getGoods(id);
    }

    @Override
    public void saveGoods(Goods goods) {
        goodsDao.saveGoods(goods);
    }

    @Override
    public void updateGoods(Goods goods) {
        goodsDao.updateGoods(goods);
    }

    @Override
    public void deleteGoods(int id) {
        goodsDao.deleteGoods(id);

    }
}


