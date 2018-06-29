<%@ page import="com.cg.entity.generate.Goods" %>
<%@ page import="java.util.List" %>
<%@ page import="com.cg.entity.ShoppingCar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>购物</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <style type="text/css" >

        .bt{float:right;clear:both;
        color:red;
            font-size:20px;}

    </style>
</head>
<sc class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">购物界面</div>
            <!-- 头部区域（可配合layui已有的水平导航） -->
            <ul class="layui-nav layui-layout-left">
                <li class="layui-nav-item"><a href="">控制台</a></li>
                <li class="layui-nav-item"><a href="">商品管理</a></li>
                <li class="layui-nav-item"><a href="">用户</a></li>
                <li class="layui-nav-item">
                    <a href="javascript:;">其它系统</a>
                    <dl class="layui-nav-child">
                        <dd><a href="">邮件管理</a></dd>
                        <dd><a href="">消息管理</a></dd>
                        <dd><a href="">授权管理</a></dd>
                    </dl>
                </li>
            </ul>
            <ul class="layui-nav layui-layout-right">
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                        贤心
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="">基本资料</a></dd>
                        <dd><a href="">安全设置</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">退了</a></li>
            </ul>
        </div>
        <div class="layui-side layui-bg-black">
            <div class="layui-side-scroll">
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree" lay-filter="test">
                    <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="/cart/list">购物</a>
                        <dl class="layui-nav-child">
                            <dd><a href="/cart/carList">购物车</a></dd>

                            <dd><a href="">超链接</a></dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;">解决方案</a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;">列表一</a></dd>
                            <dd><a href="javascript:;">列表二</a></dd>
                            <dd><a href="">超链接</a></dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item"><a href="">云市场</a></li>
                    <li class="layui-nav-item"><a href="">发布商品</a></li>
                </ul>
            </div>
        </div>
        <form action="/cart/carList" method="post">
        <div class="layui-body">
            <blockquote class="layui-elem-quote" style="margin-top:10px">通知：6月18号，全场商品，买一送一。</blockquote>
            <div class="layui-fluid">
                <table class="layui-table" lay-skin="line">
                    <colgroup>
                        <col width="150">
                        <col width="150">
                        <col width="200">
                        <col>
                    </colgroup>
                    <thead>
                    <tr>
                        <th>商品ID</th>
                        <th>商品名称</th>
                        <th>商品数量</th>
                        <th>商品单价</th>
                        <th>小计</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <%
                        ShoppingCar car = (ShoppingCar) request.getAttribute("sessionList");
                        List<Goods> goodsList = car.getGoodList();
                        for (int i = 0; i < goodsList.size(); i++) {
                            Goods goods = goodsList.get(i);

                    %>
                    <tr>
                        <td><%=goods.getId()%>
                        </td>
                        <td><%=goods.getName()%>
                        </td>
                        <td><%=goods.getNumber()%>
                        </td>
                        <td><%=goods.getPrice()%>
                        </td>
                        <td><%=goods.getNumber()*goods.getPrice()%></td>
                        <td><a
                                href="<%=request.getContextPath()%>/cart/delete/<%=goods.getId()%>"><input
                                class="btn_s" type="button" value="删除"/></a></td>
                    </tr>
                    <%}%>
                    </tbody>
                </table>
                <a class="bt" >总金额：<%=car.calswewewe()%>元</a>
                <input type="button" class="bt" onclick="javascript:window.location='http://www.0756cn.com'" value= "结账">

            </div>
        </div>
        <div class="layui-footer">
            <!-- 底部固定区域 -->
            © layui.com - 底部固定区域
        </div>
    </div>
</sc>
</html>