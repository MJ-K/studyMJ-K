package studymyself;

public class test1 {
	public static void main(String[] args) {
		int num  = 400;
		for(int i =1;i<=num;i++) {
			
			int count = calcul(i);
			
			if(count ==0) {
				System.out.print("");
				continue;
			}
			
			System.out.print(i+" ");
			
			for(int j=0;j<count;j++) {
				System.out.print("짝");
			}
			System.out.println();
		}
	}
	public static int calcul(int num) {
		
		int count =0;
		
		String str = Integer.toString(num);
		
		for(int i = 0 ;i<str.length();i++) {
			int c = str.charAt(i)-'0';
			if (c==3||c==6||c==9) {
				count++;
			}
		}
				
		return count;
	}
}
