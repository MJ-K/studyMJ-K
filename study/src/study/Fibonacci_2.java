package study;

public class Fibonacci_2 {
	public static void main(String[] args) {
		
		int input = 8;//8°³ Ãâ·Â
		
		for(int i = 1;i<=input;i++) {
			System.out.println(fib(i));
		}
		
	}
	public static int fib(int i) {
		
		if(i<=1) return i;
		else
			
		return fib(i-2)+fib(i-1);
	}
}
