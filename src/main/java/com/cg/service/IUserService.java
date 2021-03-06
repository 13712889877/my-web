package com.cg.service;

import com.cg.entity.generate.User;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 定义一个用户服务的接口
 */
@Service
public interface IUserService {

    //接口创建一个查找所有用户信息的方法
    List<User> findUser();


    //接口通过id查找单个用户信息的方法
    User getUser(int id);

    //接口创建一个保存用户信息的方法
    void saveUser(User user);

    //接口创建一个更新用户信息的方法
    void insert(User user);

    //接口通过id删除用户信息的方法
    void deleteUser(int id);
    //接口通过用户名查询用户信息的方法
    User getUserName(String userName);


}
