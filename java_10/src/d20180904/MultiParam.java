package d20180904;

import java.util.Scanner;

public class MultiParam {
	void loginDemo(String id, int pw) {
	//id가 java이고 pw 가 1234이면 로그인 성공 메세지 출력
		if(id.equals("java") && pw ==1234) {
			System.out.println("로그인 성공 하셨습니다");
		}
		else {
			System.out.println("회원가입하세요");
		}
	}//loginDemo() end
	
	public static void main(String[] args) {
		String id = "";
		int pw = 0;
		
		System.out.println("로그인 하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력하세요 : ");
		id = sc.nextLine();
		System.out.println("패스워드를 입력하세요 : ");
		pw = sc.nextInt();
		
		MultiParam mmp = new MultiParam();
		mmp.loginDemo(id, pw);
	}
	
}
