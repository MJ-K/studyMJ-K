package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BOJ_10951 {
	public static void main(String[] args) throws IOException{
		//testcase의 갯수가 존재하지 않는다.
		//EOF까지 받는다.
		
		//정석
		/*Scanner sc = new Scanner(System.in);
		int a , b;
		
		
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b =sc.nextInt();
			System.out.println(a+b);
		}
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		while((input =br.readLine())!=null) {

			System.out.println(Integer.valueOf(input.charAt(0))-48+Integer.valueOf(input.charAt(2))-48);
		}
	}
}
