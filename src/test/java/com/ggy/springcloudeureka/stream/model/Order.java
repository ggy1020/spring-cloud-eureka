package com.ggy.springcloudeureka.stream.model;

import java.math.BigDecimal;

public class Order {
    private String id;
    private BigDecimal price;
    private String area;
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Order(String id, BigDecimal price, String area, String date) {
        this.id = id;
        this.price = price;
        this.area = area;
        this.date = date;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", area='" + area + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
