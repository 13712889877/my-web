package com.cg.service.impl;

import com.cg.dao.IUserDao;
import com.cg.dao.impl.UserDaoImpl;
import com.cg.entity.User;
import com.cg.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {


    private IUserDao userDao = new UserDaoImpl();


    public List<User> findUser() {
        return userDao.findUser();
    }

    @Override
    public User getUser(String name) {
        return userDao.getUser(name);
    }


    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }
}
