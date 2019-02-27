package d20180828;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		/*
		 * if(조건식 a){
		 * 		문장1;
		 * 		문장2;
		 * }else if(조건식 b){
		 * 		문장3;
		 * 		문장4;
		 * }else{
		 * 		문장5;
		 * }
		 * */
		
		int math;
		int grammer;
		
		System.out.println("당신의 성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		//System.out.println("value : "+value);
		
		//학점처리
		
		if (value >= 90) {// 100~90
			System.out.println("당신의 학점은 A입니다.");
		}
		else if(value >= 80) {//89~80
			System.out.println("당신의 학점은 B입니다.");
		}
		else if(value >= 70) {//79~70
			System.out.println("당신의 학점은 C입니다.");
		}
		else if(value >= 60) {//69~60
			System.out.println("당신의 학점은 D입니다.");
		}
		else {//59~0
			System.out.println("당신의 학점은 F입니다.");
		}
	}
}
