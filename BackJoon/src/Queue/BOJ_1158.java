package Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_1158 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String command = br.readLine();
		int num = Integer.valueOf(command.charAt(0)-48);
		int term = Integer.valueOf(command.charAt(2)-48);
		int data;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i= 1;i<num+1;i++) {
			q.offer(i);
		}
		bw.write("<");
		for(int i= 1;i<=(num-1)*term+1;i++) {
			if(q.isEmpty()) break;
			if(q.size()==1) { bw.write(String.valueOf(q.remove())); break;}
			if(i%term==0) {
				bw.write(String.valueOf(q.remove())+", ");
			}
			else {
				data = q.remove();
				q.add(data);
			}
		}
		bw.write(">");
		br.close();
		bw.flush();
		bw.close();
	}
}
