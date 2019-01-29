package com.ggy.springcloudeureka.stream;

import java.lang.reflect.Array;

public class FunctionDemo {
    public static void main(String[] args) {
        // 将两个入参做加法操作，并返回相加后结果
        test(3, 5, (i, j) -> i + j);
    }

    private static void test(int i, int j, FunctionalTest functionalTest) {
        if (functionalTest.calculate(i, j) > 10) {
            System.out.println("计算结果大于 10");
            return;
        }
        System.out.println("计算结果小于 10");
    }
}
