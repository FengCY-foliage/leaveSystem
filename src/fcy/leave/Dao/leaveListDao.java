package fcy.leave.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fcy.leave.Utils.JDBCUtils;
import fcy.leave.bean.leaveListBean;
import fcy.leave.bean.loginBean;

public class leaveListDao {
	public static ArrayList<leaveListBean> findLeaveList(String name) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<leaveListBean> list = new ArrayList<leaveListBean>();
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "select * from leave_list where name='"+name+"'";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				leaveListBean leaveListBean = new leaveListBean();
				leaveListBean.setId(rs.getInt("id"));
				leaveListBean.setName(rs.getString("name"));
				leaveListBean.setUsername(rs.getString("username"));
				leaveListBean.setBecause(rs.getString("because"));
				leaveListBean.setDay(rs.getString("day"));
				leaveListBean.setState(rs.getString("state"));
				leaveListBean.setShenqingData(rs.getString("shenqingData"));
				leaveListBean.setShenheData(rs.getString("shenhedata"));
				list.add(leaveListBean);
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
	public static ArrayList<leaveListBean> findLeaveListAll() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<leaveListBean> list = new ArrayList<leaveListBean>();
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "select * from leave_list";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				leaveListBean leaveListBean = new leaveListBean();
				leaveListBean.setId(rs.getInt("id"));
				leaveListBean.setName(rs.getString("name"));
				leaveListBean.setUsername(rs.getString("username"));
				leaveListBean.setBecause(rs.getString("because"));
				leaveListBean.setDay(rs.getString("day"));
				leaveListBean.setState(rs.getString("state"));
				leaveListBean.setShenqingData(rs.getString("shenqingData"));
				leaveListBean.setShenheData(rs.getString("shenhedata"));
				list.add(leaveListBean);
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
	public static ArrayList<leaveListBean> findLeaveListShenhe() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<leaveListBean> list = new ArrayList<leaveListBean>();
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "select * from leave_list where state='…Û∫À÷–'";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				leaveListBean leaveListBean = new leaveListBean();
				leaveListBean.setId(rs.getInt("id"));
				leaveListBean.setName(rs.getString("name"));
				leaveListBean.setUsername(rs.getString("username"));
				leaveListBean.setBecause(rs.getString("because"));
				leaveListBean.setDay(rs.getString("day"));
				leaveListBean.setState(rs.getString("state"));
				leaveListBean.setShenqingData(rs.getString("shenqingData"));
				leaveListBean.setShenheData(rs.getString("shenhedata"));
				list.add(leaveListBean);
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
