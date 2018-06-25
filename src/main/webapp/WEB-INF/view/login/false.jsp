<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="/login/beforeRegister" method="post">

    <input type="text" name="userName" placeholder="用户名"/>
    <input type="password" name="userPassword" placeholder="密码"/>
    <button type="submit">登录</button>
    <a href="/login/beforeRegister">
        <button>注册</button>
    </a><br>
    <%=request.getAttribute("errorMsg") == null ? "" : request.getAttribute("errorMsg")%>
    <a>注册失败</a><br>
</form>
</body>
</html>
