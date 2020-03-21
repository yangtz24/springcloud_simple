package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: DeptConsumerFeign
 * @Description: TODO
 * @Author: Administrator
 * @Date: 主启动类   18:02
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ytz.springcloud.service"})  //开启feign客户端
@ComponentScan(basePackages = {"com.ytz.springcloud"})
public class DeptConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign.class, args);
    }
}
