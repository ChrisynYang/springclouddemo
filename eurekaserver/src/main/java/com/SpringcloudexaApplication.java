package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudexaApplication {

    public static void main(String[] args) {
        System.out.println("EurekaServer running");
        SpringApplication.run(SpringcloudexaApplication.class, args);
    }
}
