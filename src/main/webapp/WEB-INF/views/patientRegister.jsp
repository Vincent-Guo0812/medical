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
    <legend>病人登记</legend>
</fieldset>

<form class="layui-form" action="${pageContext.request.contextPath}/patient/register" method="post" onsubmit="return check()">
    <div class="layui-form-item">
        <label class="layui-form-label">身份证号</label>
        <div class="layui-input-inline">
            <input type="text" name="id" lay-verify="identity" placeholder="" autocomplete="off" class="layui-input" id="id">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="name" name="name" lay-verify="required" autocomplete="off" class="layui-input" id="name">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">联系方式</label>
            <div class="layui-input-inline">
                <input type="text" name="telephone" lay-verify="phone" autocomplete="off" class="layui-input" id="telephone">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-inline">
            <input type="radio" name="gender" value="true" title="男" checked="checked">
            <input type="radio" name="gender" value="false" title="女">
        </div>
    </div>


    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">病史（没有填无）</label>
        <div class="layui-input-block"  style="width: 60%;height: 30%">
            <textarea placeholder="请输入内容" name="medicalHistory" class="layui-textarea" style="height:90%" id="medicalHistory"></textarea>
        </div>
    </div>

    <div class="layui-form-item" pane="">
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" type="submit">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
    </div>
</form>
<script src="${pageContext.request.contextPath}/static/admin/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/static/admin/js/jquery-1.8.3.min.js"></script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

    });

    function check() {
        if( $("#id").val()==""  ||  $("#name").val()==""  || $("#telephone").val()=="" || $("#medicalHistory").val()=="" ){
            alert("当前表单不能含空项！");
            return false;
        }
        return true;
    }
</script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

</body>
</html>
