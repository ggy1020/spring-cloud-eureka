package com.ggy.springcloudeureka.stream;

import com.sun.org.apache.xpath.internal.operations.String;

@FunctionalInterface
public interface FunctionalTest {

    int calculate(int a, int b);

    default String sayHello(String name){
        return  name;
    }
}
