package Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BOJ_10845 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> arr =new  ArrayList<String>();
		
		//push : input
		//pop : output (empty -> -1)
		//size : size
		//empty : t ->1 f ->0
		//front : first . -1
		//back : last  . -1
		
		int N = Integer.parseInt(br.readLine());
		String str;
		String[] st;
		
		int last=0;
		
		for(int i=0;i<N;i++) {
			str = br.readLine();
			st = str.split(" ");
			switch(st[0]) {
			case "push": 
				arr.add(st[1]);
				last++;
				break;
			case "pop": 
				if(arr.isEmpty()) {
					bw.write("-1\n");
				}else {
					bw.write(arr.remove(0)+"\n");
				}
				break;
			case "size":
				bw.write(arr.size()+"\n");
				break;
			case "front": 
				if(arr.isEmpty()) bw.write("-1\n");
				else bw.write(arr.get(0)+"\n");
				break;
			case "back": 
				if(arr.isEmpty()) bw.write("-1\n");
				else bw.write(arr.get(last-1)+"\n");
				break;
			case "empty" :
				if(arr.isEmpty()) bw.write("1\n");
				else  bw.write("0\n");
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}	
}
