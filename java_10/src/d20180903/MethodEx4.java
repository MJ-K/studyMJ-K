package d20180903;
/*
 * 메소드 오버로딩
 * 
 * 실행화면 
 * -----------
 * 자바
 * 자바 A
 * 자바 A 1000
 * 자바 A 1000 10.5
 * 자바 A 1000 10.5 true
 * 
 * */
public class MethodEx4 {
	
	/*void printString(String str) {
		System.out.println(str);
	}
	
	void printStringChar(String str,char ch) {
		System.out.println(str + " " + ch);
	}
	
	void printStringCharInt(String str,char ch, int x) {
		System.out.println(str + " " + ch + " " + x);
	}
	
	void printStringCharIntDouble(String str,char ch, int x, double d) {
		System.out.println( str + " " + ch + " " + x+ " "+ d);
	}
	
	void printStringCharIntDoubleBoolean(String str,char ch, int x, double d, boolean bol) {
		System.out.println(bol);
	}
	*/ //불편하다.
	
	void print(String str) {
		System.out.println(str);
	}
	
	void print(String str, char ch) {
		System.out.println(str + " " + ch);
	}// 메소드 오버로딩 (다중정의) 하나의 이름이지만 다양한 상황에서 동작하게 하는 것
	
	void print(String str, char ch, int x) {
		System.out.println(str + " " + ch + " " + x);
	}
	
	void print(String str,char ch, int x, double d) {
		System.out.println( str + " " + ch + " " + x+ " "+ d);
	}
	void print(String str,char ch, int x, double d, boolean bol) {
		System.out.println( str + " " + ch + " " + x+ " "+ d +" "+ bol);
	}
	
	public static void main(String[] args) {
		MethodEx4 m4 = new MethodEx4();
		m4.print("자바");
		m4.print("자바",'A');
		m4.print("자바",'A',1000);
		m4.print("자바",'A',1000,10.5);
		m4.print("자바",'A',1000,10.5,true);
	}
}
