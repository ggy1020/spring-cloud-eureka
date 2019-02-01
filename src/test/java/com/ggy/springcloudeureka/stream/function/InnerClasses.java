package com.ggy.springcloudeureka.stream.function;

import java.util.concurrent.*;

/**
 * 共享final内部变量
 * */
public class InnerClasses {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(1);
        final Future<?> task1 = ForkJoinPool.commonPool().submit(() -> {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                latch.countDown();//递减函数，如果执行这个方法，就释放latch所有的线程
            }
        });
        final Future<?> task2 = ForkJoinPool.commonPool().submit(() -> {
            final long start = System.currentTimeMillis();
            try {
                latch.await();//latch等待状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Done after " + (System.currentTimeMillis()
                        - start) + "ms");
            }
        });
        try {
            task1.get();
            task2.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
