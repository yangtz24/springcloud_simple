package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServer7001
 * @Description: TODO
 * @Author: Administrator
 * @Date: 主启动类   10:48
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer  //开启Eureka服务端
public class EurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class, args);
    }
}
