package com.hjy.testspringboot.controller;

import com.hjy.testspringboot.exception.Myexception;
import com.hjy.testspringboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FristController {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name") String name){
        if(name.equals("aaa")){

            throw  new Myexception();
        }
        helloService.printlnHello();
        return "hello world";
    }
}
