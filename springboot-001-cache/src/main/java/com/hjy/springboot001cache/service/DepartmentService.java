package com.hjy.springboot001cache.service;


import com.hjy.springboot001cache.Mapper.DepartmentMapper;
import com.hjy.springboot001cache.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;
    @Cacheable(value={"dep"},key ="#id")
    public Department getDepartmentById(Integer id){

       return departmentMapper.getDepartmentById(id);
    }

}
