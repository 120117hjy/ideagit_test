package com.hjy.testspringboot.controller;

import com.hjy.testspringboot.dao.DepartmentDao;
import com.hjy.testspringboot.dao.EmployeeDao;
import com.hjy.testspringboot.entities.Department;
import com.hjy.testspringboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping(value = "/emps")
    public String list(Model modle){

        Collection<Employee> employeelist =  employeeDao.getAll();
        modle.addAttribute("employeelist",employeelist);
       return   "list";
    }

    @GetMapping(value = "/emp")
    public String emp(Model modle){


        Collection<Department> departments = departmentDao.getDepartments();
        modle.addAttribute("departments",departments);
        return   "add";
    }

    @PostMapping(value = "/emp")
    public String empadd(Employee employee){

        employeeDao.save(employee);
        return   "redirect:/emps";
    }

    @GetMapping(value = "/emp/{id}")
    public String empupdate(@PathVariable Integer id,Model modle){

        Collection<Department> departments = departmentDao.getDepartments();
        Employee employee = employeeDao.get(id);
        modle.addAttribute("departments",departments);
        modle.addAttribute("employee",employee);
        return   "add";
    }
}
