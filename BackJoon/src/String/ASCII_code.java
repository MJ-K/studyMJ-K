package String;

import java.util.Scanner;

public class ASCII_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char user = sc.next().charAt(0);
		
		System.out.println(Integer.valueOf(user));
	}
	
}
