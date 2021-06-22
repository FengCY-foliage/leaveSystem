<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>登录</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<link rel="shortcut icon" href="images/logo.jpg">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>

</head>
<script language="javascript">

 if(top.location != location){
top.location.href = location.href;
}
</script>
<body>

	<div class="bg"></div>
	<div class="container">
		<div class="line bouncein">
			<div class="xs6 xm4 xs3-move xm4-move">
				<div style="height:150px;"></div>
				<div class="media media-y margin-big-bottom"></div>
				<form id="loginForm" action="http://localhost:8080/leaveSystem/loginServlet" method="post">
					<div class="panel loginbox">
						<div class="text-center margin-big padding-big-top">
							<h1>学生请假管理系统</h1>
						</div>
						<div class="panel-body"
							style="padding:30px; padding-bottom:10px; padding-top:10px;">
							<div class="form-group">
								<div class="field field-icon-right">
									<input type="text" class="input input-big" name="userid"
										placeholder="登录学号" data-validate="required:请填写学号"  value="1"/> <span
										class="icon icon-user margin-small"></span>
								</div>
							</div>
							<div class="form-group">
								<div class="field field-icon-right">
									<input type="password" class="input input-big" name="password"
										placeholder="登录密码" data-validate="required:请填写密码" value="1"/> <span
										class="icon icon-key margin-small"></span>
								</div>
							</div>
							<div class="form-group">
								<div class="field">
									<input type="text" class="input input-big" name="code" value="6982"
										placeholder="填写右侧的验证码" data-validate="required:请填写右侧的验证码" />
									<img src="images/passcode.jpg" alt="" width="100" height="32"
										class="passcode" style="height:43px;cursor:pointer;"
										onclick="this.src=this.src+'?'">
								</div>
							</div>
						</div>
						<div style="padding-left:30px;padding-right:30px;">
							<input type="submit"
								class="button button-block bg-main text-big input-big"
								value="登录">
						</div>
						<div style="margin:30px;padding-bottom:30px;">&emsp;&emsp;
							<input type="radio" name="users" value="student" checked>学生&emsp;&emsp;&emsp;&emsp;
							<input type="radio" name="users" value="teacher">辅导员&emsp;&emsp;&emsp;&emsp;
							<input type="radio" name="users" value="admin">管理员&emsp;&emsp;
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
