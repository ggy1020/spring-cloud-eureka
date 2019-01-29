package com.ggy.springcloudeureka.stream;


import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {

        // 1.1使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world4444 !");
            }
        }).start();

// 1.2使用 lambda expression
        new Thread(() -> System.out.println("Hello world4554 !")).start();

// 2.1使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world2422 !");
            }
        };

// 2.2使用 lambda expression
        Runnable race2 = () -> System.out.println("Hello world 222222!");

// 直接调用 run 方法(没开新线程哦!)
        race1.run();
        race2.run();
    }

    public static void LambdaForEach(){

        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.println(player+";"));
        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);
    }
}
