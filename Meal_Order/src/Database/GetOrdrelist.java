package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetOrdrelist {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String sql = null;
	
	public GetOrdrelist() {
		try {
			conn = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<String> getOrderlistData() {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		sql = "SELECT O.cuisineNo, M.mealName ,B.memberName, O.orderCount, O.amount, O.orderDate FROM orderlist O, meal M, member B "
				+ "WHERE O.mealNo = M.mealNo AND O.memberNo = B.memberNo;";
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		try {
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String cuisineNo = rs.getString(1);
				String mealName = rs.getString(2);
				String memberName = rs.getString(3);
				String orderCount = rs.getString(4);
				String amount = rs.getString(5);
				String orderDate = rs.getString(6);
				
				arr.add(cuisineNo);
				arr.add(mealName);
				arr.add(memberName);
				arr.add(orderCount);
				arr.add(amount);
				arr.add(orderDate);
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
		return arr;
	}
	
	
	public static void main(String[] args) {
		new GetOrdrelist();
	}
}
