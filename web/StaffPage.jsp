
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Static/lib/layui/css/layui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/Static/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/Static/lib/layui/layui.js" charset="utf-8"></script>
</head>
<body>
<br><br>
<div id="all">
    <h1>快递员查看信息页面</h1>
    <h3 id="h3">欢迎${staff.staffUsername}登录${staff.staffId}</h3><br>
    <h3>待取件</h3>
    <table class="layui-hide" id="noget" lay-filter="noget"></table>
    <h3>已取件</h3>
    <table class="layui-hide" id="hasget"></table>
    <h3>待派送</h3>
    <table class="layui-hide" id="nosend" lay-filter="nosend"></table>
    <h3>已派送</h3>
    <table class="layui-hide" id="hassend"></table>
</div>
<script>
    layui.use('table', function(){
        var table = layui.table;
        var staffId=${staff.staffId};
        table.render({
            elem: '#noget'
            ,url:'${pageContext.request.contextPath}/fore/selectNoGet.action'
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,where:{staffId: staffId}
            ,cols: [[
                {field:'waybillId', width:130, title: '订单号'}
                ,{field:'senderName', width:80, title: '发件人'}
                ,{field:'senderPhone', width:120, title: '发件人电话'}
                ,{field:'senderProvinces', width:120, title: '发件省市'}
                ,{field:'senderAddress', title: '发件地址',width:120}
                ,{field:'receiverName', title: '收件人',width:80}
                ,{field:'receiverPhone', title: '收件人电话', width:120}
                ,{field:'receiverProvinces', title: '收件省市', width:120}
                ,{field:'receiverAddress', width:120, title: '收件地址'}
                ,{field:'',title:"下单时间",width:200,templet: '<div>{{ layui.laytpl.toDateString(d.waybillDate)}}</div>'}
                ,{field:'waybillPayment', title: '支付方式', width:120}
                ,{field:'itemType', title: '物品类型', width:120}
                ,{fixed: 'right', width:150, align:'center', toolbar: '#get'}
            ]]
        });
        table.on('tool(noget)', function (obj) {
            var data = obj.data;
            var waybillDate=layui.laytpl.toDateString(data.waybillDate);
             if (obj.event === 'get1') {
                var index = layui.layer.open({
                    title: "确认订单",
                    type: 2,
                    area: ['900px', '765px'],
                    content: "${pageContext.request.contextPath}/weight.jsp",
                    end: function () {
                        shuaxin();
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
                            //body.find('input[name=waybillPrice]').val(data.waybillPrice);
                            body.find('input[name=waybillPayment]').val(data.waybillPayment);
                            body.find('input[name=itemType]').val(data.itemType);
                            //body.find('input[name=itemWeight]').val(data.itemWeight);
                            body.find('#staff1Id').val(data.staff1Id);
                            //body.find('#staff2Id').val(data.staff2Id);
                            //重新渲染
                            iframeWindow.layui.form.render();
                        }
                    }
                });
            }
        });
        table.render({
            elem: '#hasget'
            ,url:'${pageContext.request.contextPath}/fore/selectHasGet.action'
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,where:{staffId: staffId}
            ,cols: [[
                {field:'waybillId', width:130, title: '订单号'}
                ,{field:'senderName', width:80, title: '发件人'}
                ,{field:'senderPhone', width:120, title: '发件人电话'}
                ,{field:'senderProvinces', width:120, title: '发件省市'}
                ,{field:'senderAddress', title: '发件地址',width:120}
                ,{field:'receiverName', title: '收件人',width:80}
                ,{field:'receiverPhone', title: '收件人电话', width:120}
                ,{field:'receiverProvinces', title: '收件省市', width:120}
                ,{field:'receiverAddress', width:120, title: '收件地址'}
                ,{field:'',title:"下单时间",width:200,templet: '<div>{{ layui.laytpl.toDateString(d.waybillDate)}}</div>'}
                ,{field:'waybillPayment', title: '支付方式', width:120}
                ,{field:'itemType', title: '物品类型', width:120}
                ,{field:'itemWeight', title: '物品重量', width:120}
                ,{field:'waybillPrice', title: '运费', width:120}
            ]]
        });

        table.render({
            elem: '#nosend'
            ,url:'${pageContext.request.contextPath}/fore/NoSend.action'
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,where:{staffId: staffId}
            ,cols: [[
                {field:'waybillId', width:130, title: '订单号'}
                ,{field:'senderName', width:80, title: '发件人'}
                ,{field:'senderPhone', width:120, title: '发件人电话'}
                ,{field:'senderProvinces', width:120, title: '发件省市'}
                ,{field:'senderAddress', title: '发件地址',width:120}
                ,{field:'receiverName', title: '收件人',width:80}
                ,{field:'receiverPhone', title: '收件人电话', width:120}
                ,{field:'receiverProvinces', title: '收件省市', width:120}
                ,{field:'receiverAddress', width:120, title: '收件地址'}
                ,{field:'',title:"下单时间",width:200,templet: '<div>{{ layui.laytpl.toDateString(d.waybillDate)}}</div>'}
                ,{field:'waybillPayment', title: '支付方式', width:120}
                ,{field:'itemType', title: '物品类型', width:120}
                ,{field:'itemWeight', title: '物品重量', width:120}
                ,{field:'waybillPrice', title: '运费', width:120}
                ,{fixed: 'right', width:150, align:'center', toolbar: '#send'}
            ]]
        });
        table.on('tool(nosend)', function (obj) {
            var data = obj.data;
           if (obj.event === 'edit') {
               $.ajax({
                   url: '${pageContext.request.contextPath}/fore/send.action',
                   type: "post",
                   dataType: 'text',
                   data:"waybillId="+data.waybillId,
                   success: function (res) {
                       layer.alert(res, function(index){
                           //do something
                           table.reload('test', {page: {
                                   curr: 1
                               }});
                           layer.close(index);
                           shuaxin();
                       });
                   },
                   error: function () {
                       alert("失败了");
                   }
               });
            }
        });
        table.render({
            elem: '#hassend'
            ,url:'${pageContext.request.contextPath}/fore/HasSend.action'
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,where:{staffId: staffId}
            ,cols: [[
                {field:'waybillId', width:130, title: '订单号'}
                ,{field:'senderName', width:80, title: '发件人'}
                ,{field:'senderPhone', width:120, title: '发件人电话'}
                ,{field:'senderProvinces', width:120, title: '发件省市'}
                ,{field:'senderAddress', title: '发件地址',width:120}
                ,{field:'receiverName', title: '收件人',width:80}
                ,{field:'receiverPhone', title: '收件人电话', width:120}
                ,{field:'receiverProvinces', title: '收件省市', width:120}
                ,{field:'receiverAddress', width:120, title: '收件地址'}
                ,{field:'',title:"下单时间",width:200,templet: '<div>{{ layui.laytpl.toDateString(d.waybillDate)}}</div>'}
                ,{field:'waybillPayment', title: '支付方式', width:120}
                ,{field:'itemType', title: '物品类型', width:120}
                ,{field:'itemWeight', title: '物品重量', width:120}
                ,{field:'waybillPrice', title: '运费', width:120}
            ]]
        });
        function shuaxin() {
            table.reload('noget', {page: {
                    curr: 1
                }});
            table.reload('hasget', {page: {
                    curr: 1
                }});
            table.reload('nosend', {page: {
                    curr: 1
                }});
            table.reload('hassend', {page: {
                    curr: 1
                }});
        }
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



    });


</script>
<script type="text/html" id="send">
    <button class="layui-btn layui-btn-xs" lay-event="edit">确认收货</button>
</script>
<script type="text/html" id="get">
    <button class="layui-btn layui-btn-xs" lay-event="get1">确认订单</button>
</script>

</body>
</html>
