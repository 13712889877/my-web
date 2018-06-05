package com.cg.dao;

import com.cg.entity.Goods;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface IGoodsDao {

    public List<Goods> findGoods();

    public Goods getGoods(String id);


    public void saveGoods(Goods goods);


    public void updateGoods(Goods goods);


    public void deleteGoods(int id);



}



