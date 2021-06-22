<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*" import="fcy.leave.bean.*" import="fcy.leave.Dao.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>学生信息列表</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<link rel="shortcut icon" href="images/logo.jpg">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 学生列表</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left:10px;">
					<li><a class="button border-main icon-plus-square-o"
						href="studentAdd.jsp"> 录入学生信息</a></li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th>学生姓名</th>
					<th>学生学号</th>
					<th>学生密码</th>
				</tr>

				<%--读取信息记录 --%>
				
				<tr>
				 
					<% ArrayList<loginBean> list= peopleListDao.findStudent(); %>
					<% for(int i = 0;i<list.size();i++) {
						out.println("<tr>");
						out.println("<td>"+list.get(i).getName()+"</td>");
						out.println("<td>"+list.get(i).getUsername()+"</td>");
						out.println("<td>"+list.get(i).getPassword()+"</td>");
						out.println("</tr>");
					} %>
					
					<td>
					
			</table>
		</div>
</body>
<script type="text/javascript">
$("[name='keywords']").each(function(){
var n = $(this).attr("search");
if(n.indexOf(name) == -1 )
{
$(this).hide();//隐藏不存在关键字的列表
}
});
</script>
</html>