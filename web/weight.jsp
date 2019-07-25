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
            width: 750px;
            height: 650px;
            margin: 10px;
            padding: 0;
            margin-left: 70px;
        }
    </style>
</head>
<body>
<div>
    <form class="layui-form layui-form-pane" action="">

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">运单号</label>
                <div class="layui-input-inline">
                    <input type="tel" name="waybillId" lay-verify="required" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">发件人</label>
                <div class="layui-input-inline">
                    <input type="text" name="senderName" lay-verify="" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">发件人电话</label>
                <div class="layui-input-inline">
                    <input type="tel" name="senderPhone" lay-verify="" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">发件人省市</label>
                <div class="layui-input-inline">
                    <input type="text" name="senderProvinces" lay-verify="" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">发件人地址</label>
                <div class="layui-input-inline">
                    <input type="tel" name="senderAddress" lay-verify="" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">收件人</label>
                <div class="layui-input-inline">
                    <input type="text" name="receiverName" lay-verify="" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">收件人电话</label>
                <div class="layui-input-inline">
                    <input type="tel" name="receiverPhone" lay-verify="" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">收件人省市</label>
                <div class="layui-input-inline">
                    <input type="text" name="receiverProvinces" lay-verify="" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">收件人地址</label>
                <div class="layui-input-inline">
                    <input type="tel" name="receiverAddress" lay-verify="" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">订单状态</label>
                <div class="layui-input-inline">
                    <input type="text" name="waybillState" lay-verify="" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">下单时间</label>
                    <div class="layui-input-inline">
                        <input type="text" name="waybillDate" class="layui-input" id="test5" lay-verify="datetime" placeholder="yyyy-MM-dd HH:mm:ss">
                    </div>
                </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">支付方式</label>
                <div class="layui-input-inline">
                    <input type="tel" name="waybillPayment" lay-verify="" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">物品类型</label>
                <div class="layui-input-inline">
                    <input type="text" name="itemType" lay-verify="" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">物品重量</label>
                <div class="layui-input-inline">
                    <input type="text" name="itemWeight" lay-verify="" autocomplete="off"
                           class="layui-input"  onblur="yunfei()">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">订单价格</label>
                <div class="layui-input-inline">
                    <input type="text" name="waybillPrice" lay-verify="" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <div class="layui-input-inline">
                    <input type="hidden" name="staff1Id" id="staff1Id" lay-verify="" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <div class="layui-input-inline">
                    <input type="hidden" name="staff2Id" id="staff2Id" lay-verify="" autocomplete="off" class="layui-input">
                </div>
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
            alert(JSON.stringify(data.field));
            $.ajax({
                url: "${pageContext.request.contextPath}/fore/updateW.action",
                type: "post",
                dataType: 'text',
                // contentType: "application/json",
                data: "json="+JSON.stringify(data.field).toString(),
                success: function (objstr) {
                    layer.alert(objstr, function(index){
                        //do something
                        layer.close(index);
                        var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                        parent.layer.close(index);
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
            elem: '#test5'
            ,type: 'datetime'
        });
    });
    function yunfei(){
        var itemWeight=$('input[name=itemWeight]').val();
        if (itemWeight!=""){
            var senderProvinces=$('input[name="senderProvinces"]').val();
            var receiverProvinces=$('input[name="receiverProvinces"]').val();
            $.ajax({
                url: "${pageContext.request.contextPath}/route/route1.action",
                type:"post",
                data:{"itemWeight":itemWeight,"senderProvinces":senderProvinces,"receiverProvinces":receiverProvinces},
                //{"username": username, "password": password},
                success:  function(objstr) {
                    // var objs = eval("(" + objstr + ")");
                    // alert(objstr);
                    $('input[name=waybillPrice]').val(objstr);
                },
                error : function() {
                    alert("失败了");
                }
            });
        }else {
            $('input[name=waybillPrice]').val("");
        }
    }
</script>
</body>
</html>

