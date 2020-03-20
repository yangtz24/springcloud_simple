package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: DeptConsumerFeign
 * @Description: TODO
 * @Author: Administrator
 * @Date: 主启动类   18:02
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign.class, args);
    }
}
