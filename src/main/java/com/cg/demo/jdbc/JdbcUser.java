package com.cg.demo.jdbc;
import com.cg.entity.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUser {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://101.201.235.213:3306/cg", "cg", "123456");
        return conn;
    }
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
                int userId =rs.getInt("user_id");
                String userName = rs.getString("user_name");
                String userPassword =rs.getString("user_password");
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
            close(rs, stmt, conn);
        }
        return userList;
    }


    public User getUser(String id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        User user = new User();
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from user where id= " + id);

            while (rs.next()) {
                int userId =rs.getInt("user_id");
                String userName = rs.getString("user_name");
                String userPassword =rs.getString("user_password");
                String userEmail = rs.getString("user_email");
                user.setUserId(userId);
                user.setUserName(userName);
                user.setUserPassword(userPassword);
                user.setUserEmail(userEmail);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs, stmt, conn);
        }
        return user;
    }


    public void saveUser(User user) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into user(user_name,user_password,user_email) values('" +user.getUserName()+"','"+user.getUserPassword() +"','"+user.getUserEmail()+");");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(stmt, conn);
        }
    }


    public void updateUser(User user) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("update user set user_name="+ user.getUserName() +",user_password="+user.getUserPassword()+",user_email="+user.getUserEmail()+");");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(stmt, conn);
        }
    }

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
            close(stmt, conn);
        }
    }


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

