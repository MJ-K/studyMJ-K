package d20180827;
// 8. 대입연산자
public class OperEx8 {
	public static void main(String[] args) {
		
		int a = 10;
		
		/*a = a + 1;
		a++;//후치
		++a;//전치*/		
		
		//a = a+2;
		
		a += 2;
		
		System.out.println("a : "+a);
		System.out.println("a +=2 : " +(a+=2));
		System.out.println("a -=2 : " +(a-=2));
		System.out.println("a *=2 : " +(a*=2));
		System.out.println("a /=2 : " +(a/=2));
		System.out.println("a %=2 : " +(a%=2));
	}
}
