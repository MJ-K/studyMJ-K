package d20180910;

// 인터페이스 : 서로 관계가 없는 객체들을 상호작용하기 위해 사용하는 시스템
//    		  : 다중상속의 장점을 취하고 싶을 때 사용
// 따라서 추상클래스 보다 많이 사용

public interface Weapon {
	public void attack();//인터페이스 안은 무조건 추상 메소드라서 abstract 생략
	public void repair();
	public void upgarde();
}
