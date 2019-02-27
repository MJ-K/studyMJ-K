package d20180907;

public class 말 extends 포유류 implements Flyable{
	
	@Override
	public void 먹기() {
		System.out.println("말은 당근을 먹어요");
		
	}

	@Override
	public void 자기() {
		System.out.println("말은 서서 자요");
		
	}

	public void 달리기() {
		System.out.println("말은 앞만 보고 달려요");
	}

	@Override
	public void 비행() {
		// TODO Auto-generated method stub
		System.out.println("역시 현질이 짱~! 잘 날아요");
	}
}
