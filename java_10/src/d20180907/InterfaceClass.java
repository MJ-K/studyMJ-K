package d20180907;

public class InterfaceClass implements InterfaceEx1, InterfaceEx2{

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		System.out.println("실제로 구현되는 부분");
		System.out.println("문자열을 얻어오는 부분");
		return null;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("실제로 구현되는 부분");
		System.out.println("연산을 막 하는 로직이 들어갈 부분");
	}
	
}
