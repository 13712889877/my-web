package com.cg.dao;

import com.cg.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface IUserDao {

    public List<User> findUser();


    public User getUser(String name);


    public void saveUser(User user);


    public void updateUser(User user);


    public void deleteUser(int id);


}
