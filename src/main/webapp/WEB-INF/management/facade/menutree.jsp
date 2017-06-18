<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<fmt:setBundle basename="i18n/management/facade/menutree" />
<!--  <fmt:setLocale value="zh_CN" />  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><fmt:message key="page.title"></fmt:message></title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active");
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
});
</script>
</head>
<body style="background: #f0f9fd">
	<div class="lefttop">
		NCEE
	</div>

	<dl class="leftmenu">
		<dd>
			<div class="title">
				<span><img src="../images/leftico01.png" /></span>
				<fmt:message key="menu.tree.branch.papermanage"></fmt:message>
			</div>
			<ul class="menuson">
				<li  class="active">
					<cite></cite>
					<s:a href="../menutree/addpaper" target="rightFrame">
						<fmt:message key="menu.tree.leaf.addpaper"></fmt:message>
					</s:a>
				</li>
				<li>
					<cite></cite>
					<s:a href="../menutree/paperlist" target="rightFrame">
						<fmt:message key="menu.tree.leaf.paperlist"></fmt:message> 
					</s:a>
				</li>
				<li>
					<cite></cite> 
					<s:a href="../menutree/addquestion.do" target="rightFrame" >
						<fmt:message key="menu.tree.leaf.addquestion"></fmt:message> 
					</s:a>
				</li>
				<li>
					<cite></cite>
					<s:a href="../menutree/questionlist" target="rightFrame">
						<fmt:message key="menu.tree.leaf.questionlist"></fmt:message>
					</s:a>
				</li>
				<li>
					<cite></cite>					
					<s:a href="../menutree/addprovince.do" target="rightFrame"> 
						<fmt:message key="menu.tree.leaf.addprovince"></fmt:message> 
					</s:a> 
				</li>
				<li>
					<cite></cite>
					<s:a href="../menutree/provincelist" target="rightFrame">
						<fmt:message key="menu.tree.leaf.provincelist"></fmt:message>
					</s:a>
				</li>
				<li>
					<cite></cite>
					<s:a href="../menutree/addknowledge" target="rightFrame">
						<fmt:message key="menu.tree.leaf.addknowledge"></fmt:message>
					</s:a>
				</li>
				<li>
					<cite></cite>
					<s:a href="../menutree/knowledgelist" target="rightFrame">
						<fmt:message key="menu.tree.leaf.knowledgelist"></fmt:message>
					</s:a>
				</li>
			</ul>
		</dd>

		<dd>
			<div class="title">
				<span><img src="../images/leftico02.png" /></span>其他设置
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">编辑内容</a><i></i></li>
				<li><cite></cite><a href="#">发布信息</a><i></i></li>
				<li><cite></cite><a href="#">档案列表显示</a><i></i></li>
			</ul>
		</dd>

		<dd>
			<div class="title">
				<span><img src="../images/leftico03.png" /></span>编辑器
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">自定义</a><i></i></li>
				<li><cite></cite><a href="#">常用资料</a><i></i></li>
				<li><cite></cite><a href="#">信息列表</a><i></i></li>
				<li><cite></cite><a href="#">其他</a><i></i></li>
			</ul>
		</dd>

		<dd>
			<div class="title">
				<span><img src="../images/leftico04.png" /></span>权限管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">自定义</a><i></i></li>
				<li><cite></cite><a href="#">常用资料</a><i></i></li>
				<li><cite></cite><a href="#">信息列表</a><i></i></li>
				<li><cite></cite><a href="#">其他</a><i></i></li>
			</ul>

		</dd>

	</dl>

</body>
</html>