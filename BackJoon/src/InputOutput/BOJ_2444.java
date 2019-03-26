package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2444 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<(n*2)-1;i++) {
			if(i<n) {
				for(int j=0;j<n+i;j++) {
					if(j<n-1-i) sb.append(" ");
					else sb.append("*");
				}
			}else {
				for(int j=0;j<(n*2)-1-(i-n+1);j++) {
					if(j<(i-n)+1) sb.append(" ");
					else sb.append("*");
				}
			}
			
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
