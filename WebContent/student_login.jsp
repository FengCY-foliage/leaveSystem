<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>系统主页</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<link rel="shortcut icon" href="images/logo.jpg">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>

</head>
<body style="background-color:#f2f9fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img src="images/logo.jpg" class="radius-circle rotate-hover"
					height="50" alt="" />请假信息管理系统
			</h1>
		</div>
		<div class="head-l">
			<a href="" target="_blank" style="color:#FFF"><span
				class="icon-user"></span> 欢迎 <% HttpSession Session = request.getSession();
		         String name = (String)Session.getAttribute("name");
		         out.println(name); %></a>&nbsp;&nbsp;<a
				class="button button-little bg-green" href="" target="_blank"><span
				class="icon-home"></span> 首页</a> &nbsp;&nbsp;<a
				class="button button-little bg-red" href="login.jsp"><span
				class="icon-power-off"></span> 退出登录</a>
		</div>
	</div>
	<div class="leftnav">
		<div class="leftnav-title">
			<strong><span class="icon-list"></span>菜单列表</strong>
		</div>
		<h2>
			<span class="icon-user"></span>系统设置
		</h2>
		<ul style="display:block">
			<li><a href="leave_list_student.jsp" target="right"><span
					class="icon-caret-right"></span>填写请假单</a></li>
		</ul>
	</div>
	<script type="text/javascript">
		$(function() {
			$(".leftnav h2").click(function() {
				$(this).next().slideToggle(200);
				$(this).toggleClass("on");
			})
			$(".leftnav ul li a").click(function() {
				$("#a_leader_txt").text($(this).text());
				$(".leftnav ul li a").removeClass("on");
				$(this).addClass("on");
			})
		});
	</script>
	<ul class="bread">
		
		<li><a href="##" id="a_leader_txt">欢迎界面</a></li>
		<li><b>当前语言：</b><span style="color:red;">中文</php></span>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;切换语言：<a href="##">中文</a></li>

	</ul>
	<div class="admin">
		<iframe scrolling="auto" rameborder="0" src="stu_main.jsp"
			name="right" width="100%" height="100%"></iframe>
	</div>
</body>
</html>
