package fcy.leave.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fcy.leave.Utils.JDBCUtils;
import fcy.leave.bean.loginBean;
public class loginDao {
	public static ArrayList<loginBean> find(String username,String password,String user) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<loginBean> list = new ArrayList<loginBean>();
		try {
			conn=JDBCUtils.getConn();
			stmt = conn.createStatement();
			String sql = "select * from "+user+" where username='"+username+"' and password='"+password+"'";
//			System.out.println(sql);
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
