package d20180906;

public class TestMain3 {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		Medic me = new Medic();
		
		m1.공격하기(m2);
		
		System.out.println(m2.hp);
		
		me.치료하기(m2);
		
		System.out.println(m2.hp);
	}
}
