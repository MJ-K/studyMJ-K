package d20180828;

public class IfEx2 {
	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		
		int big;
		
		//두 값 중 큰 값을 구하기
		
		if (num1>num2) {
			
			big = num1;
		}
		else {
			
			big = num2;
		}
		
		System.out.println(big);
		
		System.out.println("------------------");
		
		//두 수 차의 절대값을 구해보세요
		
		int res;
		
		/*res= num1-num2;
		
		if(res>=0) {
			System.out.println(res);
		}
		else {
			res= res+((-2)*res);
			System.out.println(res);
		}*/
		
		if(num1 > num2) {
			res = num1-num2;
		}
		else
		{
			res = num2-num1;
		}
		System.out.println(res);
	}
}
