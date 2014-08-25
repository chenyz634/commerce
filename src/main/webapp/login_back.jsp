<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String cp = request.getContextPath();
%>
<!DOCTYPE html>
<!--  PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>网上展示平台</title>
	<link rel="stylesheet" type="text/css" href="easyui/themes/cupertino/easyui.css"/>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"/>
	<link rel="stylesheet" type="text/css" href="css/login.css"/>
	<script type="text/javascript" src="js/jquery-1.7.1.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript">
		function check(){
			if(window != top)
				top.location = "<%=cp%>/index.jsp";	
		}
		function submitForm() {
			if(!$("#loginForm").form("validate")) {
				return;
			}
			$('#loginForm').submit();
		}
	</script>
</head>
<body class="easyui-layout" id="tbody" onload="check();">
	<div region="center"  >
		<!--  <div style="margin:20px 0;"></div>-->
		<div class="easyui-panel" title="Login to system" style="width:400px;padding:30px 70px 20px 70px;">
			<form id="loginForm" action='' method="post">
				<div style="margin-bottom:10px">
					<input class="easyui-textbox" name="username" style="width:100%;height:40px;padding:12px" data-options="prompt:'Username',iconCls:'icon-man',iconWidth:38,required:true">
				</div>
				<div style="margin-bottom:20px">
					<input class="easyui-textbox" name="password" type="password" style="width:100%;height:40px;padding:12px" data-options="prompt:'Password',iconCls:'icon-lock',iconWidth:38,required:true">
				</div>
				<div style="margin-bottom:20px">
					<input type="checkbox" checked="checked">
					<span>Remember me</span>
				</div>
			</form>
			<div>
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm();" data-options="iconCls:'icon-ok'" style="padding:5px 0px;width:100%;">
					<span style="font-size:14px;">Login</span>
				</a>
			</div>
		</div>
	</div>
</body>
</html>