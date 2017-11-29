package com.bee.sample.ch5.service.impl;

import com.bee.sample.ch5.dao.UserDao;
import com.bee.sample.ch5.entity.User;
import com.bee.sample.ch5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User geUserById(Long id) {
        return userDao.findUserById(id);
    }
}
