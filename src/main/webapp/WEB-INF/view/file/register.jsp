
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/login?method=beforeLogin" method="post">

    <input type="text" name="userName"  placeholder="用户名" />
    <input type="password" name="userPassword"  placeholder="密码" />
    <input type="email" name="userEmail"  placeholder="用户邮箱" />
    <span style="font-size:18px;"> <button type="submit">注册</button> </span><span style="font-size:24px;"><meta http-equiv="refresh" content="3;URL=http://localhost:9090/login?method=login  "> </span>

</form>
</body>
</html>