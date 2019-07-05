<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>添加个人信息</title>
</head>
<body>
        <table border="1">
            <tr>
                <td>姓名</td>
                <td>年龄</td>
                <td>家庭住址</td>
            </tr>
          <%
          
           %>
            <tr>
                <td>${information.inName}</td>
                <td>${information.inAge}</td>
                <td>${information.inAddress}</td>
            </tr>
        </table>
</body>

</html>