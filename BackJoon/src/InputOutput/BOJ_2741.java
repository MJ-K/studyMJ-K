package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2741 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i =1;i<=input;i++) {
			sb.append(i).append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
