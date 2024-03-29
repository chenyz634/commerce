var title = "用户信息";
var data = {
		xy : null,
		zy : null,
		xl : null
};
var arrMatch=[
    //combobox,combotree
	new Match("C_USERNAME","用户名称 ",textfunction),
	/*new Match("C_PASSWORD","用户密码",textfunction),*/
	new Match("C_ROLES","用户角色",textfunction),
	new Match("C_ORGCODE","用户组织",textfunction),
	]; 

function submitSerach(pageNumber) {
	loading("获取数据中。。。。。。");
	if(pageNumber == 1) {//重新点击了查询按钮，这时候从第一页开始显示，但是分页显示的可能不是第一页 ，所以需要重新设置下pagination显示的当前页数
		var pg = $("#groupInfoTable").datagrid("getPager");
		pg.pagination({pageNumber:1});
	} 
	psize = $("#p_size").val();
	if(psize==""||psize==null){
		psize=10;
	}
	var options = {
			url     :'../user/list_user.action?rows='+psize+'&page='+pageNumber,
			success	:	reloadGroupTable,
			error	:	errorTip,
			dataType:	'json'
	};
    $("#searchForm").ajaxSubmit(options);
}
function reloadGroupTable(responseXML, statusText, xhr, form) {
	$('#groupInfoTable').datagrid('loadData', responseXML); 
	setLinkbuttonStyle();
	unloading();
}
function reloadTableAfterUpdateOrAdd() {
	$('#groupInfoTable').datagrid('reload'); 
}
function errorTip(responseXML, statusText, xhr, form) {
	showResult(obtainTextInTag(responseXML,"<title>"),$(responseXML).find("#msg").text());
	setLinkbuttonStyle();
	unloading();
}

 function initTable() { 
	 $("#tableid").datagrid({
 		title:'用户检索',
 		singleSelect:true,
 		fitColumns:true,
 		
 		columns:[[
			{field:'way',title:'连接方式',width:fixWidth(0.1)},
 		    {field:'target',title:'检索项',width:fixWidth(0.2)},
 		    {field:'method',title:'运算',width:fixWidth(0.1)},
 		    {field:'content',title:'内容',width:fixWidth(0.23)},
 		    {field:'sort',title:'排序',width:fixWidth(0.15)},
 		    {field:'dos',title:'操作',width:fixWidth(0.2)}
 		]]
 	});
	//alert(window.location.href);
	//$.post('../../group/Group_list.action?search.columns=-');
	$('#groupInfoTable').datagrid({    
		title:'用户信息',
 		fitColumns:true,
	    url:'../user/list_user.action?search.columns=-',
	    pageSize:10,
	    pageList:[10,20,50],
	    columns:[[  
	        {field:'ok',checkbox:true},   
	        {field:'username',title:'用户名称',width:fixWidth(0.1)},  
	        //{field:'password',title:'用户密码',width:fixWidth(0.1)},  
	        {field:'roles',title:'用户角色',width:fixWidth(0.1)}, 
	        {field:'orgcode',title:'用户所属组织',width:fixWidth(0.1)}, 
	                
	        {field:'dos',title:'操作',width:fixWidth(0.25),align:'left',formatter:function(value,rowData,index){
	        	var s = '<a href="#" name="editLink" onclick="editUser('+"'"+rowData.username+"'"+');">编辑</a> ';
	        	var c = '<a href="#" name="delLink" onclick="delOneMet('+"'"+rowData.username+"'"+')">删除</a>';
	        	return s+c;
	        }}
	    ]],
	    toolbar:[
	        {text:'增加', iconCls:'icon-add', handler: showAddPage },
	        {text:'批量删除', iconCls:'icon-cancel', handler: delUser}
	    ],
	    pagination: true,
  		rownumbers: false,
  		onLoadSuccess:function (data) { //数据加载成功后需要设置linkbutton的样式，
  			setLinkbuttonStyle();
  		}
	});
 	var pg = $("#groupInfoTable").datagrid("getPager");
	if(pg) {    
	    $(pg).pagination({
	        onRefresh:function(pageNumber,pageSize){ 
	        	submitSerach(pageNumber); 
	        	setLinkbuttonStyle();
	        },    
	        onChangePageSize:function(pageSize){  
	        	$("#p_size").val(pageSize);
	        	submitSerach(1);//更改分页单位后，设置为显示第一页
	        	setLinkbuttonStyle();
	        },    
	        onSelectPage:function(pageNumber,pageSize){ 
	       		submitSerach(pageNumber);
	       		setLinkbuttonStyle();
	       	}    
	    });    
	 } 
	$("#p_size").val($("#groupInfoTable").datagrid('options').pageSize);
}
 
	$(document).ready(function () {
		//alert($("#groupInfoTable").datagrid('options').pageSize);
		
	});

 //显示添加学生窗口
 function showAddPage() {
	 var content = '<iframe id="userIframe" frameborder="0"  src="add.jsp" style="width:100%;height:100%;"/>';
	 $("#dlg").dialog({
		 title	:"添加用户信息",
		 height:$(window).height() * 0.8,
		 width:$(window).width() * 0.7,
		 modal:true,
		 content:content,
		 buttons:[
		          {text:'完  成',handler:function() {
		        	  $("#dlg").dialog("close");
		          }}
		          ]
	 });
 }
 /**
  * 只显示作者是自己的记录
  * @param author
  */
