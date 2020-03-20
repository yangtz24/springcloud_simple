package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: DeptApplication8003
 * @Description: TODO
 * @Author: Administrator
 * @Date: 主启动类   15:23
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class DeptApplication8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptApplication8003.class, args);
    }
}
