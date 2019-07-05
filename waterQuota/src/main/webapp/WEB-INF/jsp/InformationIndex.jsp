<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>添加个人信息</title>
</head>
<body>
    <h1>Please input Information data!</h1>
    <form action="InfoSaveresult" name="insertForm" method="post">
        <p>
        <table border="1">
            <tr>
                <td>姓名</td>
                <td>年龄</td>
                <td>家庭住址</td>
            </tr>
            <tr>
                <td><input name="inName" type="text"/></td>
                <td><input name="inAge" type="text" /></td>
                <td><input name="inAddress" type="text"/></td>
            </tr>
        </table>
        </p>
        <tr>
            <td><input type="submit" value="确定" size="50"/></td>
            <td><input type="reset" value="取消" size="50"/></td>
        </tr>
    </form>
</body>

</html>