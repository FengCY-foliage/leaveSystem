<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*" import="fcy.leave.bean.*" import="fcy.leave.Dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<link rel="shortcut icon" href="images/logo.jpg">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>教师信息</strong>
		</div>
		<div class="body-content">
			<form method="post" class="form-x"
				action="peopleAddServlet?2">
				<div class="form-group">
					<div class="label">						
						</select>

						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>教师姓名：</label>
					</div>
					<div class="field" style="width:600px;">
						<input type="text" class="input w50" value="" name="name"
							data-validate="required:数据必填项" />
						<div class="tips"></div>
					</div>
				</div>
					<div class="form-group">
					<div class="label">
						<label>教师编号：</label>
					</div>
					<div class="field" style="width:600px;">
						<input type="text" class="input w50" value="" name="username"
							data-validate="required:数据必填项" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>教师密码：</label>
					</div>
					<div class="field" style="width:600px;">
						<input type="text" class="input w50" value="" name="password"
							data-validate="required:数据必填项" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label></label>
					</div>
					<div class="field">
					<button class="button bg-main icon-check-square-o" type="submit">
							提交</button>
						&emsp;&emsp;&nbsp; <a class="button bg-main icon-check-square-o"
							href="teacher_list.jsp"
							style="background-color:#FFB800; 
						type="submit">返回</a>
						</from>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript">
	function showTime() { 
	var date1 =new Date;
    var year=date1.getFullYear();
    var month=date1.getMonth();
    var day=date1.getDate();
    var hh=date1.getHours();
    var mm=date1.getMinutes();
    var ss=date1.getSeconds();
	var time=year+"年"+(month+1)+"月"+day+"日  "+hh+":"+mm+":"+ss;
    document.getElementById("clock").innerHTML = time;
	}
</script>
</html>