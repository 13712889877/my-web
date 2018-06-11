<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车商品显示</title>
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

    <a href="<%=request.getContextPath()%>/goods?method=shopList"><input
            class="btn_s" type="button" value="返回商品列表"/></a>
</table>
</body>
</html>
