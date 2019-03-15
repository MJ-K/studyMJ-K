package programming1;

public class test2 {
	  public void solution(int a, int b) {
	         
		  for(int i= 0;i<b;i++) {
			  for(int j = 0;j<a;j++) {
				  System.out.print("*");
			  }
			  System.out.println("");
		  }
	         
	  }
	  public static void main(String[] args) {
		new test2().solution(5, 3);
	}
}
