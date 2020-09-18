<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

  <title>My JSP 'index.jsp' starting page</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <!--
  <link rel="stylesheet" type="text/css" href="styles.css">
  -->
</head>
<script type="text/javascript" src="js/jquery1.10.2.js"></script>
<script type="text/javascript">
  function regist(){

    var  mobile = document.getElementById("mobile").value;
    alert(mobile);
    xmlHttpRequest = new XMLHttpRequest();
    xmlHttpRequest.onreadystatechange = callback;
    xmlHttpRequest.open("get", "MobileServlet?mobile="+mobile, true);
    xmlHttpRequest.send(null);

  }


  function  callback(){

    if(xmlHttpRequest.readyState ==4 && xmlHttpRequest.status==200){

      var data = xmlHttpRequest.responseText;
      if(data =="true"){
        alert("号码已存在");

      }else{
        alert("号码已注册");
      }
    }

  }
  function  registjq(){

    var mobile = $("mobile").val()
    $.ajax({
      url:"MobileServlet",
      method:"post",
      data:"mobile="+mobile,
      sync:true,
      dataType:"json",
      success:function(result,testStauts){
        var students = eval(result);
        $.each(students ,function (i,element) {
          alert(this.name+"-----"+this.age)
        })
        alert(student.name+"="+student.age);

      },
      error:function(xhr,errorMessage,e){
        alert("服务器发生异常");
      }

    })
  }
</script>
<body>
电话号码:<input id="mobile" type="text"/><br/>
<input type="button" value="提交" onclick="registjq()">
</body>
</html>
