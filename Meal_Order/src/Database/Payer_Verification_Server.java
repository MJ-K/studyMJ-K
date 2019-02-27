package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Payer_Verification_Server {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private ArrayList<Integer> memberno;
	
	private String sql;
	
	public Payer_Verification_Server() {
		
		try {
			conn = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<Integer> GetMemberNo() {
		sql = "SELECT memberNo from member";
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		memberno = new ArrayList<Integer>();
		int i=0;
		try {
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt(1);
				System.out.println(num);
				memberno.add(num);
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
		
		return memberno;
	}
	
	public boolean check_passwd(String memberNo,String passwd) {
		
		boolean result = false;
		
		sql = "SELECT passwd FROM member WHERE memberNo ="+memberNo;
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		
		try {
			rs = pstmt.executeQuery();
			while(rs.next()) {
				if(rs.getString(1).equals(passwd)) {
					result = true;
				}
				else result = false;
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
		
		return result;
	}
	
	public void correct_passwd(int cuisineNo, String[] mealNo, String memberNo, int[] menuCount, String[] menuPrice, String current) {
		//결제 목록에 메뉴 등록 "순번(null)  종류번호(cuisineNo)  음식번호(mealNo)	
		//				     사번(memberNo)  총주문(menucount)    금액(menuprice)	주문일자(current)" 순으로 orderlist 에 insert
		
		for(int i=0;i<mealNo.length;i++) {		
			System.out.println(cuisineNo+" "+mealNo[i]+" "+memberNo+" "+menuCount[i]+" "+menuPrice[i]+" "+current);
		}
		
		sql = "INSERT INTO orderlist VALUES(null,?,?,?,?,?,?)";
		pstmt = UsePreparedStatement.getprestat(conn, sql);
		
		try {
			
			for(int i=0;i<mealNo.length;i++) {		
				
				pstmt.setString(1, Integer.toString(cuisineNo));
				pstmt.setString(2, mealNo[i]);
				pstmt.setString(3, memberNo);
				pstmt.setString(4, Integer.toString(menuCount[i]));
				pstmt.setString(5, menuPrice[i]);
				pstmt.setString(6, current);
				
				pstmt.executeUpdate();
			}
			
			// 해당 메뉴 조리 수량에서 menucount 만큼 빼기
			
			int[] current_count = new int[mealNo.length]; 
			
			for(int i =0;i<mealNo.length;i++) {
				
				sql = "SELECT maxCount FROM meal WHERE mealNo = "+mealNo[i];
				pstmt = UsePreparedStatement.getprestat(conn, sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					int maxcount = rs.getInt(1);
					
					current_count[i] = maxcount; 
				}
			}
			
			for(int i =0;i<mealNo.length;i++) {
				
				current_count[i]-= menuCount[i];
				sql = "UPDATE meal SET maxCount = "+current_count[i]+" WHERE mealNo = "+mealNo[i];
				
				pstmt = UsePreparedStatement.getprestat(conn,sql);
				pstmt.executeUpdate();
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
	
	public static void main(String[] args) {
		new Payer_Verification_Server().GetMemberNo();
	}
}
