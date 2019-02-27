package d20180905;

public class Parent {
	String a = "부모";
	
	void method() {
		System.out.println(a + "함수 호출");
		System.out.println("부모가 자식에게 잔소리");
	}//안쓰고싶으면 안쓸 수 있는 것이 오버라이딩
	
}
