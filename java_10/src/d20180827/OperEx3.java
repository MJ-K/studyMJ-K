package d20180827;
// 3. shift 연산자 : >>, <<, >>>
// 어디에 쓸까? 기초적인 암호화 혹은 인코딩
public class OperEx3 {
	public static void main(String[] args) {
		
		byte b = 10;
		
		// >>> : 맨 앞에 비트값이 0,1 관계없이 빈자리 부호값이 0이 들어옴
		// >>  : 맨 앞의 비트값이 0이면 0,1 이면 1로 들어옴
		
		 System.out.println(" b >> 2 : "+ (b>>2));
		 // 0000 1010 >> 0000 0010
		 System.out.println(" b << 2 : "+ (b<<2));
		 // 0000 1010 << 0010 1000
	
	}
}
