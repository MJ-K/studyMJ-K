package d20180830;
//2차 배열
public class ArrayEx5 {
	public static void main(String[] args) {
		
	/*	int[][] m = new int[3][2];
		
		System.out.println("m : "+m);//레퍼런스 타입인지 확인 m : [[I@7852e922 (주소 부여받음)
										//2차배열은 " [[ ", 1차배열은 " [ " 로 시작한다.

		System.out.println("m[1][0] : " + m[1][0]);// 아무것도 넣지 않았지만 기본값 '0'이 나온다.
													//m[1][0] : 0
		
		System.out.println("m[0] : "+ m[0]); // 참조값 나옴. m[0] : [I@4e25154f

		System.out.println("m.length : "+m.length);//m.length : 3
		System.out.println("m[0].length: "+m[0].length);//m[0].length: 2*/
		
		
		//int[] a = {10,20,30};
		
		int[][] m = {{ 2, 7 },{ 5, 10 },{ 12, 17 }};// 2차원배열 선언과 동시에 초기화
		
		System.out.println(m[0][0]+","+m[0][1]);
		System.out.println(m[1][0]+","+m[1][1]);
		System.out.println(m[2][0]+","+m[2][1]);
		
		System.out.println("--------------------------------");
		
		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++) {
				System.out.println("m["+i+"]"+"["+j+"]"+ " : "+m[i][j]);
			}
		}
		
	}
}
