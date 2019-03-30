package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ_10799 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
			
		int count = 0;
		String str = br.readLine();

		for(int i=0;i<str.length();i++) {
			if(str.substring(i, i+1).equals("(")) {
				stack.push(i);
			}
			else {
				if(stack.pop()+1 == i) {
					count += stack.size();
				}
				else count++;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
