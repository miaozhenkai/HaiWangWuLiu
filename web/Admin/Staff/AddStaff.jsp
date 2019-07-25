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
    <form class="layui-form layui-form-pane" action="">
        <div class="layui-form-item">
            <div class="layui-input-inline">
                <input type="hidden" name="staffId" lay-verify="" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="staffName" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block" style="width: 190px">
                <select name="staffSex" lay-verify="required" lay-search>
                    <option value="">请选择性别</option>
                    <option value="男">男</option>
                    <option value="女">女</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">生日</label>
                <div class="layui-input-inline">
                    <input type="text" name="staffBirthday" id="date" lay-verify="date" placeholder="yyyy-MM-dd"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">电话</label>
            <div class="layui-input-inline">
                <input type="text" name="staffPhone" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">登录用户名</label>
            <div class="layui-input-inline">
                <input type="text" name="staffUsername" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-inline">
                <input type="text" name="staffPassword" lay-verify="required" autocomplete="off" class="layui-input"
                       value="">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">分公司</label>
            <div class="layui-input-block" style="width: 190px">
                <select name="firmId" lay-verify="required" lay-search>
                    <option value="">请选择分公司</option>
                    <c:forEach var="firm" items="${firmList}">
                        <option value="${firm.firmId}">${firm.firmName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">部门</label>
            <div class="layui-input-block" style="width: 190px">
                <select name="departmentId" lay-verify="required" lay-search>
                    <option value="">请选择部门</option>
                    <c:forEach var="department" items="${departmentList}">
                        <option value="${department.departmentId}">${department.departmentName}</option>
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
            $.ajax({
                url: "${pageContext.request.contextPath}/staff/addStaff.action",
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

