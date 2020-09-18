package cn.hjy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "cn.hjy.springboot.mapper")
@SpringBootApplication
public class SpringbootMybatis006Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatis006Application.class, args);
    }

}
