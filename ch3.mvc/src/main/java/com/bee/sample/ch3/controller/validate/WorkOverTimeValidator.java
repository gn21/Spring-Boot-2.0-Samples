package com.bee.sample.ch3.controller.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author yangyueming
 */
public class WorkOverTimeValidator implements ConstraintValidator<WorkOverTime, Integer> {

    private WorkOverTime work;
    private int max;

    @Override
    public void initialize(WorkOverTime work) {
        this.work = work;
        max = work.max();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value < max;
    }
}
