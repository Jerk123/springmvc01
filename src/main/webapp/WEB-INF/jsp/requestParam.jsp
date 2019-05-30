<%--
  Created by IntelliJ IDEA.
  User: Jerk
  Date: 2019/5/30
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/requestParam1?id=1">我是一个传参的请求</a><br>
    <a href="/requestParam2?id=1">我是一个传参的请求(参数名不同)</a><br>
    <a href="/requestParam3?id=1">我是一个传参的请求(参数名一定要有)</a><br>
    <a href="/requestParam4?pageNum=1">我是一个传参的请求(参数名有默认值)</a><br>
    <a href="/requestParam5?id=1&age=12">我是一个传参的请求(多个参数)</a><br>
</body>
</html>
