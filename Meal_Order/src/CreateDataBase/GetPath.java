package CreateDataBase;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class GetPath {
	
	private static String path = null;
	private static String encode = null;
	private static final String defa_dir = "2/DataFiles/";
	
	public GetPath() {
		 path = getClass().getResource("").getPath();
		 try {
		 encode = URLDecoder.decode(path, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		System.out.println(encode);
	}
	
	public String nowPath(String filename) {
		
		String res_filepath = encode + defa_dir +filename;
		//System.out.println(res_filepath);
		return res_filepath;
	}
	
/*	public static void main(String[] args) {
		new GetPath();
	}*/
}
