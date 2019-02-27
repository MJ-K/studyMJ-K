package d20180827;
//연산자
// 1. 증감 연산자 : ++, 11
public class OperEx1 {		//클래스 시작
	public static void main(String[] args) { //메인 메소드 시작
		
		int a = 100; // int형 변수 a에 100을 선언과 동시에 초기화 후 대입
		int b = 100;
		
		//a = a + 1;
		/*a++;
		b--;*/
		//b = a++; //후치연산
		
		b = ++a;//전치연산
		
		System.out.println("a = "+a+", b = "+b);
		
	}
}
