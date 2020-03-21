package com.ytz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: ConfigApplication
 * @Description: TODO
 * @Author: Administrator
 * @Date: 配置 主启动类   21:02
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableConfigServer  //开启配置服务端
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
