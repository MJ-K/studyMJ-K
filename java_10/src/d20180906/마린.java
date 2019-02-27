package d20180906;

public class 마린 {
	// 멤버 변수
	int x, y;
	int hp;
	int 공격력, 방어력, 사거리;
	int 이동속도, 공격속도, 시야;
	
	// 생성자
	마린(){
		x = 0; y = 0;
		hp = 100;
		공격력 = 5; 방어력 = 0; 사거리 = 1;
		이동속도 = 3; 공격속도 = 2; 시야 = 2;
	}
	
	// 생성자 오버로딩
	마린(int hp){
		this();
		this.hp = hp;
	}
	
	
	
	// 멤버 메소드
	void 이동하기(int a, int b) {
		x = a;
		y = b;
		System.out.println("고고~! ("+x +  " : "+ y +")");		
	}
	
	// 공격하기 추가
	void 공격하기(마린 x) {
		System.out.println("x : "+ x);
		x.hp -= 공격력;
		System.out.println("탕~~");
	}
	
	
	
	void 패트롤() {
		System.out.println("순찰 중 이상 무");
	}
	
	void 홀드() {
		System.out.println("근무 중 이상 무");
	}
	
	void status() {
		System.out.println("---- 상태보기 ------");
		System.out.println("hp : "+ hp);
		System.out.println("x , y : "+ x + " : "+ y);
		System.out.println("공속 : "+ 공격속도);
		System.out.println("이속 : "+ 이동속도);
	}
	
}// class end











