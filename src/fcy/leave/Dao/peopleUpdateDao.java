package fcy.leave.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import fcy.leave.Utils.JDBCUtils;

public class peopleUpdateDao {
	public static boolean insertStudent(String name,String username,String password) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "insert into student (name,username,password,user)values ('"+name+"','"+username+"','"+password+"','1');";
			System.out.println(sql);
			int num = stmt.executeUpdate(sql);
			if(num>0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(rs,stmt,conn);
		}
		
		return false;
	} 
	public static boolean insertTeacher(String name,String username,String password) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "insert into teacher (name,username,password,user)values ('"+name+"','"+username+"','"+password+"','2');";
			int num = stmt.executeUpdate(sql);
			if(num>0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(rs,stmt,conn);
		}
		
		return false;
	} 
	public static boolean insertAdmin(String name,String username,String password) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "insert into admin (name,username,password,user)values ('"+name+"','"+username+"','"+password+"','3');";
			int num = stmt.executeUpdate(sql);
			if(num>0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(rs,stmt,conn);
		}
		
		return false;
	} 
}
