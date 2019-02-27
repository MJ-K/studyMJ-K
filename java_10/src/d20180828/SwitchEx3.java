package d20180828;

import java.util.Scanner;

//국어,영어,수학 점수를 차례대로 입력받은 후
//평균점수와 학점을 구하세요. - switch문

public class SwitchEx3 {
	public static void main(String[] args) {
		
		int grammer;//국어
		int english;
		int math;
		
		double avg;
		int score;
		
		String grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요 : ");
		grammer = sc.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		english = sc. nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		math = sc.nextInt();
		
		avg = (grammer+english+math)/3.0;		
		System.out.println("avg : "+String.format("%.2f",avg));
		
		score = (int)avg/10;
		System.out.println("score : " +score);
		/*
		 * 100		A
		 * 99~90 	A
		 * 89~80	B
		 * 79~70	C
		 * 69~60	D
		 * 나머지 	F
		 * */
		
		switch (score) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6:	grade = "D"; break;	
		default: grade = "F"; break;
		}
		System.out.println("당신의 학점은 "+grade+ " 입니다.");
	}
}
