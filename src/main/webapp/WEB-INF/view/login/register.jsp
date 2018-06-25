<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <script src="/scripts/jquery-3.2.1.min.js"></script>
    <script src="/js/enroll.js" charset="utf-8"></script>
    <title>用户注册</title>
    <style>
        div{position:relative;}
        button{
            position:absolute;

        }
    </style>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>账号注册</legend>
</fieldset>
<form action="/login/signup" method="post">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label style="width:120px; height:35px" class="layui-form-label">账号名称</label>
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
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label" style="width:120px; height:35px">用户邮箱</label>
            <div class="layui-input-inline">
                <input name="userEmail" lay-verify="required|email" autocomplete="off" class="layui-input"
                       type="email">
            </div>
        </div>
    </div>
    <button style="  right:950px;bottom:580px;" id="enroll" class="layui-btn layui-btn-normal">点击注册</button>
    </a>
</form>
</body>
</html>