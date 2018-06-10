<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout 后台大布局 - Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <script src="/layui/layui.js" charset="utf-8"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">layui 后台布局</div>
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
                    <div><img src="https://m.360buyimg.com/babel/jfs/t21148/263/500139364/86146/4a473fcf/5b0f68bfN7031ac10.jpg"/></div>
                    <div><img/></div>
                    <div><img/></div>
                    <div><img/></div>
                    <div><img/></div>
                </div>
            </div>


        </div>

        <div class="layui-fluid">
            <div class="layui-row layui-col-space1">
                <div class="layui-col-md3">
                    <div class="grid-demo grid-demo-bg1">
                        <div class="layui-fluid">
                            <img src="https://img11.360buyimg.com/n7/jfs/t3193/290/2633160715/81419/e2c85984/57e3a6eaN816e240d.jpg"/>
                        </div>

                        <div class="layui-fluid">
                            然也（RAE） 450ml双层不锈钢内胆保温杯 男女过滤车载杯子泡花草茶情侣茶杯水杯红色R3105
                        </div>
                        <div class="layui-fluid">
                            价格：54
                        </div>
                        <div class="layui-fluid">
                            <div class="layui-col-md6">
                                <button class="layui-btn">收藏</button>
                            </div>
                            <div class="layui-col-md6">
                                <button class="layui-btn add-shopping">加入购物车</button>
                            </div>

                        </div>

                    </div>
                </div>
                <div class="layui-col-md3">
                    <div class="grid-demo"><div class="layui-fluid">
                        <img src="https://img11.360buyimg.com/n7/jfs/t3193/290/2633160715/81419/e2c85984/57e3a6eaN816e240d.jpg"/>
                    </div>

                        <div class="layui-fluid">
                            然也（RAE） 450ml双层不锈钢内胆保温杯 男女过滤车载杯子泡花草茶情侣茶杯水杯红色R3105
                        </div>
                        <div class="layui-fluid">
                            价格：54
                        </div>
                        <div class="layui-fluid">
                            <div class="layui-col-md6">
                                <button class="layui-btn">收藏</button>
                            </div>
                            <div class="layui-col-md6">
                                <button class="layui-btn add-shopping">加入购物车</button>
                            </div>

                        </div></div>
                </div>
                <div class="layui-col-md3">
                    <div class="grid-demo grid-demo-bg1"><div class="layui-fluid">
                        <img src="https://img11.360buyimg.com/n7/jfs/t3193/290/2633160715/81419/e2c85984/57e3a6eaN816e240d.jpg"/>
                    </div>

                        <div class="layui-fluid">
                            然也（RAE） 450ml双层不锈钢内胆保温杯 男女过滤车载杯子泡花草茶情侣茶杯水杯红色R3105
                        </div>
                        <div class="layui-fluid">
                           价格：54
                        </div>
                        <div class="layui-fluid">
                            <div class="layui-col-md6">
                                <button class="layui-btn">收藏</button>
                            </div>
                            <div class="layui-col-md6">
                                <button class="layui-btn add-shopping">加入购物车</button>
                            </div>

                        </div></div>
                </div>
                <div class="layui-col-md3">
                    <div class="grid-demo"><div class="layui-fluid">
                        <img src="https://img11.360buyimg.com/n7/jfs/t3193/290/2633160715/81419/e2c85984/57e3a6eaN816e240d.jpg"/>
                    </div>

                        <div class="layui-fluid">
                            然也（RAE） 450ml双层不锈钢内胆保温杯 男女过滤车载杯子泡花草茶情侣茶杯水杯红色R3105
                        </div>
                        <div class="layui-fluid">
                            价格：54
                        </div>
                        <div class="layui-fluid">
                            <div class="layui-col-md6">
                                <button class="layui-btn">收藏</button>
                            </div>
                            <div class="layui-col-md6">
                                <button class="layui-btn add-shopping">加入购物车</button>
                            </div>

                        </div></div>
                </div>
            </div>
        </div>



    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script>
    //JavaScript代码区域
    layui.use(['carousel','element','jquery'], function () {
        var element = layui.element;
        var $ = layui.$;
        var carousel = layui.carousel;
        //常规轮播
        carousel.render({
            elem: '#test1',
            width: '100%',
            arrow: 'always'
        });

        $(document).ready(function(){


            $(".add-shopping").on("click",function(){

            });

        });

    });




</script>
<script type="text/javascript">
    var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
    document.write(unescape("%3Cspan id='cnzz_stat_icon_30088308'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "w.cnzz.com/c.php%3Fid%3D30088308' type='text/javascript'%3E%3C/script%3E"));</script>
</body>
</html>