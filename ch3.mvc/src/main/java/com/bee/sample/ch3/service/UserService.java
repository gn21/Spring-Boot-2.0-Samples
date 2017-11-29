package com.bee.sample.ch3.service;

import com.bee.sample.ch3.entity.User;
import java.util.List;

/**
 * @author yangyueming
 */
public interface UserService {

    List<User> allUser();

    User getUserById(Long id);

    void updateUser(Long id, Integer type);
}
