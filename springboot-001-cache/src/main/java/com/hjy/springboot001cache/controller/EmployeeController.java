package com.hjy.springboot001cache.controller;

import com.hjy.springboot001cache.bean.Department;
import com.hjy.springboot001cache.bean.Employee;
import com.hjy.springboot001cache.service.AsyncService;
import com.hjy.springboot001cache.service.DepartmentService;
import com.hjy.springboot001cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    AsyncService asyncService;

    @GetMapping(value = "/emp/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id){

        asyncService.sayHello();
        return employeeService.getDepartmentById(id);
    }
}
