
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login?method=login" method="post">

    <input type="text" name="userName"  placeholder="用户名" />
    <input type="password" name="userPassword"  placeholder="密码" />
    <button type="submit">登录</button>
</form>
</body>
</html>
