package d20180905;

public class Human {
	//멤버 변수 생성
	int 눈;
	int 코;
	int 입;
	int iq;
	String 성별;
	int 나이;
	double 키;
	double 몸무게;
	String 이름;
	
	//생성자 
	
	Human(){
		눈 = 2;
		코 = 1;
		입 = 1;
		iq = 100;
		성별 = "남자";
		나이 = 18;
		키 = 174.7;
		몸무게 = 65.8;
		이름 = "갑돌이";
		System.out.println("생성자 호출");
	}// 이거 못쓰게 막아놓으면 제대로 된 oop구성
	
	//내 객체를 사용할 다른 사용자 혹은 개발자를 위해서
	//다양한 생성자를 갖는 클래스로 생성
	//생성자 오버로딩(이름은 같지만 타입 등이 다르다)

	Human(String 이름){
		//나머지 부분은 null, 또는 초기화 안돼서 0 값..
		this.이름 = 이름;// this 나 자신의 변수를 얘기함 this.이름 = 전역변수의 이름
	}
	
	Human(String str1, String str2){
		눈 = 2;
		코 = 1;
		입 = 1;
		iq = 100;
		나이 = 18;
		몸무게 = 65.8;
		키 = 174.7;
		this.이름 = str1;//this 안써도 되지만 쓰는게 권장사항0
		this.성별 = str2;
	}
	
	
	
	// 이름, 성별, 키 생성자 오버로딩
	Human(String str1, String str2,double d){

		// 기본 생성자를 실행하고 사용자가 요구하는 변수만 열어주고 싶을 때
		// => 생성자 인자가 많아서 복사 - 붙여넣기가 복잡할 때
		
		this();
		
		this.이름 = str1;
		this.성별 = str2;
		this.키 = d;
	}
	

	// 이름, 성별, 키, 몸무게, 나이 생성자 오버로딩
	Human(String 이름, String 성별,double 키, double 몸무게, int 나이){

		//멤버 변수를 초기화
		//멤버 변수 이름 = 매개 변수 이름 할당
		//this.멤버 변수 이름 = 매개 변수 이름 할당(권장)
		
		this(이름, 성별, 키);// 기본생성자 실행 + 이전에 실행한 인자까지 모두 불러올 수 있음
		//바로 위에있는 human 불러온거..
		
		/*this.이름 = str1;
		this.성별 = str2;
		this.키 = d;*/
		this.몸무게 = 몸무게;
		this.나이 = 나이;
		
		
	}
	
	
	//멤버 메소드
	
	void 걷기() {
		System.out.println("하나 둘 하나 둘");
	}
	
	void 먹기() {
		System.out.println("냠냠");
	}

	void 코딩하기() {
		System.out.println("와 재미있다~ ctr+c, ctrl+v");
	}
	
	void 자기() {
		System.out.println("쿨쿨");
	}
	
	void 생각하기() {
		System.out.println("멍~~");
	}
}
