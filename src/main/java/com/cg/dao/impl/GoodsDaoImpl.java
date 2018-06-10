package com.cg.dao.impl;

import com.cg.dao.IGoodsDao;
import com.cg.entity.Goods;
import com.cg.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.cg.util.DBUtil.getConnection;

/**
 * 实现商品信息的接口
 */
public class GoodsDaoImpl implements IGoodsDao {
    /**
     * 操作数据库，从数据库查找所有商品的信息
     */

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
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                Double remark = rs.getDouble("remark");

                int number = rs.getInt("number");

                goods.setNumber(number);
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

    /**
     * 操作数据库，通过id从数据库中查找单个商品的信息
     *
     * @param id
     */

    @Override
    public Goods getGoods(int id) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Goods goods = new Goods();
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from goods where id= " + id);

            while (rs.next()) {
                int idi = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                Double remark = rs.getDouble("remark");
                int number = rs.getInt("number");
                goods.setId(idi);
                goods.setName(name);
                goods.setPrice(price);
                goods.setRemark(remark);
                goods.setNumber(number);


            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, stmt, conn);
        }
        return goods;
    }

    /**
     * 操作数据库，向数据库添加新的商品信息
     *
     * @param goods
     */

    @Override
    public void saveGoods(Goods goods) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into goods(name,price,remark,number) values('" + goods.getName() + "','" + goods.getPrice() + "','" + goods.getRemark() + "," + goods.getNumber() + ");");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(stmt, conn);
        }
    }

    /**
     * 操作数据库，更新数据库中商品信息
     *
     * @param goods
     */


    @Override
    public void updateGoods(Goods goods) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("update goods set name=" + goods.getName() + ",price=" + goods.getPrice() + ",remark=" + goods.getRemark() + ",number" + goods.getNumber() + ");");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(stmt, conn);
        }
    }

    /**
     * 操作数据库，通过id从数据库中删除商品信息
     *
     * @param id
     */

    @Override
    public void deleteGoods(int id) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("delete  from goods where id  = " + id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(stmt, conn);
        }
    }


}
