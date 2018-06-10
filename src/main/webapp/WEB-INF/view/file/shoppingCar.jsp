<%@ page import="com.cg.entity.ShoppingCar" %>
<%@ page import="java.util.List" %>
<%@ page import="com.cg.entity.Goods" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>商品数量</th>
        <th>商品总价</th>
        <th>商品评论</th>
        <th>操作</th>
        <th> 消费总金额</th>
    </tr>
    </thead>
    <tbody>
    <%
        ShoppingCar car = (ShoppingCar) session.getAttribute("SHOPPING_CAR");
        List<Goods> goodsList = car.getGoodList();
        for (int i = 0; i < goodsList.size(); i++) {
            Goods goods = goodsList.get(i);
    %>
    <td><%=goods.getId()%>
    </td>
    <td><%=goods.getName()%>
    </td>
    <td><%=goods.getPrice()%>
    </td>
    <td><%=goods.getNumber()%>
    </td>
    <td><%=goods.getNumber() * goods.getPrice()%>
    </td>
    <td><%=goods.getRemark()%>
    </td>


    <td><a
            href="<%=request.getContextPath()%>/goods?method=delete&id=<%=goods.getId()%>"><input
            class="btn_s" type="button" value="删除"/></a></td>
    </tr>

    <%
        }
    %>
    </tbody>

    <td><%=car.getTotalPrice()%></td>
    <a
            href="<%=request.getContextPath()%>/goods?method=shopList"><input
            class="btn_s" type="button" value="返回商品列表"/></a>
</table>
</body>
</html>
