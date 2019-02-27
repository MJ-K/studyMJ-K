package d20180907;

public class Teran {
	// 멤버 변수
	int x, y, hp, 방어력, 시야, 이동속도, 공격속도, 사거리;
	
	// 생성자
	Teran(){
		x = 0;
		y = 0;
		hp = 100;
		방어력 = 0;
		시야 = 2;
		이동속도 = 2;
		공격속도 = 2;
		사거리 = 1;
	}
	
	// 멤버 메소드
	void 이동하기(int a, int b) {
		x = a;
		y = b;
		System.out.println(" x : y => "+ x + " : " + y);
	}
	
	void 패트롤() {
		System.out.println("순찰 중 이상 무");
	}
	
	void 홀드() {
		System.out.println("근무 중 이상 무");
	}
	
	
}









