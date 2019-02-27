package CreateDataBase;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDB {

	private static ResultSet rs = null;
	
	public SelectDB() {}
	
	public static void cuisine(PreparedStatement pstmt) {
		
		try {
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int d1 = rs.getInt(1);
				String d2= rs.getString(2);
			
				System.out.print("순번 : "+d1+"\t");
				System.out.print("종류  : "+d2+"\t");
				
				System.out.println("");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public static void meal(PreparedStatement pstmt) {
		try {
					
			//5.실행
			//DBMS가 실행 후 결과값을 리턴해주는 객체 : ResultSet
			rs = pstmt.executeQuery();				
			
			//6.레코드별로 로직 처리
			
			while(rs.next()) {
				int d1 = rs.getInt(1);
				int d2 = rs.getInt(2);
				String d3 = rs.getString(3);
				int d4 = rs.getInt(4);
				int d5 = rs.getInt(5);
				short d6 = rs.getShort(6);
			
				System.out.print("순번 : "+d1+"\t");
				System.out.print("종류  : "+d2+"\t");
				System.out.print("음식명 : "+d3+"\t");
				System.out.print("가격  : "+d4+"\t");
				System.out.print("조리가능수량  : "+d5+"\t");
				System.out.print("오늘의메뉴  : "+d6+"\t");
				
				System.out.println("");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void member(PreparedStatement pstmt) {
		try {
					
			//5.실행
			//DBMS가 실행 후 결과값을 리턴해주는 객체 : ResultSet
			rs = pstmt.executeQuery();				
			
			//6.레코드별로 로직 처리
			
			while(rs.next()) {
				int d1 = rs.getInt(1);
				String d2 = rs.getString(2);
				String d3 = rs.getString(3);
			
				System.out.print("사번 : "+d1+"\t");
				System.out.print("사원명  : "+d2+"\t");
				System.out.print("패스워드 : "+d3+"\t");
				
				System.out.println("");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void orderlist(PreparedStatement pstmt) {
		try {
					
			//5.실행
			//DBMS가 실행 후 결과값을 리턴해주는 객체 : ResultSet
			rs = pstmt.executeQuery();				
			
			//6.레코드별로 로직 처리
			
			while(rs.next()) {
				int d1 = rs.getInt(1);
				int d2 = rs.getInt(2);
				int d3 = rs.getInt(3);
				int d4 = rs.getInt(4);
				int d5 = rs.getInt(5);
				int d6 = rs.getInt(6);
				Date d7 = rs.getDate(7);
				
				System.out.print("순번 : "+d1+"\t");
				System.out.print("종류  : "+d2+"\t");
				System.out.print("번호 : "+d3+"\t");
				System.out.print("음식번호 : "+d4+"\t");
				System.out.print("사번  : "+d5+"\t");
				System.out.print("총주문금액 : "+d6+"\t");
				System.out.print("주문일자 : "+d7+"\t");
				
				System.out.println("");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
