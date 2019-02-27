package d20180905;

public class TestMain {
	public static void main(String[] args) {
		Human h1= Human.getinstance();
		System.out.println(h1.get나이());
		System.out.println(h1.이름);
		
		/*System.out.println(h1.눈);*/ //private int 눈 이라 서 다른 class에서 사용 못함.0
	}
}
