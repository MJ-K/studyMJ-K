package d20180910;


// 자바는 클래그 단위로 되어있다.

// 1. import java.lang. 와 같이 * 자주쓰는거는 생략 가능 
// 2. 기본생성자 생략 가능
// 3. extends Object 생략
// 4. 확연히 구분될 때 생략 가능

// 자바 최그 클래스 Object (lang에..)
public class ObjectBasic {

	// (public)어디에든 - (static)new 하지 않고 - (rtn)리턴값이 필요없는 메소드
	// - main 이름을 가진 - 매게변수 String 배열을 가진 - 이름은 args
	
	

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2= new Object();
		
		System.out.println("obj1 : "+obj1);
		System.out.println("obj2 : "+obj2);
		
		//obj1 -- obj2 의 관계
		
		if(obj1 == obj2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		System.out.println("-----------------------");
		
		if(obj1.equals(obj2)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		obj2.toString();
		
		System.out.println("-----------------------");
		System.out.println("obj1: "+obj1);
		System.out.println("obj1.toString(): " + obj1.toString());
		//toString() : 오브젝트 값
		//자바는 문자열이라는 것이 없고 문자형밖에없다. 모든 Stirng은 char배열을 합친 것인데 단지 
		//편하게 쓰는걸 권하기 위해 String = "" 이런 형식으로 사용가능하게 했다.
		
		
	}
}
