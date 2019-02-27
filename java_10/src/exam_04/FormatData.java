package exam_04;

public class FormatData {
	
	/*6. 아래의 출력결과를 얻을수 있게 FormatData 클래스를 작성하시오.

	 * 출력결과
	----------------------------------
	    20
	    [ 10 20 50 30 ]
	    240.3
	----------------------------------*/
	void print(int a) {
		System.out.println(a);
	}
	
	void print(int[] b) {
		System.out.print("{");
		for(int i=0; i<b.length;i++) {
			System.out.print(" "+b[i]);
		}
		System.out.println(" }");
	}
	
	void print(float f) {
		System.out.println(f);
	}
}
