package d20180907;

class Fruit{
	// 사과, 복숭아, 바나나 상수를 생성
	final static int APPLE = 1;
	final static int PEACH = 2;
	final static int BANANA = 3;
}

class Company{
	// 구글, 오라클, 애플 상수 생성
	final static int GOOGLE = 1;
	final static int ORACLE = 2;
	final static int APPLE = 3;
}

public class FinalEx {
	public static void main(String[] args) {
		// 과일 분류 switch문 작성
		int type;
		type = Fruit.APPLE;
		
		// 누군가 실수로 컴퍼니의 APPLE을 부른다면?
		type = Company.APPLE;
		
		switch(type) {
		case Fruit.APPLE:
			System.out.println("사과");
			break;
		case Fruit.PEACH:
			System.out.println("복숭아");
			break;
		case Fruit.BANANA:
			System.out.println("바나나");
			break;
		}
	}
}
