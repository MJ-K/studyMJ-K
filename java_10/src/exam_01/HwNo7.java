package exam_01;

import java.util.Scanner;

public class HwNo7 {
	public static void main(String[] args) {
		
			//		7. 몇줄 출력? 3
			//
			//			       *
			//			       **
			//			       ***
			// 			를 구하시오.
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하고싶은 줄 수를 입력하세요 : ");
		num= sc.nextInt();
		
		for(int i=1;i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
