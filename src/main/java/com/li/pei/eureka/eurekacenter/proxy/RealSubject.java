package com.li.pei.eureka.eurekacenter.proxy;

/**
 * @Auther: lipei
 * @Date: 24/11/2018 16:12
 * @Description: pei Li
 */
public class RealSubject implements Subject {
    @Override
    public void dealTask(String taskName) {
        System.out.println("正在执行任务：" + taskName);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
