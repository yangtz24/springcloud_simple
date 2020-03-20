package com.ytz.springcloud.service;

import java.util.List;

import com.ytz.springcloud.entities.Dept;

public interface DeptService
{
	boolean add(Dept dept);

	Dept get(Long id);

	List<Dept> list();
}
