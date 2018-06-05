package com.cg.service;

import com.cg.entity.User;

import java.util.List;

public interface IUserService {

    List<User> findUser();


    User getUser(String name);


    void saveUser(User user);


    void updateUser(User user);


    void deleteUser(int id);

}
