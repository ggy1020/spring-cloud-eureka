package com.ggy.springcloudeureka.stream.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
/**
 * 高阶函数示例
 * */
public class HighOrderFunctions {
    private static <T> Predicate<T> notEqual(T t) {
        return (v) -> !Objects.equals(v, t);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.stream().filter(notEqual(1)).forEach(System.out::println);
    }
}

