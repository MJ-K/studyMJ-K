package InputOutput;

import java.util.Scanner;

public class BOJ_10950 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int T = sc.nextInt();
		int a, b;
		
		while(T>0) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
			T--;
		}
	}
}
