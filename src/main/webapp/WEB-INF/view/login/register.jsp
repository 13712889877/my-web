<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login?method=beforeLogin" method="post">

    <input type="text" name="userName" placeholder="用户名"/>
    <input type="password" name="userPassword" placeholder="密码"/>
    <input type="email" name="userEmail" placeholder="用户邮箱"/>
</form>
</body>
</html>