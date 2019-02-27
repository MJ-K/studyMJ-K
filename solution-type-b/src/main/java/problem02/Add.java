package problem02;


public class Add implements Arithmetic{
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	private static class lazyholder{
		private static final Add instance = new Add();
	}
	public static Add getinstance() {
		return lazyholder.instance;
	}
	
}
