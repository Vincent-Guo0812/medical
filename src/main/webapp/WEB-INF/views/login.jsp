<%--
  Created by IntelliJ IDEA.
  User: 32880
  Date: 2019/1/3
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/login" method="post">
    username:<input type="text" name="id"/><br>
    password:<input type="password" name="password"/><br>
    <input type="submit" value="登录">${error}
</form>


</body>
</html>
