package cn.hjy.springboot.controller;

import cn.hjy.springboot.bean.Department;
import cn.hjy.springboot.mapper.DepartmnetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmnetMapper departmentMapper;

    @GetMapping("/get/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id){

        Department  department = departmentMapper.getDepartmentById(id);
        return department;
    }
}
