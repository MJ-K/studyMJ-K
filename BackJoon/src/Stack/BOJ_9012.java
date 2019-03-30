package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class BOJ_9012 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<String> stack = new Stack<String>();
		String str;
		String[] spli;
		boolean flag;
		
		for(int i =0; i <N;i++) {
			str = br.readLine();
			spli = str.split("");
			flag = true;
	
			for(int j=0;j<spli.length;j++) {
				if(spli[j].equals("(")) {
					stack.push("(");
					
				}
				else {
					if(stack.isEmpty()) {
						flag= false;
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if(stack.isEmpty()&&flag==true) { 
				bw.write("YES\n");
			}
			else{
				bw.write("NO\n");
			}
			stack.clear();
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
