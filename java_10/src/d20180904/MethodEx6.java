package d20180904;

//1. 1이상 1000이하의 정수 중에서 소수를 출력하는 main 메소드
//2. 메인메소드에서 전달된 값이 소수인지 아닌지를 파악하는 primeNumber()
//2-1. primeNumber()에서 소수 여부를 true, false 판단해서 반환 true 일때만 출력
 
public class MethodEx6 {
	
	boolean primeNumber(int num) {
		
		boolean res = true;
		
		for(int i=2;i<num;i++) {
			if((num%i)==0) {
				res = false;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		MethodEx6 m6 = new MethodEx6();
		
		for(int i=2 ;i<=1000;i++) {
			if(m6.primeNumber(i)) {
				System.out.println(i);
			}
		}
		
	}
}
