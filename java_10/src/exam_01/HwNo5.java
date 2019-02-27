package exam_01;

public class HwNo5 {
	public static void main(String[] args) {
		//		5.
		//	     *
		//	     **
		//	     ***
		//	     ****
		//	     *****
		//		를 구하시오.
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
