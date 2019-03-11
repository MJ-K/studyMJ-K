package Hash;

import java.util.HashMap;

public class Solution3 {
	public int solution(String[][] clothes) {
		int answer = 0;
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(int i = 0;i<clothes.length;i++) {
			map.put(clothes[i][0], clothes[i][1]);
		}
		
	
		for(int i = 0;i<clothes.length;i++) {
		
		}
		
		/*ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0;i<clothes.length;i++) {
			arr.add(clothes[i][1]);
		}
		
		Collections.sort(arr);
		
		for(int i = 0;i<clothes.length;i++) {
			if(clothes) {}
		}*/
		
		
		answer = clothes.length;
		
	    return answer;
	}
	public static void main(String[] args) {
		String[][] clothes = {};
		System.out.println(new Solution3().solution(clothes));
	}
}
