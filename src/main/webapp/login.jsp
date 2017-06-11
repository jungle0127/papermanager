<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NCEE登录系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/cloud.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
	    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
		$(window).resize(function(){  
	    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    }); 
});  
</script> 
</head>
<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  
    <div class="logintop">    
	    <span>欢迎登录后台管理界面平台</span>    
	    <ul>
		    <li><a href="#">回首页</a></li>
		    <li><a href="#">帮助</a></li>
		    <li><a href="#">关于</a></li>
	    </ul>    
	</div>
	<form action="login" method="post">
		<div class="loginbody">
		    <span class="systemlogo"></span> 
		    <div class="loginbox">
			        <ul>
					    <li>
						    <input id="username" name="username" type="text" class="loginuser" value="ps" onclick="JavaScript:this.value=''"/>
					    </li>
					    <li>
					    	<input id="password" name="password" type="password" class="loginpwd" value="lotus" onclick="JavaScript:this.value=''"/>
					    </li>
					    <li>
					    	<input name="login" type="submit" class="loginbtn" value="Login"  /> <!-- onclick="javascript:window.location='manage/manageindex.jsp'"  -->
					    	<label>
					    		<input name="" type="checkbox" value="" checked="checked" />记住密码
					    	</label>
					    	<label>
					    		<a href="#">忘记密码？</a>
					    	</label>
					    </li>
		    		</ul>
	    	</div>
	 	</div>
	</form>
	<div class="loginbm">版权所有  2017</div>
</body>
</html>