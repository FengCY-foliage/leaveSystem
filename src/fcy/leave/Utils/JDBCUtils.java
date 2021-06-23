package fcy.leave.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
	public static Connection getConn()throws Exception{
	    Connection conn=null;
	   try{
	         String db_url="jdbc:mysql://localhost:3306/leave?characterEncoding=utf8&useSSL=false&allowPublicKeyRetrieval=true";
			   String db_user="root";
			   String db_pwd="root";
			   Class.forName("com.mysql.jdbc.Driver");
			  //2.2:DriverManager获得Connection 类型的连接对象conn
			    conn=DriverManager.getConnection(db_url, db_user, db_pwd);
			    return conn;
	    }catch(Exception e){
	      throw e;
	    }
	   
	   }

	  public static void close (Statement stmt,Connection conn) {
		  if(stmt !=null) {
			  try {
				  stmt.close();
			  }catch(SQLException e){
				  e.printStackTrace();
			  }
		  }
		  if(conn !=null) {
			  try {
				  conn.close();
			  }catch(SQLException e){
				  e.printStackTrace();
			  }
		  }
	  }
	  public static void close(ResultSet rs,Statement stmt,Connection conn) {
		  if(rs!=null) {
			  try{
				rs.close();  
			  }catch(SQLException e) {
				  e.printStackTrace();
			  }
			  rs=null;
		  }
		  close(stmt,conn);
	  }
}
