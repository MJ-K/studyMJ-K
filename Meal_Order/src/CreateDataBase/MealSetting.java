package CreateDataBase;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MealSetting {
	
	private static final String is = "SHOW DATABASES LIKE'MEAL'";
	private static final String drop = "DROP DATABASE MEAL";
	private static final String create_db= "CREATE DATABASE MEAL DEFAULT CHARACTER SET UTF8";
	private static final String use = "USE MEAL";
	
	private static String select = "SELECT * FROM ";
	
	private static final String ct_meal = "CREATE TABLE meal"
			+ "(mealNo int PRIMARY KEY NOT NULL AUTO_INCREMENT,"
			+ "cuisineNo int,"
			+ "mealName varchar(20),"
			+ "price int,"
			+ "maxCount int,"
			+ "todayMeal tinyint(1))DEFAULT CHARACTER SET UTF8";
	
	private static final String ct_cuisine = "CREATE TABLE cuisine"
			+ "(cuisineNo int PRIMARY KEY NOT NULL AUTO_INCREMENT,"
			+ "cuisineName varchar(10))DEFAULT CHARACTER SET UTF8";
	
	private static final String ct_member = "CREATE TABLE member"
			+ "(memberNo int PRIMARY KEY NOT NULL AUTO_INCREMENT,"
			+ "memberName varchar(20),"
			+ "passwd varchar(4))DEFAULT CHARACTER SET UTF8";
	
	private static final String ct_orderlist= "CREATE TABLE orderlist"
			+ "(orderNo int PRIMARY KEY NOT NULL AUTO_INCREMENT,"
			+ "cuisineNo int,"
			+ "mealNo int,"
			+ "memberNo int,"
			+ "orderCount int,"
			+ "amount int,"
			+ "orderDate datetime)DEFAULT CHARACTER SET UTF8";
	
	private static final String auto_increment = "ALTER TABLE member AUTO_INCREMENT = 10001";
	
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	
	private static String path = null;
	private static StringBuffer insert = null;
	
	private static BufferedReader bin = null;
	private static FileReader freader = null;

	public static void main(String[] args) throws SQLException {
	
		conn = MakeConnection.getConnection();
		
		pstmt = UsePreparedStatement.getprestat(conn, is);
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			pstmt = UsePreparedStatement.getprestat(conn, drop);//drop old database
			pstmt.executeUpdate();
		}		
		pstmt = UsePreparedStatement.getprestat(conn, create_db);//create new database 'meal'
		pstmt.executeUpdate();
		
		
		pstmt = UsePreparedStatement.getprestat(conn,use);
		pstmt.executeUpdate();
		
		pstmt = UsePreparedStatement.getprestat(conn, ct_meal);
		pstmt.executeUpdate();
		
		pstmt = UsePreparedStatement.getprestat(conn, ct_cuisine);
		pstmt.executeUpdate();
		
		pstmt = UsePreparedStatement.getprestat(conn, ct_member);
		pstmt.executeUpdate();
		
		pstmt = UsePreparedStatement.getprestat(conn, ct_orderlist);
		pstmt.executeUpdate();
		
		
		///////cuisine.txt
		path = new GetPath().nowPath("cuisine.txt");
		bin = InsertDB.encoding(path);

		insert = new StringBuffer();
		insert.append("INSERT INTO cuisine ");
		insert.append("VALUES(NULL,?) ");
		
		pstmt = UsePreparedStatement.getprestat(conn, insert.toString());
		InsertDB.insert(pstmt);

		
		///////////////////////meal.txt
		
		path = new GetPath().nowPath("meal.txt");
		bin = InsertDB.encoding(path);

		insert = new StringBuffer();
		insert.append("INSERT INTO meal ");
		insert.append("VALUES(NULL,?,?,?,?,?) ");
		
		pstmt = UsePreparedStatement.getprestat(conn, insert.toString());
		InsertDB.insert(pstmt);
		
		///////////////////////member.txt
		
		pstmt = UsePreparedStatement.getprestat(conn, auto_increment);
		pstmt.executeUpdate();
		
		path = new GetPath().nowPath("member.txt");
		bin = InsertDB.encoding(path);

		insert = new StringBuffer();
		insert.append("INSERT INTO member ");
		insert.append("VALUES(NULL,?,?) ");
		
		pstmt = UsePreparedStatement.getprestat(conn, insert.toString());
		InsertDB.insert(pstmt);
		
		
		///////////////////////orderlist.txt
		
		path = new GetPath().nowPath("orderlist.txt");
		bin = InsertDB.encoding(path);

		insert = new StringBuffer();
		insert.append("INSERT INTO orderlist ");
		insert.append("VALUES(NULL,?,?,?,?,?,?) ");
		
		pstmt = UsePreparedStatement.getprestat(conn, insert.toString());
		InsertDB.insert(pstmt);
		
		
		////////////////select ///////////////
		
		/*pstmt = UsePreparedStatement.getprestat(conn, select+"meal");
		SelectDB.meal(pstmt);
		
		pstmt = UsePreparedStatement.getprestat(conn, select+"cuisine");
		SelectDB.cuisine(pstmt);
		
		pstmt = UsePreparedStatement.getprestat(conn, select+"member");
		SelectDB.member(pstmt);
		
		pstmt = UsePreparedStatement.getprestat(conn, select+"orderlist");
		SelectDB.orderlist(pstmt);*/
		
		
		/////////////////////// DATABASE & TABLE END
		
		
		////////////////////////create user
		
		String is_user = "SELECT User FROM mysql.user WHERE user = 'user'";
		String flush = "FLUSH PRIVILEGES";

		pstmt = UsePreparedStatement.getprestat(conn, is_user);
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.println("유저 삭제 완료");
			String drop_user= "DROP USER user@localhost";
			pstmt = UsePreparedStatement.getprestat(conn, drop_user);
			pstmt.executeUpdate();
			
			pstmt = UsePreparedStatement.getprestat(conn, flush);
			pstmt.executeUpdate();
			
		}
	
			String create_user = "CREATE USER 'user'@'localhost' IDENTIFIED BY '1234' PASSWORD EXPIRE NEVER";
			
			pstmt = UsePreparedStatement.getprestat(conn, create_user);
			pstmt.executeUpdate();
			
			String grant = "GRANT SELECT, INSERT, DELETE , UPDATE ON meal.* to user@localhost";
			
			pstmt = UsePreparedStatement.getprestat(conn, grant);
			pstmt.executeUpdate();
			
			pstmt = UsePreparedStatement.getprestat(conn, flush);
			pstmt.executeUpdate();
		
		System.out.println("권한 부여 완료");
		
	}
}
