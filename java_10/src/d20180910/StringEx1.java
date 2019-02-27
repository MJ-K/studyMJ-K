package d20180910;

public class StringEx1 {
	public static void main(String[] args) {
		
		String str1= new String("java");
		String str2 = new String("java");
		//레퍼런스 타입인데 주소값이 나오지 않는 이유 : 아주 예외적으로 String 클래스만 new를 생략하여
		//primitive type처럼 쓰도록 허용
		//print시 data가 나옴

	/*	String str3 = new String("java");
		String str4 = "java";
		*/
		
		System.out.println("str1 : "+ str1);
		System.out.println("-------------");
		
		//hashcode : 해당 객체의 고유한 값을 return
		//일반적으로 객체 내부 주소를 정수값으로 변환 - 16진수
		
		System.out.println("str1: "+ 
				str1.getClass().getName()+'@'+Integer.toHexString(str1.hashCode())); 
		
		System.out.println("str1.toString() : "
				+ ""+ str1.toString());
		
		//objectbasic 의 ~~~.toString()과 비교.
		
		System.out.println("--------------------");
		
		//str1 - str2 의 관계?
		
		if (str1==str2) {//not 문자열 비교(내용 비교 아님) //각자 다른 객체인데 같은 객체냐고 물어본거고
			System.out.println("동일");
		}else {
			System.out.println("다름");
		}
		
		System.out.println("--------------------");
		
		if(str1.equals(str2)) {// 얘가 리얼 문자열 비교
			System.out.println("동일");
		}else {
			System.out.println("다름");
		}
		
		/*
		 *		 			Object 				String
		 * 
		 * toString()		참조값				자기자신의 문자열
		 * equals			주소값동일여부		내용동일여부
		 * 
		 * 
		 * 
		 * */
		
		System.out.println("-----------------------");
		
		String str3 = "java";
		String str4 = "java";
		
		if(str3==str4)System.out.println("같다"); // 얘는 내용 비교
				
		
	}
}
