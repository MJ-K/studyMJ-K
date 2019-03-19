package study;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reversearray {
	public static void main(String[] args) {
		Integer[] num = {1,2,3,4,5};
	
		Arrays.sort(num, Collections.reverseOrder());
		
		
		int[] num2 = {100,2,3,40,57};
		
		List<int[]> list = Arrays.asList(num2);
		
		Collections.reverse(list);
	}
}
