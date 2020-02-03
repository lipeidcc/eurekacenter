package com.li.pei.eureka.eurekacenter.config;

import io.sentry.Sentry;
import io.sentry.spring.SentryExceptionResolver;
import io.sentry.spring.SentryServletContextInitializer;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;

import javax.annotation.PostConstruct;

/**
 * @Auther: lipei
 * @Date: 31/10/18 09:29
 * @Description: pei Li
 */
@Configuration
public class SentryConfig {
    @Bean
    public HandlerExceptionResolver sentryExceptionResolver() {
        return new SentryExceptionResolver();
    }

    @Bean
    public ServletContextInitializer sentryServletContextInitializer() {
        return new SentryServletContextInitializer();
    }

    @PostConstruct
    public void init() {
        Sentry.init("https://44dba742f6554b7fa784a540c38e8311@sentry.io/1312594").setEnvironment("dev");
    }
}
