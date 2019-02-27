package d20180904;

public class Computer {
	//멤버변수
	double monitor;
	String keyboard;
	double 본체;
	double 마우스;
	
	//생성자
	Computer(){
		monitor = 24;
		keyboard = "querty";
		본체 = 20.3;
		마우스 = 3.5;
	}
	
	//멤버 메소드
	void 연산하기() {
		System.out.println("하나 둘 하나 둘");
	}
	
	void 전원켜기() {
		System.out.println("어서오세요");
	}
	
	void 전원끄기() {
		System.out.println("종료합니다");
	}
	
	void 코딩하기() {
		System.out.println("아~~오늘도 야근인가...");
	}

	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println(com.마우스);
		com.전원켜기();
	}
}
