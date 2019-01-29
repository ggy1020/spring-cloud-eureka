package com.ggy.springcloudeureka.stream.learnLambda;

import com.ggy.springcloudeureka.stream.model.Order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BaseData {
    public static List<Order> orderList = new ArrayList<>();

    static {
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
