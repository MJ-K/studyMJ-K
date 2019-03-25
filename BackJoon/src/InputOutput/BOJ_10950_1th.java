package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10950_1th {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] str;
		
		for(int i =0;i<n;i++) {
			str = br.readLine().split(" ");
			sb.append(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
