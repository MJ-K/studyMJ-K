package Hash;

import java.util.HashMap;

public class Solution1_correct {
	public String solution(String[] participant, String[] completion) {
		  String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
	        for (String player : completion) hm.put(player, hm.get(player) - 1);

	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){
	                answer = key;
	            }
	        }
	        return answer;
	}
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana","mislav","mislav"};
		String[] completion = {"stanko", "mislav","ana"};
		
		System.out.println(new Solution1().solution(participant, completion));
	}
}
