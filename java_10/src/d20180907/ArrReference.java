package d20180907;

import d20180906.고래;
import d20180906.다람쥐;
import d20180906.토끼;
import d20180906.포유류;

public class ArrReference {
	public static void main(String[] args) {
		토끼 r = new 토끼();
		고래 w = new 고래();
		다람쥐 s = new 다람쥐();
		
		/*포유류[] moList = new 포유류[3];
		moList[0] = r;
		moList[1] = w;
		moList[2] = s;*/
		
		포유류[] moList = {new 토끼(), new 다람쥐(), new 고래()};
		
		for(int i=0; i<moList.length; i++) {
			moList[i].먹기();
		}
		
		System.out.println();
		// 참조변수인지 확인하고 싶을 때
		// 참조변수 r이 토끼 클래스의 참조변수입니까? true/false
		System.out.println(r instanceof 토끼);
	}
}
