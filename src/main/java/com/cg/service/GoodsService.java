/*
package com.cg.service;

import com.cg.dao.IGoodsDao;
import com.cg.entity.Goods;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class GoodsService  {

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://101.201.235.213:3306/cg", "cg", "123456");
        return conn;
    }

    
    public List<Goods> findGoods() {
        List<Goods> goodsList = new ArrayList<Goods>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
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
            close(rs, stmt, conn);
        }
        return goodsList;
    }



    @Override
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
    }


    @Override
    public void close(Statement stmt, Connection con) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


    }

    @Override
    public void close(ResultSet rs, Statement stmt, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

*/
