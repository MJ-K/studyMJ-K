package Hash;

import java.util.Arrays;

public class Solution2 {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        for(int i =0;i<phone_book.length;i++) {
        	for(int j =i+1;j<phone_book.length;j++) {
        		if(phone_book[j].startsWith(phone_book[i])) {
        			answer = false; break;
        		}
        	}
        	if(answer==false) break;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		
		String[] phone_book = {"119","97674223","1195524421"};
		//String[] phone_book = {"123","456","789"};
		
		System.out.println(new Solution2().solution(phone_book));
	}
}
