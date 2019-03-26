package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1924_2 {
	public static void main(String[] args) throws Exception{
		//2007년 1월 1일 월요일 /기준
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] dateArray = {"SUN","MON", "TUE", "WED", "THU" ,"FRI","SAT"};
		int month = Integer.parseInt(str.nextToken());
		int day = Integer.parseInt(str.nextToken());
		
		int numOfDays = 0;
		
		for(int i =0;i<month-1;i++) {
			numOfDays += monthArray[i];
		}		
		numOfDays +=day;
		
		System.out.println(dateArray[numOfDays%7]);
	}
}
