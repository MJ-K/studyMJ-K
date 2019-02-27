package d20180829;

public class ForEX4 {
	public static void main(String[] args) {
		//1. 구구단 출력
		//2. 구구단 짝수단 출력
		//3. 2단은 2*2까지 ....8단은 8*8까지 출력
		
		//1
		for(int i=1;i<10;i++) {
			System.out.println("-------------"+i+"단------------");
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
		//2
		
		for(int i=2;i<10;i+=2) {
			System.out.println("-------------"+i+"단------------");
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
		//3
		
		for(int i=2;i<10;i+=2) {
			System.out.println("-------------"+i+"단------------");
			for(int j=1;j<=i;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
}
