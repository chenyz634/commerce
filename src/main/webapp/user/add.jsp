<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.text.*,java.util.*"%>
<%
	String cp = request.getContextPath();
%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加专家分组</title>
<link rel="stylesheet" type="text/css" href="../easyui/themes/default/easyui.css"/>
<link rel="stylesheet" type="text/css" href="../easyui/themes/icon.css"/>
<script type="text/javascript" src="../js/jquery-1.7.1.js"></script>
<script type="text/javascript" src="../easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="../js/comm.js"></script> 
<script type="text/javascript" src="../js/search.js"></script> 
<script type="text/javascript" src="user.js"></script> 
<script type="text/javascript">
	$(document).ready(function(){
		combobox('roles', '../code/js.json');
	});
	
	function addpassword() {
		    var password = document.getElementById("username").value;
			var p_length = password.length;		
			var p_part = password.substring(p_length - 6,p_length);
			alert(p_part);
			document.getElementById("password").value = p_part; 
	}
	
	function submitAddUser() {
	   
		//document.getElementById("insert").innerHTML(insertText);
		//使用easyui的表单验证方式
		$("#User_add")
		.form(
				'submit',
				{
					url : '../user/user_add.action',
					onSubmit:function(){   
				    },  
					success : function(data) {										
						if ($.trim($(data).find('span').text()) != "添加成功") {
							$.messager.alert("提示信息", "添加失败！", "info");
						} else {
							$.messager.alert("提示信息",$(data).find('span').text(),"info");
						}
						parent.reloadTableAfterUpdateOrAdd();
					}
				});
	}
	
	//重置
	function clearForm() {
		$("#User_add").form('clear');
	}
</script>
</head>
<body>
<div class="easyui-panel"  >
	 <div style="padding:10px 0 10px 1px">
	 	<form id="User_add" method="post" >
		<table id="main_table">
			<tr>
				<td><label for="username">用户名称</label></td>
				<td><input id="username" maxlength="50" name="obj.username" missingMessage="请输入用户组名称" class='easyui-validatebox'  type="text" onchange="addpassword()"/></td>
				<td><label for="roles">用户角色</label></td>
				<td><input id="roles" name="obj.roles" class="easyui-combobox"  type="text"/></td>
			</tr>
			<tr>
				<td><label for="password">密码</label></td>
				<td>密码为用户名后六位</td>
				<input id="password" maxlength="200" name="obj.password"  class='easyui-validatebox' type="hidden"/>
				<td><label for="orgcode">组织</label></td>
				<td><input id="orgcode" maxlength="50" name="obj.orgcode" class="easyui-validatebox" type="text"/></td>
			</tr>
			<tr>
				<td colspan="4" style="text-align: center; padding: 5px">  				    
					 <a class="easyui-linkbutton" href="javascript:void(0);" onclick="return submitAddUser();">保&nbsp;&nbsp;存</a> 
					<a class="easyui-linkbutton" href="javascript:void(0);" onclick="return clearForm();">重&nbsp;&nbsp;置</a>
				</td> 
				
			</tr>
		</table>
		</form>
	 </div>
</div>
</body>
</html>