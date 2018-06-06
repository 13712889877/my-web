package com.cg.service.impl;

import com.cg.dao.IUserDao;
import com.cg.dao.impl.UserDaoImpl;
import com.cg.entity.User;
import com.cg.service.IUserService;

import java.util.List;


/**
 * 实现用户服务的接口
 */
public class UserServiceImpl implements IUserService {

    //new一个全局的userDao

    private IUserDao userDao = new UserDaoImpl();


    /**
     * 服务层，从userDao中调取findUser方法
     */
    public List<User> findUser() {
        return userDao.findUser();
    }

    /**
     * 服务层，从userDao中调取getUser方法
     *
     * @param userName
     */

    @Override
    public User getUser(String userName) {
        return userDao.getUser(userName);
    }

    /**
     * 服务层，从userDao中调取saveUser方法
     *
     * @param user
     */

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    /**
     * 服务层，从userDao中调取updateUser方法
     *
     * @param user
     */

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    /**
     * 服务层，从userDao中调取deleteUser方法
     *
     * @param id
     */

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }
}
