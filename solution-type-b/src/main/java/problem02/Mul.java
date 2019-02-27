package problem02;


public class Mul implements Arithmetic{
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	private static class lazyholder{
		private static final Mul instance = new Mul();
	}
	public static Mul getinstance() {
		return lazyholder.instance;
	}
	
}
