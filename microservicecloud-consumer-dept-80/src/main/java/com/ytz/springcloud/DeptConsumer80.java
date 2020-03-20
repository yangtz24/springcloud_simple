package com.ytz.springcloud;

import com.ytz.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 *@ClassName: DeptConsumer80
 *@Description: TODO
 *@Author: Administrator
 *@Date: 主启动类
 *@Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载自定义Ribbon配置类，从而使配置生效
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= MyRule.class)
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class, args);
    }
}
