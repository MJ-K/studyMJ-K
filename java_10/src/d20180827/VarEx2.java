package d20180827;

import java.nio.ByteBuffer;

public class VarEx2 {
	public static void main(String args[]) {
		
		byte b2 = 10;
		
		System.out.println("b2 : " + b2);
		System.out.println("-----------------------");
		
		byte b1 = 10;
		byte b3 = 20;
		
		/*b2 = (byte) (b1+b3);
		자바는 int 이하의 연산은 모두 int로 변환하여 계산*/		
		int c = b1+b3;
		
		System.out.println("c : "+ c);
		System.out.println("----------------------");

		c = b1;
		
		b1=(byte)c;
		
		double num3 = 3.14;
		System.out.println(num3);
	}
}
