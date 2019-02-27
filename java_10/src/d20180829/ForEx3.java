package d20180829;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ForEx3 {
	public static void main(String[] args) {
		
		
		// 1부터 16까지 짝수만 출력해보세요.
	
		for(int i=2; i<=16 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
		//1 부터 9까지 옆으로출력
		for(int i=1;i<10;i++) {
			System.out.print(i+"\t");
	
		}
		
		System.out.println();
		System.out.println("-------------------------");
		//1 부터 10까지의 합을 출력
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			System.out.println(sum+=i);
		}
	}
}