package fcy.leave.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fcy.leave.Dao.loginDao;
import fcy.leave.bean.loginBean;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		String username = req.getParameter("userid");
		String password = req.getParameter("password");
		String type = req.getParameter("users");
		boolean is=true;
		try {
			ArrayList<loginBean> list= loginDao.find(username, password, type);
			if(list.size()==0) {is=false;};
			if(is) {
				HttpSession session = req.getSession();
				session.setAttribute("name", list.get(0).getName());
				session.setAttribute("username", list.get(0).getUsername());
				session.setAttribute("password", list.get(0).getPassword());
				if(type.equals("student")) {
					res.sendRedirect("/leaveSystem/student_login.jsp");
				}else if(type.equals("teacher")) {
					res.sendRedirect("/leaveSystem/teacher_login.jsp");
				}else {
					res.sendRedirect("/leaveSystem/admin_login.jsp");
				}
				res.getWriter().println("登录成功");
			}else{
				res.getWriter().println("<script>alert('用户名或密码错误');</script>");
				res.setHeader("refresh", "0;url=http://localhost:8080/leaveSystem/login.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
