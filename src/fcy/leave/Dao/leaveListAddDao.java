package fcy.leave.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import fcy.leave.Utils.JDBCUtils;

public class leaveListAddDao {
	public static boolean insertLeave(String name,String username,String because,String day,String state,String shenqingData ) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "insert into leave_list (name,username,because,day,state,shenqingData,shenheData)values ('"+name+"','"+username+"','"+because+"','"+day+"','"+state+"','"+shenqingData+"','нч')";
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
