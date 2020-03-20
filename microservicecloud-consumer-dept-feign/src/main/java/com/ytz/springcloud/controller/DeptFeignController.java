package com.ytz.springcloud.controller;

import com.ytz.springcloud.entities.Dept;
import com.ytz.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: DeptFeignController
 * @Description: TODO    消费者  feign
 * @Author: Administrator
 * @Date: feign Controller   20:24
 * @Version: 1.0
 **/
@RestController
public class DeptFeignController {

    @Autowired
    private DeptClientService service;

    @GetMapping("consumer/dept/{id}")
    public Dept get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("consumer/dept")
    public List<Dept> list() {
        return service.list();
    }

    @PostMapping("consumer/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }



}
