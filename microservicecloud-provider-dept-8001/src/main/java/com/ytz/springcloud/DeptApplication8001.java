package com.ytz.springcloud;/**
 * @author ytzboy
 * @date 2020/3/20 9:27
 * @name: DeptApplication8001
 * @Description: TODO
 * @version 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *@ClassName: DeptApplication8001
 *@Description: TODO
 *@Author: Administrator
 *@Date: 主启动类   9:27
 *@Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class DeptApplication8001 {
    public static void main(String[] args)
    {
        SpringApplication.run(DeptApplication8001.class, args);
    }
}
