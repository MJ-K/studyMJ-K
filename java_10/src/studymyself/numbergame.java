package studymyself;

public class numbergame {
	//369게임 짝 출력
	
	
	//1~100사이 숫자 3의 배수에 '짝'출력
	public static void main(String[] args) {
	
		
		for(int i = 1 ;i<=400;i++) {
			String c = Integer.toString(i);
			if(c.contains("3")||c.contains("6")||c.contains("9")) {
				System.out.print("짝\t");
				if(i%10==0) System.out.println("");
				continue;
			}
			System.out.print(i+"\t");
			if(i%10==0) System.out.println("");
		}
		
	}
}
