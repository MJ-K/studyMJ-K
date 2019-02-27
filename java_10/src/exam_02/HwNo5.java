package exam_02;

public class HwNo5 {
	public static void main(String[] args) {

		/*5. 구구단 옆으로 출력하기
		
		2* 1 = 2   2 * 2 = 4    2 * 3 = 6        2 * 9  = 18
		3 * 1 = 3   3 * 2 = 6   3 * 3 = 9 ...   3 * 9 = 27
		
		...
		
		9 * 1 = 9   9 * 2 = 18   9 * 3 = 27     9 * 9 = 81 */	
		
		
		//이중for문사용, 안쪽 for 문 print 사용, 바깥쪽에 계행 실행
		
		for(int i=2; i<10;i++) {
			for(int j=1; j<10;j++) {
				System.out.print(i+" * "+j+" = "+(i*j)+"\t");
			}
			System.out.println("\n");
		}
	}
}