function showMyselfList(author){
	$("#searchCol").val("c_author");
	$("#searchOpera").val("eq");
	$("#searchVal").val(author);
	submitSerach(1);
}
 //用来显示添加，编辑专家组信息状态。关闭添加，编辑会议资料对话框
 function closeDlg(callbackData) {
	$("#dlg").dialog("close");
	$("#groupInfoTable").datagrid("reload");
	showResult(obtainTextInTag(callbackData,"<title>"),$(callbackData).find("#msg").text());
 }

 
 function delOneMet(obj) {
	 $.messager.confirm('确认','删除不可恢复，您确认想要删除记录吗？',function(r){
		 if(r) {
			 loading("传输数据中，请稍后。。。");
			 alert(obj);
			 $.post("../user/user_delete.action?username="+obj,function (callbackData) {
				 showResult(obtainTextInTag(callbackData,"<title>")  ,$(callbackData).find("#msg").text());
				 $("#groupInfoTable").datagrid("reload");
				 unloading();
			 }); 
		 }
	 });
 }
 
//删除选中学生，一个或多个
 function delUser() {
	//获取所有选中行
	var rows = $("#groupInfoTable").datagrid("getSelections");
	if(rows.length == 0) {
		$.messager.alert("提示","请选择你要删除的项！");
		return ;
	}
	
	$.messager.confirm('确认','所有被选中的记录都将被彻底删除，并且不可恢复，您确认想要删除记录吗？',function(r){    
		if (r){  
			loading("传输数据中，请稍后。。。");
			var ids = [];
			//var undelete = "会议名称为："; //提示给用户不能删除的文件的信息
			var flag = false;
			 for(i = 0 ; i < rows.length ; i++ ) {
				 var row = rows[i];
				// if(row.author == author || isAdmin){
					 ids.push(row.username);
				 //}else{
					// undelete +=" '"+row.name+"' ";
					// flag = true;
				// }
			 }
			 //if(flag){
				 	//undelete += " 的作者不是您本人，您将不能删除";
				 	//alert(undelete);
				 //}
			 if(ids.length>0){
				 //判断是否有要删除的id，没有就不执行下列代码
				 $.post("../user/user_delete.action",$.param({username:ids}, true),function (callbackData) {
					 showResult(obtainTextInTag(callbackData,"<title>"),$(callbackData).find("#msg").text());
					 $("#groupInfoTable").datagrid("reload");
				 }); 
			 }
			 unloading();
		}    
	}); 
 }
 //打开开编辑专家组信息窗口
 function editUser(Username){
	 
	 var content = '<iframe scrolling="auto" name="editIfram" id="groupIframe" frameborder="0"  src="../user/load_user.action?username='+Username+'" style="width:100%;height:100%;"/>';
	 $("#dlg").dialog({
		 title:"更新用户信息",
		 height:$(window).height() * 0.9,
		 width:$(window).width() * 0.7,
		 content:content,
		 modal: true,
		 buttons:[
		          {text:'完  成',handler:function() {
		        	  $("#dlg").dialog("close");
		          }}
		          ]
	 }); 
 }
 
/*上传文件*/
function uploadGroup(dir,author) {
	var content = '<iframe id="groupIframe" frameborder="0"  src="../upload.jsp?type=meeting&author='+author+'&dir='+dir+'" style="width:100%;height:100%;"></iframe>';
	$("#dlg").dialog({
		title:'上传会议资料',
		height:450,
		width:650,
		modal:true,
		content:content,
		buttons:[
		    {text:'完  成',handler:function () {
		        $("#dlg").dialog("close"); 
		    }}
		]
	});
}	

