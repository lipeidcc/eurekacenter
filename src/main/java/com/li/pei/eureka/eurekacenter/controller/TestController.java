package com.li.pei.eureka.eurekacenter.controller;

import io.sentry.Sentry;
import io.sentry.event.UserBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import java.lang.reflect.Proxy;

/**
 * @Auther: lipei
 * @Date: 31/10/18 09:10
 * @Description: pei Li
 */
@RestController

public class TestController implements Lpei{
    long PAY_PASSWD = 78541258611L;

    @RequestMapping("test")
    public String test() {
        Sentry.getContext().setUser(
                new UserBuilder().setUsername("黎沛").build()
        );
        throw new RuntimeException("111");
//        return "hello world";
    }


    public static String aaa() throws InterruptedException {
        try {
            return "a";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(5000L);
            return "B";
        }
    }

    public static void main(String[] args) {
        TestController t = new TestController();
        for (Class c : t.getClass().getClass().getInterfaces()) {
            System.out.printf(c.getName());
        }



    }
}
