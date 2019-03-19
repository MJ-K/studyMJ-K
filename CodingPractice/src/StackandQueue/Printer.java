package StackandQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	public static void main(String[] args) {
		//PROGRAMMERS (STACK/QUEUE) - PRINTER 
		// 2132 QUEUE (LINKEDLIST)
		// 1223 SORT
		
		int answer = 0;
		int n  = 0;
		
		//int[] priorities = {2,1,3,2}; 
		//int location = 2;//result : answer =  1
		
		int[] priorities = {1,2,9,1,1,1};
		int location = 1;  //result : answer = 5
		
		 int l = location;
		 
		 Queue<Integer> q = new LinkedList<Integer>();
		 for(int i : priorities) {
			q.add(i);
		 }
		
		 Arrays.sort(priorities);
		 
		 while(!q.isEmpty()) {
			 n = q.poll();
			 l--;
			 if(n == priorities[(priorities.length-1)-answer]) {
				 answer++;
				 if(l<0) break;
			 }else {
				 q.add(n);
				 if(l<0) {l = q.size()-1;}
			 }
		 }
		 System.out.println(answer);
		
	}
}
