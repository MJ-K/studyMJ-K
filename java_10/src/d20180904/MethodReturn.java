package d20180904;

/*
 * 
 * 실행화면
 * ----------------
 * 1.자바
 * 2. A
 * 3. 1000
 * 4. 3.14
 * 5. true 
 * 
 * */

public class MethodReturn {
	String returnStr() {
		return "자바";
	}
	char returnChar() {
		return 'A';
	}
	int returnInt() {
		return 1000;
	}
	double returnDouble() {
		return 3.14;
	}
	boolean returnBoolean() {
		return true;
	}
		public static void main(String[] args) {
			
			MethodReturn mr = new MethodReturn();
			
			System.out.println(" 실행화면");
			System.out.println("----------");
			
			System.out.println("1. " + mr.returnStr());
			System.out.println("2. " + mr.returnChar());
			System.out.println("3. " + mr.returnInt());
			System.out.println("4. " + mr.returnDouble());
			System.out.println("5. " + mr.returnBoolean());// print는 어떤 데이터가 와도 출력할 수 있도록
															//오버로딩 되어있다.
			
		}

}
