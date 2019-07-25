<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>海王物流管理系统登录</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Static/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Static/css/login.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Static/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/Static/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/Static/lib/layui/layui.js" charset="utf-8"></script>
</head>
<body class="login-bg">
<div class="login layui-anim layui-anim-up">
    <div class="message">海王物流管理系统登录</div>
    <div id="darkbannerwrap"></div>
    <form method="post" class="layui-form">
        <input name="username" placeholder="用户名" type="text" lay-verify="required" class="layui-input">
        <hr class="hr15">
        <input name="password" lay-verify="required" placeholder="密码" type="password" class="layui-input">
        <hr class="hr15">
        <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
        <hr class="hr20">
    </form>
</div>

<script>
    $(function () {
        layui.use('form', function () {
            var form = layui.form;
            // layer.msg('玩命卖萌中', function(){
            //   //关闭后的操作
            //     alert(123);
            //   });
            //监听提交
            form.on('submit(login)', function (data) {
                var username = $("input[name='username']").val();
                var password = $("input[name='password']").val();
                $.ajax({
                    type: "post",
                    url: '${pageContext.request.contextPath}/admin/login.action',//用于文件上传的服务器端请求地址
                    data: {"username": username, "password": password},
                    dataType: 'json',//返回值类型 一般设置为json
                    success: function (objs) {
                        if (objs == "1") {
                            layer.msg('登录成功', {
                                time: 1000 //2秒关闭（如果不配置，默认是3秒）
                            }, function () {
                                location.href = 'Main.jsp'
                            });
                        } else {
                            layer.msg("用户名或密码错误");
                        }
                    },
                    error: function (data, ststus, e) {
                        alert("失败" + e);
                    }
                })
                return false;
            });
        });
    })
</script>
<!-- 底部结束 -->
</body>
</html>