package com.bee.sample.ch3.controller.form;

import com.bee.sample.ch3.controller.validate.WorkOverTime;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 * @author yangyueming
 */
@Data
public class WorkInfoForm {

    @NotNull(groups = {Update.class})
    @Null(groups = {Update.class})
    private Long id;
    @Size(min = 3, max = 20)
    private String name;
    @Email
    private String email;
    @WorkOverTime(max = 5)
    private Integer workTime;

    public interface Update {

    }

    public interface Add {

    }

}
