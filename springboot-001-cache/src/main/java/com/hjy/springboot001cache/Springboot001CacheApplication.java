package com.hjy.springboot001cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching
@EnableAsync
@MapperScan("com.hjy.springboot001cache.Mapper")
public class Springboot001CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot001CacheApplication.class, args);
    }

}
