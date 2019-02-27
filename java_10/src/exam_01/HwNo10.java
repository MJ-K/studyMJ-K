package exam_01;

import java.util.Scanner;

public class HwNo10 {
	public static void main(String[] args) {
		
		
		//10. 사용자로부터 값을 입력받아 해당 단을 출력하는 코드를 작성하시오
		int dan;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력하고 싶은 단을 입력하세요 : ");
		dan = sc.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
		
	}
}
