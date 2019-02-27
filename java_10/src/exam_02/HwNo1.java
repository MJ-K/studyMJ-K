package exam_02;

import java.util.Scanner;

public class HwNo1 {
	public static void main(String[] args) {
		/*1. 사용자로부터 입력받은 값이 3의 배수인지 아닌지 출력
	     ex1) 입력: 9
	     9는 3의배수입니다.
	     ex2) 입력: 7
	     7은 3의배수가 아닙니다.*/
		
		//%를 이용하여 나머지가 남지 않는 것을 확인한다. => 3의 배수이면 x % 3 = 0 이 나온다.
		
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("입력 : ");
		num=sc.nextInt();
		
		if((num%3)==0) {
			
			System.out.println(num+"은 3의 배수입니다.");
		
		}
		else {
			
			System.out.println(num+"은 3의 배수가 아닙니다.");
		}
		

	}
}
