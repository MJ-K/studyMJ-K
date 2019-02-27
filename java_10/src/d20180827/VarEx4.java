package d20180827;

public class VarEx4 {
	public static void main(String[] args) {
		//문자형은 char 자료형 문자형은 ''안에 한글자만 가능
		//CHAR : 0~32768
		char ch1= 'J';
		char ch2= 'A';
		char ch3= 'V';
		char ch4= 'A';
		//ASCII코드000000
		System.out.println(""+ch1+ch2+ch3+ch4);
		//괄호 안에 ""가 없으면 ASCII 코드값 그대로 출력됨에 유의
		
		String str="JAVA";
		
		System.out.println(str);
		System.out.println("------------------");
		
		//자바는 uni코드 지원하므로 한글 지원이 됨. 잘 안씀
		
		
		
	}
}
