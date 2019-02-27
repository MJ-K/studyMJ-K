package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Change_Menu {
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	public Change_Menu() {
		try {
			conn = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//public 
	
	public static void main(String[] args) {
		
	}
}
