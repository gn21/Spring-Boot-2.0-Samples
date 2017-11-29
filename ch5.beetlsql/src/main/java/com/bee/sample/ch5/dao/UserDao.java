package com.bee.sample.ch5.dao;

import com.bee.sample.ch5.entity.User;
import java.util.List;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

@SqlResource("www.user")
public interface UserDao extends BaseMapper<User> {

    public List<User> selectSample(User query);
}