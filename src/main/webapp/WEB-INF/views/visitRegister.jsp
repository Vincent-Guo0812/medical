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
    <legend>入诊登记</legend>
</fieldset>

<div class="layui-form-item">
    <div class="layui-inline" style="left: 10px">
        <input type="text" name="ID" id="ID" required lay-verify="required" placeholder="请输入身份证号" autocomplete="off" class="layui-input">
    </div>

   <button type="submit" id="submit" class="layui-btn layui-btn-normal" lay-submit="search">搜索</button>
</div>




<form class="layui-form" id="form" action="${pageContext.request.contextPath}/patient/recordRegister" method="post" hidden="hidden" onsubmit="return check()">

    <input type="hidden" name="doctorId" id="doctorId" value="${sessionScope.doctor.id}">
    <input type="hidden" name="doctorName" id="doctorName" value="${sessionScope.doctor.name}">

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="name" name="name" id="name" lay-verify="required" autocomplete="off" class="layui-input" disabled="disabled">
                <input type="hidden" id="id1" name="identityId">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">联系方式</label>
            <div class="layui-input-inline">
                <input type="text" name="telephone" id="telephone" lay-verify="phone" autocomplete="off" class="layui-input" disabled="disabled">
            </div>
        </div>
        <div class="layui-inline">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-inline" id="genderCheck">
            <input type="radio" name="gender"  value="true" title="男" checked="checked" lay-filter="aaa">
            <input type="radio" name="gender"  value="false" title="女" lay-filter="aaa">
        </div>
        </div>
    </div>

    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">病史（没有填无）</label>
        <div class="layui-input-block"  style="width: 60%;height: 30%">
            <textarea placeholder="请输入内容" id="medicalHistory" name="medicalHistory" class="layui-textarea" style="height:90%" disabled="disabled"></textarea>
        </div>
    </div>



    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">诊断医生</label>
            <div class="layui-input-inline">
                <input type="name" id="doctorId3" name="doctorId3" lay-verify="required" autocomplete="off" class="layui-input" disabled="disabled">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">科室</label>
            <div class="layui-input-inline">
                <select name="department" id="department" lay-verify="required" lay-search="">
                    <option value="">请选择科室</option>
                    <option value="1">内科</option>
                    <option value="2">口腔科</option>
                    <option value="3">儿科</option>
                    <option value="4">眼科</option>
                    <option value="5">皮肤科</option>
                    <option value="6">妇产科</option>
                </select>
            </div>
        </div>
    </div>
    </div>

    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">症状</label>
        <div class="layui-input-block"  style="width: 60%;height: 30%">
            <textarea placeholder="请输入内容" name="symtom" id="symtom" class="layui-textarea" style="height:90%"></textarea>
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">处方</label>
        <div class="layui-input-block"  style="width: 60%;height: 30%">
            <textarea placeholder="请输入内容" name="prescribe" id="prescribe" class="layui-textarea" style="height:90%"></textarea>
        </div>

    </div>


    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">是否住院</label>
            <div class="layui-input-inline" id="hos">
                <input type="radio" id="radio" name="hospitalized" value="true" title="是" >
                <input type="radio" name="hospitalized" lay-filter="bbb"  value="false" title="否"  checked="checked" >
            </div>
        </div>
        <div class="layui-inline" >
            <label class="layui-form-label">床位号</label>
            <div class="layui-input-inline" >
                <select name="modules" lay-verify="required" lay-search="" disabled="disabled" id="bed">
                    <option value="">请选择床位</option>
                    <option value="1">201</option>
                    <option value="2">202</option>
                    <option value="3">203</option>
                    <option value="4">204</option>
                    <option value="5">205</option>
                </select>
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">住院天数</label>
            <div class="layui-input-inline" >
                <input type="text" name="bedTime" lay-verify="required" autocomplete="off" class="layui-input" disabled="disabled" id="bedTime">
            </div>
        </div>
    </div>



    <div class="layui-form-item" pane="" style="top: 10px">
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" type="submit">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
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
<script>

    function check() {
        if( $("#department").val()=="" ||  $("#symtom").val()=="" || $("#prescribe").val()=="") {
          alert("表单不能包含空项");
          return false;
      }
        return true;
    }

       $(document).on("click","#submit",function () {
           var ID=$("#ID").val();
           $.ajax({
               url:"${pageContext.request.contextPath}/patient/selectById2?ID="+ID,
               type:"POST",
               success(result){
                   if(result!=null && result.length!=0){
                       $("#form").removeAttr("hidden");
                       $("#id1").val(result.id);
                       $("#name").val(result.name);
                       $("#telephone").val(result.telephone);
                       $("#medicalHistory").val(result.medicalHistory);
                       $("#doctorId3").val($("#doctorName").val());
                       $("input[name=gender][value='true']").attr("checked", result.gender == true ? true : false);
                       $("input[name=gender][value='false']").attr("checked", result.gender == false ? true : false);
                       form.render();
                   }else{
                       $("#form").attr("hidden","hidden");
                       alert("暂无病人信息");
                   }
               },
           });
   });


</script>
</body>
</html>

