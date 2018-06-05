<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>主界面</title>
</head>
<body>
<h2>
    欢迎光临，<br>
    <%
        Map<String, String> map = (HashMap<String, String>) request.getAttribute("map");
        for (Map.Entry<String, String> entry : map.entrySet()) {
    %>
    <p>用户<%=entry.getKey()%>
    </p>
    <%
  }%>
</h2>
</body>
</html>