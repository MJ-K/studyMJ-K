package d20180828;
//반복문(제어문)
// for(초기식; 조건식; 증감식){
//}

public class ForBasic {
	public static void main(String[] args) {
		
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);	*/
		
		for (int i=1; i<4; i++) {
			System.out.println(i+". for 반복문 : "+i);
		}
		System.out.println("------------------------------------");
		
		//구구단 3단 작성
		
		for(int i=1;i<10;i++) {
			System.out.println("3 * "+i+" = "+(3*i));
		}
		
		System.out.println("----------------------------");
		
		//구구단 5단 출력해보세요.
		
		for(int i=1;i<10;i++) {
			System.out.println("5 * "+i+" = "+(5*i));
		}
	}
}
