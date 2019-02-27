package d20180903;
/*
 * 
 * OOP(Object Oriented Programming)
 * 
 * : 사물, 대상이 가진 특성, 성질과 그 행동들을 그대로 실체화 하고자 하는 목적을 가진 프로그램
 * 	
 * 
 * */

//클래스
// : 하나의 클래스는 메모리 할당 시 다양한 값을 가지게 되며
// : 하나의 객체는 독립적으로 사용됩니다.
public class Car {
		//1. Member 변수
		String manf = "롤스로이스";//제조사
		String engine = "8기통";
		String name = "팬텀";
		String wheel = "15인치";
		
		//2. 생성자
		Car(){
			
		}
		
		//3. member method
		void go() {
			System.out.println("와 되게 조용함...");
		}
		
		void back() {
			System.out.println("와 후방 카메라...");
		}
		
		public static void main(String[] args) {
			
			Car c = new Car(); //메모리에 올림 => 인스턴스화
			
			c.go();
			
			String carManf = c.manf;
			
			System.out.println("제조사 : "+carManf);
		}
}
