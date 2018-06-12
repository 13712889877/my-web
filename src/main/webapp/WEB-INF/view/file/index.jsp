<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>主界面</title>
</head>
<body>
<%=request.getAttribute("errorMsg")%>
<a
        href="<%=request.getContextPath()%>/login?method=beforeLogin"><input
        class="btn_s" type="button" value="返回登录列表"/></a>

</body>
</html>