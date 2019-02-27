package exam_05;

import java.util.Scanner;

/*
 * 
실행
------------------------
금액을 입력하세요: 2970
500원 : 5
100원 : 4
50원 : 1
10원 : 2

 * 
 * */

public class HwEc {
	 public static void main(String[] args){
		 
		 System.out.print("금액을 입력하세요:");
		 Scanner sc = new Scanner(System.in);
		 int money = sc.nextInt();

		 Exchange ec = new Exchange();
		 ec.change(money);
		 
	 }
}

class Exchange{
	public void change(int money){
		int[] coin = new int[8];
		
		divide(coin,money);
		
		for(int i =0 ; i<coin.length; i++) {
			if(coin[i] > 0) {
				System.out.println(coin[i]);	
			}
		}
	}
	
	void divide(int[] coin, int money){
		coin[0] = money/50000;
		coin[1] = money%50000 / 10000;
		coin[2] = money%10000 / 5000;
		coin[3] = money%5000 / 1000;
		coin[4] = money%1000 / 500;
		coin[5] = money%500 / 100;
		coin[6] = money%100 / 50;
		coin[7] = money%50 / 10;
	}
}