
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login?method=beforeLogin" method="post">

    <input type="text" name="user_name"  placeholder="用户名" />
    <input type="password" name="user_password"  placeholder="密码" />
    <input type="email" name="user_email"  placeholder="用户邮箱" />
    <button type="submit">登录</button>
</form>
</body>
</html>
