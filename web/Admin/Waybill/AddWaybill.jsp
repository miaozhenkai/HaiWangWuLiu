<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Static/lib/layui/css/layui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/Static/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Static/lib/layui/layui.js"></script>
    <script>
        function close(status) {
            parent.location.reload();
            // var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
            // parent.layer.close(index);
        }
    </script>
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
    <form class="layui-form" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">运单号</label>
            <div class="layui-input-inline">
                <input type="text" name="waybillId" lay-verify="" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">发件人</label>
            <div class="layui-input-inline">
                <input type="text" name="senderName" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">发件人电话</label>
            <div class="layui-input-inline">
                <input type="text" name="senderPhone" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">发件人地址</label>
            <div class="layui-input-inline">
                <input type="text" name="senderAddress" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">收件人</label>
            <div class="layui-input-inline">
                <input type="text" name="receiverName" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">收件人电话</label>
            <div class="layui-input-inline">
                <input type="text" name="receiverPhone" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">收件人地址</label>
            <div class="layui-input-inline">
                <input type="text" name="receiverAddress" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">订单状态</label>
            <div class="layui-input-inline">
                <input type="text" name="waybillState" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label" style="margin-left: -20px;width: 100px">订单生成时间</label>
            <div class="layui-input-inline">
                <input type="text" name="waybillDate" id="date" lay-verify="date" placeholder="yyyy-MM-dd"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">负责此单员工</label>
            <div class="layui-input-block" style="width: 190px">
                <select name="staffId" lay-verify="required" lay-search>
                    <option value="">请选择此单员工</option>
                    <c:forEach var="staffs" items="${staffList}">
                        <option value="${staffs.staffId}">${staffs.staffName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">添加</button>
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
            alert(JSON.stringify(data.field));
            $.ajax({
                url: "${pageContext.request.contextPath}/waybill/addWaybill.action",
                type:"post",
                dataType:'text',  //切记切记：注意返回类型
                contentType:"application/json",
                data: JSON.stringify(data.field),
                success:  function(objstr) {
                    layer.alert(objstr, {
                        closeBtn: 1    // 是否显示关闭按钮
                        ,btn: ['确定'] //按钮
                        ,icon: 6    // icon
                    });
                },
                error : function() {
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

