<%--
  Created by IntelliJ IDEA.
  User: Miaozhenkai
  Date: 2019/6/20
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单查询</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Static/js/jquery.min.js"></script>
    <script type="text/javascript">
        function chaxun(){
            var waybillId=$('#waybillId').val();
                $.ajax({
                    type : "post",
                    url : "${pageContext.request.contextPath}/xiadan/chaxun.action",
                    data : "waybillId=" + waybillId,
                    dateType : "json",
                    //请求成功后调用
                    success : function(data) {
                        var object = eval("("+data+")");
                        $('#waybillId1').html(object.waybillId);
                        $('#senderName').html(object.senderName);
                        $('#senderPhone').html(object.senderPhone);
                        $('#senderProvinces').html(object.senderProvinces);
                        $('#senderAddress').html(object.senderAddress);
                        $('#receiverName').html(object.receiverName);
                        $('#receiverPhone').html(object.receiverPhone);
                        $('#receiverProvinces').html(object.receiverProvinces);
                        $('#receiverAddress').html(object.receiverAddress);
                        $('#waybillState').html(object.waybillState);
                        $('#waybillPayment').html(object.waybillPayment);
                    },
                    //请求失败后调用
                    error : function() {

                    }
                });
        }
    </script>
</head>
<body>
    <input type="text" id="waybillId" value="20190620043302"><br>
    <input type="button" value="查询" onclick="chaxun()">
<p id="data"></p>

<table border="1px;">
    <tr>
        <th>订单号</th>
        <th>邮寄人</th>
        <th>邮寄人手机号</th>
        <th>邮寄省份</th>
        <th>邮寄地址</th>
        <th>收货人</th>
        <th>收货人手机号</th>
        <th>收货省份</th>
        <th>收货地址</th>
        <th>邮寄状态</th>
        <th>支付方式</th>
    </tr>
    <tr>
        <td id="waybillId1"></td>
        <td id="senderName"></td>
        <td id="senderPhone"></td>
        <td id="senderProvinces"></td>
        <td id="senderAddress"></td>
        <td id="receiverName"></td>
        <td id="receiverPhone"></td>
        <td id="receiverProvinces"></td>
        <td id="receiverAddress"></td>
        <td id="waybillState"></td>
        <td id="waybillPayment"></td>
    </tr>


</table>
</body>
</html>
