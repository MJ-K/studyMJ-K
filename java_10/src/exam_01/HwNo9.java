package exam_01;

public class HwNo9 {
	public static void main(String[] args) {
		
		//9. 구구단 2단 부터 9단까지 출력하는 코드를 작성하시오
		for(int i=2; i <10; i++) {
			System.out.println("------------"+i+"단-----------");
			for(int j=1; j<10; j++) {
				System.out.println(i + " * "+ j +" = "+ (i*j));
			}
		}
	}
}
