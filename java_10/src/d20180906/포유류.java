package d20180906;

public abstract class 포유류 {
	int 눈;
	int 코;
	int 입;
	String 성별;
	
	// 추상 메소드(미구현 메소드) -> 메소드 바디 {} 가 없는 메소드로 만들어야 함
	// 추상 메소드를 1개 이상 갖는 클래스는 반드시 추상 클래스이어야 함
	// 추상 메소드는 구현클래스에서 반드시 오버라이드 해서 사용합니다.
	
	public abstract void 먹기();
	
	public abstract void 자기();
}
