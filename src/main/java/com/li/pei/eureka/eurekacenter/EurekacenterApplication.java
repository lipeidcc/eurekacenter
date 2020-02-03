package com.li.pei.eureka.eurekacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerExceptionResolver;

@EnableEurekaServer
@SpringBootApplication
public class EurekacenterApplication {
    @Bean
    public HandlerExceptionResolver sentryExceptionResolver() {
        return new io.sentry.spring.SentryExceptionResolver();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekacenterApplication.class, args);
    }
}
