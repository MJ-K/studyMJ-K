package d20180906;

public class TestMain2 {
	public static void main(String[] args) {
		메딕 me = new 메딕();
		me.이동하기(500, 300);
		me.status();
		
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		
		// supermarine -> hp=500
		/*
		 *  SuperMarine sm = new SumerMarine();
		 *  sm.hp = 500;
		 * 
		 * 
		 */
		
		마린 su = new 마린(500);
		su.status();
		
		System.out.println("---------------------------------");
		
		마린 m3 = m1;
		m3.hp = 50;
		
		System.out.println("m1.hp :"+ m1.hp + " " + m1);
		System.out.println("m2 : "+ m2);
		System.out.println("m3.hp : "+ m3.hp + " " + m3);
		
		System.out.println("-------------------------------------");
		// 마린이 공격하기를 하고 싶어요
		m1.공격하기(m2);
		m2.status();
		
		System.out.println("-------------------------------");
		// 메딕이 치료하기를 하고 싶어요
		// m2를 치료한 후  m2 상태를 확인해보세요
		me.치료하기(m2);
		m2.status();
		me.status();
		
		
	}
}











