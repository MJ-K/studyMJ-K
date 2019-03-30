package Queue;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1158_RE {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num =sc.nextInt();
		int term =sc.nextInt();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i= 1;i<=num;i++) {
			q.offer(i);
		}
		bw.write("<");
		for(int i=0;i<(num-1);i++){
			for(int j=0;j<term-1;j++) {
				q.offer(q.poll());
			}
			bw.write(q.poll()+", ");
		}
		bw.write(q.poll()+">");
		bw.flush();
		bw.close();
	}
}
