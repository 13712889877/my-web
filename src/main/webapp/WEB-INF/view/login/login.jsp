<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <title>登录界面</title>
    <style>

    </style>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>账号登录</legend>
</fieldset>
<form action="/login/signin" method="post">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label style="width:120px; height:35px" class="layui-form-label">用户账号</label>
            <div class="layui-input-inline">
                <input name="userName" lay-verify="required|text" autocomplete="off" class="layui-input" type="text">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label" style="width:120px; height:35px">用户密码</label>
            <div class="layui-input-inline">
                <input name="userPassword" lay-verify="required|number" autocomplete="off" class="layui-input"
                       type="password">
            </div>
        </div>
    </div>

    <div class="layui-input-block">
        <button class="layui-btn" type="submit">登录</button>
        <a href="/login/beforeRegister">
            <button type="button" class="layui-btn">注册</button>
        </a>
    </div>

</form>


</body>
</html>
