package game;

import java.util.ArrayList;
import java.util.Scanner;

public class count_zero_even_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "Y";
		int usernum  = 0;
		int remain = 0;
		
		int zero = 0;
		int odd = 0;
		int even = 0;
		//ArrayList<Integer> arr = new ArrayList<Integer>();
		
		System.out.println( "15054007 김민정" );
		
		while(true) {
			
			
			
			System.out.println("양의 정수를 입력해주세요 :");
			usernum = sc.nextInt();
			
			if(usernum <0) continue;//양의 정수가 아니면 continue;
			
			while(true) {
				
				remain = usernum %10;
				usernum /= 10;
				
				if(remain==0) {
					zero++;
				}else if(remain%2==0) {
					even++;
				}else {
					odd++;
				}
				
				if(usernum == 0) break;
				
			}
			
			System.out.println("결과  ");
			System.out.println("제로 : "+zero+" 개");
			System.out.println("짝수 : "+even+" 개"); 
			System.out.println("홀수 : "+odd+" 개");
			
			System.out.println("다른 수로 하시겠습니까?(Y/N)");
			
			input = sc.next();
			
		
			if(input.equals("y")||input.equals("n")||input.equals("Y")||input.equals("N")) {
				if(input.equals("n")||input.equals("N")) {
					System.out.println("게임을 종료하겠습니다.");
					break;
					
				}
				if(input.equals("y")) {
					input=input.replace("y", "Y");
				}
			}else {
				System.out.println("잘못 된 입력입니다 게임을 종료하겠습니다.");
				System.exit(0);
				//break;
			}
			
		}
		
		
	}
}
