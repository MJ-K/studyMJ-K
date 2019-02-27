package problem04;

import java.io.BufferedReader;

public class Main_2 {
	public static void main(String[] args) {
		
		String[] str = {"0","#"};
		String map = "";
		
		int num1=(int)(Math.random()*9)+10;
		int num2=(int)(Math.random()*9)+10;
		
		System.out.println(num1);
		System.out.println(num2);
		
		if(num1<10||num2<10) {
				System.out.println("시스템오류");
		}else {
			
			for(int i = 0;i<(num1+num2);i++) {
				map+=str[(int) ((Math.random()*1)+1)];
			}
			
			System.out.println(map);
		}
	}
}
