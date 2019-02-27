package d20180905;
//생성자를 통해 접근하는 방법
//(생성자 오버로딩)
public class Society extends Human{
	public static void main(String[] args) {
		Human h1= Human.getinstance();
		h1.먹기();
		System.out.println("h1 : "+ h1);
		
		/*000000000000000000000000000000000000000Human h2 = new Human();
		h2.먹기();
		
		h2.이름 = "갑순이";
		h2.성별 = "여성"; 
		
		System.out.println(h2.이름);*/ //권장하지 않는 방법 메소드를 통해 접근하는 것을 권장
		
		Human h2 = Human.getinstance();
		h2.set이름("갑순이");
		System.out.println("h2 이름 : " + h2.이름);
		
		System.out.println("--------------------------------");
		
		Human h3 = new Human("유관순","여성");
		System.out.println("h3 이름 : "+ h3.이름);
		System.out.println("h3 성별 : "+ h3.성별);
		
		System.out.println("--------------------------------");
		
		Human h4 = new Human("홍길동","남성",180.5);
		System.out.println("h4 이름 : "+ h4.이름);
		System.out.println("h4 iq : "+ h4.iq);
		
		System.out.println("--------------------------------");
		
		Human h5 = new Human("신사임당","여성",160.1, 60, 40);
		System.out.println("h5 이름 : "+ h5.이름);
		System.out.println("h5 iq : "+ h5.iq);
		
		
		
	}
}
