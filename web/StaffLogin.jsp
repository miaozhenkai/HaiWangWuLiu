<%--
  Created by IntelliJ IDEA.
  User: 刘顺玲
  Date: 2019/6/20
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>快递员登录</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/staff/staffLogin.action">

    用户名:<input name="staffUserName" placeholder="用户名" type="text" ><br>

    密码:<input name="staffPwd" placeholder="密码" type="password"><br>

    <input value="登录"  type="submit"><input type="reset" value="重置"><br>
    </form>
</body>
</html>
