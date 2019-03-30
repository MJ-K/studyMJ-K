package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_1406 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int comm = Integer.parseInt(br.readLine());
		Stack<String> s1 = new Stack<String>();
		Stack<String> s2 = new Stack<String>();
		
		for(int i=0;i<str.length();i++) {
			s1.push(str.substring(i, i+1));
		}
		
		for(int i =0;i<comm;i++) {
			str = br.readLine();
			switch(str.substring(0,1)) {
			case "L": 
				if(!s1.isEmpty()) s2.push(s1.pop());
				break;
			case "D":
				if(!s2.isEmpty()) s1.push(s2.pop());
				break;
			case "B":
				if(!s1.isEmpty())s1.pop();
				break;
			case "P":
				s1.push(str.substring(2));
				break;
			}
		}
		br.close();
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		while(!s2.isEmpty()) {
			bw.write(s2.pop());
		}
		
		bw.flush();
		bw.close();
	}
}
