# Spring Cloud 微服务架构搭建
## 1.简介

​	**Spring Cloud**是一系列框架的有序集合。它利用[Spring Boot](https://baike.baidu.com/item/Spring%20Boot/20249767)的开发便利性巧妙地简化了分布式系统基础设施的开发，如服务发现注册、配置中心、消息总线、负载均衡、断路器、数据监控等，都可以用**Spring Boo**t的开发风格做到一键启动和部署。**Spring Cloud**并没有重复制造轮子，它只是将各家公司开发的比较成熟、经得起实际考验的服务框架组合起来，通过**Spring Boot**风格进行再封装屏蔽掉了复杂的配置和实现原理，最终给开发者留出了一套简单易懂、易部署和易维护的分布式系统开发工具包。

## 2.注册中心（Eureka ）

​	Spring Cloud Eureka 是 Spring Cloud Netflix 微服务套件中的一部分，它基于Netflix Eureka 做了二次封装，主要负责完成微服务架构中的服务治理功能。

## 3.负载均衡（Ribbon）

## 4.HTTP客户端（Feign）

​	Feign是一种声明式、模板化的HTTP客户端。

## 5.服务熔断（Hystrix）

## 6.网关（ZUUL）

## 7.事件、消息总线（Bus）

## 8.配置管理（Config）