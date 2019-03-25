package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10952 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		
		while(true) {
			input = br.readLine();
			if((input.charAt(0)-48)==0&&(input.charAt(2)-48)==0) break;
			System.out.println((input.charAt(0)-48)+(input.charAt(2)-48));
		}
	}
}
