package Database;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;


//sql문을 preparesatatment에 담아서 그걸 리턴해주는 클래스
public class UsePreparedStatement {

	private static PreparedStatement st = null;
	
	public UsePreparedStatement() {	}
	
	public static PreparedStatement getprestat(Connection conn,String sql) {
		try {
			st = conn.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println("오류 : "+e);
		}
		return st;
	}
}
