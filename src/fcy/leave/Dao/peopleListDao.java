package fcy.leave.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fcy.leave.Utils.JDBCUtils;
import fcy.leave.bean.leaveListBean;
import fcy.leave.bean.loginBean;

public class peopleListDao {
	public static ArrayList<loginBean> findStudent() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<loginBean> list = new ArrayList<loginBean>();
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "select * from student";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				loginBean loginBean = new loginBean();
				loginBean.setName(rs.getString("name"));
				loginBean.setUsername(rs.getString("username"));
				loginBean.setPassword(rs.getString("password"));
				loginBean.setUser(rs.getString("user"));
				list.add(loginBean);
			}
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(rs,stmt,conn);
		}
		return null;
	}
	public static ArrayList<loginBean> findTeacher() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<loginBean> list = new ArrayList<loginBean>();
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "select * from teacher";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				loginBean loginBean = new loginBean();
				loginBean.setName(rs.getString("name"));
				loginBean.setUsername(rs.getString("username"));
				loginBean.setPassword(rs.getString("password"));
				loginBean.setUser(rs.getString("user"));
				list.add(loginBean);
			}
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(rs,stmt,conn);
		}
		return null;
	}
	public static ArrayList<loginBean> findAdmin() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<loginBean> list = new ArrayList<loginBean>();
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "select * from admin";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				loginBean loginBean = new loginBean();
				loginBean.setName(rs.getString("name"));
				loginBean.setUsername(rs.getString("username"));
				loginBean.setPassword(rs.getString("password"));
				loginBean.setUser(rs.getString("user"));
				list.add(loginBean);
			}
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(rs,stmt,conn);
		}
		return null;
	}
}
