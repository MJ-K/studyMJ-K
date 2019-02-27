package d20180829;

//다중 반복문

public class ForEx2 {
	public static void main(String[] args) {
		
			for(int i =2; i<19; i++) {
			System.out.println("\n-----"+i+"단---------------\n");
			for(int j=1; j<=19; j++) {
				System.out.println(i+" * "+j+" = "+	(i*j));
			}
		}
			 System.exit(0);
	}
}
