package fcy.leave.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fcy.leave.Dao.leaveListAddDao;

/**
 * Servlet implementation class leaveListAddServlet
 */
public class leaveListAddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		String because = new String(req.getParameter("because").getBytes("ISO-8859-1"),"UTF-8");
		String day = req.getParameter("day");
		String shenqingData = (String)req.getParameter("shenqingData");
		HttpSession session = req.getSession();
		String name=(String) session.getAttribute("name");
		String username=(String) session.getAttribute("username");
		boolean is = leaveListAddDao.insertLeave(name, username, because, day, "审核中", shenqingData);
		if(is) {
			res.getWriter().println("申请成功");
			res.getWriter().println("3秒后自动返回...");
			res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/leave_list_student.jsp");

		}else {
			res.getWriter().println("假条申请失败");
			res.getWriter().println("3秒后自动返回...");
			res.setHeader("refresh", "3;url=http://localhost:8080/leaveSystem/leave_list_student.jsp");
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
