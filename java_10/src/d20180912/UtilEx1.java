package d20180912;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {
		//랜덤 : Math.random() --> double type 리턴
		Random rnd = new Random(); // 정수로 리턴
		
		//0 부터 44까지의 정수
		int value = rnd.nextInt(45);
		System.out.println(value);
		
		System.out.println("------------------------------");
		//1000 사이에서 랜덤하게 정수 100개를 추출하여 출력해보세요.
		
		for(int i= 1 ; i<=100 ; i++) {
			System.out.print((rnd.nextInt(1000)+1)+"\t");
			if((i%5)==0) {
				System.out.println();
			}
		}
		
	}
}
