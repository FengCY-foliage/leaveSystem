package fcy.leave.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fcy.leave.Dao.loginDao;
import fcy.leave.Dao.shenheLeaveDao;
import fcy.leave.bean.loginBean;

/**
 * Servlet implementation class shenheServlet
 */
public class shenheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html;charset=UTF-8");
		String state = req.getQueryString();
		String[] arr = state.split("&&");
		boolean is= shenheLeaveDao.shenhe(arr[1], arr[0]);
		if(is) {
			res.getWriter().println("操作成功");
			res.getWriter().println("3秒后自动返回...");
			res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/leave_shenhe_teacher.jsp");

		}else {
			res.getWriter().println("操作失败");
			res.getWriter().println("3秒后自动返回...");
			res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/leave_shenhe_teacher.jsp");
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
