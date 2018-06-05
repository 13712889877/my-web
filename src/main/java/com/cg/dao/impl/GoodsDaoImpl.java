package com.cg.dao.impl;

import com.cg.dao.IGoodsDao;
import com.cg.entity.Goods;
import com.cg.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GoodsDaoImpl implements IGoodsDao {

    @Override
    public List<Goods> findGoods() {
        List<Goods> goodsList = new ArrayList<Goods>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from goods");

            while (rs.next()) {
                Goods goods = new Goods();
                int id =rs.getInt("id");
                String name = rs.getString("name");
                Double price =rs.getDouble("price");
                Double remark = rs.getDouble("remark");
                goods.setId(id);
                goods.setName(name);
                goods.setPrice(price);
                goods.setRemark(remark);
                goodsList.add(goods);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, stmt, conn);
        }
        return goodsList;
    }

    @Override
    public Goods getGoods(String id) {
        return null;
    }

    @Override
    public void saveGoods(Goods goods) {

    }

    @Override
    public void updateGoods(Goods goods) {

    }

    @Override
    public void deleteGoods(int id) {

    }


}
