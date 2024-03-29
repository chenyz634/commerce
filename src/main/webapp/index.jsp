<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.text.*,java.util.*"%>
<%
	String cp = request.getContextPath();
%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>网站容灾系统</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/cupertino/easyui.css"/>
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"/>
<script type="text/javascript" src="js/jquery-1.7.1.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/index.js"></script> 
<script type="text/javascript">
	var urls = {
		"项目申报":"<%=cp%>/other/project/Project_list.jsp",
		"本单位审核":"<%=cp%>/other/meeting/Meeting_list.jsp",
		"教育厅审核":"<%=cp%>/project/check/list.jsp",
		"评审分组":"pingshen/group/list.jsp",
		"评审打分":"pingshen/score/list.jsp",
		"评审决策":"<%=cp%>/other/training/Training_list.jsp",
		"专家推荐":"expert/list.jsp",
		"专家审核":"<%=cp%>/expert/details/list.jsp",
		"用户管理":"<%=cp%>/user/list.jsp",
		"代码管理":"code/admin/codelibs.jsp"
	};

	String.prototype.trim = function() {
		return this.replace(/(^\s*)|(\s*$)/g, "");
	}
	$(function() {
		$(".easyui-tree").tree({
			onClick : function(node) {
				if (urls[node.text.trim()]) {
					addTab(node.text, urls[node.text.trim()]);
				}
			}
		});
	});
	

	//打开修改密码窗口
	function editUser(user) {
		var content = '<iframe scrolling="auto" name="editIfram" id="userIframe" frameborder="0"  src="other/User_load.action?users='
				+ user + '" style="width:100%;height:100%;"/>'
		$("#dlg").dialog({
			title : "更新用户信息",
			height : $(window).height() * 0.5,
			width : $(window).width() * 0.35,
			content : content,
			modal : true,
			buttons : [ {
				text : '返  回',
				handler : function() {
					$("#dlg").dialog("close");
				}
			} ]
		});
	}
	
	function logoff(){
		
		window.location.href="logout";
		
	}
	$(function(){
		$(".easyui-tree").tree({
			onClick: function(node){
				if(urls[node.text]){
					addTab(node.text,urls[node.text]);
				}
			}
		});
	});
</script>
</head>
<body class="easyui-layout" style="overflow: auto">

	<div data-options="region:'north',split:false" style="height: 92px;">
		<div
			style="background:url(<%=cp%>/images/banner.jpg) left top; height:90px; width:100%;">
			<div
				style="width: 100%; position: absolute; top: 68px; right: 20px; font-size: 12px; text-align: right; color: #020e30;">
				今天是<%=new SimpleDateFormat("yyyy年MM月dd日 E").format(new Date())%>
				<shiro:user>
					<a href="#" onclick="editUser('<%=request.getRemoteUser()%>');"
						class="easyui-linkbutton" data-options="plain:true">修改密码</a> <a
						href="#" onclick="logoff();" class="easyui-linkbutton"
						data-options="plain:true">退出系统</a>
				</shiro:user>
			</div>
		</div>
	</div>

	<div data-options="region:'west',title:'导航',split:true"
		style="width: 220px;">
		<div class="easyui-accordion" fit="true" border="false">
			<ul id="tree" class="easyui-tree">	
				<shiro:hasPermission name="xmsb">
					<li>项目申报</li>
				</shiro:hasPermission>
				<shiro:hasPermission name="bdwsh">
					<li>本单位审核</li>
				</shiro:hasPermission>
				<shiro:hasPermission name="edush">
					<li>教育厅审核</li>
				</shiro:hasPermission>
				<shiro:hasPermission name="psfz">
					<li>评审分组</li>
				</shiro:hasPermission>
				<shiro:hasPermission name="psdf">
					<li>评审打分</li>
				</shiro:hasPermission>
				<shiro:hasPermission name="psjc">
					<li>评审决策</li>
				</shiro:hasPermission>
				<shiro:hasPermission name="zjtj">
					<li>专家推荐</li>
				</shiro:hasPermission>
				<shiro:hasPermission name="zjsh">
					<li>专家审核</li>
				</shiro:hasPermission>
				<shiro:hasPermission name="yhgl">
					<li>用户管理</li>
				</shiro:hasPermission>
				<shiro:hasPermission name="dmgl">
					<li>代码管理</li>
				</shiro:hasPermission>
			</ul>
		</div>
	</div>
	<div data-options="region:'center',split:false,overflow:true">
		<div id="main-center" class="easyui-tabs" fit="true" border="false">
			<div title="欢迎" style="padding: 20px;" closable="false">
				<h3>欢迎使用科研项目管理平台！<shiro:user>当前用户是：<shiro:principal/></shiro:user></h3>
			</div>
		</div>
	</div>
	<div id="dlg"></div>
</body>
</html>
