package com.bee.sample.ch3.controller.form;

import com.bee.sample.ch3.entity.Order;
import com.bee.sample.ch3.entity.OrderDetail;
import java.util.List;
import lombok.Data;

@Data
public class OrderPostForm {

    private Order order;
    private List<OrderDetail> details;

}
