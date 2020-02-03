package com.li.pei.eureka.eurekacenter.thread;

import javax.validation.constraints.NotNull;
import java.util.concurrent.*;

/**
 * @Auther: lipei
 * @Date: 26/11/2018 09:21
 * @Description: pei Li
 */
public class MyThread extends Thread {

    private Integer index;

    public static String test() {
        try {
            return "1";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return null;
    }

    public MyThread(Integer index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println(this.index);
    }

    public static void main(@NotNull  String[] args) {

//        RejectedExecutionHandler r = new ThreadPoolExecutor.AbortPolicy();
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
//                new ArrayBlockingQueue<Runnable>(5), r);
//        for (int i = 0; i < 150; i++) {
//            MyThread myTask = new MyThread(i);
//            executor.execute(myTask);
//            System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" +
//                    executor.getQueue().size() + "，已执行玩别的任务数目：" + executor.getCompletedTaskCount());
//        }
//        executor.shutdown();
//
//        System.out.printf(MyThread.test());
        System.out.print(128&129);
    }
}
