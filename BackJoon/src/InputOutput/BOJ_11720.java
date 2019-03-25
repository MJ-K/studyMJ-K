package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11720 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int sum = 0;
		String input= br.readLine();
		
		for(int i=0;i<T;i++) {
			sum +=Integer.valueOf(input.charAt(i))-48;
		}
		System.out.println(sum);
	}
}
