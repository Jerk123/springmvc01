<%--
  Created by IntelliJ IDEA.
  User: Jerk
  Date: 2019/5/30
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
<form action="/student/1" method="post">
    <input type="submit" value="提交">
</form>

<form action="/student/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="put提交">
</form>

<form action="/student/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="delete提交">
</form>
</body>
</html>
