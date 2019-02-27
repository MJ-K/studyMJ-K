package d20180829;


//while문 : for문과 같은 반복문
//while문이 for문보다 조건이 더 간편하다

public class WhileEx1 {
	public static void main(String[] args) {
		
		//while문 역시 중첩이 가능함. 구구단 9단까지 출력해보세요.
		int i=1;
		int j=1;
		while(i<=9) {
			System.out.println("-------------------------");
			while(j<=9) {
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			}
			i++;
			j=1;
		}
		System.out.println("-----------------------------------");
		// 1부터 10까지의 합(while)
		int sum=0;
		int num=1;
		while (num<=10) {
			sum+=num;
			num++;
		}
		System.out.println("sum : "+sum);
		
		
		System.out.println("---------------------------");
		//1부터 100까지 출력(while)
		//100부터 1까지 출력(do~while)
		int a=1;
		while(a<=100) {
			System.out.println(a++);
		}
		System.out.println("-----------------------");
		
		do {
			System.out.println(--a);
		}while(a>1);
				
	}
}
