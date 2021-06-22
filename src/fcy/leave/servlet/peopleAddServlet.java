package fcy.leave.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fcy.leave.Dao.peopleUpdateDao;
/**
 * Servlet implementation class peopleAddServlet
 */
public class peopleAddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		String user = req.getQueryString();
		String name = new String(req.getParameter("name").getBytes("ISO-8859-1"),"UTF-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		boolean is = false;
		if(user.equals("1")) {
			is= peopleUpdateDao.insertStudent(name, username, password);
		}else if(user.equals("2")) {
			is= peopleUpdateDao.insertTeacher(name, username, password);
		}else if(user.equals("3")){
			is= peopleUpdateDao.insertAdmin(name, username, password);
		}
		if(is) {
			if(user.equals("1")) {
				res.getWriter().println("操作成功");
				res.getWriter().println("3秒后自动返回...");
				res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/student_list.jsp");
			}else if(user.equals("2")) {
				res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/teacher_list.jsp");
			}else if(user.equals("3")){
				res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/admin_list.jsp");
			}
		}else {
			if(user.equals("1")) {
				res.getWriter().println("操作失败");
				res.getWriter().println("3秒后自动返回...");
				res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/student_list.jsp");
			}else if(user.equals("2")) {
				res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/teacher_list.jsp");
			}else if(user.equals("3")){
				res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/admin_list.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
