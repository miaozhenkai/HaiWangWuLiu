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
                <a>订单管理</a>
                <a>
                    <cite>订单列表</cite></a>
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
                            <input type="text" id="sarchsname" placeholder="请输入发件人姓名" autocomplete="off"
                                   class="layui-input"></div>
                        <div class="layui-inline layui-show-xs-block">
                            <input type="text" id="sarchsphone" placeholder="请输入发件人电话" autocomplete="off"
                                   class="layui-input"></div>
                        <div class="layui-inline layui-show-xs-block">
                            <input type="text" id="sarchrname" placeholder="请输入收件人姓名" autocomplete="off"
                                   class="layui-input"></div>
                        <div class="layui-inline layui-show-xs-block">
                            <div class="layui-btn" id="sarch">
                                <i class="layui-icon">&#xe615;</i></div>
                        </div>
                    </form>
                </div>
                <div class="layui-card-body ">
                    <table class="layui-table"
                           lay-data="{url:'${pageContext.request.contextPath}/waybill/selectAll.action',page:true,toolbar: '#toolbarDemo',id:'test',limits: [5,10,15]}"
                           lay-filter="test">
                        <thead>
                        <tr>
                            <th lay-data="{type:'checkbox'}">W_ID</th>
                            <th lay-data="{field:'waybillId', width:130, sort: true}">运单号</th>
                            <th lay-data="{field:'senderName', width:85}">发件人</th>
                            <th lay-data="{field:'senderPhone',width:105}">发件人电话</th>
                            <th lay-data="{field:'senderAddress', edit: 'text',,width:105}">发件人地址</th>
                            <th lay-data="{field:'receiverName',width:85}">收件人</th>
                            <th lay-data="{field:'receiverPhone',width:105}">收件人电话</th>
                            <th lay-data="{field:'receiverAddress',width:190}">收件人地址</th>
                            <th lay-data="{field:'waybillState',width:185}">订单状态</th>
                            <th lay-data="{field:'time',width:200,templet: '<div>{{ layui.laytpl.toDateString(d.waybillDate)}}</div>'}">订单生成时间</th>
                            <th lay-data="{field:'staff1',templet: function(d){ if(d.staff1==null){return null;}else{return d.staff1.staffId;}},width:82}">
                                取件员id
                            </th>
                            <th lay-data="{field:'staff1',templet: function(d){ if(d.staff1==null){return null;}else{return d.staff1.staffName;}},width:85}">
                                取件员姓名
                            </th>
                            <th lay-data="{field:'staff2',templet: function(d){ if(d.staff2==null){return null;}else{return d.staff2.staffId;}},width:82}">
                                派送员id
                            </th>
                            <th lay-data="{field:'staff2',templet: function(d){ if(d.staff2==null){return null;}else{return d.staff2.staffName;}},width:85}">
                                派送员姓名
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

//1.多条件分页查询所有运单
        $('#sarch').on('click', function () {
            var sarchsname = $('#sarchsname').val();
            var sarchsphone = $('#sarchsphone').val();
            var sarchrname = $('#sarchrname').val();
            table.reload('test', {
                //url: '${pageContext.request.contextPath}/staff/staffList.action'
                where: {
                    sarchSName: sarchsname,
                    sarchSPhone: sarchsphone,
                    sarchRName: sarchrname,
                }, page: {
                    curr: 1
                }
            });
        });
        //3.删除，更新
        //监听工具条
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            if (obj.event === 'del') {
                layer.confirm('确定删除吗', function (index) {
                    $.ajax({
                        url: '${pageContext.request.contextPath}/waybill/delete.action',
                        method: 'post',
                        dataType: 'text',
                        data: "waybillId=" + data.waybillId,
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
                var waybillDate=layui.laytpl.toDateString(data.waybillDate);
                var staff1Id="";
                var staff2Id="";
                if (data.staff2==undefined){
                    staff2Id="";
                }if(data.staff2!=undefined){
                    staff2Id=data.staff2.staffId;
                }if (data.staff1==undefined){
                    staff1Id="";
                }if(data.staff1!=undefined){
                    staff1Id=data.staff1.staffId;
                }
                var index = layui.layer.open({
                    title: "更新运单信息",
                    type: 2,
                    area: ['900px', '765px'],
                    content: "${pageContext.request.contextPath}/Admin/Waybill/UpdateWaybill.jsp",
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
                            body.find('input[name=waybillId]').val(data.waybillId);
                            body.find('input[name=senderName]').val(data.senderName);
                            body.find('input[name=senderPhone]').val(data.senderPhone);
                            body.find('input[name=senderProvinces]').val(data.senderProvinces);
                            body.find('input[name=senderAddress]').val(data.senderAddress);
                            body.find('input[name=receiverName]').val(data.receiverName);
                            body.find('input[name=receiverPhone]').val(data.receiverPhone);
                            body.find('input[name=receiverProvinces]').val(data.receiverProvinces);
                            body.find('input[name=receiverAddress]').val(data.receiverAddress);
                            body.find('input[name=waybillState]').val(data.waybillState);
                            body.find('input[name=waybillDate]').val(waybillDate);
                            body.find('input[name=waybillPrice]').val(data.waybillPrice);
                            body.find('input[name=waybillPayment]').val(data.waybillPayment);
                            body.find('input[name=itemType]').val(data.itemType);
                            body.find('input[name=itemWeight]').val(data.itemWeight);
                            body.find('#staff1Id').val(staff1Id);
                            body.find('#staff2Id').val(staff2Id);
                            //重新渲染
                            iframeWindow.layui.form.render();
                        }
                    }
                });
            }
        });

		//2.增加运单
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
							xadmin.open('增加运单', '${pageContext.request.contextPath}/Admin/Waybill/AddWaybill.jsp');
							break;
					};
				});
		//时间戳的处理
        layui.laytpl.toDateString = function(d, format){
            var strDate=d;
            var dateStr=strDate.split(" ");
            var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";
            var date = new Date(Date.parse(strGMT))
            //var date = new Date(d || new Date())
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
            format = format || 'yyyy-MM-dd HH:mm:ss';
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

