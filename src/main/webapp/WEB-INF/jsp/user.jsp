<%--
  Created by IntelliJ IDEA.
  User: Jerk
  Date: 2019/5/30
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
        <form action="/addUser" method="post">

            username:<input type="text" name="username" value="张三">
            age:<input type="text" name="age" value="12">
            address:<input type="text" name="address.name" value="南京">
            <input type="submit" value="提交">
        </form>
</body>
</html>
