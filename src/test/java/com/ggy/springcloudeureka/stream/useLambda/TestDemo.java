package com.ggy.springcloudeureka.stream.useLambda;

public class TestDemo {
    public static void main(String[] args) {
       Home home = new Home();

       //骑车
        Bike bike = new Bike();
        home.goHome(bike);

        //匿名内部类
        home.goHome(new Vehicle() {
            @Override
            public void gohometool() {
                System.out.println("匿名内部类，跑回家");
            }
        });

        //Lambd实现
        home.goHome(()-> System.out.println("Lambd实现 走回家"));
    }
}
