package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2739 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i =1;i<10;i++) {
			sb.append(N).append(" * ").append(i).append(" = ").append(i*N);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
