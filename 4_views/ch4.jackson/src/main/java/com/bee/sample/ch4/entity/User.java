package com.bee.sample.ch4.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class User {

    @JsonIgnore
    private BigDecimal salary;

    @JsonView(IdView.class)
    private Integer id;

    @JsonView(IdNameView.class)
    private String name;

    public interface IdView {

    }

    public interface IdNameView extends IdView {

    }

}
