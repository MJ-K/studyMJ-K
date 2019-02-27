package d20180910;

// is - a 관계 : 상속 관계 (자식은 부모다)
// has = a 관계 : 간접 상속관계, 인터페이스 객체를 멤버 변수로 사용(반드시 오버라이드 할 필요 (=x)) 
// 따라서 졸라맨은 객체를 멤버변수로 사용하도록 한다.

// 무기들이 만들어져있다. 상속받아 쓰자

// 논리적으로 사람객체의 부모가 Gun이 되는 이상한 관계가 됨

public class 졸라맨{// 사람 형태 가 부모
	int 팔;
	int 다리;
	int 머리;
	
	//클래스(객체)도 멤버 변수로 선언가능
	
	Weapon w;
	//인터페이스 참조변수로 선언
	//졸라맨이 바뀔때마다 무기종류에 따른 선언 필요 없움
	졸라맨(Weapon w){
		this. w = w;
	}//weapon 모든 객체를 주소에 담을 수 있음
	
	//졸라맨(레이저총 r){
	//	this.r = r;
	//} //이렇게 쓰면 전부 다 이렇게 써주고 수정도 매번 해야함.
	
	public void 공격하기() {
		if(w!=null) {
			w.attack();
		}else {
			System.out.println("원투 원투");//system 이 함수는 jre에 있다.
		}
	}
	
	public void walk() {
		System.out.println("walk walk");
	}
	
	public void 변신하기() {
		System.out.println("사랑과 정의를 지키는 졸라맨~");
	}
}