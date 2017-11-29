package com.bee.sample.ch5.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User implements Serializable {

    private Integer id;
    private Integer departmentId;
    //部门
    private String name;
    //创建时间
    private Date createTime;

}
