package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DB연결객체를 리턴하는 클래스
public class MakeConnection {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/meal?characterEncoding=UTF-8&serverTimezone=UTC";
	private static final String user = "user";
	private static final String password = "1234";
	
	private static Connection conn = null;
	
	private static MakeConnection mc;

	private MakeConnection() {};
	
	public static MakeConnection getInstance() {
		if(mc==null)mc = new MakeConnection();
		return mc;
	}
	
	public static Connection getConnection() throws SQLException {
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
