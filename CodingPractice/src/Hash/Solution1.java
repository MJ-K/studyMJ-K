package Hash;

import java.util.HashMap;

public class Solution1 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hash = new HashMap<>();
        
        
        /*for(int i= 0;i<completion.length;i++) {
        	for(int j = 0;j<participant.length;j++) {
        		if(completion[i].equals(participant[j])) {
        			
        		}
        	}
        }*/
        
        for(int i= 0;i<participant.length;i++) {
        	hash.put(participant[i], 0);
        }
        
  /*      for(int i = 0;i<completion.length;i++) {
        	if(hash.containsKey(completion[i])) {
        		hash.put(completion[i], hash.get(completion[i])+1);
        	}
        	
        }*/
        
        for(int i = 0;i<participant.length;i++) {
        	for(int j= 0;j<completion.length;j++) {
        		if(participant[i].equals(completion[j])) {
        			hash.put(participant[i], hash.get(participant[i])+1);
        		}
            }
        	if(hash.get(participant[i])!=1) {
        		answer = participant[i];
        	}
        }
        
     /*   for(int i= 0;i<participant.length;i++) {
        	if(hash.get(participant[i])!=1) {
        		answer = participant[i];
        	}
        }*/
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana","mislav","mislav"};
		String[] completion = {"stanko", "mislav","ana"};
		
		System.out.println(new Solution1().solution(participant, completion));
	}
}
