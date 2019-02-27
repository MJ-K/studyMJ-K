package d20180910;

public class TestMain {
	public static void main(String[] args) {
		광선검 b = new 광선검();
		레이저총  r = new 레이저총();
		Gun g = new Gun();
		수류탄 gr = new 수류탄();
		
		//객체 집어넣기 가능!  ↓ // 나머지 객체들은 Weapon을 상속하고 있다. 
		//weapon을 상속한 애들을 상수로 만들었다.
		
		
		졸라맨 j = new 졸라맨(g);
		j.변신하기();
		j.공격하기();
		System.out.println(g.총알);
		// 인터페이스로 표기해보기.
	}
}
