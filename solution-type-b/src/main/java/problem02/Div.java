package problem02;


public class Div implements Arithmetic{
	@Override
	public int calculate(int a, int b) {
		if(a == 0) return 0;
		return a/b;
	}
	private static class lazyholder{
		private static final Div instance = new Div();
	}
	public static Div getinstance() {
		return lazyholder.instance;
	}
	
}
