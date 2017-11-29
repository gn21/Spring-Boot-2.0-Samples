package com.bee.sample.ch6.service;

import com.bee.sample.ch6.entity.User;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User findUser(int id);

    Integer addUser(User user);

    List<User> getAllUser(int start, int end);

    User getUser(String name);

    User getUser(String name, Integer departmentId);

    Page<User> queryUser(Integer departmentId, Pageable page);

    Page<User> queryUser2(Integer departmentId, Pageable page);

    List<User> getByExample(String name);

    void updateUser();
}
