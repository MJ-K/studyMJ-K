package d20180903;
//임의의 두 정수를 받아서, 사칙연산을 한번에 출력하는 메소드 생성
//위 메소드를 호출할 수 있는 메인메소드 생성
//단, 나눗셈의 몫과 나머지는 따로 출력하세요.

import java.util.Scanner;

public class MethodEx1 {
	
	void calcul(int x, int y) {
		System.out.println(x +" + "+y+" = "+(x+y));
		System.out.println(x +" - "+y+" = "+(x-y));
		System.out.println(x +" * "+y+" = "+(x*y));
		System.out.println(x +" / "+y+" = "+(x/y));
		System.out.println(x +" % "+y+" = "+(x%y));
	}
	public static void main(String[] args) {
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사칙연산을 하고싶은 수 두개를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		MethodEx1 c =new MethodEx1();
		c.calcul(num1,num2);
	}
}
