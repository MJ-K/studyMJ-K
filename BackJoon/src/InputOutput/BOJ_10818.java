package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10818 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		String[] nums = input.split(" ");
		
		int max = Integer.parseInt(nums[0]);
		int min = Integer.parseInt(nums[0]);
		
		for(int i =0;i<num;i++) {
			if(max < Integer.parseInt(nums[i])) max = Integer.parseInt(nums[i]);
			if(min > Integer.parseInt(nums[i])) min = Integer.parseInt(nums[i]);
		}
		
		System.out.println(min + " "+ max);
	}
}
