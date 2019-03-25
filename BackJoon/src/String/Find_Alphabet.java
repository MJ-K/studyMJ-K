package String;

import java.util.Scanner;

public class Find_Alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		int start = 97;
		boolean flag = false;
		
		
		for(int i =0;i<26;i++) {
			flag = false;
			for(int j=0;j<s.length();j++) {
				if(start==Integer.valueOf(c[j])) {
					//System.out.println("start : "+start + " ,c : "+c[j]+"-  : "+Integer.valueOf(c[j]));
					System.out.print(j+" ");
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.print("-1 ");
			}
			start++;
		}
	}
}
