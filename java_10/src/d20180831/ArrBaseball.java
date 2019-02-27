package d20180831;

import java.util.Scanner;

public class ArrBaseball {
	public static void main(String[] args) {
		// 1. 컴퓨터가 3자리 정수를 랜덤하게 생성함
		// 2. 각각 자리에 수를 넣고 각자리별로 일치여부 검사
		// 3. 사용자가 입력값을 받기 - 3자리 정수
		// 4. 컴퓨터가 생성한 숫자와 사용자가 입력한 숫자를 비교
		//    각 요소를 비교하여 자리값과 숫자가 일치하는지 판단(자리수 = 숫자)
		//    자리값과 숫자가 동시에 일치하면 스트라이크 변수 값을 증가
		//    자리값과 숫자가 다른자리에서 일치하면 볼 변수 값을 증가
		// 5. 판정 결과를 화면에 출력
		// ? strike, ? ball
		
		// 6. 3S이면 경기를 종료, 아니면 반복
		
		
		int s_num=0;//시스템 수
		int u_num=0;//user number
		
		int[] s_numcheck = new int[3];//system number자리별 일치 여부 검사
		int[] u_numcheck = new int[3];
		
		int strike=0;
		int ball=0;
		int same_sum=0;
		
		int temp=0;
		
		boolean y_n=true;
		boolean len_check=true;
		boolean same=true;
		
		Scanner sc= new Scanner(System.in);
		
		while(same) {
			do {
				s_num=(int)(Math.random()*998)+1;
			}while(s_num<100);
			
			//System.out.println("system : " + s_num);
			
			s_numcheck[0]=s_num/100;//100
			s_numcheck[1]=(s_num-(100*s_numcheck[0]))/10;//10
			s_numcheck[2]=s_num-(100*s_numcheck[0])-(10*s_numcheck[1]);//1
			
			for(int i=0;i<3;i++) {
				for(int j=i+1;j<3;j++) {
					if(s_numcheck[i]==s_numcheck[j]) {
						same_sum++;
					}
				}
			}
			if(same_sum==0) same=false;
			same_sum=0;
		}
		
		System.out.println("system : " + s_num);
		
		
		
		while(len_check) {
		System.out.print("서로 다른 3자리 양수를 입력하세요 : ");
		u_num=sc.nextInt();
			if((int)(Math.log10(u_num)+1)==3) {
				len_check=false;
				u_numcheck[0]=u_num/100;//100
				u_numcheck[1]=(u_num-(100*u_numcheck[0]))/10;//10
				u_numcheck[2]=u_num-(100*u_numcheck[0])-(10*u_numcheck[1]);//1
			}
			else {
				System.out.print("잘못 입력하셨습니다. 다시");
			}
		}
		len_check =true;
		
		while(y_n) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(s_numcheck[i]==u_numcheck[j]) {
						if(i==j) {
							strike++;
						}
						else ball++;
					}
				}
			}	
			System.out.println("strike : "+strike+", ball : "+ball);
			if(strike==3) {
				y_n=false;
				System.out.println("맞추셨습니다. 게임을 종료합니다.");
			}
			else {
				while(len_check) {
					System.out.print("틀리셨습니다. 다시 서로 다른 3자리 양수를 입력하세요 : ");
					u_num=sc.nextInt();
						if((int)(Math.log10(u_num)+1)==3) {
							len_check=false;
							u_numcheck[0]=u_num/100;//100
							u_numcheck[1]=u_num-(100*u_numcheck[0])/10;//10
							u_numcheck[2]=u_num-(100*u_numcheck[0])-(10*u_numcheck[1]);//1
						}
						else {
							System.out.print("잘못 입력하셨습니다.");
						}
					}
					len_check =true;
			}
		}
	}
}
