package d20180827;
//6. 논리 연산자 : &&, ||
public class OperEx6 {
	public static void main(String[] args) {
		 boolean b1 = true;
		 boolean b2 = false;
	
		 //b1과 b2 and 연산
		 System.out.println("b1 && b2 : " + (b1&&b2));
		 
		 //b1 b2 or 연산
		 System.out.println("b1 || b2 : " + (b1||b2));
		 
		 System.out.println("b1 & b2 : " + (b1 & b2));
		 //비트연산자가 논리 연산도 가능함 그러나 반대로는 불가능함
	}
}
