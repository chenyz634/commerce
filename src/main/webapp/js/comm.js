/**
 * 提取标签内容，这个方法应该也挺有用的，可以提取某个标签内的文本 你可以看下面textMsgIsError对这个函数的使用
 * 
 * @param tag
 * @return
 */
function obtainTextInTag(data, tag) {
	var spaceindex = tag.indexOf(" ");
	var tagname = tag.substring(1, spaceindex == -1 ? tag.length - 1
			: spaceindex);
	var si = data.indexOf(tag);
	if (si == -1) {
		// 没有开始标签
		return "";
	}
	var ei = data.indexOf("</" + tagname + ">", si + tag.length);
	return data.substring(si + tag.length, ei == -1 ? data.length : ei);
}

/**
 * 打印错误信息
 * 
 * @param t
 * @return
 */
function analyzeError(t) {
	$.messager.alert('错误信息', t);
}

/**
 * 判断返回的文本消息是否有错误，有则返回true，无则返回false 这个函数主要是给ajax调用使用的 一般ajax调用的时候都会指定一个success:
 * showResponse 那么在showResponse里需要首先调用这个方法，看返回消息是否有错误
 * 如果有错误，即这个方法返回true，则showResponse后续代码也不用执行了
 * 
 * @return
 */
function textMsgIsError(data, errorCallback) {
	var t = obtainTextInTag(data, "<title>");
	if (t != "失败") {
		return false;
	}
	t = obtainTextInTag(data, '<span id="msg">');
	analyzeError($("<div/>").html(t).text());
	return true;
}

/**
 * 以下方法处理xml消息，即ajax请求时指定数据类型为xml
 * 
 * @param data
 * @return
 */
function xmlMsgIsError(data, errorCallback) {
	if ($(data).find("title").text() != "失败") {
		return false;
	}
	var t = $(data).find("#msg").text();
	analyzeError(t);
	return true;
}

/**
 * 以下方法处理json错误消息，这个就自己写吧
 * 
 * @param data
 * @return
 */
function jsonMsgIsError(data, errorCallback) {
	// 没有错误
	if (!data.errormsg) {
		return false;
	}

	var t = data.errormsg;
	analyzeError(t);
	return true;
}

/**
 * 这个代码专门用来处理ajax异常情况，请补充完整
 * 
 * @return
 */
function showError() {
	analyzeError("未知异常");
}

function showError(responseXML, statusText, xhr, form) {
	alert("error");
	alert(responseXML);
	unloading();// 隐藏loading
}

// loading效果
function loading(content) {
	$("<div class=\"datagrid-mask\"></div>").css({
		display : "block",
		width : "100%",
		height : $(window).height()
	}).appendTo("body");
	$("<div class=\"datagrid-mask-msg\"></div>").html(content).appendTo("body")
			.css({
				display : "block",
				left : ($(document.body).outerWidth(true) - 190) / 2,
				top : ($(window).height() - 45) / 2
			});
}

// hidden Load
function unloading() {
	$(".datagrid-mask").remove();
	$(".datagrid-mask-msg").remove();
}
// easyui
// 操作状态提示
function showResult(title, content) {
	// alert("show ");
	/*
	 * $.messager.show({ title:title, msg:content, showType:'show' });
	 */

	// 页面中部显示
	$.messager.show({
		title : title,
		msg : content,
		showType : 'fade',
		timeout : 3000,
		style : {
			right : '',
			bottom : ''
		}
	});
}

function fixWidth(percent) {

	return $(window).width() * percent;
}

/* 获取easyui数据表格当前显示页，id：为数据表格的id */
function getPageNum(id) {
	return $("#" + id).datagrid("getPager").data("pagination").options.pageNumber;
}

/* 获取easyui数据表的当前的分页单位，id:数据表格的id */
function getPageSize(id) {
	return $("#" + id).datagrid("getPager").data("pagination").options.pageSize;
}
