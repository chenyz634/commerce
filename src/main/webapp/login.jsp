<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>电子商务</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="css/login.css" rel="stylesheet">
<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.placeholder.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("input, textarea").placeholder();
	});
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<h1 class="text-center login-title">用户登录</h1>
				<div class="account-wall">
					<img class="profile-img" src="images/photo.jpg.png" alt="">
					<%if(request.getAttribute("shiroLoginFailure") != null){ %>
					<div class="alert alert-error">
						<a class="close" data-dismiss="alert" href="#">×</a>用户名或密码错误！
					</div>
					<%} %>
					<form class="form-signin" method="post" action="">
						<input type="text" name="username" class="form-control"
							placeholder="用户名" required autofocus>
						<input type="password" name="password" class="form-control"
							placeholder="密码" required>
						<button class="btn btn-lg btn-primary btn-block" type="submit">
							登录</button>
						<label class="checkbox pull-left">
						<input type="checkbox" name="rememberMe"
							value="true"> 记住用户名
						</label> <!-- <a href="#" class="pull-right need-help">帮助? </a> --><span
							class="clearfix"></span>
					</form>
				</div>
				<a href="#" class="text-center new-account">注册新用户</a>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		
	</script>
</body>
</html>
