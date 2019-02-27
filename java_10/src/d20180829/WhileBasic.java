package d20180829;

public class WhileBasic {
	public static void main(String[] args) {
		for(int i=1; i<9; i++) {
			System.out.println("2 * "+i+"="+(2*i));
		}
		System.out.println("---------------------");
		System.out.println("while 반복문----------");
		
		int j=1;
		while(j<=9) {
			System.out.println("2 * "+j+"="+(2*j));
			j++;
		}
		
		System.out.println("---------------");
		System.out.println("do while문 ....");
		
		int k=1;
		do {
			System.out.println("2 * "+k+"="+(2*k));
			k++;
		}while(k<=9);
	}
}
