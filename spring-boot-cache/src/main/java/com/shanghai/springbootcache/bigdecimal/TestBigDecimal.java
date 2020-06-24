package com.shanghai.springbootcache.bigdecimal;

import java.math.BigDecimal;

/**
 * @author caizhengjun
 * @date 2020/6/23 4:54 下午
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.001");
        System.out.println("a = " + a);

        BigDecimal b = new BigDecimal("0.01");
        System.out.println("b = " + b);


        BigDecimal add = a.add(b);//加法
        System.out.println("add = " + add);

        BigDecimal subtract = a.subtract(b);//减法
        System.out.println("subtract = " + subtract);

        BigDecimal multiply = a.multiply(b);
        System.out.println("multiply = " + multiply);

        BigDecimal divide = a.divide(b);
        System.out.println("divide = " + divide);

        int i = a.compareTo(b);
        System.out.println("i = " + i);

    }
}
