package Stack_and_Queue;

import java.util.ArrayList;
import java.util.Queue;

public class Printer {
	public static void main(String[] args) {

		//int[] priorities = {2,1,3,2};
		//int location = 2; //찾고자 하는 인덱스
		
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		
		int max = 0;
		int index = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0;i<priorities.length;i++) {
			max =0;
			index = 0;
			for(int j = 0;j<priorities.length ;j++) {
				if(max < priorities[j]) {
					max = priorities[j];
					index = j;
				}else if(max==priorities[j]) {
					if(index <j) {
						index = j;
					}
				}
			}
			arr.add(index);
			priorities[index] = 0;
		}
		System.out.println(arr.indexOf(location)+1);
	}
}
