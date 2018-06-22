package com.cg.service.impl;

import com.cg.entity.generate.GoodsExample;
import com.cg.entity.generate.User;
import com.cg.mapper.generate.UserMapper;
import com.cg.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * 实现用户服务的接口
 */
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUser() {
        GoodsExample e = new GoodsExample();
        GoodsExample.Criteria criteria = e.createCriteria();
        return userMapper.selectByExample(e);
    }

    @Override
    public User getUser(String name) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}