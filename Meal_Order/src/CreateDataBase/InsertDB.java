package CreateDataBase;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class InsertDB {
	
	private static BufferedReader bin;
	private static StringTokenizer st = null;
	private static String read_bin = null;
	
	
	public InsertDB() {
		// TODO Auto-generated constructor stub
	}
	public static BufferedReader encoding(String path) {
		
		try {
			bin = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF8"));
			//경로의 파일을 불러와서 utf8 캐릭터셋으로 인코딩 후에  버퍼링을 이용한 읽기
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bin;
	}
	
	public static void insert(PreparedStatement pstmt) {
		
		 try {
			while ((read_bin = bin.readLine()) != null) {
				 
			     //System.out.println(read_bin);

			     st = new StringTokenizer(read_bin, "\t");
			     String str[] = new String[st.countTokens()];

			     for (int i = 0; st.hasMoreTokens(); i++) { 
			         str[i] = st.nextToken();
			         //System.out.println(str[i]);
			     }

			     if (str[0].equals("순번") || str[1].equals("종류") || str[0].equals("사번")) continue;
			     
			     for(int i = 1;i<str.length;i++) {
			    	 
			    	 //System.out.println("str["+i+"]"+"="+str[i]);
			    	  pstmt.setString(i, str[i]);
			     }
			     
			     pstmt.executeUpdate();
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
