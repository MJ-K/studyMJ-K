package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GetCuisineCount {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String sql = null;
	
	public GetCuisineCount() {
		try {
			conn = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int[] countCuisine() {
		int[] cuisineCount = new int[8];
		sql = "SELECT cuisineNo, COUNT(cuisineNo) FROM "
				+ "orderlist GROUP BY cuisineNo";
		int i =0;
		
		
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		try {
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				
				cuisineCount[i] = rs.getInt(1);
				cuisineCount[i+1] = rs.getInt(2);
				
				//System.out.println(cuisineCount[i] + " " + cuisineCount[i+1]);
				
				i+=2;
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
		
		return cuisineCount;
	}
	
/*	public static void main(String[] args) {
		new GetCuisineCount().countCuisine()
	}*/
}
