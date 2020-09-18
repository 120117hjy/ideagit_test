package com.hjy.springboot001cache.service;

import com.hjy.springboot001cache.Mapper.EmployeeMapper;
import com.hjy.springboot001cache.bean.Department;
import com.hjy.springboot001cache.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(value={"emp1"},key ="#id")
    public Employee getDepartmentById(Integer id){

        return  employeeMapper.getEmployeeById(id);
    }
}
