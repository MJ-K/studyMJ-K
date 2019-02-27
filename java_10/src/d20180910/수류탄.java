package d20180910;

public class 수류탄 implements Weapon{
	
	boolean 안전핀;
	int 안전시간;
	double 살상범위;
	
	수류탄(){
		안전시간 = 5;
		살상범위 = 50.0;
	}
	
	@Override
	public void attack() {
		System.out.println("셋 둘 하나 투척");
	}
	@Override
	public void repair() {	
		System.out.println("안전핀 결합");
		
	}
	@Override
	public void upgarde() {
		System.out.println("살상거리가 길어졌음");
	}
	
	
	
}


