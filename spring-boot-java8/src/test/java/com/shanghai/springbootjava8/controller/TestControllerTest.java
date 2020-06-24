package com.shanghai.springbootjava8.controller;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author caizhengjun
 * @date 2020/6/24 3:24 下午
 */
@SpringBootTest
public class TestControllerTest {

    @Test
    public void test1() {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(1, 4, 5, 6);

        Stream.concat(stream1, stream2).filter(integer -> integer > 3).forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<String> collect = Stream.of("one", "two", "three", "four")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    @Test
    public void test3() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        OptionalInt max = stream.mapToInt(Integer::shortValue).max();
        max.ifPresent(System.out::println);
    }

    @Test
    public void test4() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        IntSummaryStatistics collect = stream.collect(Collectors.summarizingInt(Integer::shortValue));
        System.out.println("collect = " + collect);

        double average = collect.getAverage();
        long count = collect.getCount();
        int max = collect.getMax();
        int min = collect.getMin();
        long sum = collect.getSum();

        System.out.println("average = " + average);
        System.out.println("count = " + count);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
    }

    @Test
    public void test5() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Double collect = stream.collect(Collectors.averagingInt(Integer::shortValue));
        System.out.println("collect = " + collect);
    }

    @Test
    public void test6() {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
        String collect = stream.collect(Collectors.joining(","));
        System.out.println("collect = " + collect);
    }

    @Test
    public void test7() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer reduce = stream.reduce(0, Integer::sum);
        System.out.println("reduce = " + reduce);
    }

    @Test
    public void test8() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer collect = stream.reduce(0, Integer::sum);
        System.out.println("collect = " + collect);
    }

    @Test
    public void test9() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.parallelStream().forEach(System.out::println);
    }

    @Test
    public void test10() {
        String s = "";
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
    }

    @Test
    public void test11() {
        if (42 == 42.0) {
            System.out.println("equal");
        }
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        ReentrantLock reentrantLock = new ReentrantLock();

    }
}