<%@ page import="com.cg.entity.Goods" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>商品评论</th>
        <th >操作</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Goods> goodsList = (List<Goods>) request.getAttribute("goodsList");
        for (int i = 0; i < goodsList.size(); i++) {
            Goods  goods= goodsList.get(i);
    %>
    <td><%=goods.getId()%></td>
    <td><%=goods.getName()%></td>
    <td><%=goods.getPrice()%></td>
    <td><%=goods.getRemark()%></td>
    <td><a
            href="<%=request.getContextPath()%>/goods?method=addShoppingCar&goodsId=<%=goods.getId()%>"><input
            class="btn_s" type="button" value="预购" /></a></td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
