package com.hjy.springboot001cache;

import com.hjy.springboot001cache.Mapper.DepartmentMapper;
import com.hjy.springboot001cache.bean.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class Springboot001CacheApplicationTests {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    RedisTemplate<Object, Department> depRedisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {

        Department department = departmentMapper.getDepartmentById(1);
        System.out.println(department);
    }

    @Test
    void testRedisStringTemplate() {

        stringRedisTemplate.opsForValue().append("d1","f");
        stringRedisTemplate.opsForList().leftPush("mylist","s1");
        stringRedisTemplate.opsForList().leftPush("mylist","s2");
    }

    @Test
    void testRedisTemplate() {

        Department department = departmentMapper.getDepartmentById(1);
        depRedisTemplate.opsForValue().set("dep",department);
    }
}
