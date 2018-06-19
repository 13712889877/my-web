<%@ page import="com.cg.entity.generate.Goods" %>
<%@ page import="java.util.List" %>
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
                        <a class="" href="javascript:;">购物</a>
                        <dl class="layui-nav-child">
                            <dd><a href="/main-index">商品大全</a></dd>

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

        <div class="layui-body">

            <blockquote class="layui-elem-quote" style="margin-top:10px">通知：6月18号，全场商品，买一送一。</blockquote>

            <!-- 内容主体区域 -->
            <div style="padding:15px;">
                <div class="layui-carousel" id="test1" lay-filter="test1">
                    <div carousel-item="">
                        <div><img
                                src="https://m.360buyimg.com/babel/jfs/t21148/263/500139364/86146/4a473fcf/5b0f68bfN7031ac10.jpg"/>
                        </div>
                        <div><img
                                src="https://img1.360buyimg.com/da/jfs/t22210/6/857311990/97597/aea1d022/5b1a5f8eNfca48a3a.jpg"/>
                        </div>
                        <div><img src="https://image.suning.cn/uimg/aps/material/152846025226066530.jpg"/></div>
                        <div><img src="https://image.suning.cn/uimg/aps/material/152825001199159378.jpg"/></div>
                        <div><img src="https://image3.suning.cn/uimg/cms/img/152872236716215493.jpg"/></div>
                    </div>
                </div>
            </div>
            <div class="layui-fluid">
                <%
                    List<Goods> goodsList = (List<Goods>)request.getSession().getAttribute("SHOPPING_CAR");
                    for (int i = 0; i < goodsList.size(); i++) {
                        Goods goods = goodsList.get(i);
                        if((i+1)%4==1){

                %>
                <div class="layui-row layui-col-space1">
                    <div class="grid-demo grid-demo-bg1">
                        <div class="layui-fluid">
                            <img style="width:160px;height:220px;"
                                <%=goods.getUrl()%>>
                        </div>

                        <div class="layui-fluid">
                           <%=goods.getRemark()%>
                        </div>
                        <div class="layui-fluid">
                            <%=goods.getPrice()%>
                        </div>
                        <div class="layui-fluid">
                            <div class="layui-col-md6">
                                <button class="layui-btn">收藏</button>
                            </div>
                            <div class="layui-col-md6">
                                <button class="layui-btn add-shopping onclick=climeMe()"><input type="hidden"
                                                                                                value="<%=i+1%>"/>加入购物车
                                </button>
                            </div>
                        </div>
                    </div>
                <%}%>
                <%  if((i+1)%4==0) {
                %>
                </div>
                 <% }}%>
            </div>
        </div>
        <div class="layui-footer">
            <!-- 底部固定区域 -->
            © layui.com - 底部固定区域
        </div>
    </div>
</sc>
</html>