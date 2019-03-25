package InputOutput;

import java.util.Scanner;

public class BOJ_1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
			
		if(a<10&&a>0&&b<10&&b>0) {
			System.out.println(a+b);
		}
	}
}
