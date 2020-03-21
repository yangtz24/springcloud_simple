package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: DeptHystrixDashboardApplication
 * @Description: TODO
 * @Author: Administrator
 * @Date: 熔断监控主启动类   10:13
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableHystrixDashboard // 开启监控
public class DeptHystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptHystrixDashboardApplication.class, args);
    }
}
