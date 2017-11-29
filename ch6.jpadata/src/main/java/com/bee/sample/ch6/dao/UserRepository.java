package com.bee.sample.ch6.dao;

import com.bee.sample.ch6.entity.User;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByName(String name);

    @Query("select u from User u where u.name=?1 and u.department.id=?2")
    User findUserByDepartment(String name, Integer departmentId);

    @Query(value = "SELECT * FROM user WHERE name=?1 AND department_id=?2", nativeQuery = true)
    User nativeQuery(String name, Integer departmentId);

    @Query(value = "SELECT * FROM user WHERE name=:name AND department_id=:departmentId", nativeQuery = true)
    User nativeQuery2(@Param("name") String name,
        @Param("departmentId") Integer departmentId);

    @Query(value = "SELECT department_id,count(1) total FROM user GROUP BY department_id", nativeQuery = true)
    List<Object[]> queryUserCount();

    @Query(value = "SELECT id FROM user WHERE department_id=?1", nativeQuery = true)
    List<Integer> queryUserIds(Integer departmentId);

    @Query(value = "select u from User u where u.department.id=?1")
    Page<User> queryUsers(Integer departmentId, Pageable page);

}
