package com.cg.dao.impl;

import com.cg.dao.IUserDao;
import com.cg.entity.User;
import com.cg.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.cg.util.DBUtil.getConnection;

public class UserDaoImpl implements IUserDao {


    @Override
    public List<User> findUser() {
        List<User> userList = new ArrayList<User>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from user");

            while (rs.next()) {
                User user = new User();
                int userId = rs.getInt("user_id");
                String userName = rs.getString("user_name");
                String userPassword = rs.getString("user_password");
                String userEmail = rs.getString("user_email");
                user.setUserId(userId);
                user.setUserName(userName);
                user.setUserPassword(userPassword);
                user.setUserEmail(userEmail);
                userList.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, stmt, conn);
        }
        return userList;
    }

    @Override
    public User getUser(String name) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        User user = new User();
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from user where name= " + name);

            while (rs.next()) {
                int userId = rs.getInt("user_id");
                String userName = rs.getString("user_name");
                String userPassword = rs.getString("user_password");
                String userEmail = rs.getString("user_email");
                user.setUserId(userId);
                user.setUserName(userName);
                user.setUserPassword(userPassword);
                user.setUserEmail(userEmail);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, stmt, conn);
        }
        return user;
    }


    @Override
    public void saveUser(User user) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into user(user_name,user_password,user_email) values('" + user.getUserName() + "','" + user.getUserPassword() + "','" + user.getUserEmail() + ");");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(stmt, conn);
        }
    }


    @Override
    public void updateUser(User user) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("update user set user_name=" + user.getUserName() + ",user_password=" + user.getUserPassword() + ",user_email=" + user.getUserEmail() + ");");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(stmt, conn);
        }
    }

    @Override
    public void deleteUser(int id) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("delete * from user where id  = " + id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(stmt, conn);
        }
    }

}
