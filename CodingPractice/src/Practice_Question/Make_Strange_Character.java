package Practice_Question;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Make_Strange_Character {
	public static void main(String[] args) {
		String s = "   try    ttTDADDSSDFsdfd world  asdfasdf ";//TrY HeLlO WoRlD
		ArrayList<String> arr = new ArrayList<String>();
		String answer = "";
		
		s=s.replaceAll(" ", "-");
		System.out.println(s);

		String a1 = "";
		String a2 = "";
		
		for(int i =0;i<s.length();i++) {
			if('z'>=s.charAt(i)&&s.charAt(i)>='A') {
				if(!a1.equals("")) {
					arr.add(a1);
					a1="";
				}
				a2+=s.charAt(i);
			}
			else {
				if(!a2.equals("")) {
					arr.add(a2);
					a2="";
				}
				a1+=s.charAt(i);
			}
			if(i==s.length()-1) {	
				if(!a2.equals("")) {
					arr.add(a2);
				}
				if(!a1.equals("")) {
					arr.add(a1);
				}
			}
		}
		
		for(int i = 0;i<arr.size();i++) {
			System.out.println(i+" ¹ø¤Š : "+arr.get(i));
		}
		
		for(int i = 0;i<arr.size();i++) {
			if(arr.get(i).contains("-")) {answer+=arr.get(i); continue;}
			for(int j=0;j<arr.get(i).length();j++) {
				if(j%2==0) {answer+=Character.toString(arr.get(i).charAt(j)).toUpperCase();}
				else answer+=Character.toString(arr.get(i).charAt(j)).toLowerCase();
			}
		}
		
		answer = answer.replaceAll("-", " ");
		System.out.println(answer);
	}
}
