package com.bee.sample.ch3.service.impl;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author yangyueming
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> allUser() {
        return sampleUser(5);
    }


    @Override
    public User getUserById(Long id) {
        User user = sampleUser(1).get(0);
        user.setId(id);
        return user;
    }


    private List<User> sampleUser(int num) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            User user = new User();
            user.setId((long) i);
            user.setName("mame" + i);
            userList.add(user);
        }
        return userList;
    }


    @Override
    public void updateUser(Long id, Integer type) {
        // TODO Auto-generated method stub

    }
}
