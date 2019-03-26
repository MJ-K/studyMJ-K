package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2438 {
	public static void main(String[] args) throws Exception{
		//±âº» º° Âï±â
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i =0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}