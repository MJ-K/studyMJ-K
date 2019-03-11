package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution1_1 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";

        ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList(participant));
        ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList(completion));

        Collections.sort(arr1);
        Collections.sort(arr2);

        
        for(int i=0;i<completion.length;i++) {
        	if(!arr1.get(i).equals(arr2.get(i))) {
        		answer = arr1.get(i);
        	}else {
        		answer = arr1.get(participant.length-1);
        	}
        }
        
        return answer;
	}
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "mislav","ana"};
		
		//String[] participant = {"leo", "kiki", "ana","ana","halo","halo","cjaksldkfj","qweasfsd","sdfsfadsdf"};
		//String[] completion = {"kiki","ana","ana","halo","halo","cjaksldkfj","qweasfsd","leo"};
		
		System.out.println(new Solution1_1().solution(participant, completion));
	}
}
