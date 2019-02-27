package problem02;

public class Sub implements Arithmetic{
	@Override
	public int calculate(int a, int b) {
		
		return a-b;
	}
	private static class lazyholder{
		private static final Sub instance = new Sub();
	}
	public static Sub getinstance() {
		return lazyholder.instance;
	}
	
}
