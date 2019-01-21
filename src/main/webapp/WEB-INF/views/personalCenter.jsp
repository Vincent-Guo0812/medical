<%--
  Created by IntelliJ IDEA.
  User: 32880
  Date: 2019/1/9
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/admin/layui/css/layui.css"  media="all">
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>密码修改</legend>
</fieldset>

<form class="layui-form" id="form1" onsubmit="return check()" method="post" action="${pageContext.request.contextPath}/passwordChange">

    <div class="layui-form-item">
        <label class="layui-form-label">当前密码</label>
        <div class="layui-input-inline">
            <input type="password" name="pwd"  placeholder="" autocomplete="off" class="layui-input" id="pwd">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">新密码</label>
            <div class="layui-input-inline">
                <input type="password" name="newPwd1"  autocomplete="off" class="layui-input" id="newPwd1">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">确认密码</label>
            <div class="layui-input-inline">
                <input type="password" name="newPwd2" autocomplete="off" class="layui-input" id="newPwd2">
            </div>
        </div>
    </div>

    <div class="layui-form-item" pane="">
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" type="submit" id="btn">确认修改</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </div>
</form>

<script src="${pageContext.request.contextPath}/static/admin/js/jquery-1.8.3.min.js"></script>

<script>


function check(){
    if($("#newPwd1").val()=="" || $("#newPwd2").val()=="" || $("#pwd").val()==""){
        alert("表单项不能为空");
        return false;
    }
    if($("#newPwd1").val()!=$("#newPwd2").val()){
        alert("两次密码不一致");
        document.getElementById("form1").reset();
        return false;
    }
    return true;
}


$("#pwd").blur(function () {
    var password=$("#pwd").val();
    var password=$("#pwd").val();
    $.ajax({
        url:"${pageContext.request.contextPath}/passwordCheck",
        data:{password:password},
        type:"POST",
        success:function (result) {
            if(result==false){
                alert("密码输入错误");
                document.getElementById("btn").disabled=true;
            }
        },
    });
});


</script>

</body>
</html>
