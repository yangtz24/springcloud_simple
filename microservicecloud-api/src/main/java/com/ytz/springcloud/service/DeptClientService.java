package com.ytz.springcloud.service;

import com.ytz.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @InterfaceName: DeptClientService
 * @Description: TODO
 * @Author: Administrator
 * @Date: 服务暴露接口
 * @Version: 1.0
 **/
//@Service
@FeignClient(value = "MICROSERVICECLOUD-DEPT")  //服务名称
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean add(Dept dept);
}
