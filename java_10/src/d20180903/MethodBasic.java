package d20180903;
/*
 * 
 *  메소드(함수)는 멤버 변수(필드, 데이터)를 조작하고 처리하는 역할을 합니다.
 * 	
 *  2번 이상 호출되는 로직이나 향후 호출될 가능성이 있는 로직은 메소드의 대상이 됩니다.
 * 
 * */

public class MethodBasic {
	
	// 리턴값이 없다.
	void helloMethod(int x) {// X는 매개변수, Parmeter
		System.out.println("메소드 코드블럭 첫번째 줄");
		System.out.println("메소드 코드블럭" +x+"번째 줄");
		System.out.println("메소드 종료");
	}
	
	public static void main(String[] args) {
		
		System.out.println("메소드를 이해해 봅시다");
		MethodBasic mb= new MethodBasic();
		mb.helloMethod(2);//실인수 
		System.out.println("메인 메소드 종료");
	}
	
}
