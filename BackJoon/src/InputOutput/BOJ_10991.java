package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10991 {
	public static void main(String[] args)throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
		
    	for(int i =0;i<n;i++) {
    		for(int j=0;j<(n-1)-i;j++) sb.append(" ");
    		for(int j=0;j<i+1;j++) {
    			if(j==i) sb.append("*");
    			else sb.append("*").append(" ");
    		}
    		sb.append("\n");
    	}
    	System.out.println(sb);
	}
}
