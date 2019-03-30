package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10820 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		char[] c;
		int upper;
	    int lower;
	    int num;
	    int space;
		while((str = br.readLine()) != null && str.length() != 0) {
			upper = 0; lower = 0; num = 0; space = 0;
			c= str.toCharArray();
			for(int i =0;i<c.length;i++) {
				if(c[i]>='A'&&c[i]<='Z') upper++;
				else if(c[i]>='a'&&c[i]<='z') lower++;
				else if(c[i]>='0'&&c[i]<='9')  num++;
				else if(c[i]== ' ') space++;
			}
			 String result = lower + " " + upper + " " + num + " " + space+"\n";
			   sb.append(result);
		}
		System.out.println(sb);
		br.close();
	}
}///런타임에러..
/*import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    String input;
    int upper;
    int lower;
    int num;
    int space;
 
    while(sc.hasNextLine()) {
      upper = 0; lower = 0; num = 0; space = 0;
      input = sc.nextLine();
      
      for(int i = 0; i < input.length(); i++) {
        int c = (int)input.charAt(i);
        if(c>= 97 && c <=122) {
          lower++;
        } else if(c>= 65 && c <=90) {
          upper++;
        } else if(c>= 48 && c <=57 ) {
          num++;
        } else if(c==32) {
          space++;
        }
       }
       
       System.out.println(lower + " " + upper + " " + num + " " + space);
     }
    
    sc.close();
    }
    
}*/
///정답코드.
