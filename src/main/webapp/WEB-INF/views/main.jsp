<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*,java.sql.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>病历管理系统</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/layui/css/layui.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/css/admin.css"/>
		<script type="text/javascript">
            function showTime(){
                nowtime=new Date();
                year=nowtime.getFullYear();
                month=nowtime.getMonth()+1;
                date=nowtime.getDate();
                document.getElementById("mytime").innerText=year+"年"+month+"月"+date+"日"+" "+nowtime.toLocaleTimeString();
            }
            setInterval("showTime()",1000);
		</script>

	</head>
	<body>

		<div class="main-layout" id='main-layout'>
			<!--侧边栏-->
			<div class="main-layout-side">
				<div class="m-logo">
				</div>
				<ul class="layui-nav layui-nav-tree" lay-filter="leftNav">
				  <li class="layui-nav-item layui-nav-itemed">
				    <a href="javascript:;"><i class="iconfont">&#xe607;</i>病人管理</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;" data-url="${pageContext.request.contextPath}/patient/toPatientRegister" data-id='1' data-text="病人登记"><span class="l-line"></span>病人登记</a></dd>
				      <dd><a href="javascript:;" data-url="${pageContext.request.contextPath}/patient/selectAll" data-id='2' data-text="病人搜索"><span class="l-line"></span>病人搜索</a></dd>
				    </dl>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont">&#xe608;</i>病历管理</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;" data-url="${pageContext.request.contextPath}/patient/toVisitRegister" data-id='3' data-text="入诊登记"><span class="l-line"></span>入诊登记</a></dd>
				      <dd><a href="javascript:;" data-url="${pageContext.request.contextPath}/listNow" data-id='9' data-text="当前病历"><span class="l-line"></span>当前病历</a></dd>
				    </dl>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;" data-url="${pageContext.request.contextPath}/alreadyRecovery" data-id='10' data-text="归档管理"><i class="iconfont">&#xe604;</i>归档管理</a>
				  </li>
				   <li class="layui-nav-item">
				    <a href="javascript:;" data-url="${pageContext.request.contextPath}/toPersonalCenter" data-id="11" data-text="个人中心"><i class="iconfont">&#xe60c;</i>个人中心</a>
				  </li>
				</ul>
			</div>
			<!--右侧内容-->
			<div class="main-layout-container">
				<!--头部-->
				<div class="main-layout-header">
					<div class="menu-btn" id="hideBtn">
						<a href="javascript:;">
							<span class="iconfont">&#xe60e;</span>
						</a>
					</div>
					<ul class="layui-nav" lay-filter="rightNav">
						<li class="layui-nav-item"> <a>系统时间： <span id="mytime"></span></a></li>
					  <li class="layui-nav-item"><a href="javascript:;" data-url="email.html" data-id='4' data-text="邮件系统"><i class="iconfont">&#xe603;</i></a></li>
					  <li class="layui-nav-item">
					    <a href="javascript:;" data-url="admin-info.html" data-id='5' data-text="个人信息">${sessionScope.doctor.name}</a>
					  </li>
					  <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/logOut">退出</a></li>
					</ul>
				</div>
				<!--主体内容-->
				<div class="main-layout-body">
					<!--tab 切换-->
					<div class="layui-tab layui-tab-brief main-layout-tab" lay-filter="tab" lay-allowClose="true">
					  <ul class="layui-tab-title">
					    <li class="layui-this welcome">后台主页</li>
					  </ul>
					  <div class="layui-tab-content">
					    <div class="layui-tab-item layui-show" style="background: #f5f5f5;">
					    	<!--1-->
					    	<iframe src="${pageContext.request.contextPath}/toWelcome" width="100%" height="100%" name="iframe" scrolling="auto" class="iframe" framborder="0"></iframe>
					    	<!--1end-->
					    </div>
					  </div>
					</div>
				</div>
			</div>
			<!--遮罩-->
			<div class="main-mask">
				
			</div>
		</div>

		<script src="${pageContext.request.contextPath}/static/admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/static/admin/js/common.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/static/admin/js/main.js" type="text/javascript" charset="utf-8"></script>

	</body>
</html>
