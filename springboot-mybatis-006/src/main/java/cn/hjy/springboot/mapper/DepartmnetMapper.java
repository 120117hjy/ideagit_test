package cn.hjy.springboot.mapper;

import cn.hjy.springboot.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepartmnetMapper {

    @Select("select * from department where id = #{id}")
    public Department getDepartmentById(Integer id);
}
