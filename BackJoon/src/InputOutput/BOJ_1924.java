package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1924 {
	public static void main(String[] args) throws Exception{
		//2007년 1월 1일 월요일 /기준
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input= br.readLine();
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] dateArray = {"SUN","MON", "TUE", "WED", "THU" ,"FRI","SAT"};
		String[] date  = input.split(" ");
		
		int numOfDays = 0;
		
		for(int i =0;i<Integer.parseInt(date[0])-1;i++) {
			numOfDays += monthArray[i];
		}		
		numOfDays +=Integer.parseInt(date[1]);
		
		System.out.println(dateArray[numOfDays%7]);
	}
}
