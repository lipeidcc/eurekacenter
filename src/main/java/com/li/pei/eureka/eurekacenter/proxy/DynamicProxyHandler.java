package com.li.pei.eureka.eurekacenter.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: lipei
 * @Date: 24/11/2018 16:36
 * @Description: pei Li
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxyed;

    public DynamicProxyHandler(Object proxyed) {
        this.proxyed = proxyed;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理工作了.");

        return method.invoke(proxyed, args);
    }

    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(
                Subject.class.getClassLoader(),real.getClass().getInterfaces(),
                new DynamicProxyHandler(real));

        proxy.dealTask("11");
    }
}
