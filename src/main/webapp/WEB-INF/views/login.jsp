<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>后台登录</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/layui/css/layui.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/css/login.css" />
	</head>

	<body>
		<div class="m-login-bg">
			<div class="m-login">
				<h3>病历管理系统</h3>
				<div class="m-login-warp">
					<form class="layui-form" action="${pageContext.request.contextPath}/login" method="post">
						<div class="layui-form-item">
							<input type="text" name="id" required lay-verify="required" placeholder="DoctorID" autocomplete="off" class="layui-input">
						</div>
						<div class="layui-form-item">
							<input type="password" name="password" required lay-verify="required" placeholder="Password" autocomplete="off" class="layui-input">
						</div>
						<div class="layui-form-item m-login-btn">
							<div class="layui-inline">
								<button class="layui-btn layui-btn-normal" lay-submit lay-filter="login">登录</button>
							</div>
							<div class="layui-inline">
								<button type="reset" class="layui-btn layui-btn-primary">取消</button>
							</div>
						</div>
                        <div>
                            ${error}
                        </div>

					</form>
				</div>
				<p class="copyright">Copyright 2018-2019   @ Wenqi.Guo</p>
			</div>
		</div>
		<script src="${pageContext.request.contextPath}/static/admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
	</body>

</html>