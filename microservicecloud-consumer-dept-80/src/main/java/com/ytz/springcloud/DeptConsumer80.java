package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *@ClassName: DeptConsumer80
 *@Description: TODO
 *@Author: Administrator
 *@Date: 主启动类
 *@Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class, args);
    }
}
