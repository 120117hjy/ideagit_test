package com.hjy.springboot001cache.controller;

import com.hjy.springboot001cache.bean.Department;
import com.hjy.springboot001cache.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping(value = "/Dep/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id){

        return departmentService.getDepartmentById(id);
    }

}
