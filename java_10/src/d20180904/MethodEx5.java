package d20180904;

import java.util.Scanner;

// 임의의 원의 반지름 정보를 전달
// 원의 넓이를 계산해서 반환하는 메소드 생성
// 원의 둘레를 계산해서 반환하는 메소드 생성
// 메인함수에서 그 결과를 출력해보세요

// 원의 넓이 : x * x * 3.14
// 원의 둘레 : x * 2 * 3.14

public class MethodEx5 {
	
	double area(int radius) {
		
		return (radius * radius * 3.14);
	}
	
	double round(int radius) {
		
		return (radius * 2 * 3.14);
	}
	
	public static void main(String[] args) {
		
		int radius;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("넓이와 둘레를 구할 반지름을 넣어주세요 : ");
		radius = sc.nextInt();
		
		MethodEx5 m5 = new MethodEx5();
		System.out.println(m5.round(radius));
		System.out.println("반지름" +radius+ "을 가진 원의 넓이는 : " + String.format("%.2f", m5.area(radius)));
		System.out.println("반지름" +radius+ "을 가진 원의 둘레는 : " + String.format("%.2f", m5.round(radius)));
	}
}
