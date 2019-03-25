package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11022 {
	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input;
		
		for(int i =0;i<T;i++) {
			input = br.readLine();
			
			System.out.println("Case #"+(i+1)+": "+(Integer.valueOf(input.charAt(0))-48)
					+" + "+(Integer.valueOf(input.charAt(2))-48)+" = "+(Integer.valueOf(input.charAt(0))-48+Integer.valueOf(input.charAt(2))-48));
		}
	}
}
