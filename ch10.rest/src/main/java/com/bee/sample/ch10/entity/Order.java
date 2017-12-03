package com.bee.sample.ch10.entity;

import java.util.Date;
import lombok.Data;

/**
 * @author yangyueming
 */
@Data
public class Order {

    String id;
    String name;
    Date createDate;
}
