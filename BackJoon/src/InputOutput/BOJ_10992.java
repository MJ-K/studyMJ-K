package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10992 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
		
    	for(int i =0;i<n;i++) {
    		for(int j=0;j<(n-1)-i;j++) sb.append(" ");
    		if(i==n-1) {
    			for(int j=0;j<2*n-1;j++) {
	    			sb.append("*");
	    		}
    		}
    		else {
	    		for(int j=0;j<i+1;j++) {
	    			if(j==i) sb.append("*");
	    			else if(j==0) sb.append("*").append(" ");
	    			else sb.append(" ").append(" ");
	    		}
    		}
    		sb.append("\n");
    	}
    	System.out.println(sb);
	}
	
}
