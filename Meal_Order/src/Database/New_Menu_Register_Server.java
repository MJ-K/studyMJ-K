package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class New_Menu_Register_Server {
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	private String sql;
	
	public New_Menu_Register_Server() {
	
		try {
			conn = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Register(String cuisineNo, String mealName, String price, String maxcount) {
		
		sql = "INSERT INTO meal VALUES(NULL,?,?,?,?,0)";
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		
		try {
			
			pstmt.setString(1, cuisineNo);
			pstmt.setString(2, mealName);
			pstmt.setString(3, price);
			pstmt.setString(4, maxcount);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			if (pstmt != null) try { pstmt.close(); System.out.println("종료2");} catch(SQLException ex) {}
			if (conn != null) try { conn.close();System.out.println("종료3"); } catch(SQLException ex) {}
		}
	}
	
	public static void main(String[] args) {
		//new New_Menu_Register_Server();
	}
}
