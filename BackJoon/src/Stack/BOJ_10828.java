package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class BOJ_10828 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//command num
		
		String command;
		String[] str = new String[2];
		ArrayList<String> arr= new ArrayList<String>();
		
		
		for(int i =0;i<N;i++) {
			command = br.readLine();
			str = command.split(" ");

			switch(str[0]) {
			case "push" : 
				arr.add(str[1]);
				break;
			case "size" : 
				System.out.println(arr.size());
				break;
			case "top" : 
				if(arr.size()==0) {System.out.println("-1");}
				else { System.out.println(arr.get(arr.size()-1));}
				break;
			case "pop" : 
				if(arr.size()==0) {System.out.println("-1");}
				else 
				{ 
					System.out.println(arr.get(arr.size()-1));
					arr.remove(arr.size()-1);
				}
				break;
			case "empty" : 
				if(arr.size()==0) {System.out.println("1");}
				else System.out.println("0"); 
				break;
			}
			
			
			
		}
	}
}
