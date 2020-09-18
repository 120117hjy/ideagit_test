package com.hjy.testspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String loginsign(@RequestParam String username, @RequestParam String password,Map<String,String> map, HttpSession session
                            ) {

        if (!StringUtils.isEmpty(username) && "123".equals(password) ){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        } else {
            map.put("msg","密码不正确");
            return "login";
        }
    }
}
