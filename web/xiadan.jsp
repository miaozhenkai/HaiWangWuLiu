<%--
  Created by IntelliJ IDEA.
  User: Miaozhenkai
  Date: 2019/6/19
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/xiadan/xiadan.action" method="post">
    发件人<input type="text" name="senderName" ><br>
    发件人电话<input type="text" name="senderPhone"><br>
    收件人<input type="text" name="receiverName"><br>
    收件人电话<input type="text" name="receiverPhone"><br>
    发件地 省市<select name="senderProvinces">
                    <option value="北京市">北京市</option>
                    <option value="天津市">天津市</option>
                    <option value="上海市">上海市</option>
                </select><br>
    发件地 详细<input type="text" name="senderAddress"><br>
    收件地 省市<select name="receiverProvinces">
                    <option value="北京市">北京市</option>
                    <option value="天津市">天津市</option>
                    <option value="上海市">上海市</option>
                </select><br>
    收件地 详细<input type="text" name="receiverAddress"><br>
    支付方式<input type="radio" name="waybillPayment" checked="checked" value="现付">现付
            <input type="radio" name="waybillPayment" value="到付">到付<br>
    货物易损类型<select name="itemType">
                    <option value="易压">易压</option>
                    <option value="易爆">易爆</option>
                    <option value="易燃">易燃</option>
                </select><br>
    提交<input type="submit"> 重置<input type="reset">
</form>
</body>
</html>
