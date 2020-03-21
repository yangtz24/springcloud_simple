package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: ZuulApplication
 * @Description: TODO
 * @Author: Administrator
 * @Date: zuul 网关主启动类   20:18
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableZuulProxy // 开启网关服务
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
