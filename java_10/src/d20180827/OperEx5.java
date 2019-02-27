package d20180827;
//5. 비트 연산자 : &(and),|(or)
public class OperEx5 {
	public static void main(String[] args) {
		
		byte a = 10;		//0000 1010
		byte b = 22;		//0001 0110
		
		// a | b =>2진수로 각각 자리수 끼리 or 연산
		
		System.out.println(" a | b : "+(a|b));
		System.out.println(" a & b : "+(a&b));
	}
}
