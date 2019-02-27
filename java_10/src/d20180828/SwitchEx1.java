package d20180828;
//switch 문
//상대적으로 if 문 보다 빠르다.
//switch문의 조건식은 제한적이지만 if문보다 조건을 파악하기 쉽다.
//switch문에는 key값이 필요하다.

import java.io.IOException;
import java.util.Scanner;

//1부터 5까지 숫자를 입력하면 해당하는 요일을 영문으로 출력해보세요.

public class SwitchEx1 {
	
	public static void main(String[] args) throws IOException {
		
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		num=sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("MON");
			break;
		case 2 : 
			System.out.println("TUE");
			break;
		case 3 : 
			System.out.println("WED");
			break;
		case 4 :
			System.out.println("THU");
			break;
		case 5 : 
			System.out.println("FRI");
			break;
		default : 
			System.out.println("WEEKEND");
		}
	}

}
