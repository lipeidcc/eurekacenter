package com.li.pei.eureka.eurekacenter.proxy;

import java.lang.reflect.Proxy;

/**
 * @Auther: lipei
 * @Date: 24/11/2018 16:14
 * @Description: pei Li
 */
public class ProxySubject implements Subject {
    Subject delegate;

    public ProxySubject(Subject subject) {
        this.delegate = subject;
    }

    @Override
    public void dealTask(String taskName) {
        delegate.dealTask(taskName);
    }
}
