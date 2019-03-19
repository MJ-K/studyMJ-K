package Sort;

import java.util.Arrays;

public class Kth_Number {
	public static void main(String[] args) {
		int[] array= {1,5,2,6,3,7,4}; // 5263
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};// result : answer = {5,6,3};

		
		int[] answer = new int[commands.length];
		
		for(int i =0 ;i<commands.length;i++) {
			int n = 0;
			int[] arr = new int[commands[i][1]-commands[i][0]+1];
			
			for(int j = commands[i][0]-1;j<commands[i][1];j++) {
				arr[n] = array[j];
				n++;
			}
			
			Arrays.sort(arr);
			
			answer[i] = arr[commands[i][2]-1];
			
		}
		
	
	}
}
