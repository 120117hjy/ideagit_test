package com.hjy.testspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
//@ImportResource(locations = {"classpath:bean.xml"})
/*@ComponentScan("com.hjy")*/
public class TestspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestspringbootApplication.class, args);
    }

}
