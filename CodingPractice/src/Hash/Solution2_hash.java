package Hash;

import java.util.HashSet;
import java.util.Iterator;
class Solution2_hash {
    public boolean solution(String[] phoneBook) {
       boolean answer = true;

        HashSet hm = new HashSet();
        for(String num : phoneBook)
        {
            hm.add(num);
        }


        for(String tel : phoneBook)
        {
            Iterator it = hm.iterator();
            while(it.hasNext())
            {
                String def = (String) it.next();

                if(def.startsWith(tel) && def.equals(tel) == false)
                    return false;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
		
		String[] phone_book = {"119","97674223","1195524421"};
		//String[] phone_book = {"123","456","789"};
		
		System.out.println(new Solution2().solution(phone_book));
	}
}