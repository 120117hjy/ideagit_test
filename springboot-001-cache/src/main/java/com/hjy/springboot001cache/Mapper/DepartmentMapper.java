package com.hjy.springboot001cache.Mapper;

import com.hjy.springboot001cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department getDepartmentById(Integer id);
}
