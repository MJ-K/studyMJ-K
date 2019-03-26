package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2445 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<n*2;j++) {
				if(j>i&&j<(n*2-1-i)) sb.append(" ");
				else sb.append("*");
			}
			sb.append("\n");
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n*2;j++) {
				if(j>(n-2-i)&&j<(n*2-(n-i-1))) sb.append(" ");
				else sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
