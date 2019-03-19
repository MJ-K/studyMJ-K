package StackandQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer_Answer1 {
	public static void main(String[] args) {
		
		int answer = 0;
		
		int[] priorities = {2,1,3,2}; 
		int location = 2;//result : answer =  1
		
		//int[] priorities = {1,1,9,1,1,1};
		//int location = 0;  //result : answer = 5
		
		 int l = location;

	        Queue<Integer> que = new LinkedList<Integer>();
	        for(int i : priorities){
	            que.add(i);
	        }

	        Arrays.sort(priorities);
	        int size = priorities.length-1;



	        while(!que.isEmpty()){
	            Integer i = que.poll();
	            if(i == priorities[size - answer]){
	                answer++;
	                l--;
	                if(l <0)
	                    break;
	            }else{
	                que.add(i);
	                l--;
	                if(l<0)
	                    l=que.size()-1;
	            }
	        }
	        System.out.println(answer);

	}
}
