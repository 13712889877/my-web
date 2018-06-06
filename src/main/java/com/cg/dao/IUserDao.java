package com.cg.dao;

import com.cg.entity.User;


import java.util.List;

/**
 * 定义一个用户信息的接口
 */
public interface IUserDao {
    //创建一个查找所有用户信息的方法
    List<User> findUser();


    //通过id查找单个用户信息的方法
    User getUser(String name);

    //创建一个保存用户信息的方法
    void saveUser(User user);

    //创建一个更新用户信息的方法
    void updateUser(User user);

    //通关id删除用户信息的方法
    void deleteUser(int id);


}
