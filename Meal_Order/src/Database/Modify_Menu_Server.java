package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Modify_Menu_Server {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String sql = null;
	
	public Modify_Menu_Server(/*Connection conn, PreparedStatement pstmt*/) {		
		try {
			conn = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*this.conn = conn;
		this.pstmt = pstmt;*/
	}
	
	public void modify(String check_menuName, String change_cuisinetype, String change_mealName, String change_mealPrice, String change_maxcount) {
		
		//기존 이름 검색 후 mealNO 얻기
		String mealNo = null;
		sql = "SELECT mealNo FROM meal WHERE mealName = \""+check_menuName+"\"";
		
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		try {
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				mealNo = rs.getString(1); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//mealNo를 바탕으로 update 
		
		sql = "UPDATE meal SET cuisineNo="+change_cuisinetype+",mealName= \""+change_mealName+"\",price="+change_mealPrice
				+",maxCount="+change_maxcount+" WHERE mealNo="+mealNo;
		
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		try {
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (rs != null) try { rs.close();System.out.println("종료1"); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); System.out.println("종료2");} catch(SQLException ex) {}
			if (conn != null) try { conn.close();System.out.println("종료3"); } catch(SQLException ex) {}
		}
		
	}
	
	public void delete (String[] mealName) {
		int i = 0;
		while(i<mealName.length) {
			sql = "DELETE FROM meal WHERE mealName = \""+mealName[i]+"\"";
			pstmt= UsePreparedStatement.getprestat(conn, sql);
			
			try {
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}

		if (rs != null) try { rs.close();System.out.println("종료1"); } catch(SQLException ex) {}
		if (pstmt != null) try { pstmt.close(); System.out.println("종료2");} catch(SQLException ex) {}
		if (conn != null) try { conn.close();System.out.println("종료3"); } catch(SQLException ex) {}
		
	}
	
	public void todaymenu(String[] mealName) {
		int i = 0;
		try {
			while(i<mealName.length) {
				sql = "UPDATE meal SET todayMeal = 1 WHERE mealName = \""+mealName[i]+"\"";
				pstmt= UsePreparedStatement.getprestat(conn, sql);
				System.out.println(mealName[i]);
				pstmt.executeUpdate();
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (rs != null) try { rs.close();System.out.println("종료1"); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); System.out.println("종료2");} catch(SQLException ex) {}
			if (conn != null) try { conn.close();System.out.println("종료3"); } catch(SQLException ex) {}
		}
		
	}
	
}
