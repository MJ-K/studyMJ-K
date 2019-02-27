package d20180907;

abstract class A{
	void aaa() {
		System.out.println("AA 추상 클래스 aaa method");
	}
}

class BB extends A{
	void bbb() {
		System.out.println("BB 클래스 bbb method");
	}
}

class CC extends A{
	void ccc() {
		System.out.println("CC 클래스 ccc method");
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		/*AA a = new AA();
		추상 클래스는 인스턴스화 할 수 없음*/
		
		BB b = new BB();
		b.aaa();
		b.bbb();
		
		System.out.println();
		
		CC c = new CC();
		c.aaa();
		c.ccc();
	}
}
