package com.cg.service.impl;

import com.cg.dao.IUserDao;
import com.cg.dao.impl.UserDaoImpl;
import com.cg.entity.Goods;
import com.cg.entity.User;
import com.cg.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {


    private IUserDao userDao = new UserDaoImpl();


    public List<User> findUser() {
        IUserDao userDao = new UserDaoImpl();


        return userDao.findUser();
    }
}
