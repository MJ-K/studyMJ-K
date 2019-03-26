package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10992_6th {
	public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
		for(int i=0 ; i<n-1 ; i++, sb.append("*\n")) {
			for(int j=0 ; j<n-1-i ; j++, sb.append(' '));
			if(i > 0)	sb.append('*');
			for(int j=0 ; j<2*i-1 ; j++, sb.append(' '));
		}
		for(int i=1 ; i<2*n ; i++, sb.append('*'));
    	System.out.print(sb);
    }
}
