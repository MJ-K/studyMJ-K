package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10809_RE {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//a =97 z=122
		String str = br.readLine();
		int[] a = new int[26];
		int count=0;
		
		for(int i=0;i<26;i++) {
			a[i]= -1;
		}
		
		for(int i=0;i<str.length();i++) {
			if(a[Integer.valueOf(str.charAt(i))-97]!=-1) {count++;continue;}
			a[Integer.valueOf(str.charAt(i))-97] =count;
			count++;
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
