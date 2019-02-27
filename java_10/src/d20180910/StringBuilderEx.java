package d20180910;

// StringBuffer, StringBuilder
//	1.0			,	1.5
//  안정			불안정(thread사용 시 불안정)

public class StringBuilderEx {
	public static void main(String[] args) {
	
		String str = "soldesk";
		StringBuilder sb = new StringBuilder();
		sb.append(str); //sb에 데이터를 집어 넣겠다.
		System.out.println(sb);
		
		sb.insert(1, 4);//문자열 중간에 데이터 삽입 1번째 인덱스에 4를 삽입
		System.out.println(sb);
		
		sb.delete(0, 1);
		System.out.println(sb);
		
		
		StringBuilder sb2 = new StringBuilder(str);
		sb2.append("AA");
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		
		System.out.println("=======================");
		String str0 = "Hello";
		String str1 = "Java";
		String str2 = "World";
		
		//문자열 비교  : compareTo
		if(str1.compareTo(str2)<0) {//알파벳 순서 비교
			System.out.println("str1이 앞선다");
		}else {
			System.out.println("str2가 앞선다");
		}
	}
}
