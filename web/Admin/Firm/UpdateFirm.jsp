<%--
  Created by IntelliJ IDEA.
  User: 邓浩楠
  Date: 2019/6/19
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Static/lib/layui/css/layui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/Static/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Static/lib/layui/layui.js"></script>
    <style>
        html, body {
            width: 400px;
            height: 500px;
            margin: 20px;
            padding: 0;
            margin-left: 60px;
        }
    </style>
</head>
<body>
<div>
    <form class="layui-form layui-form-pane" action="" lay-filter="staffForm">
        <div class="layui-form-item">
            <div class="layui-input-inline">
                <input type="hidden" name="firmId" lay-verify="" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">分公司名称</label>
            <div class="layui-input-inline">
                <input type="text" name="firmName" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">修改</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>
<script>
    //Demo
    layui.use('form', function () {
        var form = layui.form;
        //监听提交
        form.on('submit(formDemo)', function (data) {
            $.ajax({
                url: "${pageContext.request.contextPath}/firm/updateFirm.action",
                type: "post",
                dataType: 'text',
                contentType: "application/json",
                data: JSON.stringify(data.field),
                success: function (objstr) {
                    layer.alert(objstr, {
                        closeBtn: 1    // 是否显示关闭按钮
                        , btn: ['确定'] //按钮
                        , icon: 6    // icon
                    });
                },
                error: function () {
                    alert("失败了");
                }
            });
            return false;
        });

    });
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        //执行一个laydate实例
        laydate.render({
            elem: '#date' //指定元素
        });
    });
</script>
</body>
</html>
