package com.ggy.springcloudeureka.stream;

import com.ggy.springcloudeureka.stream.learnLambda.BaseData;
import com.ggy.springcloudeureka.stream.model.Order;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.stream.Stream;

public class StreamDemo extends BaseData {
    public static void main(String[] args) {
        /*Arrays.stream(new String[]{"hello","word"}).forEach(System.out::println);
        int sum = Arrays.stream(new int[]{1,2,3}).reduce((a,b)->a+b).getAsInt();
        System.out.println(sum);*/
        Stream.of(1,2,3).map(v-> v+1).flatMap(v->Stream.of(v*5,v*10)).forEach(System.out::println);
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
       /* hashSet.stream().sorted().forEach(System.out::println);
        Stream<Order> limit = orderList.stream().limit(1);
        limit.forEach(System.out::println);*/
    }
}
