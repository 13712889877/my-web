package com.cg.service.impl;

import com.cg.dao.IGoodsDao;
import com.cg.dao.impl.GoodsDaoImpl;
import com.cg.entity.Goods;
import com.cg.service.IGoodsService;
import com.cg.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class GoodsServiceImpl implements IGoodsService {



    private IGoodsDao goodsDao = new GoodsDaoImpl();

    @Override
    public List<Goods> findGoods() {
        IGoodsDao goodsDao = new GoodsDaoImpl();



        return goodsDao.findGoods();
    }



   /* @Override
    public Goods getGoods(String id) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Goods goods = new Goods();
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from goods where id= " + id);

            while (rs.next()) {
                int bid =rs.getInt("id");
                String name = rs.getString("name");
                Double price =rs.getDouble("price");
                Double remark = rs.getDouble("remark");
                goods.setId(bid);
                goods.setName(name);
                goods.setPrice(price);
                goods.setRemark(remark);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs, stmt, conn);
        }
        return goods;
    }


    @Override
    public void saveGoods(Goods goods) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into goods(name,price,remark) values('" +goods.getName()+"','"+goods.getPrice() +"','"+goods.getRemark()+");");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(stmt, conn);
        }
    }


    @Override
    public void updateGoods(Goods goods) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String id = null;
            stmt.executeUpdate("update goods set name="+ goods.getName() +",price="+goods.getPrice()+",remark="+goods.getRemark()+");");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(stmt, conn);
        }
    }



    @Override
    public void deleteGoods(int id) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("delete * from goods where id  = " + id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(stmt, conn);
        }
    }*/


}

