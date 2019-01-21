<%--
  Created by IntelliJ IDEA.
  User: 32880
  Date: 2019/1/9
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>病历详情</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/admin/layui/css/layui.css"  media="all">
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>病历详情</legend>
</fieldset>

<div class="layui-form-item">
</div>

<form  class="layui-form" id="form" action="${pageContext.request.contextPath}/recovery">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="name" name="name" id="name" lay-verify="required" autocomplete="off" class="layui-input" disabled="disabled" value="${patient.name}">
                <input type="hidden" id="id1" name="recordId" value="${record.id}">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">入诊时间</label>
            <div class="layui-input-inline">
                <input type="text" name="telephone" id="registerTime" lay-verify="phone" autocomplete="off" class="layui-input" disabled="disabled"
                value="<fmt:formatDate value="${record.visitingTime}" type="date" pattern="yyyy-MM-dd HH:mm"/>">
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">联系方式</label>
            <div class="layui-input-inline">
                <input type="text" name="telephone" id="telephone" lay-verify="phone" autocomplete="off" class="layui-input" disabled="disabled" value="${patient.telephone}">
            </div>
        </div>


    </div>


    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-inline" id="genderCheck">
                <input type="radio" disabled="disabled" name="gender"  value="true" title="男"  ${patient.gender==true?"checked":""} lay-filter="aaa">
                <input type="radio" name="gender" disabled="disabled" value="false" title="女" ${patient.gender==false?"checked":""} lay-filter="aaa">
            </div>
        </div>
    </div>


    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">病史（没有填无）</label>
        <div class="layui-input-block"  style="width: 60%;height: 30%">
            <textarea placeholder="请输入内容" id="medicalHistory" name="medicalHistory" class="layui-textarea" style="height:90%" disabled="disabled">${patient.medicalHistory}</textarea>
        </div>
    </div>



    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">诊断医生</label>
            <div class="layui-input-inline">
                <input type="name" id="doctorId3" name="doctorId3" lay-verify="required" autocomplete="off" class="layui-input" disabled="disabled" value="${doctor.name}">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">科室</label>
            <div class="layui-input-inline">
                <input type="name"  autocomplete="off" class="layui-input" disabled="disabled" value="${department.name}">

            </div>
        </div>
    </div>


    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">症状</label>
        <div class="layui-input-block"  style="width: 60%;height: 30%">
            <textarea  name="symtom" id="symtom" class="layui-textarea" style="height:90%" disabled="disabled">${record.symtom}</textarea>
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">处方</label>
        <div class="layui-input-block"  style="width: 60%;height: 30%">
            <textarea name="prescribe" id="prescribe" class="layui-textarea" style="height:90%" disabled="disabled" >${record.prescribe}</textarea>
        </div>

    </div>


    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">是否住院</label>
            <div class="layui-input-inline" id="hos">
                <input type="radio" id="radio" name="hospitalized" value="true" title="是"  disabled="disabled">
                <input type="radio" name="hospitalized" lay-filter="bbb"  value="false" title="否"  checked="checked" disabled="disabled">
            </div>
        </div>
    </div>

    <div class="layui-form-item" pane="" style="top: 10px">
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" type="submit">病历归档</button>
            </div>
        </div>
    </div>

</form>


<script src="${pageContext.request.contextPath}/static/admin/layui/layui.js" charset="utf-8"></script>
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

</script>
<script src="${pageContext.request.contextPath}/static/admin/js/jquery-1.8.3.min.js"></script>
</body>
</html>


