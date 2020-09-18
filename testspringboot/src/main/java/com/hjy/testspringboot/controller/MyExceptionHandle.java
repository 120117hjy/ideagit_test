package com.hjy.testspringboot.controller;

import com.hjy.testspringboot.exception.Myexception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandle {

//    @ResponseBody
////    @ExceptionHandler(Myexception.class)
////    public Map<String,Object>  exceptionHandler(Exception e){
////
////        Map<String,Object> map = new HashMap<>();
////        map.put("code","user.notexist");
////        map.put("message",e.getMessage());
////        return map;
////    }

    @ExceptionHandler(Myexception.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();

        request.setAttribute("javax.servlet.error.status_code",400);
        map.put("code","user.notexist");
        map.put("message","用户出错啦");

        request.setAttribute("ext",map);
        //转发到/error
        return "forward:/error";
    }
}
