package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: ConfigEurekaApplication
 * @Description: TODO
 * @Author: Administrator
 * @Date: config eureka主启动类   21:33
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaApplication.class, args);
    }
}
