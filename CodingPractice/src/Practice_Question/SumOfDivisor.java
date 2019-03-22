package Practice_Question;

public class SumOfDivisor {
	public static void main(String[] args) {
		//int n = 12; //28
		int n =5; //6
		int sum = 0;
		int  i = 0;
		
		while(true) {
			i++;
			if(i>n)break;
			if(n%i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
