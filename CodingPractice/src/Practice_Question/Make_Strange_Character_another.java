package Practice_Question;

public class Make_Strange_Character_another {
	public static void main(String[] args) {
		String s = "   try    ttTDADDSSDFsdfd world  asdfasdf ";
		String answer = "";
	    int cnt = 0;
	    String[] array = s.split("");
	    
	    for(String ss : array) {
	        cnt = ss.contains(" ") ? 0 : cnt + 1;
	        answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
	    }
	    System.out.println(answer);
	}
}
