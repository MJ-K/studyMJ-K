package study;

public class fibonacci_1 {
	public int fib (int i, int a, int b) {
		
		if(i == 0) return a;
		else {
			System.out.println(b);
			return fib(i-1, b, a+b);
		}
		
	
	}
	public static void main(String[] args) {
		System.out.println(new fibonacci_1().fib(7, 0, 1));
	}
}
