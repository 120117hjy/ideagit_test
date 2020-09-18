package com.hjy.springboot001cache.Mapper;

import com.hjy.springboot001cache.bean.Department;
import com.hjy.springboot001cache.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    public Employee getEmployeeById(Integer id);
}
