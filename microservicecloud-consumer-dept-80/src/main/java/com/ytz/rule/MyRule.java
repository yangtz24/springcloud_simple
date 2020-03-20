package com.ytz.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyRule
 * @Description: TODO
 * @Author: Administrator
 * @Date: 自定义 路由规则   16:52
 * @Version: 1.0
 **/
@Configuration
public class MyRule {

    public IRule myRule() {
//        return new RoundRobinRule();//默认  轮循
//        return new RandomRule();// 使用随机
        return new MyRandomRule();//自定义随机路由规则  每个服务访问5次
    }
}
