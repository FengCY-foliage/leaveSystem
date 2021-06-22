<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*" import="fcy.leave.bean.*" import="fcy.leave.Dao.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>请假信息列表</title>
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
				<strong class="icon-reorder"> 请假列表</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left:10px;">
					<li><a class="button border-main icon-plus-square-o"
						href="leave_add.jsp"> 添写请假单</a></li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th>学生姓名</th>
					<th>学号</th>
					<th>请假事由</th>
					<th>请假天数</th>
					<th>请假时间</th>
					<th>审核状态</th>
					<th>审核时间</th>
				</tr>

				<%--读取信息记录 --%>
				
				<tr>
				 <% HttpSession Session = request.getSession();
		         String name = (String)Session.getAttribute("name");
		         %>
					<% ArrayList<leaveListBean> list= leaveListDao.findLeaveList(name); %>
					<% for(int i = 0;i<list.size();i++) {
						out.println("<tr>");
						out.println("<td>"+list.get(i).getName()+"</td>");
						out.println("<td>"+list.get(i).getUsername()+"</td>");
						out.println("<td>"+list.get(i).getBecause()+"</td>");
						out.println("<td>"+list.get(i).getDay()+"</td>");
						out.println("<td>"+list.get(i).getShenqingData()+"</td>");
						out.println("<td>"+list.get(i).getState()+"</td>");
						out.println("<td>"+list.get(i).getShenheData()+"</td>");
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