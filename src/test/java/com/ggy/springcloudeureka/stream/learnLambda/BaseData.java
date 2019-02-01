package com.ggy.springcloudeureka.stream.learnLambda;

import com.ggy.springcloudeureka.stream.model.Order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class BaseData {
    public static List<Order> orderList = new ArrayList<>();

    public static List<Integer>  nums = new ArrayList<>();

    public static HashSet<Integer> hashSet= new HashSet<Integer>();

    static {
        //存放list
        nums.add(1);nums.add(50);nums.add(10);nums.add(77);nums.add(7);nums.add(8);nums.add(4);nums.add(6);
        //存放hashset
        hashSet.add(55);hashSet.add(77);hashSet.add(66);
        hashSet.add(15);hashSet.add(37);hashSet.add(46);
        hashSet.add(57);hashSet.add(67);hashSet.add(96);
        hashSet.add(44);hashSet.add(12);hashSet.add(11);
        //存放对象
        orderList.add(new Order("4", new BigDecimal("4000"), "北京", "2018-12-12"));
        orderList.add(new Order("2", new BigDecimal("2000"), "深圳", "2018-12-12"));
        orderList.add(new Order("3", new BigDecimal("3000"), "郑州", "2018-12-12"));
        orderList.add(new Order("14", new BigDecimal("14000"), "郑州", "2018-12-12"));
        orderList.add(new Order("1", new BigDecimal("1000"), "上海", "2018-12-12"));
        orderList.add(new Order("5", new BigDecimal("5000"), "广州", "2018-12-12"));
        orderList.add(new Order("11", new BigDecimal("11000"), "湖北", "2018-12-12"));
        orderList.add(new Order("12", new BigDecimal("12000"), "湖北", "2018-12-12"));
        orderList.add(new Order("6", new BigDecimal("6000"), "辽宁", "2018-12-12"));
        orderList.add(new Order("8", new BigDecimal("8000"), "北京", "2018-12-12"));
        orderList.add(new Order("10", new BigDecimal("10000"), "北京", "2018-12-12"));
        orderList.add(new Order("9", new BigDecimal("9000"), "吉林", "2018-12-12"));
        orderList.add(new Order("13", new BigDecimal("13000"), "吉林", "2018-12-12"));
        orderList.add(new Order("7", new BigDecimal("7000"), "黑龙江", "2018-12-12"));
    }
}
