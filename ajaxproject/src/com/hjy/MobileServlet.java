package com.hjy;


import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;

public class MobileServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
          doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException, IOException {
        PrintWriter out = response.getWriter();
        String mobile = request.getParameter("mobile");
        Student  stu1 = new Student();
        stu1.setName("lisi");
        stu1.setAge(20);
        Student  stu2 = new Student();
        stu2.setName("zhangsan");
        stu2.setAge(21);
        Student  stu3 = new Student();
        stu3.setName("wangwu");
        stu3.setAge(22);
        JSONObject json = new JSONObject() ;
        json.put("stu1",stu1);
        json.put("stu2",stu2);
        json.put("stu3",stu3);

        out.print(json);

        out.close();
    }
}
