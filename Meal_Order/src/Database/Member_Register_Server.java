package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;



public class Member_Register_Server {
	
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	
	private final String select = "SELECT MAX(memberNo) FROM member";
	private final String insert = "INSERT INTO member VALUES (NULL,?,?)";
	private String select2 = "SELECT * FROM ";
	
	public Member_Register_Server(Connection conn, PreparedStatement pstmt) {		
		try {
			conn = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.conn = conn;
		this.pstmt = pstmt;
	}


	public Integer get_MemeberNo() {
	
		//사원번호 +1
		int new_memberNo = 0;
		
		pstmt = UsePreparedStatement.getprestat(conn, select);
		try {
			rs = pstmt.executeQuery();
			if(rs.next()) {
				new_memberNo = rs.getInt(1)+1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new_memberNo;
	}
	
	public void Register_DB(String name, char[] passwd) {
		
		//insert DB
		String password = String.valueOf(passwd);
		
		
		pstmt = UsePreparedStatement.getprestat(conn, insert);
		try {
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
			
			pstmt = UsePreparedStatement.getprestat(conn, select2+"member");
			CreateDataBase.SelectDB.member(pstmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (pstmt != null) try { pstmt.close(); if(pstmt.isClosed()) {System.out.println("yes1");}} catch(SQLException ex) {}
			if (conn != null) try { conn.close();if(conn.isClosed()) {System.out.println("yes2");} } catch(SQLException ex) {}
		}
		
	}
	
	/*public static void main(String[] args) {
		new Member_Register_server().Register_DB("김민정", "1234");
		
		
	}*/
}
