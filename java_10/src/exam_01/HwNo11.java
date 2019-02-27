package exam_01;

import java.util.Scanner;

public class HwNo11 {
	public static void main(String[] args) {
		
		//11.  1부터 입력한 숫자까지의 누적합을 출력하시요
		
		int w_num;//원하는 숫자(want num)
		int num=1;//1부터
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 누적합을 원하는 수를 입력하세요 : ");
		w_num=sc.nextInt();
		
		while(num<=w_num) {
			sum+=num;
			num++;
		}
		System.out.println("1부터 "+w_num+"까지의 합은 "+sum+"입니다.");
		
	}
}
