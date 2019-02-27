package d20180910;

public class Gun implements Weapon{//추상 메소드를 반드시 오버라이딩 해야한다.

	
	int 총알;

	Gun(){
		this.총알 = 6;
	}
	
	Gun(int 총알){
		this.총알 = 총알;// 구현 시에 총알 기능 바꿀 수 있음(공격계수 등,,)
	}
	
	public void 재장전() {
		총알 = 6;
	}
	//간접적인 확장
	
	
	@Override
	public void attack() {
		System.out.println("빵~~~");
		총알 --;
	}

	@Override
	public void repair() {
		System.out.println("뚝딱 뚝딱");
	}

	@Override
	public void upgarde() {
		System.out.println("반동이 없어졌어요");
	}

}
