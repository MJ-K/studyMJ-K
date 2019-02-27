package exam_02;

import java.util.Scanner;

public class HwNo6 {
	public static void main(String[] args) {
		
		/*6. 화폐교환기

		사용자로부터 숫자를 입력받아  화폐 몇장, 동전 몇 개로 
		
		교환가능한지 메세지를 출력하시는 코드를 작성하시오*/
		
		
		
		// 교환할 금액을 입력받고, 가장 큰 단위 50000으로 나눠 몫과 나머지를 따로 저장.
		// 오만,만,오천,천,오백,백,오십,십(8개짜리 int 배열) 몫은 배열에 저장
		// 나머지는 공동 사용
		//0.올바른 값이 입력되었는지 확인
		// 1.나눌 수 있는 단위 찾기.
		// 2.중간에 0이 되는 것 확인.
		
		int num = 0;
		int money[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int arr[] = new int[8];
		int remain;//나머지
		int y_n=0;//flag
		
		Scanner sc= new Scanner(System.in);
		
		while(y_n==0) {
			System.out.print("교환할 금액을 적어주세요 : ");
			num = sc.nextInt();
			if(num<0||num%10!=0) {
				System.out.println("잘못된 화폐단위 입니다. 다시 입력해주세요.");
			}
			else y_n=1;
		}
		
		System.out.println("교환된 화폐는 : ");
		
		for(int i=0;i<8;i++) {
			if((num/money[i])!=0) //받은 금액에서 가장 큰 단위(5만)부터 나누기 위한 조건
			{
					arr[i] = num / money[i];//지폐 개수
					remain = num % money[i];//남은 금액
					num = remain;
					
					System.out.println(money[i]+"원 짜리 "+arr[i]+"개");
					if(num==0)break;
				
			}
		}
		System.out.println("입니다.");
	}
}
