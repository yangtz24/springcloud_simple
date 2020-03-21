package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ytzboy
 * @version 1.0
 * @date 2020/3/20 21:22
 * @name: DeptHystrixApplication8001
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
@EnableHystrix  //开启熔断机制
public class DeptHystrixApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptHystrixApplication8001.class, args);
    }
}
