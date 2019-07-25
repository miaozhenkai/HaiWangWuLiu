<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.2</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Static/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Static/css/xadmin.css">
    <script src="${pageContext.request.contextPath}/Static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Static/js/xadmin.js"></script>
</head>
<body>
<div class="x-nav">
            <span class="layui-breadcrumb">
                <a>首页</a>
                <a>员工管理</a>
                <a>
                    <cite>员工列表</cite></a>
            </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       onclick="location.reload()" title="刷新">
        <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i>
    </a>
</div>
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-body ">
                    <form class="layui-form layui-col-space5">
                        <div class="layui-inline layui-show-xs-block">
                            <input type="text" id="sarchname" placeholder="请输入用户名" autocomplete="off"
                                   class="layui-input"></div>
                        <div class="layui-inline layui-show-xs-block">
                            <input type="text" id="sarchphone" placeholder="请输入电话" autocomplete="off"
                                   class="layui-input"></div>
                        <div class="layui-input-inline layui-show-xs-block">
                            <select id="sarchsex">
                                <option value="">请选择性别</option>
                                <option value="男">男</option>
                                <option value="女">女</option>
                            </select>
                        </div>
                        <div class="layui-inline layui-show-xs-block">
                            <div class="layui-btn" id="sarch">
                                <i class="layui-icon">&#xe615;</i></div>
                        </div>
                    </form>
                </div>
                <div class="layui-card-body ">
                    <table class="layui-table"
                           lay-data="{url:'${pageContext.request.contextPath}/staff/staffList.action',page:true,toolbar: '#toolbarDemo',id:'test',limits: [5,10,15]}"
                           lay-filter="test">
                        <thead>
                        <tr>
                            <th lay-data="{type:'checkbox'}">ID</th>
                            <th lay-data="{field:'staffId', width:60, sort: true}">ID</th>
                            <th lay-data="{field:'staffName'}">姓名</th>
                            <th lay-data="{field:'staffSex', width:80, sort: true}">性别</th>
                            <th lay-data="{field:'', templet: '<div>{{ layui.laytpl.toDateString(d.staffBirthday) }}</div>'}">生日</th>
                            <th lay-data="{field:'staffPhone'}">电话</th>
                            <th lay-data="{field:'staffUsername'}">登录名</th>
                            <th lay-data="{field:'staffPassword'}">密码</th>
                            <th lay-data="{field:'firm',templet: function(d){ return d.firm.firmName;}}">分公司</th>
                            <th lay-data="{field:'department',templet: function(d){ return d.department.departmentName;}}">
                                部门
                            </th>
                            <th lay-data="{fixed: 'right', width:150, align:'center', toolbar: '#barDemo'}"></th>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/html" id="barDemo">
    <button class="layui-btn layui-btn-xs" lay-event="edit">编辑</button>
    <button class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</button>
</script>
<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData"> 获取选中行数据</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll"> 验证是否全选</button>
        <button class="layui-btn layui-btn-sm" lay-event="add">添加</button>
    </div>
</script>
<script>
    layui.use('table', function () {
        var table = layui.table;
//多条件查询
        $('#sarch').on('click', function () {
            var sarchname = $('#sarchname').val();
            var sarchphone = $('#sarchphone').val();
            var sarchsex = $('#sarchsex').val();
            table.reload('test', {
                //url: '${pageContext.request.contextPath}/staff/staffList.action'
                where: {
                    sarchName: sarchname,
                    sarchPhone: sarchphone,
                    sarchSex: sarchsex,
                }, page: {
                    curr: 1
                }
            });
        });
        //监听工具条
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    $.ajax({
                        url: '${pageContext.request.contextPath}/staff/delStaff.action',
                        method: 'post',
                        dataType: 'text',
                        data: "staffId=" + data.staffId,
                        success: function (res) {
                            layer.alert(res, function(index){
                                //do something
                                table.reload('test', {page: {
                                        curr: 1
                                    }});
                                layer.close(index);
                            });
                        },
                        error: function () {
                            alert("失败了");
                        }
                    });
                });
            } else if (obj.event === 'edit') {
                var staffBirthday=layui.laytpl.toDateString(data.staffBirthday);
                var index = layui.layer.open({
                    title: "修改员工信息",
                    type: 2,
                    area: ['600px', '700px'],
                    content: "${pageContext.request.contextPath}/Admin/Staff/UpdateStaff.jsp",
                    end: function () {
                        table.reload('test', {page: {
                                curr: 1
                            }});
                    },
                    success: function (layero, index) {
                        var body = layui.layer.getChildFrame('body', index);
                        //获取新窗口对象
                        var iframeWindow = layero.find('iframe')[0].contentWindow;
                        if (data) {
                            body.find('input[name=staffId]').val(data.staffId);
                            body.find('input[name=staffName]').val(data.staffName);
                            body.find('#staffSex').val(data.staffSex);
                            body.find('input[name=staffBirthday]').val(staffBirthday);
                            body.find('input[name=staffPhone]').val(data.staffPhone);
                            body.find('input[name=staffUsername]').val(data.staffUsername);
                            body.find('input[name=staffPassword]').val(data.staffPassword);
                            body.find('#firmId').val(data.firm.firmId);
                            body.find('#departmentId').val(data.department.departmentId);
                            //重新渲染
                            iframeWindow.layui.form.render();
                        }
                    }
                });
            }
        });
        //头工具栏事件
        table.on('toolbar(test)',
            function (obj) {
                var checkStatus = table.checkStatus(obj.config.id);
                switch (obj.event) {
                    case 'getCheckData':
                        var data = checkStatus.data;
                        layer.alert(JSON.stringify(data));
                        break;
                    case 'getCheckLength':
                        var data = checkStatus.data;
                        layer.msg('选中了：' + data.length + ' 个');
                        break;
                    case 'isAll':
                        layer.msg(checkStatus.isAll ? '全选' : '未全选');
                        break;
                    case 'add':
                        var index = layui.layer.open({
                            title: "添加员工信息",
                            type: 2,
                            area: ['600px', '700px'],
                            content: "${pageContext.request.contextPath}/Admin/Staff/AddStaff.jsp",
                            end: function () {
                                table.reload('test', {page: {
                                        curr: 1
                                    }});
                            }
                        });
                        break;
                };
            });
        //时间戳的处理
        layui.laytpl.toDateString = function(d, format){
            var date = new Date(d || new Date())
                ,ymd = [
                this.digit(date.getFullYear(), 4)
                ,this.digit(date.getMonth() + 1)
                ,this.digit(date.getDate())
            ]
                ,hms = [
                this.digit(date.getHours())
                ,this.digit(date.getMinutes())
                ,this.digit(date.getSeconds())
            ];
            format = format || 'yyyy-MM-dd';
            // format = format || 'yyyy-MM-dd HH:mm:ss';
            return format.replace(/yyyy/g, ymd[0])
                .replace(/MM/g, ymd[1])
                .replace(/dd/g, ymd[2])
                .replace(/HH/g, hms[0])
                .replace(/mm/g, hms[1])
                .replace(/ss/g, hms[2]);
        };
        //数字前置补零
        layui.laytpl.digit = function(num, length, end){
            var str = '';
            num = String(num);
            length = length || 2;
            for(var i = num.length; i < length; i++){
                str += '0';
            }
            return num < Math.pow(10, length) ? str + (num|0) : num;
        };
    });</script>
</html>