package study;

public class re_fibonacci {
	public static void main(String[] args) {
		
		fib(7,0,1);
		
	}
	public static int fib(int i, int a, int b) {
		
		//i�� ���� , a�� n-1, b�� n
		
		if(i<=0) return i;
		
		else 
			{
				System.out.println(b);
				return fib(i-1, b, a+b);//fib(��������, n-1, (n-1)+(n-2))
			}
	}
}
