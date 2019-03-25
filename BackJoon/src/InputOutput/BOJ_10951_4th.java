package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10951_4th {
	public static void main (String[] arg) throws IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input; 
		while((input = br.readLine()) != null)
		{
			System.out.println(input.charAt(0) + input.charAt(2) - 0x60);   
		}		
	}
}