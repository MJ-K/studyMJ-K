package d20180828;

import java.awt.Container;
import java.util.Scanner;

// 학점 구하는 switch문 전부 if 문으로 변경 가능

public class SwitchEx2 {
	public static void main(String[] args) {
		
		int score;
		String grade="";
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요 : ");
		score = sc.nextInt();//입력
		
		//switch문은 case에 값이 하나만 인정
		//key 값이 하나가 되도록 사이값을 미리 조정
		
		/*
		 * 100		A
		 * 99~90 	A
		 * 89~80	B
		 * 79~70	C
		 * 69~60	D
		 * 나머지 	F
		 * */
		score/=10;
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
