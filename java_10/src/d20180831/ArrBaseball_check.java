package d20180831;

import java.util.Scanner;

public class ArrBaseball_check {
	public static void main(String[] args) {
		// 1. 컴퓨터가 3자리 정수를 랜덤하게 생성함
		int[] com = new int[3];
		Scanner sc= new Scanner(System.in);
		boolean flag = true;
		
		int count = 0;
		
		// 2. 각각 자리에 수를 넣고 각자리별로 일치여부 검사
		
		while(flag) {
			
			com[0]=(int)(Math.random()*9)+1;
			com[1]=(int)(Math.random()*9)+1;
			com[2]=(int)(Math.random()*9)+1;
		
			if(com[0]!=com[1]&& com[0] != com[2] && com[1] != com[2]) {
				flag = false;
			}
		}
		while(true) {
			count++;
			System.out.println("컴퓨터 생성값 : "+com[0]+com[1]+com[2]);
	
			// 3. 사용자가 입력값을 받기 - 3자리 정수
			
			//Scanner sc= new Scanner(System.in);
			System.out.print("숫자를 입력하세요 : ");
			
			int value =sc.nextInt();
			
			//System.out.println("사용자가 입력한 값 : "+value);
			
			//376
			//userInput[0] -->3
			//userInput[0] -->6
			//userInput[0] -->7
			
			int[] userInput = new int[3];
			userInput[0] = value/100;
			userInput[1] = value%100/10;
			userInput[2] = value%10;
			
			//System.out.println("사용자가 입력한 값 : "+userInput[0]+userInput[1]+userInput[2]);
			
			
			// 4. 컴퓨터가 생성한 숫자와 사용자가 입력한 숫자를 비교
			//    각 요소를 비교하여 자리값과 숫자가 일치하는지 판단(자리수 = 숫자)
			//    자리값과 숫자가 동시에 일치하면 스트라이크 변수 값을 증가
			//    자리값과 숫자가 다른자리에서 일치하면 볼 변수 값을 증가
			int strike=0;
			int ball=0;
			
			for(int i=0;i<3;i++) {
				if(com[i] == userInput[i]) {
					strike ++;
				}
				else
				{
					for(int j=0;j<3;j++) {
						if(com[j]==userInput[i]) {
							ball++;
						}
					}
					
				}
			}
			// 5. 판정 결과를 화면에 출력
			
			System.out.println(strike + "strike, "+ball +"ball");
			// ? strike, ? ball
			
			// 6. 3S이면 경기를 종료, 아니면 반복
			if(strike==3) break;
		}	
		System.out.println("축하합니다! "+count+" 번 만에 성공하셨습니다.");
	}
}
