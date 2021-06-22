package fcy.leave.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import fcy.leave.Utils.JDBCUtils;

public class shenheLeaveDao {
	public static boolean shenhe(String id,String state) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String states=null;
			if(state.equals(1)) {
				states="已同意";
			}else{
				states="已拒绝";
			}
			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
			String date = new Date(System.currentTimeMillis()).toString();
			String sql = "update leave_list set state='"+states+"',shenheData='"+date+"' where id="+id+";";
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
