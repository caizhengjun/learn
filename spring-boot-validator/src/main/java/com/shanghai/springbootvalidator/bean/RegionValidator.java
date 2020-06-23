package com.shanghai.springbootvalidator.bean;

import com.shanghai.springbootvalidator.annotation.Region;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/23 1:53 下午
 */
public class RegionValidator implements ConstraintValidator<Region, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        HashSet<Object> regions = new HashSet<>();
        regions.add("China");
        regions.add("China-Taiwan");
        regions.add("China-HongKong");
        return regions.contains(value);
    }
}
