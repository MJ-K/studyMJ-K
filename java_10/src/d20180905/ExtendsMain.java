package d20180905;

public class ExtendsMain extends Child {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("p.a : "+ p.a);
		p.method();
		
		System.out.println("------------------");
		System.out.println("c.a : "+c.a);//자식 클래스에는 a가 없지만 상속받아서 사용
		c.method();
		/* 결과 : 
		 * c.a : 부모
		 * 자식클래스에서
		 * 부모 메소드 호출
		 * 자식은 친구에게 잔소리하기*/
		
		System.out.println("------------------");
		System.out.println("c.b : "+c.b);//자식 클래스에는 a가 없지만 상속받아서 사용
		c.method();
		
	}
}
