package d20180906;

public class TestMain {
	public static void main(String[] args) {
		마린 m1 = new 마린();
		m1.이동하기(500, 200);
		m1.status();
		
		System.out.println("--------------------------");
		마린 m2 = new 마린();
		m2.이동하기(400, 100);
		m2.status();
		
	}
}
