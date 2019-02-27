package exam_01;

public class HwNo8 {
	public static void main(String[] args) {
		//		8.   
		//	     ******
		//	     ****
		//	     ***
		//	     **
		//	     *     
		//  를 구하시오.
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
