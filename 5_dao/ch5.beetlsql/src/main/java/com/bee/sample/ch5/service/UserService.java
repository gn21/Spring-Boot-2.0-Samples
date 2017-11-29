package com.bee.sample.ch5.service;

import com.bee.sample.ch5.entity.User;
import java.util.List;

public interface UserService {

    public User getUserById(Integer id);

    public List<User> select(String name);

}
