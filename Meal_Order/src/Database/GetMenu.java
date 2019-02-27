package Database;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class GetMenu {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	private String sql = null;
	private ResultSet rs = null;
	
	//private String[][] menu = null;
	private ArrayList<String> menu = null;
	
	public GetMenu() {
		
		//순번, 음식명, 가격, 조리가능수량 가져오기
		//종류 1 한식
		//   2 중식
		//   3 일식
		//   4 양식
		//오늘의 메뉴 1인 것 (조건)
		try {
			conn = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<String> GetMenu_arr_forbutton(int cuisineNo) {
		menu = new ArrayList<String>();
		int i = 0;
		sql = "SELECT * FROM meal WHERE cuisineNo = "+cuisineNo;
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		try {
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String mealNo = rs.getString("mealNo");
				String mealName = rs.getString("mealName");
				String price = rs.getString("price");
				String maxcount = rs.getString("maxCount");
				int today = rs.getInt("todayMeal");
			
				int maxcount_int = Integer.valueOf(maxcount);
				
				if(today == 1 && maxcount_int>1) {
		/*		System.out.println(mealNo);
				System.out.println(mealName);
				System.out.println(price);
				System.out.println(maxcount);
				*/
					menu.add(mealNo);
					menu.add(mealName);
					menu.add(price);
					menu.add(maxcount);
				}
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
		return menu;
	}
	
	public ArrayList<String> GetMenu_arr_formanager(int cuisineNo) {
		menu = new ArrayList<String>();
		int i = 0;
		sql = "SELECT mealName, price, maxCount,todayMeal FROM meal WHERE cuisineNo = "+cuisineNo;
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		try {
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String mealName = rs.getString("mealName");
				String price = rs.getString("price");
				String maxcount = rs.getString("maxCount");
				String today = rs.getString("todayMeal");
				
				menu.add(mealName);
				menu.add(price);
				menu.add(maxcount);
				menu.add(today);
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
		return menu;
	}
	/*public static void main(String[] args) {
		
		ArrayList<String> arr=new GetMenu().GetMenu_arr(3);
		int i = 0;
		int rowsnum = 0;
		while(i<arr.size()) {
			System.out.println(arr.get(i)+" "+arr.get(i+1)+" "+arr.get(i+2)+" "
					+ arr.get(i+3));
			i+=4;
		}
		
		if(((arr.size()/4)%5)==0) {
			rowsnum=((arr.size()/4)/5);	
		}else {
			rowsnum = (((arr.size()/4)/5)+1);
		}
		System.out.println("arrsize : "+arr.size()/4);
		System.out.println("버튼 줄 수 :"+rowsnum);
	}*/
}
